package ATM;
import java.text.DecimalFormat;
import java.util.*;
public class Account {
	private int customernumber;
	private int pinnumber;
	private double checkingbalance=0,savingbalance=0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat("'$'#,##,###.00");
	
	//set the customer number
	
	public int SetCustomerNumber(int customernumber) {
		this.customernumber=customernumber;
		return customernumber;
	}
		// get customer number
		
	public int GetCustomerNumber() {
		return customernumber;
	}
	
	//set pin number
	
	public int SetPinNumber(int pinnumber) {
		this.pinnumber=pinnumber;	
		return pinnumber;
	}
	
	public int GetPinNumber() {
		return pinnumber;
	}
     
	//get checking account balance
	
   public double GetCheckingBalance() {
	   return checkingbalance;
   }
   
   //getting saving account balance
   
   public double GetSavingBalance() {
	   return savingbalance;
   }
	
   //calculating checking account withdrawal
   
   public double CalcCheckingWithdraw(double Camount) {
	   checkingbalance=(checkingbalance-Camount);
	   return checkingbalance;
   }
	    
	//calculating saving account withdrawal
	   
	public double CalcSavingWithdraw(double Samount) {
		savingbalance=(savingbalance-Samount);
		return savingbalance;
	}
		
	//calculating checking account deposit
		
	public double CalcCheckingDeposit(double Camount) {
		checkingbalance=(checkingbalance+Camount);
		return checkingbalance;
	}
	
	//calculating saving account deposit
	
	public double CalcSavingDeposit(double Samount) {
		savingbalance=(savingbalance+Samount);
		return savingbalance;
	}
	
	//customer checking account withdraw input
	
	public void GetCheckingWithdrawInput() {
		System.out.println("checking account balance: "+ moneyformat.format(checkingbalance));
		System.out.println("Amout you want to withdraw from Checking Account: ");
		double Camount = input.nextDouble();
		
		if((checkingbalance-Camount)>=0) {
			CalcCheckingWithdraw(Camount);
			System.out.println("New checking account balance: "+moneyformat.format(checkingbalance));
		}
		else 
			System.out.println("Balance cannot be negative"+"\n");
	}
	
	//customer saving account withdraw input
	
	public void GetSavingWithdrawInput() {
		System.out.println("saving account balance: "+ moneyformat.format(savingbalance));
		System.out.println("Amount you want to withdraw from saving account: ");
		double Samount =input.nextDouble();
		
		if((savingbalance-Samount)>=0) {
			CalcSavingWithdraw(Samount);
			System.out.println("New saving acount balance"+moneyformat.format(savingbalance));
		}
		else
			System.out.println("Balance cannot be negative."+"\n");
	}
	
	//customer checking account deposit input
	
	public void GetCheckingDepositInput() {
		System.out.println("Checking account balance"+ moneyformat.format(checkingbalance));
		System.out.println("Amount you want to Deposit from checking account: ");
		double Camount=input.nextDouble();
		
		if((checkingbalance+Camount)>=0) {
			CalcCheckingDeposit(Camount);
			System.out.println("New checking balance amount"+ moneyformat.format(checkingbalance));
		}
		else
			System.out.println("Balance cannot be Negative"+"\n");
		}
	
	//customer saving account deposit input
	
   public void GetSavingDepositInput() {
	   System.out.println("saving account Balance"+moneyformat.format(savingbalance));
	   System.out.println("Amount you want to Deposit from saving account");
	   double Samount=input.nextDouble();
	   
	   if((savingbalance+Samount)>=0) {
		   CalcSavingDeposit(Samount);
		   System.out.println("New saving balance amount"+ moneyformat.format(savingbalance));
	   }
	   else
		   System.out.println("Balance cannot be Negative"+ "\n");
   }
}

