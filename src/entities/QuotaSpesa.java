package entities;

import java.math.BigDecimal;

public class QuotaSpesa {

	private BigDecimal importo;   //Non più derivato per permettere suddivisioni non eque
	
	private SpesaComune spesa;
	private Profilo profilo;
}
