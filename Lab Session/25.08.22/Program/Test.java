package interfaces;



public class Test {

	public static void main(String[] args) {
		BloodDoner obj=new BloodDoner();
		obj.chennai(6,"Sasi",6369499827l);
		obj.Madurai(4,"ramamorthy",9578058484l);
		obj.Coimbatore(8,"Sagayam",9876543210l);
		System.out.println(obj.Trichy(10,"Veda",8825779313l));
	}

}

	interface Doners
	{
		
		void chennai(int a,String b,long c );
		void Madurai(int d,String e,long f);
		void Coimbatore(int g,String h,long i );
		String Trichy (int j,String k, long l);
		
		
	}
	class BloodDoner implements Doners
	{
		public void chennai(int a,String b,long c )
		{
			System.out.println("No of Doners in Chennai ="+ a + "," + "Arrangement Supervisor ="+ b +"," +"His Mobile Number =" + c);
		}
		public void Madurai(int d,String e,long f)
		{
			System.out.println("No of Doners in Madurai ="+ d + "," + "Arrangement Supervisor ="+ e +"," +"His Mobile Number =" + f);
		

		}
		public void Coimbatore(int g,String h,long i )
		{
			System.out.println("No of Doners in Coimbatore ="+ g + "," + "Arrangement Supervisor ="+ h +"," +"His Mobile Number =" + i);
		}
		public String Trichy (int j,String k, long l)
		{
			return("No of Doners in Trichy ="+ j + "," + "Arrangement Supervisor ="+ k +"," +"His Mobile Number =" + l);
			
		}
	}
		