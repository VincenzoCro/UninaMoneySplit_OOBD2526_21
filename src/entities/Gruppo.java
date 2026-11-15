package entities;

import java.sql.Date;
import java.util.List;
import java.util.Set;

public class Gruppo {

	private Long id;
	private String nome;
	private String percorsoImmagineGruppo;
	private String descrizione;
	private Date dataCreazione;
	
	private Profilo proprietario;
	private Set<Partecipazione> partecipazioni;   //Usare un Set garantisce unicità
	private List<Spesa> spese;
}
