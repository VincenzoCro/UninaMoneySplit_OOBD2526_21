package controllers;

import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.Arrays;

import boundaries.MainFrame;
import boundaries.SchermataDiAccesso;
import dao.ProfiloDAO;
//import dao.ProfiloDAOFinto;
import entities.Profilo;
import entities.SessioneUtente;
import exceptions.AccessoException;
import exceptions.CredenzialiErrateException;
import exceptions.PasswordErrataException;
import exceptions.ProfiloNonTrovatoException;

public class ControllerAccesso {
	
	private SessioneUtente sessioneUtente;
	private ProfiloDAO profiloDAO;
	private MainFrame mainFrame;
	private SchermataDiAccesso schermataDiAccesso;

	public static void main(String[] args) {
		
		ControllerAccesso controllerAccesso = new ControllerAccesso();
	}
	
	public ControllerAccesso() {
		sessioneUtente = new SessioneUtente();
		
		mainFrame = new MainFrame();
		schermataDiAccesso = new SchermataDiAccesso(this);
		
		mainFrame.cambiaSchermata(schermataDiAccesso);
		mainFrame.setVisible(true);
	}

	public void loginProfilo(String username, char[] password) {
		
		try {
			validaCredenziali(username, password);
			
			Profilo profiloTrovato = profiloDAO.getProfiloByUsername(username);
			
			if (profiloTrovato == null)
				throw new ProfiloNonTrovatoException();
			
			char[] veraPassword = profiloTrovato.getPassword();
			if (!Arrays.equals(password, veraPassword))
				throw new PasswordErrataException();
			
			sessioneUtente.setProfiloLoggato(profiloTrovato);
			schermataDiAccesso.mostraInfo("Login effettuato.");
//			mainFrame.cambiaSchermata(new SchermataHome());
			
		}
		catch (AccessoException e) {
			schermataDiAccesso.mostraErrore(e.getMessage());
		}
		catch (SQLException e) {
			e.printStackTrace();
			schermataDiAccesso.mostraErrore("Errore di connessione al database.");
		}
		finally {
			if (password != null)
				Arrays.fill(password, '\0');
		}
	}
	
	private void validaCredenziali(String username, char[] password) throws CredenzialiErrateException{
		
		if (username == null || username.isBlank())
			throw new CredenzialiErrateException("Inserire username.");
		
		if(password == null || password.length == 0) {
			throw new CredenzialiErrateException("Inserire password.");
		}
		
		//Regole sulla lunghezza dei campi future
		
	}

}
