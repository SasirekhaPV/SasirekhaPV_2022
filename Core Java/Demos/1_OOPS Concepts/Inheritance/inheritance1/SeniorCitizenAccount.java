package bank.inheritance;
public class SeniorCitizenAccount  extends BankAccount{
    public void applyFixedDeposit()
    {
        super.interestRate=10.5;
        System.out.println("Fixed deposit rate is "+interestRate+" for a Senior Citizen account");
        System.out.println("");
    }
}
