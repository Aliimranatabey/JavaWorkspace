import java.util.List;

public class Ucus {

	private List<Gelen> gelenListesi;
	private double yetiskinUcret;
	private double cocukUcret;
	private double bebekUcret;

	public Ucus(List<Gelen> gelenListesi, double yetiskinUcret, double cocukUcret, double bebekUcret) {
		this.gelenListesi = gelenListesi;
		this.yetiskinUcret = yetiskinUcret;
		this.cocukUcret = cocukUcret;
		this.bebekUcret = bebekUcret;
	}

	public double getYetiskinUcret() {
		return yetiskinUcret;
	}

	public void setYetiskinUcret(double yetiskinUcret) {
		this.yetiskinUcret = yetiskinUcret;
	}

	public double getCocukUcret() {
		return cocukUcret;
	}

	public void setCocukUcret(double cocukUcret) {
		this.cocukUcret = cocukUcret;
	}

	public double getBebekUcret() {
		return bebekUcret;
	}

	public void setBebekUcret(double bebekUcret) {
		this.bebekUcret = bebekUcret;
	}

	public List<Gelen> getGelenListesi() {
		return gelenListesi;
	}

}
