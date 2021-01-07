package ATM;
import java.io.IOException;
import java.util.*;
import java.text.DecimalFormat;


public class Menu extends Account{ 
	Scanner menuinput=new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat("'$'#,##,###");
	
	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
    //VALIDATE LOGIN INFO CUSTOMER NUMBER AND PIN
	
	public void GetLogin() throws IOException{
		int x=1;
		
		do {
			try {
				data.put(123456, 1234);
				data.put(987456, 9874);
				System.out.println("Welcome to the ATM Simulation"+"\n");
				System.out.println("Enter your Customer number"+"\n");
				SetCustomerNumber(menuinput.nextInt());
				System.out.println("Enter your pin number");
				SetPinNumber(menuinput.nextInt());	
			} catch(Exception e) {
				System.out.println("Invalid character(s). Only Numbers.");
				x=2;
			}
			 int cn=GetCustomerNumber();
			 int pn=GetPinNumber();
			 if(data.containsKey(cn) && data.get(cn)==pn) {
				getAccountType();
			}
			 else
				 System.out.println("\n"+"Wrong customer number or pin number");
		} while(x==1);
	}
	public void getAccountType() {
		System.out.println("select the account you want to access: ");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.println("choice: ");
		selection = menuinput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thankyou for using this ATM.");
			break;
		default:
			System.out.println("/n"+"Invalid Choice"+"/n");
			getAccountType();	
	}
	}
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type 1 - Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposite Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("choice: ");
		selection=menuinput.nextInt();
		
			switch(selection) {
		case 1:
			System.out.println("Checking Account Balance: "+ moneyformat.format(GetCheckingBalance()));
			getAccountType();
			break;
		case 2:
			GetCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			GetCheckingDepositInput();
			getAccountType();
			break;
		case 4:	
			System.out.println("Thankyou for using this ATM.");
			break;
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
		    getChecking();
		}
		
		}
	
	
	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("Type 1 - Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposite Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("choice: ");
		
		selection = menuinput.nextInt();
		 
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance: "+ moneyformat.format(GetSavingBalance()));
			getAccountType();
			break;
		case 2:
			GetSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			GetSavingDepositInput();
			getAccountType();
			break;
		case 4:	
			System.out.println("invalid choice");
			getSaving();
		}
		}
	int selection;
}

