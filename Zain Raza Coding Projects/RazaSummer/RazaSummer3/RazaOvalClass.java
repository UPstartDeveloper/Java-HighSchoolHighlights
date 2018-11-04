//**************************************
//	Author name: Zain Raza
//
//	Description: RazaOvalClass.java
//	Demonstrates how to design a class.
//
//	Due Date: August 28, 2018
//**************************************

public class RazaOvalClass
{
//*******************************************
//	Demonstrates the use of a constructor
//	and several set and get methods in 
//	in writng a class for geometric figures.
//*******************************************

// Variables
double width;// stores width of oval
double length;// stores length of oval

//Constructor
	public RazaOvalClass()// allows for instantiation of Oval objects
		{
			
		}

//Methods
public void setWidth(double w)
{
	width = w;// changes the width of the oval
}

public void setLength(double l)
{
	length = l;// changes the length of the oval
}

public double getWidth()
{
	return width;// returns the width
}

public double getLength()
{
	return length;// returns the length
}

public double area()
{
	double area = ((width*length)*0.8);// calculates the area given current length and width
	return area;// returns the area	
}

}