
public class Dragon extends Beyblade {

	private String kutsalCanavar;
	private String gizliYetenek;

	public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
		this.gizliYetenek = gizliYetenek;
	}

	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);

	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkıyor...");
		System.out.println(getBeybladeci() + " ın Saldırısı : Hayalet Kasırgası");
	}

}