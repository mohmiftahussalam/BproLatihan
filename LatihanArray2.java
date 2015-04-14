public class LatihanArray2
{
	public static void main(String []args)
	{
		//deklarasi dan inisialisasi jadi satu
		int []arry = new int[5];
		
		arry[0] =100;
		arry[4] =30;
		
		int i=0;
		while(i<5)
		{
		System.out.println("isi arry ke ["+ i+"] " + arry[i]);
			i++;
		}			
	}
}