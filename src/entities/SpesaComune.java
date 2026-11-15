package entities;

import java.util.Set;

public class SpesaComune extends Spesa {

	private Profilo creatore;
	private Profilo pagante;
	
	private Set<QuotaSpesa> quote;
}
