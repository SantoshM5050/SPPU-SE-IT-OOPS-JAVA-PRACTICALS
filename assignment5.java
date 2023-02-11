//import libr_Santosh
//pacakage assignment_SantoshM:
import java.util.Scanner;

interface vehicle {		
	void gear_change(int a);		
	void speed_up();
	void apply_brakes();
	void display();

}


class bicycle implements vehicle
{
	int gear,speed;
	
	bicycle()			
	{
		System.out.println("\tBicycle started successfully\n ");
		gear=1;			
		speed=10;		
	}
	
	public void gear_change(int gearex)
	{
		if(gearex<7 && gearex>0)		
		{
			gear=gearex;
			System.out.println("\tGear changed Successfully \n\t Current Gear Is "+gear);
		}
		else
			System.out.println("Gear is Out Of Range \n");
	}
	
	public void speed_up()			
	{
		if((speed+5)<50 ) {		
			speed+=5;
			System.out.println("\n\tBicycles speed increased \n\t current speed is "+speed);
		}
		else
			System.out.println("Speed Cannot Be Increased Above 50 Kmhr\n");
	}
	
	public void apply_brakes()		
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("1. DECREASE SPEED\n2. STOP BICYCLE\n");
		x=sc.nextInt();
		
		if(x==1)
			if((speed-5)>0)			
			{
				speed-=5;			
				System.out.println("Speed Reduced Successfull \n\tCurrent speed is "+speed+" Kmhr \n");
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Bicycle stopped Successfully\n ");}
				
		if(x==2)			
		{
			speed=0;
			gear=0;
			System.out.println("Bicycle stopped Successfully\n ");
		}
		
	}
	
	public void display()		
	{
		System.out.println("YOUR  BICYCLE'S SPEED IS "+speed +" Kmhr AND GEAR IS "+gear);
	}
}





class car implements vehicle		
{
	int gear,speed;
	
	car()
	{
		System.out.println("\tCar started successfully\n ");
		gear=1;			
		speed=10;		
	}
	public void gear_change(int gearex)
	{
		if(gearex<7 && gearex >0)	
		{
			this.gear=gearex;
			System.out.println("\tGear changed Successfully \n\t Current Gear is "+gear);
		}
		else
			System.out.print(" Gear Out Of Range \n");
	}
	
	public void speed_up()
	{
		
		if((speed+20)<150 )			
		{
			speed+=20;
			System.out.println("Cars speed increased \n\t Current speed is "+speed+" Kmhr\n");
		}
		else
			System.out.println("Speed Cannot Be Increased Above 150 Kmhr\n");
			
	}
	
	public void apply_brakes()
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("1. TO DECREASE SPEED\n2. TO STOP CAR\n");
		x=sc.nextInt();
		if(x==1)
			if((speed-20)>0)		
			{
				speed-=20;			
				System.out.println("Speed Reduced Successfully \n\tCurrent Speed Is "+speed+" kmhr\n");
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Car stopped Successfully\n ");}
		if(x==2)
		{
			speed=0;
			gear=0;
			System.out.println("Car stopped Successfully \n");
		}	
	}
	
	public void display()		
	{
		System.out.println("YOUR  CAR'S SPEED IS "+speed +" Kmhr AND GEAR IS "+gear+"\n");
	}

}




class bike implements vehicle
{
	int gear,speed;		
	
	bike()
	{
		System.out.println("\tBike started successfully \n");
		gear=1;		
		speed=10;	
	}
	public void gear_change(int gearex)
	{
		if(gearex<6 && gearex>0)		
		{
			gear=gearex;
			System.out.println("\tGear changed Successfully \n\t Current Gear IS "+gear);
		}
		else
			System.out.println("Gear out of range \n");
	}
	
	public void speed_up()
	{
		if((speed+20)<100 )		
		{
			speed+=20;
			System.out.println("Bike's speed increased \n\t Current speed is "+speed+" Kmhr.\n");
		}
			else
				System.out.println("Speed Cannot Be Increased Above 100 Kmhr \n");
			
	}
	
	public void apply_brakes()			
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("1. TO DECREASE SPEED\n2. TO STOP bike\n");
		x=sc.nextInt();
		if(x==1)
			if((speed-20)>0)	
			{
				speed-=20;			
				System.out.println("Speed Reduced Successfull   \n\tCurrent speed is "+speed+ "kmhr\n" );
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Bike stopped Successfully \n");}
		if(x==2)
		{
			speed=0;
			gear=0;
			System.out.println("Bike stopped Successfully \n");
		}
		
	}
	
	public void display()		
	{
		System.out.println("YOUR  BIKE'S SPEED IS "+speed +" Kmhr AND GEAR IS "+gear+"\n");
	}
}


public class assignment5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);		
		
		vehicle v=null;			
		System.out.println("======================================================================");
		int y;			
		bb:		
		do {
			System.out.print("  SELECT VEHICLE  \n\t1.BICYCLE \n\t2.CAR  \n\t3.BIKE \n\t4.Exit \nChoice::");
			 y=sc.nextInt();
			 
			 System.out.println("======================================================================");
			 
			if(y==1)		
				v=new bicycle();	
			else if(y==2)
				v= new car();		
			else if(y==3)
				v=new bike();		
			else if(y==4)
				break bb;			
			else
				System.out.println("INVALID INPUT");
				System.out.println("======================================================================");
			
			if(0<y&&y<4) {
			aa:		
				do {
					System.out.print(" \tPress 1. Speed Up \n\tPress 2. Change gear \n\tPress 3. Apply Brakes  "
						+ "\n\tPress 4. Display Vehicle Status \n\tPress 5. change Vehicle /Exit \nChoice::");
					int z=sc.nextInt();  		
					System.out.println("======================================================================");
				switch(z)
				{
				case 1:
					v.speed_up();
					System.out.println("======================================================================");
					break;
				case 2:
					System.out.print("which gear you want?   ");
					int a=sc.nextInt();
					v.gear_change(a);
					System.out.println("======================================================================");
					break;
					
				case 3:
					v.apply_brakes();
					System.out.println("======================================================================");
					break;
				case 4:
					v.display();
					System.out.println("======================================================================");
					break;
				case 5:
					break aa;		
				default:
						System.out.println("Invalid Input");
					
				}
				}while(true);
			}
				
			
			
		}while(y!=4); 
	}

}




