package classandobjects;



	/*SasiKumar 
========
. Create a class called Employee that includes three pieces of information as instance variables—a first name
(typeString), a last name (typeString) and a monthly salary (double). Your class should have a constructor that
initializes the three instance variables. Provide a set and a get method for each instance variable. If the monthly
salary is not positive, set it to 0.0. Write a test application named EmployeeTest that demonstrates class
Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each
Employee a 10% raise and display each Employee’s yearly salary again.*/
	


class Lab
{     private String FirstName;
      private String LastName;
      private double MonthlySalary;
      public String getFirstName()
      {    return FirstName;
      
      }
      public void setFirstName(String fName)
      {    this.FirstName=fName;
      
      }
      public String getLastName()
      {    return LastName;
      
      }
      public void setLastName(String LName)
      {    this.LastName=LName;
      
      }
      public double getMonthlySalary()
      {    return MonthlySalary;
      
      }
      public void setMonthlySalary(double MSalary)
      {    this.MonthlySalary=MSalary;
      
      }
      public static void main (String args[])
      {      Lab obj1=new Lab();
             obj1.setFirstName("SASI");
             obj1.setLastName("KUMAR");
             obj1.setMonthlySalary(26000.3445);
             System.out.println(obj1.getFirstName());
             System.out.println(obj1.getLastName());
             System.out.println(obj1.getMonthlySalary());
             double YearlySalary=obj1.getMonthlySalary()*12;
             double IncrementSalary= (YearlySalary /10)*100;
             System.out.println(IncrementSalary);
             
             
      }
             
             
             
      }
      
      
      


