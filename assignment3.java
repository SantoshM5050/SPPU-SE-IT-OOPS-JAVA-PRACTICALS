//import libr_Santosh
//pacakage assignment_SantoshM

import java.util.Scanner;
class Employee {
	Scanner sc= new Scanner(System.in);
	String emp_name;
	String address;
	String mail_id;
	long mobile_no;
	int emp_id;
	double basic_pay;
	static int id=10000;
	double net_salary,gross_salary;
	double hra,da,pf,staff_club_fund;
	
	 Employee(){
		 id++;
	}
	 
	void input() {
	System.out.print("Enter the name of Employee: ");
	emp_name=sc.nextLine();
	System.out.print("Employee ID:  ");
	emp_id=sc.nextInt();
	emp_id=id;
	System.out.print("Enter Address:  ");
	address=sc.next();
	System.out.print("Enter Mobile No.:  ");
	mobile_no=sc.nextLong();
	}
	
	void display(){
		
      	System.out.println("****************************************************************");
		System.out.println("EMP NAME\tID \tADDRESS\t\tMOBILE");
		System.out.println("****************************************************************");	     
System.out.println(emp_name+"\t\t"+emp_id+"\t"+address+"\t\t"+mobile_no +"\n");	
	}
	
	void salary(){
		da=basic_pay*.97;
		hra=basic_pay*.10;
		 pf=basic_pay*.12;//calculating pf
		staff_club_fund=basic_pay*0.001;//calculating staff_club_fund
		gross_salary=basic_pay + hra;//calculating gross salary
		
		int k=0;
		while(k<3) {			//loop for bonus salary
			System.out.println("   DOES DO YO HAVE DONE ANY EXTRA WORK \n\t1. PATENT \n\t2. OTHER BENIFICIAL WORK \n\t3.NO  ");
			System.out.print("Choice::");
			k=sc.nextInt();
			if (k==1) //if input is 1
				gross_salary+=3000;
			else if(k==2)//if input is 2
				gross_salary+=2000;
			else if(k==3)//if input is 3
				break;
			else//if invaid choice
				System.out.println("INVALID CHOICE.");
		}
		
		net_salary=gross_salary-pf-staff_club_fund;
		System.out.println("=================================================================================");
	}
	
	void salary_slip() {
		System.out.println("****************************************************************");
		System.out.println(" BASIC   PAY 		:	"+basic_pay);
		System.out.println(" HRA 	    	       	:	"+hra);
		System.out.println(" PF   	    		       :	"+pf);
		System.out.println(" GROSS SALARY       	: 	"+gross_salary);
		System.out.println(" NET SALARY 	       	: 	"+ net_salary);
		System.out.println("****************************************************************");
	}
	

}



class Programmer extends Employee{
		void read_programmer() {
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC PAY[30000-40000]: ");
			basic_pay=sc.nextDouble();
			if(basic_pay>40000 || basic_pay<30000) {
				System.out.println("SORRY!!!!!! BASIC  PAY FOR PROGRAMMER  MUST BETWEEN  [30000 - 40000]  \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}

			System.out.println("=================================================================================");
		}
		
		static void search(Programmer arr[],int key,int n) {
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					arr[i].display();//dispay database for programmer
					arr[i].salary_slip();//printing salary slip
				}
				else {
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  PROGRAMMERS  ");
				}		
			}
		}
	}



class Teamlead extends Employee{
		void read_teamlead() {
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [40000 - 50000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>50000 || basic_pay<40000) {
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [40000 - 50000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}
			System.out.println("=================================================================================");
	}
		
		static void search(Teamlead arr[],int key,int n) {
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					arr[i].display();//dispay database for Teamlead
					arr[i].salary_slip();//printing salary slip
				}
				else {
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
				}
			}
		}
	}


class Asst_pro_manager extends Employee{
		void read_Asst_pro_manager() {
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [50000 - 60000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>60000 || basic_pay<50000) {
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [50000 - 60000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}
			System.out.println("=================================================================================");
	}
		
		static void search(Asst_pro_manager arr[],int key,int n) {
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					arr[i].display();//dispay database for Asst_pro_manager
					arr[i].salary_slip();//printing salary slip	
				}
				else {
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
				}		
			}
		}
	}


class Pro_manager extends Employee{
	void read_Pro_manager() {
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [60000 - 70000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>70000 || basic_pay<60000) {
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [60000 - 70000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
			}
			System.out.println("=================================================================================");
	}
		
		static void search(Pro_manager arr,int key) {
			if (arr.emp_id==key) {
				System.out.println("       EMPLOYEE  FOUND  ");
				arr.display();//dispay database for Pro_manager
				arr.salary_slip();//printing salary slip
			}
			else {
				System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
			}
		}
	}


public class assignment3 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Programmer p[]=new Programmer[3];			 
			Teamlead t[]=new Teamlead[3];                
			Asst_pro_manager a[]=new Asst_pro_manager[2];
			Pro_manager m=new Pro_manager();			 
			aa:
			do {
				System.out.println("=================================================================================");
				System.out.println(" MAIN  MENU  \n\n1.PROGRAMMER \n2.TEAM LEAD \n3.ASSISTANT PROJECT MANAGER \n4.PROJECT MANAGER \n5.EMPLOYEE SEARCH \n6.EXIT");
				System.out.print("Choice::");
				int k=sc.nextInt();//input choice from user
				System.out.println("=================================================================================");
				int op;
				int assign1=0,assign2=0,assign3=0,assign4=0;		
				switch(k) {
				
				case 1://if input from user is 1
					do {
						System.out.print("\tPROGRAMMER  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM PROGRAMMER \n\tChoice::");
						op=sc.nextInt();
						System.out.println("=================================================================================");
						if(op==1)//if input from user is 1
						{
							assign1=6;
							for (int i=0;i<3;i++) {
								p[i]=new Programmer();
								p[i].read_programmer();
								p[i].salary();
							}
						}
						else if(op==2  && assign1==6)
						{
							for (int i=0;i<3;i++) {
								p[i].display();
								p[i].salary_slip();
							}
						}
						else if(op==2 && assign1!=6)
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
				
				case 2://if input from user is 2
					do {
						System.out.print("\tTEAMLEAD  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM TEAMLEAD SECTION  \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
							assign2=4;
							for (int i=0;i<3;i++) {
								t[i]=new Teamlead();
								t[i].read_teamlead();
								t[i].salary();
							}
						}
						else if(op==2 && assign2==4)
						{
							for (int i=0;i<3;i++) {
								t[i].display();
								t[i].salary_slip();
						}
					}
						else if(op==2 && assign1!=6) 
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  TEAMLEADS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 3://if input from user is 3
					do {
						System.out.print("\tASSISTANT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  ASSISTANT MANAGER \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
							assign3=2;
							for (int i=0;i<2;i++) {
								a[i]=new Asst_pro_manager();
								a[i].read_Asst_pro_manager();
								a[i].salary();
							}
						}
						else if(op==2 && assign3==2)
						{
							for (int i=0;i<2;i++) {
								a[i].display();
								a[i].salary_slip();
						}
					}
						else if(op==2 && assign1!=6) 										System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 4://if input from user is 4
					do {
						System.out.print("\tPROJECT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  PROJECT  MANAGER  SECTION \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
								assign4=1;
								m.read_Pro_manager();
								m.salary();
						}
						else if(op==2 && assign4==1)
						{
								m.display();
								m.salary_slip();
						}
						else if(op==2 && assign1!=6) System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 5://if input from user is 5
					String des;
					int key;
					System.out.print("ENTER  THE  DISIGNATION  OF  EMPLOYEE  YOU  WANT  TO  SEARCH : ");
					des=sc.next();
					System.out.print("Enter Emplyee ID:");
					key=sc.nextInt();
					if(des.toLowerCase().equals("programmer"))
					{
						Programmer.search(p,key,6);
					}
					else if(des.toLowerCase().equals("teamlead"))
					{
						Teamlead.search(t, key, 4);
					}
					else if(des.toLowerCase().equals("assistant"))
					{
						Asst_pro_manager.search(a, key, 2);
					}
					else if(des.toLowerCase().equals("manager"))
					{
						Pro_manager.search(m, key);
					
					}
					else {
						System.out.println("INVALID INPUT");
					}
					System.out.println("===================================================================================================");
					break;
					
				case 6://if input from user is 6
					System.out.print("Would you like to Exit\n\t1.YES\n\t2.No\n\tChoice::");
					int temp=sc.nextInt();
					if(temp==1)//checking for breaking loop
						break aa;//breaking menu bar
					
				default://default 
					System.out.println("   INVALID   ");
				}
				
			}while(true);
			sc.close();//closing scanner class object
		}
}



