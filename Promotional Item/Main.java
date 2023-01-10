import java.util.ArrayList;
import java.util.Arrays;

	public class Main {

	    public static void main(String[] args) {

	        /* 1 dalis */

	        Parduotuve iki = new Parduotuve("Zemaitijos 20", 100, PrekybosTinklai.IKI, null);

	        Parduotuve rimi = new Parduotuve("Zemaitijos 21", 150, PrekybosTinklai.RIMI, null);

	        Parduotuve lidl = new Parduotuve("Zemaitijos 22", 80, PrekybosTinklai.LIDL, null);

	        Parduotuve maxima = new Parduotuve();
	        maxima.setAdresas("Zemaitijos 23");
	        maxima.setDarbuotojuSkaicius(100);
	        maxima.setTinklas(PrekybosTinklai.MAXIMA);

	        iki.spausdinti();

	        ArrayList<Parduotuve> parduotuves = new ArrayList<>(Arrays.asList(iki, rimi, lidl, maxima));

	        didziausiaParduotuve(parduotuves);

	        maxima.ijungtiKondicionieriu();
	        rimi.ijungtiKondicionieriu();
	        lidl.ijungtiKondicionieriu();
	        iki.ijungtiKondicionieriu();
	        

	        /* --------------------------------------------------
	        2 dalis                             */

	        Preke cola = new Preke("Cola", 1.99);
	        Preke alus = new Preke("Carlsberg", 1.49);
	        Preke koldunai = new Preke("Koldunai", 2.99);
	        Preke kalmarai = new Preke("Kalmarai", 5.99);
	        Preke vistiena = new Preke();
	        vistiena.setPavadinimas("Vistiena");
	        vistiena.setKaina(3.99);

	        ArrayList<Preke> prekes = new ArrayList<>(Arrays.asList(cola, alus, koldunai, kalmarai, vistiena));

	        pigiosPrekes(prekes, 2.00);

	        AkcijinePreke colaAkcija = new AkcijinePreke("Cola su akcija", 1.99, 20);
	        AkcijinePreke alusAkcija = new AkcijinePreke("Carlsberg su akcija", 1.49, 15);
	        AkcijinePreke koldunaiAkcija = new AkcijinePreke("Koldunai su akcija", 2.99, 5);
	        AkcijinePreke kalmaraiAkcija = new AkcijinePreke("Kalmarai su akcija", 5.99, 7);
	        AkcijinePreke vistienaAkcija = new AkcijinePreke();
	        vistienaAkcija.setPavadinimas("Vistinea su akcija");
	        vistienaAkcija.setKaina(3.99);
	        vistienaAkcija.setNuolaidosProcentas(10);

	        ArrayList<AkcijinePreke> akcijinesPrekes = new ArrayList<>(Arrays.asList(colaAkcija, alusAkcija, koldunaiAkcija, kalmaraiAkcija, vistienaAkcija));
	        maziausiaNuolaida(akcijinesPrekes);

	        /* -------------------------------------------------
	        3 dalis */

	        iki = new Parduotuve("Zemaitijos 20", 100, PrekybosTinklai.IKI, prekes);

	        iki.pigiausiaPreke();

	        Preke neigiamosKainosPreke = new Preke("Bloga", -0.10);
	        prekes.add(neigiamosKainosPreke);

	        rimi = new Parduotuve("Zemaitijos 21", 150, PrekybosTinklai.RIMI, prekes);
	        rimi.parduotiVisasParduotuvesPrekes();

	    }

	    public static void didziausiaParduotuve(ArrayList<Parduotuve> parduotuves) {

	        Parduotuve didziausiaParduotuve = parduotuves.get(0);

	        for(Parduotuve parduotuve : parduotuves) {
	            if(parduotuve.getDarbuotojuSkaicius() > didziausiaParduotuve.getDarbuotojuSkaicius()) {
	                didziausiaParduotuve = parduotuve;
	            }
	        }

	        didziausiaParduotuve.spausdinti();

	    }

	    public static void pigiosPrekes (ArrayList<Preke> prekes, Double kaina) {
	        System.out.println("Pigesnes uz " + kaina + " eurus prekes");
	        for(Preke preke : prekes) {
	            if(preke.getKaina() < kaina) {
	                preke.spausdinti();
	            }
	        }
	    }

	    public static void maziausiaNuolaida(ArrayList<AkcijinePreke> akcijinesPrekes) {
	        AkcijinePreke maziausiosNuolaidosPreke = akcijinesPrekes.get(0);
	        for (AkcijinePreke akcijinePreke : akcijinesPrekes) {
	            if (akcijinePreke.getNuolaidosProcentas() < maziausiosNuolaidosPreke.getNuolaidosProcentas()) {
	                maziausiosNuolaidosPreke = akcijinePreke;
	            }
	        }
	        System.out.println("Maziausia nuolaida turi preke");
	        maziausiosNuolaidosPreke.spausdinti();
	    }


     }


