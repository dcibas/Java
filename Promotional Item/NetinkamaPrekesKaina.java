
public class NetinkamaPrekesKaina extends Exception {
	
	private Double kaina;

    public NetinkamaPrekesKaina(String message, Double kaina) {
        super(message);
        this.kaina = kaina;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }

}
