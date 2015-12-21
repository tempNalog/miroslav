package paket;

public class Knjiga {

	private String naslov;
	private long isbn;
	private String izdavac;
	private int izdanje;

	public Knjiga() {
		super();
	}

	public Knjiga(String naslov, long isbn, String izdavac, int izdanje) {
		super();
		this.naslov = naslov;
		this.isbn = isbn;
		this.izdavac = izdavac;
		this.izdanje = izdanje;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public int getIzdanje() {
		return izdanje;
	}

	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}

	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", izdavac="
				+ izdavac + ", izdanje=" + izdanje + "]";
	}
}
