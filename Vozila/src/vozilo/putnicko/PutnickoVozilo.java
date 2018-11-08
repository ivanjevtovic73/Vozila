package vozilo.putnicko;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import util.Formater;
import vozilo.MotornoVozilo;

public class PutnickoVozilo extends MotornoVozilo {

	private Boolean kabriolet;
	private Integer brojVrata;
	
	public PutnickoVozilo(String marka, Integer brojPutnika, Double cena, LocalDate datumRegistracije, boolean kabriolet, Integer brojVrata) {
		super(marka, brojPutnika, cena, datumRegistracije);
		this.kabriolet = kabriolet;
		this.brojVrata = brojVrata;
	}
	
	@Override
	public Integer ostaloDoRegistracije() {
		LocalDate istekReg = getDatumRegistracije().plusYears(1);
		Long razlika = ChronoUnit.DAYS.between(LocalDate.now(), istekReg);
		return razlika.intValue();
	}

	@Override
	public void StampajInformacije() {
		super.StampajInformacije();
		System.out.println("Tip vozila je putnicko, kabriolet " + Formater.format(kabriolet) + " , broj vrata je " + getBrojVrata());
	}
		
	public boolean isKabriolet() {
		return kabriolet;
	}

	public void setKabriolet(boolean kabriolet) {
		this.kabriolet = kabriolet;
	}

	public Integer getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(Integer brojVrata) {
		this.brojVrata = brojVrata;
	}

	@Override
	public Double prodajnaCena() {
		// TODO Auto-generated method stub
		return getCena()*1.12;
	}

	@Override
	public String minPotrebnaKategorija() {
		return "Najmanja potrebna kategorija je  " + KategorijaVozackeDozvole.B.toString();
	}

	@Override
	public Boolean starosnoOgranicenje() {
		// TODO Auto-generated method stub
		return null;
	}
}
