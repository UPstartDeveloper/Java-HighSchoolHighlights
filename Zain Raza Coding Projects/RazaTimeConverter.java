import java.util.Scanner;
/**
 *Zain Raza
 *Due Sept. 21, 2017
 *RazaTimeConverterallows user a choice of coverting between hours to minutes, days to hours, minutes to hours, or hours to days. Includes multiple methods.
 */
 public class RazaTimeConverter{
 		public static void hoursToMinutes(double min){//for converting hours to minutes
 		Scanner input=new Scanner(System.in);
 		double hr=0;
 		System.out.println("Enter amount of hours: ");//user prompt
 		hr=input.nextDouble();
 		min=hr*60;//conversion
 		System.out.println(hr + " hours equals " + min + " minutes.");
 	} 	public static void daysToHours(double hr){
 		hr=0;
 		int day=0;
 		Scanner input=new Scanner(System.in);
 		System.out.println("Enter amount of days: ");//user prompt
 		day=input.nextInt();
 		hr=day*24;//conversion
 		System.out.println(day + " days equals " + hr + " hours.");
 	}	public static void minutesToHours(double hr){
 		Scanner input=new Scanner(System.in);
 		hr=0;
 		double min=0;
 		System.out.println("Enter amount of minutes: ");//user prompt
 		min=input.nextDouble();
 		hr=min/60;//conversion
 		System.out.println(min + " minutes equals " + hr + " hours.");
 	}	public static void hoursToDays(double day){
 		Scanner input=new Scanner(System.in);
 		double hr=0;
 		day=0;
 		System.out.println("Enter amount of hours: ");//user prompt
 		hr=input.nextDouble();
 		day=hr/24;//conversion
 		System.out.println(hr + " hours equals " + day + " days.");
 	}	public static void main(String[] args){//main application
 		double min=0; 
 		double hr=0;
 		double day=0;
 		int choice=0;
 		Scanner input=new Scanner(System.in);
 		
 		System.out.println("1.Convert hours to minutes.");//user prompt for calculation
 		System.out.println("2. Convert days to hours.");//user prompt for calculation
 		System.out.println("3. Convert minutes to hours.");//user prompt for calculation
 		System.out.println("4. Convert hours to days.");//user prompt for calculation
 		choice=input.nextInt();
 		if(choice==1){
 			hoursToMinutes(min);
 			} else if(choice==2){
 			  daysToHours(hr);
 			} else if(choice==3){
 			  minutesToHours(hr);
 			} else if(choice==4){
 			  hoursToDays(day);
 			} 
 	}
 	}

 