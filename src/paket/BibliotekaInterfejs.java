package paket;

import java.util.LinkedList;

public interface BibliotekaInterfejs {
	
	public void dodajKnjigu(Knjiga knj);
	public void obrisiKnjigu(Knjiga knj);
	
	public LinkedList<Knjiga> pronadjiKnjigu(String ajde);
	public LinkedList<Knjiga> vratiKnjige();
	
	public void ucitajIzFajla(String ajde);
	public void sacuvajFajl(String ajde);

}
