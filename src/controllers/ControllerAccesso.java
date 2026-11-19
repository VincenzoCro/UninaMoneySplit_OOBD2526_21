package controllers;

import boundaries.MainFrame;
import boundaries.SchermataDiAccesso;
import dao.ProfiloDAO;
import entities.SessioneUtente;

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

}
