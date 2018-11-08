import java.time.LocalDate;

import util.Formater;
import vozilo.KategorijaZaUpravljanje;
import vozilo.MotornoVozilo;
import vozilo.autobus.Autobus;
import vozilo.putnicko.*;		//	importuje sve klase koje su podredjene klasi vozilo.putnicko
import vozilo.teretno.Kamion;
import vozilo.teretno.TeretnoVozilo;

public class Aplikacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MotornoVozilo punto = new PutnickoVozilo ("FIAT", 4, 12600d, LocalDate.of(2018, 12, 17), true, 3);
		punto.StampajInformacije();
		System.out.println();
		
		MotornoVozilo kamion = new TeretnoVozilo("TAM", 3, 25430d, LocalDate.of(2015, 4, 30), 1200, 1500);
		kamion.StampajInformacije();
		System.out.println();
		
		MotornoVozilo ikarbus = new Autobus("IKARBUS", 50, 76500d, LocalDate.now(), false, 12);
		ikarbus.StampajInformacije();
		System.out.println();
		
		MotornoVozilo noviBus = new Autobus("IKARBUS", 54, 86300d, LocalDate.now(), true, 12);
		noviBus.StampajInformacije();
		System.out.println();
		
		MotornoVozilo noviKamion = new Kamion ("FAP", 4, 37200d, LocalDate.now(), 5000, 3500);
		noviKamion.StampajInformacije();
		System.out.println();

		KategorijaZaUpravljanje ka = new PutnickoVozilo("FORD", 3, 12600d, LocalDate.now(), true, 4);
		System.out.println(ka.starosnoOgranicenje());
		
		Kamion k = new Kamion("FAP", 2, 200d, LocalDate.now(), 200, 100);
		TeretnoVozilo tv = k;
		MotornoVozilo mv = k;
		KategorijaZaUpravljanje kzv = k;

		tv.StampajInformacije();
		mv.StampajInformacije();
		System.out.println(kzv.minPotrebnaKategorija());
		System.out.println();
		
		PutnickoVozilo mot = new PutnickoVozilo("ZASTAVA", 5, 300d, LocalDate.now(), true, 3);
		mot.StampajInformacije();
		KategorijaZaUpravljanje kzu = mot;
		System.out.println(kzu.minPotrebnaKategorija());
		System.out.println();
		
		Autobus ab = new Autobus("IKARBUS", 54, 42500d, LocalDate.now(), false, 3);
		ab.StampajInformacije();
		KategorijaZaUpravljanje kzb = ab;
		System.out.println(kzb.minPotrebnaKategorija());
		System.out.println();		
		
//		-  debagovanje  -		
//		System.out.println("Ocekujem DA dobijam " + Formater.format(true));
//		System.out.println("Ocekujem NE dobijam " + Formater.format(null));
//		System.out.println("Ocekujem NE dobijam " + Formater.format(false));
	}

	
}
