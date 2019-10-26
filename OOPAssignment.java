/**
 * @(#)OOPAssignment.java
 *
 *
 * @author Kevin Donovan
 * @version 1.00 2015/11/6
 */

import java.util.Scanner;
public class OOPAssignment {


	// Scanner to take user input
	static Scanner input = new Scanner(System.in);

	//declaring things globally, so it can be used by every method (and not just the main one)

	static String name[] = {"Kevin", "Katie", "Downey", "Brian", "Dave"};
	static String pincode[] = {"1111","2222","3333","4444","5555"};
	static int balance [] = {1000,800,2000,350,15};
	static int overdraft [] = {0,0,1,1,1};
	static int pinflag, flag=0;


    public static void main(String args[]) {//start of main method

    //Start menu method call
    startmenu();

    }//end main method

	//

	public static void startmenu(){//start menu login method

	//declare variables
	String startchoice;
	String user_pin;
	int option;
	int sub = 0;

		//welcome greeting and options
    	System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
    	System.out.println("\t\t--------Welcome to DonoBank-------");
		System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
		System.out.print("\n");
		System.out.print("\n");
		System.out.println("\t\tPlease Choose An Option\n");
		System.out.println("\t\t1: Log in\n\t\t2: Exit");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^\n");
		System.out.println("");

		startchoice=input.next();

		option = validate(startchoice, 1);


		if (option ==1){
			while (flag==0){

    		System.out.println("");
    		System.out.print("Please enter your pincode: ");
    		user_pin = input.next();

    		option = validate(user_pin, 3);
    		System.out.println("");

				for(int i=0; i<name.length; i++){// start of for loop to see if information given is correct

				if (user_pin.matches(pincode[i])){//start of if
					System.out.print("\n*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^\n");
					System.out.print("\n");
					System.out.println("Donobank Main Menu");
					System.out.print("\n");
					System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
					System.out.print("\n");
					// change the value of the flag to stop the while loop
					flag=1;
					sub=i;

					}// end of if statement
				}// end of for loop

				if(flag==0){//start of if

					System.out.println("Error, That is not a correct pin.");
					System.out.println("");

					//reprompt the user
					System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
 		   			System.out.println("\t\t--------Welcome to DonoBank-------");
					System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
					System.out.print("\n");
					System.out.print("\n");
					System.out.println("\t\tPlease Choose An Option\n");
					System.out.println("\t\t1: Log in\n\t\t2: Exit");
					System.out.print("\n");
					System.out.print("\n");
					System.out.print("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^\n");
					System.out.println("");

					startchoice=input.next();

					option = validate(startchoice, 1);

				}//end of if
			}//end of while loop
		}//end of if statement

		else if(option==2){//start of else if
			//method call
			exit();

		}//end of else if

		//menu method call
		menu(sub);
	}// end of startmenu method

	//Main Menu Method
	public static void menu(int msub){//start of main menu method

		//declare variables
		String menulist = "\t\t\n\n1: Lodge \t\t\n2: Withdraw \t\t\n3: Change Pin \t\t\n4: Quit";
		String choice;
		int menuoption;

		String withdraw, lodge;
		String result;


		//welcome stuff
		System.out.println("Welcome " +name[msub]+ " to Donobank");
		System.out.println("Your Balance is: " +balance[msub]+"");
		System.out.print("\n");
		System.out.println(""+menulist+"");
		System.out.print("\n");
		System.out.print("Please Choose an Option: ");

		choice=input.next();

		menuoption = validate(choice, 2);


		//if the user hits 1: Lodge
		if(menuoption==1){// start of if

		//insert lodge call

		}//end if

		//if the user hits 2: Withdraw
		if(menuoption==2){// start of if

		//insert withdraw maths stuff here

		}//end if

		//if the user hits 3: Change pin
		if(menuoption==3){// start of if

		//insert change pin crap here

		}//end if


		//if the user hits 4:Quit
		if(menuoption==4){// start of if
		System.out.println("\n");
		System.out.println("You have been logged out");
		System.out.println("\n");

		//this calls the startmenu
		flag =0;
		startmenu();


		}//end if

	}// end of main menu method

	public static string lodge()


	//Exit Method, this is used if I need to exit the program.
	public static void exit(){//start exit method

		System.out.println("");
		System.out.println("Thank You for using DonoBank, Have a nice day");
		System.exit(0);

	}//end exit method

	//giant validate method start
	public static int validate(String x, int y){

		if (y==1){

			while(!x.matches("[1-2]")){
			System.out.println("Error, Please only use numbers 1-2\n");
			//re prompt user
			System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
    		System.out.println("\t\t--------Welcome to DonoBank-------                 ");
			System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
			System.out.print("");
			System.out.println("\t\tPlease Choose An Option\n");
			System.out.println("\t\t1: Log in\n\t\t2: Exit");
			System.out.print("");
			System.out.print("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^\n");
			System.out.print("");
			x=input.next();

			}//end of while

		}//end of if

		if(y==2){//start if

			while(!x.matches("[1-4]")){//start of while
			System.out.println("Error, Please only use numbers 1-4\n");

			//this allows the user to input again
			x=input.next();
			}//end while

		}//end if

		if(y==3){

			while(!x.matches("\\d+")){//start of while
			System.out.println("Error, Please use Digits only. \n");

			//re prompt user
			x=input.next();

			}//end while
		}//end if

		if(y==4){//start of if

			while(!x.matches("\\d{4}")){//start of while
			System.out.println("Error, Please use 4 Digit only. \n");

			}//end of while

		}//end of if

		//Here's the return for x
		return Integer.parseInt(x);


	}//end vali method



}// end class

