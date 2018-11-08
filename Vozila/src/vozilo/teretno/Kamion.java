package vozilo.teretno;

import java.time.LocalDate;

public class Kamion extends TeretnoVozilo {

	public Kamion (String marka, Integer brojPutnika, Double cena, LocalDate datumRegistracije, Integer nosivost, Integer zapremina) {
		super(marka, brojPutnika, cena, datumRegistracije, nosivost, zapremina);
	}

	@Override
	public void StampajInformacije() {
		// TODO Auto-generated method stub
		super.StampajInformacije();
		}
}
