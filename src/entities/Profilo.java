package entities;

import java.sql.Date;

import java.util.List;
import java.util.Objects;

public class Profilo {

	private Long id;
	private String username;
	private char[] password;
	private Date dataCreazione;
	private String percorsoImmagineProfilo;
	
	private List<Partecipazione> partecipazioni;
	private List<Invito> invitiMandati;
	private List<Invito> invitiRicevuti;
	
	public Profilo(String username, char[] password) {
		this.username = username;
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profilo other = (Profilo) obj;
		return Objects.equals(username, other.username);
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public char[] getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	
	
	
}
