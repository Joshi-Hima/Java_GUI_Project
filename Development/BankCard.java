public class BankCard
{
    /* Creating a class BankCard and giving private access modifier to
       the attributes to use the concept of encapsulation */
       
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    
    public BankCard(int balanceAmount, int cardId, String bankAccount, String issuerBank)
    {
        //Creating a constructor BankCard with four parameters
        
        /* Assigning values of attributes of constructor to the original
           attributes of the BankCard class*/
        
        this.clientName="";
        this.balanceAmount= balanceAmount;
        this.cardId= cardId;
        this.bankAccount= bankAccount;
        this.issuerBank= issuerBank;
    }
    
    public int getCardId()
    {
        /*Creating a getter method for cardId*/
        
        return this.cardId; //Returns the value of cardId 
    }
    
    public String getClientName()
    {
        /*Creating a getter method for clientName*/
        
        return this.clientName; //Returns the value of clientName
    }
    
    public String getIssuerBank()
    {
        /*Creating a getter method for issuerBank*/
        
        return this.issuerBank; //Returns the value of issuerBank  
    }
    
    public String getBankAccount()
    {
        /*Creating a getter method for bankAccount*/
        
        return this.bankAccount; //Returns the value of bankAccount
    }
    
    public int getBalanceAmount()
    {
        /*Creating a getter method for balanceAmount*/
        
        return this.balanceAmount; //Returns the value of balanceAmount
    }
    
    public void setClientName(String clientName)
    {
        /*Creating a setter method for clientName*/
        
        this.clientName=clientName; //Assigning the value to the clientName to the attribute
    }
    
    public void setBalanceAmount(int balanceAmount)
    {
        /*Creating a getter method for balanceAmount*/
        
        this.balanceAmount=balanceAmount; //Assigning the value to the balanceAmount to the attribute
    }
    
    public void display()
    {
        /* Creating a display method to display the attributes*/
        
        if(clientName.equals(""))  //Checking if the clientName is empty or not 
        {
            System.out.println("The client's name is not assigned.");  
        }
        else
        {
            System.out.println("The client's name is: "+clientName);  //Displaying the clientName
        }
        
        //Displaying rest of the attributes of the BankCard class
        
        System.out.println("The card id of client is: "+cardId);
        System.out.println("The issuer bank is: "+issuerBank);
        System.out.println("The bank account of the client is: "+bankAccount);
        System.out.println("The balance amount is: "+balanceAmount);
    }
}