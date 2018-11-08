package vozilo.autobus;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import util.Formater;
import vozilo.MotornoVozilo;
import vozilo.putnicko.KategorijaVozackeDozvole;

public class Autobus extends MotornoVozilo {

	private boolean zglobni;
	private Integer brojStajacihMesta;
	
	public Autobus(String marka, Integer brojPutnika, Double cena, LocalDate datumRegistracije, Boolean zglobni, Integer brojStajacihMesta) {
		super(marka, brojPutnika, cena, datumRegistracije);
		this.zglobni = zglobni;
		this.brojStajacihMesta = brojStajacihMesta;
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
		System.out.println("Zglobni " + Formater.format(zglobni) + " , stajacih mesta je " + brojStajacihMesta);
		}


	public boolean isZglobni() {
		return zglobni;
	}

	public void setZglobni(boolean zglobni) {
		this.zglobni = zglobni;
	}

	public Integer getBrojStajacihMesta() {
		return brojStajacihMesta;
	}

	public void setBrojStajacihMesta(Integer brojStajacihMesta) {
		this.brojStajacihMesta = brojStajacihMesta;
	}


	@Override
	public Double prodajnaCena() {
		// TODO Auto-generated method stub
		return getCena()*1.12;
	}


	@Override
	public String minPotrebnaKategorija() {
		return "Najmanja potrebna kategorija je  " +KategorijaVozackeDozvole.D.toString();
	}


	@Override
	public Boolean starosnoOgranicenje() {
		// TODO Auto-generated method stub
		return null;
	}

}
