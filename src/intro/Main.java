package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8
		// main javada başlangıç methodudur
		/* yorum satırı */
		
		
		System.out.println("Hello World!"); //sınıf ve mothod(println)
		
		//javada değişken isimleri camelCase yazılır
		String ogrenciAdı="ali";
		String ogretmenAdı="ahmet";
		System.out.println(ogretmenAdı);
		
		int vade=12;
		
		double dolarDun=18.35;
		double dolarBugun=18.35;
		
		boolean dolarDustuMu=true;
		
		String dolarYonu="";
		
		if (dolarBugun<dolarDun) //boolean
		{//true
			dolarYonu="down.svg";
			System.out.println(dolarYonu);
		} 
		else if(dolarBugun>dolarDun)
		{//true
			dolarYonu="up.svg";
			System.out.println(dolarYonu);

		}
		else {// önceki if'ler false ise
			dolarYonu="equal.svg";
			System.out.println(dolarYonu);
			
		}
		
		//array
		String[] krediler= {"tüketici kredisi","taşıt kredisi","konut kredisi"};
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
	}

}
