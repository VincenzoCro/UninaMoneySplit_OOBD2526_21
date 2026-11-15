package controllers;

import dao.GruppoDAO;
import dao.InvitoDAO;
import dao.PartecipazioneDAO;
import dao.ProfiloDAO;
import entities.SessioneUtente;

public class ControllerGruppi {

	private SessioneUtente sessioneUtente;
	private ProfiloDAO profiloDAO;
	private InvitoDAO invitoDAO;
	private PartecipazioneDAO partecipazioneDAO;
	private GruppoDAO gruppoDAO;
}
