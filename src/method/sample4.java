package method;

public class sample4 {
	
	
		//3. non-static method call from same class
		
		public static void main(String[] args)
		{
			System.out.println("Hi");
			
			//classname objectname=new classname();    --> 1. Create Object of current class
			//objectname.methodname();          	 -->   2. method call
			
			sample4	s4=new sample4();
			s4.m5();
			s4.m6();
			s4.m6();
					
			//1. sample4 --> classname  --> datatype of object
			//2. s4    --> objectName  --> To refer/identify object
			//3. new   --> keyword  --> to create blank/empty object
			//4. sample4()  --> classname() --> Constructor --> To copy/load all the members of class into object				
		}
		
		
		//non-static regular method
		public void m5()
		{
			System.out.println("running non-static regular method: m5");
		}

		
		//non-static regular method
		public void m6()
		{
			System.out.println("running non-static regular method: m6");
		}
	}

