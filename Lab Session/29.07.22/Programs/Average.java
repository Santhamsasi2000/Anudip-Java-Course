package Methodname;
import java.util.Scanner;

public class Average
{    
	public static  void findaverage(int ASA,String Name)
	{  
		int  TSA=13;
		int AVERAGE1=(ASA/TSA)*100;
       System.out.println(Name +"  attended the class percentage is " +AVERAGE1+"%");
	}
     public static void main(String[]args)
     {   
       Scanner obj=new Scanner(System.in);
   	   String Name = obj.nextLine();
   	   System.out.println("enter the name:"+ Name);
   	   int ASA = obj.nextInt();
   	   System.out.println("enter the attendance attend:"+ ASA);
   	   findaverage(ASA,Name);
      }
 }

