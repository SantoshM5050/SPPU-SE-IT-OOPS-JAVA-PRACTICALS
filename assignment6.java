//import libr_Santosh
//pacakage assignment_SantoshM:
import java.util.Scanner;
class assignment6 {
   public static void main (String args[]) {
      int num1, num2,result;
	
	Scanner sc = new Scanner(System.in);
      try {
        
 
         System.out.println("1: ");
	     num1=sc.nextInt();
         System.out.println("2: ");
         num2=sc.nextInt();

         result = num1/num2;

          System.out.println("result"+result);
         System.out.println("Hey I'm at the end of try block");
      }
      catch (ArithmeticException e) { 
        
         System.out.println("You should not divide a number by zero");
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Warning: ArrayIndexOutOfBoundsException");
     }
     catch (NumberFormatException e){
        System.out.println("num for,mat ");
     } 


      catch (Exception e) {
        
         System.out.println("Exception occurred");
         System.out.println(e);
        }

      System.out.println("I'm out of try-catch block in Java.");
   }
}
