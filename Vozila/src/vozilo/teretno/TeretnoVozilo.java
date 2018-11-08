package vozilo.teretno;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import vozilo.MotornoVozilo;

public class TeretnoVozilo extends MotornoVozilo {
	
	private Integer nosivost;
	private Integer zapremina;
	
	public TeretnoVozilo(String marka, Integer brojPutnika, Double cena, LocalDate datumRegistracije, Integer nosivost, Integer zapremina) {
		super(marka, brojPutnika, cena, datumRegistracije);
		this.nosivost = nosivost;
		this.zapremina = zapremina;
	}

		
	@Override
	public Integer ostaloDoRegistracije() {
		LocalDate istekReg = getDatumRegistracije().plusYears(1);
		Long razlika = ChronoUnit.DAYS.between(LocalDate.now(), istekReg);
		if (razlika>183) razlika = razlika - 183;
		return razlika.intValue();
	}


	@Override
	public void StampajInformacije() {
		// TODO Auto-generated method stub
		super.StampajInformacije();
		System.out.println("Nosivost teretnog vozila je " + nosivost + " , zapremina motora je " + getZapremina());
	}

	public Integer getNosivost() {
		return nosivost;
	}

	public void setNosivost(Integer nosivost) {
		this.nosivost = nosivost;
	}

	public Integer getZapremina() {
		return zapremina;
	}

	public void setZapremina(Integer zapremina) {
		this.zapremina = zapremina;
	}


	@Override
	public Double prodajnaCena() {
		// TODO Auto-generated method stub
		return getCena()*1.20;
	}

	@Override
	public String minPotrebnaKategorija() {
		return "Potrebna kategorija je C";
	//	return new String ("C");
	}

	@Override
	public Boolean starosnoOgranicenje() {
		// TODO Auto-generated method stub
		return null;
	}


}
