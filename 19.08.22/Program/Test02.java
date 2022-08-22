package Abstraction;

abstract class Authour
{   String Name;
    String Description;
	abstract void name();
	abstract void Address();
	Authour (String Name,String Description)
	{
		this.Name=Name;
		this.Description=Description;
	}
	
}  

class Book1 extends Authour
{  
void name()
{
	System.out.println("sasi");
} 

  

void Address()
{
	System.out.println("chennai");
}  

}
  
  
public class Test02
{  

	public static void main(String args[])
	{  

		
		Authour s=new Authour ("The Ghost","it is crime story");
		
		
		
      
        
     }  
}  