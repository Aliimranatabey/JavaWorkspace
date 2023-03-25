
public class Main {

	public static void total(int a,int b,int c) {
		int value=100;
		System.out.println("Toplama Sonucu"+(a+b+c));
	}
	public static void main(String[] args) {
		
		int i=1;
		while(i<10) {
			
			if(i%2==0) {
			String write="Çift";
			System.out.println(write);
			}
			//bu şekilde write in tanımlandığı kod bloğunun dışında yazarsak hata alırız == System.out.println(write);
			i++;
		}

		total(10,2,5);
		//Bu şekilde yazarsak kod bloğu probleminden dolayı hata alacagız  : System.out.println(value);
		//Bu şekilde yazarsak kod bloğu probleminden dolayı hata alacagız : System.out.println(a);
	}

}
