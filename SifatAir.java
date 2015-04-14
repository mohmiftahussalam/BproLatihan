import java.util.*;

public class SifatAir{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Massukan Temp air (dalam Celcius) : ");
		int suhu = sc.nextInt();
		String bentukAir="";
		
		if(suhu <= 0  )
			System.out.println("Air Menjadi padat");
		else if(suhu >= 160 )
			System.out.println("Air Menjadi gas");
		else
			System.out.println("Air Menjadi Cair");

			
	}
}