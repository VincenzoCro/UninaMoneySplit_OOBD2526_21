package entities;

import java.sql.Date;
import java.util.ArrayList;

public class Profilo {

	private Long id;
	private String username;
	private char[] password;
	private Date dataCreazione;
	public String percorsoFotoProfilo;
	
	private ArrayList<Partecipazione> partecipazioni;
	private ArrayList<Invito> invitiMandati;
	private ArrayList<Invito> invitiRicevuti;
	
}
