import java.util.ArrayList;

public class Parduotuve implements Vesinimas{

    private String adresas;
    private Integer darbuotojuSkaicius;
    private PrekybosTinklai tinklas;
    private ArrayList<Preke> prekes;

    public Parduotuve() {
    }

    public Parduotuve(String adresas, Integer darbuotojuSkaicius, PrekybosTinklai tinklas, ArrayList<Preke> prekes) {
        this.adresas = adresas;
        this.darbuotojuSkaicius = darbuotojuSkaicius;
        this.tinklas = tinklas;
        this.prekes = prekes;
    }

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    public Integer getDarbuotojuSkaicius() {
        return darbuotojuSkaicius;
    }

    public void setDarbuotojuSkaicius(Integer darbuotojuSkaicius) {
        this.darbuotojuSkaicius = darbuotojuSkaicius;
    }

    public PrekybosTinklai getTinklas() {
        return tinklas;
    }

    public void setTinklas(PrekybosTinklai tinklas) {
        this.tinklas = tinklas;
    }

    public ArrayList<Preke> getPrekes() {
        return prekes;
    }

    public void setPrekes(ArrayList<Preke> prekes) {
        this.prekes = prekes;
    }

    public void spausdinti() {
        System.out.println("Adresas: " + adresas);
        System.out.println("Darbuotoju skaicius: " + darbuotojuSkaicius);
        System.out.println("Tinklas: " + tinklas.name());
    }

    @Override
    public void ijungtiKondicionieriu() {

        switch (tinklas) {
            case IKI:
                System.out.println("Temperatura 19 laipsniu");
                break;
            case MAXIMA:
                System.out.println("Temperatura 20 laipsniu");
                break;
            case RIMI:
                System.out.println("Temperatura 18 laipsniu");
                break;
            case LIDL:
                System.out.println("Temperatura 17 laipsniu");
                break;
        }
    }

    public void pigiausiaPreke() {

        Preke pigiausiaPreke = prekes.get(0);
        for(Preke preke : prekes) {
            if(preke.getKaina() < pigiausiaPreke.getKaina()) {
                pigiausiaPreke = preke;
            }
        }
        System.out.println("Pigiausia preke parduotuveje " + tinklas.name() + " adresu: " + adresas);
        pigiausiaPreke.spausdinti();
    }

    public void parduotiVisasParduotuvesPrekes() {
        for(Preke preke : prekes) {
            try {
             preke.parduotiPreke();
            }
            catch (NetinkamaPrekesKaina e) {
                System.out.println("Klaida parduodant preke " + preke.getPavadinimas() + "!");
                System.out.println(e.getMessage() + " " + e.getKaina());
            }
        }
    }
}
