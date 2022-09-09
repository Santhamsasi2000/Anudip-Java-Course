package MultiThreading;

 class Sleep extends Thread
 {
	
	
		/*The homework is to create a new project called MyRunnableProject as following.  
		Create a class called MyCurrentDate that implements Runnable interface.
		The MyCurrentDate class displays the current date and time 10 times, with 100 milli seconds interval - use sleep() method for this interval.
		Create a class called MyMain, which contains main() method, in which 3 instances of MyCurrentDate threads are being run.*/
		
		public void run()
		{
			try
			{
				int currentDate;
			  for(currentDate =0;currentDate<=10;currentDate++)
			  {
				 Thread.sleep(100);
				 System.out.println("Saturday");
			  }
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
			
		public static void main(String args [])
		{
			Sleep t1= new Sleep();
			t1.start();
		}
}
		
		
		

           
	
   


