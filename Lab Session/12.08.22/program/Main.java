package inheritance;
class Devices
{
	String Model,ModelName,Ram,Storage;
	int i,j;
}

 class Computer extends Devices
 
{   int RamPrice,StoragePrice;
	Computer( String m,String n,String r, String s,int i,int j)
	{
		this.Model=m;
		this.ModelName=n;
		this.Ram=r;
		this.Storage=s;
		RamPrice= i * 2000;
		StoragePrice=j * 5000;
	}
}
class Smartphone extends Devices
{ 
	int RamPrice1,StoragePrice1;
	
	
	Smartphone (String m,String n,String r,String s,int i,int j)
	{   
		this.Model=m;
		this.ModelName=n;
		this.Ram=r;
		this.Storage=s;
		RamPrice1=i*500;
		StoragePrice1=j*1000;
	}
}
class Laptop extends Devices
   
{  int RamPrice2,StoragePrice2;
	Laptop (String m,String n,String r,String s,int i,int j)
	{
	
	
	this.Model=m;
	this.ModelName=n;
	this.Ram=r;
	this.Storage=s;
	RamPrice2=i*5000;
	StoragePrice2=j*10000;
	}
}
public class Main
{   public static void main(String args[])
	{
	    Laptop obj1=new Laptop("Dell","inspiron5","8gb","512gb",16,512);
	    Smartphone obj2 = new Smartphone ("Samsung","m21","6gb","128gb",2,16);
	    Computer obj3 = new Computer ("Lenovo","333","16gb","1Tb",8,64);
	    System.out.println(obj1.Model+ " " +obj1.ModelName + " " +obj1.Ram+ " " +obj1.Storage);
	    System.out.println(obj2.Model+ " " +obj2.ModelName + " " +obj2.Ram+ " " +obj2.Storage);
	    System.out.println(obj3.Model+ " " +obj3.ModelName + " " +obj3.Ram+ " " +obj3.Storage);
	    System.out.println(obj3.RamPrice + " is the price of increasing 16gb ram for my Lenovo Desktop and its increasing 1TB storage space cost is" + obj3.StoragePrice);
	    System.out.println(obj2.RamPrice1+ " is the price of increasing 2gb ram for my Samsung phone and its increasing 16gb storage space cost is" + obj2.StoragePrice1);
	    System.out.println(obj1.RamPrice2 + " is the price of increasing 16gb ram for my Dell laptop and its increasing 512gb storage space cost is" + obj1.StoragePrice2);
	    
	}
}
