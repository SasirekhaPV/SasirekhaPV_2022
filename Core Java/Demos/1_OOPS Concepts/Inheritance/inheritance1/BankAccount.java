package bank.inheritance;

public class BankAccount {

public int balance;
public int withdrawAmount;
public int depositAmount;
protected double interestRate=9.5;

public void depositMoney(){
    System.out.println("Depositing Rs "+depositAmount+" into your account");
}

public void withdrawMoney(){
balance=depositAmount-withdrawAmount;
System.out.println("Withdrawing Rs "+withdrawAmount+" from your account");
System.out.println("Balance amount in your account is"+balance);
}

}
