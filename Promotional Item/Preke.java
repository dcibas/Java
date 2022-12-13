
public class Preke {

    String pavadinimas;
    Double kaina;

    public Preke() {

    }

    public Preke(String pavadinimas, Double kaina) {
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }

    public void spausdinti() {
        System.out.println("Pavadinimas: " + pavadinimas);
        System.out.println("Kaina: " + kaina);
    }

    public Double parduotiPreke() throws NetinkamaPrekesKaina {
        if(kaina > 0.00) {
            System.out.println("Parduodama preke: " + pavadinimas);
            return kaina;
        }
        else {
            throw new NetinkamaPrekesKaina("Netinkama prekes kaina", kaina);
        }
    }
}
