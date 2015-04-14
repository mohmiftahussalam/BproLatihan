public class HitungLuasLingkaran{
	public static final float PHI=22.0f/7.0f;
	public static void main(String []args){
		//baca nilai radius
		float radius = 3.0f;
		//hitung luas lingkaran
		float luas = PHI * (radius * radius);
		//tampil hasil
		System.out.println("Luas Linkaran = " + luas);
	}
}