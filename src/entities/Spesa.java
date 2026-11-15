package entities;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

public class Spesa {

	private Long id;
	private String descrizione;
	private Date dataCreazione;
	private Time orarioCreazione;
	private BigDecimal importo;
}
