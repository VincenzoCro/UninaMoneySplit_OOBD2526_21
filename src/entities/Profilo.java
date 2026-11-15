package entities;

import java.sql.Date;

import java.util.List;

public class Profilo {

	private Long id;
	private String username;
	private char[] password;
	private Date dataCreazione;
	private String percorsoImmagineProfilo;
	
	private List<Partecipazione> partecipazioni;
	private List<Invito> invitiMandati;
	private List<Invito> invitiRicevuti;
	
}
