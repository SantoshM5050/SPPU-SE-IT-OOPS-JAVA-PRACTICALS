//import libr_Santosh
//pacakage assignment_SantoshM:

import java.util.Scanner;

abstract class Car_Factory {

    String compnay, car_name;
    double budget;
 abstract void getprice(double price);
 abstract void detail(String company_name, String car_name);
abstract void accessories();
   void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Company- ");
        compnay = scan.next();
        System.out.print("Car- ");
        car_name = scan.next();
        System.out.print("Rough Budget(in Lakhs)- ");
        budget = scan.nextDouble();
    }
    void display(Car_Factory obj1) {
      obj1.getprice(budget);
        System.out.println("\n-----------------------------------");
        obj1.detail(compnay, car_name);
        System.out.println("\n-----------------------------------");
        obj1.accessories();
        System.out.println("\n-----------------------------------");
    }
}
class Small_car extends Car_Factory {
    String Ans;
    public void getprice(double price) {
        if (price > 2 && price < 5)
            Ans = "No";
        else
            Ans = "Yes";

    }
    public void detail(String company_name, String car_name) {
        System.out.println("Company- " + company_name);
        System.out.println("Name of Car- " + car_name);
        System.out.println("Color- Black/White/Orange/Red");
        System.out.println("Fuel- Petrol");
        System.out.println("Gears- Manual");
    }

    public void accessories() {
        System.out.println("Types of Tyres- Alloy Wheels");
        System.out.println("Airbags- " + Ans);
        System.out.println("Back Wiper- " + Ans);
        System.out.println("Side Mirror- Two");
        System.out.println("Touch Screen Music Player- " + Ans);
    }
}

class Sedan extends Car_Factory {
    String Ans;

    public void getprice(double price) {
        if (price > 6 && price < 10)
            Ans = "No";
        else
            Ans = "Yes";
    }

    public void detail(String company_name, String car_name) {
        System.out.println("Company- " + company_name);
        System.out.println("Name of Car- " + car_name);
        System.out.println("Color- Black/White/Orange/Red");
        System.out.println("Fuel- Petrol/Diesel");
        System.out.println("Gears- Auto/Manual");
    }

    public void accessories() {
        System.out.println("Types of Tyres- Alloy Wheels");
        System.out.println("Airbags- YES");
        System.out.println("Back Wiper- YES");
        System.out.println("Side Mirror- Two");
        System.out.println("Touch Screen Music Player- YES");
        System.out.println("Roof Window- " + Ans);
    }
}

class Luxary extends Car_Factory {
    String Ans;

    public void getprice(double price) {
        if (price > 10 && price < 14)
            Ans = "No";
        else
            Ans = "Yes";
    }

    public void detail(String company_name, String car_name) {
        System.out.println("Company- " + company_name);
        System.out.println("Name of Car- " + car_name);
        System.out.println("Color- Black/White/Orange/Red");
        System.out.println("Fuel- Diesel");
        System.out.println("Gears- Auto");
    }

    public void accessories() {
        System.out.println("Types of Tyres- Alloy Wheels");
        System.out.println("Airbags- YES");
        System.out.println("Back Wiper- YES");
        System.out.println("Side Mirror- Two");
        System.out.println("Touch Screen Music Player- YES");
        System.out.println("Roof Window- YES");
        System.out.println("Automotive Garbage Cans- " + Ans);
        System.out.println("Automotice Air Freshner- " + Ans);
        System.out.println("Button Start- " + Ans);
    }
}

public class assignment10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ch;

        Car_Factory obj;
        while (true) {

            System.out.println("Which Car you want to See?- ");
            System.out.println("\n\t1.Small Car\n\t2.Sedan Car\n\t3.Luxary Car\n\t4.Exit");
            ch = scan.nextInt();
            System.out.println();

            switch (ch) {

                case 1:
                    obj = new Small_car();
                    obj.input();
                    obj.display(obj);
                    break;

                case 2:
                    obj = new Sedan();
                    obj.input();
                    obj.display(obj);
                    break;

                case 3:
                    obj = new Luxary();
                    obj.input();
                    obj.display(obj);
                    break;

                case 4:
                    System.out.println("\n-----------------------------------");
                    return;

                default:
                    System.out.println("INVALID CHOICE !!");
                    System.out.println("\n-----------------------------------");
                    break;

            }
        }
    }
}

