package bank.inheritance;
public class InheritanceDemo {

   
 public static void main(String[] args) {
  //Creating an instance of NRIAccount class and invoking the appropriate methods 
  NRIAccount nriAccount=new NRIAccount();
  nriAccount.depositAmount=5000;
  nriAccount.depositMoney();
 
  nriAccount.withdrawAmount=1000;
  nriAccount.withdrawMoney();
  nriAccount.applyFixedDeposit();
  
  

  //Creating an instance of SeniorCitizen class and invoking the appropriate methods
  SeniorCitizenAccount seniorCitizenAccount=new SeniorCitizenAccount();
  seniorCitizenAccount.depositAmount=2500;
  seniorCitizenAccount.depositMoney();
  
 
  seniorCitizenAccount.withdrawAmount=500;
  seniorCitizenAccount.withdrawMoney();
  seniorCitizenAccount.applyFixedDeposit();
  
 }

}
