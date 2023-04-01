
public class Main {

	public static void main(String[] args) {
		
		String s = "BuBirStringYazısıdır.";
		System.out.println(s.contains("String") + "\n" + s.contains("metin"));

	}
	
	
	
	/*public static String renderJasperReport(String reportId,CSBag reportParamaters) throws CSException{
		
		Logger.debug("[reportId="+reportId+"] dekontu ARS ile render ediliyor ...");
		
		//reportParameters hangi değere sahip bunu bulabilmek için reportParameters. dediğimizde karşımıza gelen seçeneklere bakalım
		//Bu seçeneklerden bir şey bulamassak reportParameters ın değerinin 10447 olup olmadığını kontrol edebilecek bir yöntem bulmamız gerekiyor 
		//Diyelimki String bir değer o zaman şöyle yapılabilir bence ;
		
		String value=Session.getSessionUserName();
		
		if(value.equals("10447")) {
			
			//Bi alt satırda da reportId+"_WEB" yazamamız normalmi ondan da emin değilim çünkü burayı statik olarak yazmak doğru olurmu bilemedim
			
			reportParamaters.put("CORE_REPORTID",(reportId+"_WEB"));
			reportParamaters.put("CORE_SERVICE","reportCreation");
			reportParamaters.put("CORE_LOCAL",true);
			CSBag bagJasperReport=CSCaller.call("AURORA_REPORT_SERVICE_CALLER",reportParamaters);
			String encodedJasperReport=bagJasperReport.get("CORE_REPORT").toString();
			return encodedJasperReport;
			
		}*/
	}






























