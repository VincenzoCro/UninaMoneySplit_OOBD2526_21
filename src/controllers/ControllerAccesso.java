package controllers;

import boundaries.MainFrame;
import boundaries.SchermataDiAccesso;
import dao.ProfiloDAO;
import entities.SessioneUtente;
import exceptions.CredenzialiErrateException;

public class ControllerAccesso {
	
	private SessioneUtente sessioneUtente;
	private ProfiloDAO profiloDAO;
	private MainFrame mainFrame;
	private SchermataDiAccesso schermataDiAccesso;

	public static void main(String[] args) {
		
		ControllerAccesso controllerAccesso = new ControllerAccesso();
	}
	
	public ControllerAccesso() {
		mainFrame = new MainFrame();
		schermataDiAccesso = new SchermataDiAccesso(this);
		
		mainFrame.cambiaSchermata(schermataDiAccesso);
		mainFrame.setVisible(true);
	}

	public void loginProfilo(String username, char[] password) {
		
		
		
		
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
