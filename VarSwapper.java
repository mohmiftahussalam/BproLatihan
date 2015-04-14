public class VarSwapper{
	public static void main(String []args){
		int a=50;
		int b=20;
		
		//cetak isi var a dan b
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("");
		System.out.println("Nilai a dipindah ke b dan b dipindah ke a");
		System.out.println("");
		
		a=(a+b);//70
		b=(a-b);//50
		a=(a-b);//20
		
		// proses pindah isi variabel
		System.out.println("Nilai A = " + a);
		System.out.println("Nilai B = " + b);
		
		
	}
}