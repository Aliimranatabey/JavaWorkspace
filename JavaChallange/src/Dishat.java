import java.util.List;

public class Dishat extends Ucus implements Hesaplama {
	
	public Dishat(List<Gelen> gelenListesi, double yetiskinUcret, double cocukUcret, double bebekUcret) {
        super(gelenListesi, yetiskinUcret, cocukUcret, bebekUcret);
        // TODO Auto-generated constructor stub
    }

	@Override
	public double gelenUcretHesaplama(int yetiskinSayisi, int cocukSayisi, int bebekSayisi) {
		return ((yetiskinSayisi * getYetiskinUcret()) + (cocukSayisi * getCocukUcret())
				+ (bebekSayisi * getBebekUcret()));
	}
}