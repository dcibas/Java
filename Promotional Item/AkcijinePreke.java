
	public class AkcijinePreke extends Preke {

	    Integer nuolaidosProcentas;

	    public AkcijinePreke() {

	    }

	    public AkcijinePreke(String pavadinimas, Double kaina, Integer nuolaidosProcentas) {
	        super(pavadinimas, kaina);
	        this.nuolaidosProcentas = nuolaidosProcentas;
	    }

	    public Integer getNuolaidosProcentas() {
	        return nuolaidosProcentas;
	    }

	    public void setNuolaidosProcentas(Integer nuolaidosProcentas) {
	        this.nuolaidosProcentas = nuolaidosProcentas;
	    }

	    @Override
	    public void spausdinti() {
	        super.spausdinti();
	        System.out.println("Nuolaidos procentas: " + nuolaidosProcentas);
	    }

	}
	

