//import libr_Santosh
//pacakage assignment_SantoshM:
import java.util.Scanner; 
abstract class Shape{ 
double x,y; 
void accept(double x, double y){ 
this.x=x; 
this.y=y; 
} 
abstract public void Compute_area(); 
} 
class Rectangle extends Shape{ 
double length; 
double breadth; 
public void Compute_area(){ //method overriding 
length = x; 
breadth = y; 
System.out.println("Area of a Rectangle is: " 
+(length*breadth)+"sqcm"); 
} 
} 
class Triangle extends Shape{ 
double base; 
double height; 
public void Compute_area(){ //method overriding 
base = x; 
height = y; 
System.out.println("Area of a Triangle is: " 
+(0.5*base*height)+"sqcm"); 
} 
} 
public class assignment4{ 
public static void main(String args[]){ 
Scanner in = new Scanner(System.in); 
Rectangle rect1 = new Rectangle(); 
System.out.println("Enter Length & Breadth of Rectangle in cm"); 
double l=in.nextDouble(); 
double b=in.nextDouble(); 
rect1.accept(l,b); 
rect1.Compute_area(); 
Triangle tri1 = new Triangle(); 
System.out.println("\nEnter Height & Base of Triangle in cm"); 
double h=in.nextDouble(); 
double base=in.nextDouble(); 
tri1.accept(h,base); 
tri1.Compute_area(); 
} 
} 
