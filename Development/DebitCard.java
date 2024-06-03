public class DebitCard extends BankCard
{
    /* Creating a class Debitcard which includes the property of 
     * BankCard class and assigning private access modifier to the attributes*/
    
    private int pinNo;
    private int withdrawAmount;
    private String dateofWithdraw;
    private boolean hasWithdrawn;
    
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNo)
    { 
        /* Creating a constructor of Debitcard class*/
        
        super(balanceAmount, cardId, bankAccount, issuerBank); 
        super.setClientName(clientName);
        this.pinNo=pinNo;   //Assigning the value of pinNo
        this.hasWithdrawn= false;  //Setting the value of hasWithdrawn to false
    }
    
    public int getPinNo()
    {
        /* Creating a getter method for pinNo*/
        
        return this.pinNo;  //Returns the value of pinNo
    }
    
    public int getWithdraw()
    {
        /* Creating a getter method for withdrawAmount*/
        
        return this.withdrawAmount;  //Returns the value of withdrawAmount
    }
    
    public String getDateofWithdraw()
    {
        /* Creating a getter method for dateofWithdraw*/
        
        return this.dateofWithdraw;  //Returns the value of dateofWthdraw
    }
    
    public boolean getHasWithdrawn()
    {
        /* Creating a getter method for hasWithdrawn*/
        
        return this.hasWithdrawn;  //Returns the value of hasWithdrawn
    }
    
    public void setWithdraw(int withdrawAmount)
    {
        /* Creating a setter method for withdrawAmount*/
        
        this.withdrawAmount= withdrawAmount;  //Assigning the value of withdrawAMount ot he attribute 
    }
    
    public void withdraw(int withdrawAmount, String dateofWithdraw, int pinNo)
    {
        /* Creating a withdraw method with three parameters*/
        
        if(pinNo==this.pinNo)  //Checking if the pinNo is valid or not
        {
            if(getBalanceAmount()>=withdrawAmount)  //Checking if there is sufficient balance or not
            {
                System.out.println("The amount is withdrawn successfully");  
                this.hasWithdrawn=true;
                this.dateofWithdraw=dateofWithdraw;  //Assigning the value of dateofWithdraw
                this.withdrawAmount=withdrawAmount;  //Assigning the value of withdrawAmount
                super.setBalanceAmount(getBalanceAmount()-withdrawAmount);   //Calculating thr balanceAmount after withdraw
                System.out.println("Your balance is: "+getBalanceAmount());  //Displaying the value of balanceAmount 
            }
            else
            {
                System.out.println("Please check your balance amount.");  
            }
        }
        else
        {
            System.out.println("Please enter valid pin number");  
        }
    }
    
    @Override   
    public void display()
    {
        /* Creating a display mwthod to display the details of this class*/
        
        super.display();  //Calling to the display method of the super class(BankCard) 
        
        System.out.println("The PIN number is: "+pinNo);
        System.out.println("The widthdrawal amount is: "+withdrawAmount);
        System.out.println("The date of withdrawal is: "+dateofWithdraw);
        
        if(this.hasWithdrawn==false)  //Checking if the transaction has been carried or not
        {
            System.out.println("The transaction has not been carried yet");
            System.out.println("The balance amount is: "+super.getBalanceAmount());   //Displaying the balanceAmount  
        }
    }
}