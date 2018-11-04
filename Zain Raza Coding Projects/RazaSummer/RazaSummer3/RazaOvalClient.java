//**********************************************
//	Author name: Zain Raza
//	
//	Description: RazaOvalClient.java
//	Client code demonstrates the use of the Oval
//	class.
//
//	Due Date: August 28, 2018
//**********************************************

public class RazaOvalClient
{
//***************************************************
//	Instaniation of an Oval object, followed by
//	initialization of Oval primitive data through 
//	methods accessible to objects of the Oval class.
//***************************************************

	public static void main(String[] args)
		{
			RazaOvalClass Jimmy = new RazaOvalClass();// instaniation
			Jimmy.setWidth(12);// initializes width
			Jimmy.setLength(7.5); // initializes length
	
			System.out.println("Width of oval: " + Jimmy.getWidth());// outputs width
			System.out.println("Length of oval: " + Jimmy.getLength());// outputs length
			System.out.println("Area of oval: " + Jimmy.area());// outputs area of oval
		}	

}