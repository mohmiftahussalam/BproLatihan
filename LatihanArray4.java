public class LatihanArray4
{
	public static void main(String []args)
	{
		//deklarasi dan inisialisasi jadi satu
		
		int []arr =  new int[20];
		int total = 0;
		double rataRata = 0.0;
		int min;
		int max;
		System.out.println("mengisi arry dengan 20 baris");
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*50.0);
			total +=arr[i];
		}
		
		rataRata = (double)total/(double)arr.length;
		System.out.println("menampilkan hasi bilangan random dalam");
		min = arr[0];
		max = arr[0];
		
		for(int j=0; j<arr.length;j++)
		{
			if(min>arr[j])
				min=arr[j];
			if(min>arr[j])
				min=arr[j];
			
			System.out.println("data random ke ["+j+"] =" + arr[j]);
		} 		
		
		System.out.println("rata - rata =" + rataRata);
		System.out.println("nilai min =" + min);
		System.out.println("nilai max =" + max);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"\t");	
			for(int j=0; j<arr[i]; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}