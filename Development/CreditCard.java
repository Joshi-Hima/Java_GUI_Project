public class CreditCard extends BankCard
{
    /* Creating a class CreditCard which includes the property of BankCard
       and assigning private access modifier to the attributes*/
       
    private int CVCnumber;
    private double CreditLimit;
    private double IntrestRate;
    private String ExpirationDate;
    private int GracePeriod;
    private boolean isGranted;
    
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount, int CVCnumber, double IntrestRate,
                     String ExpirationDate)
    {
        /* Creating a constructor which accepts eight parameters*/
        
        super(balanceAmount, cardId, bankAccount, issuerBank); //Calling to the super class constructor of bankCard class  
        super.setClientName(clientName);   //Calling to the setter method of the super class
        
        //Assigning the attributes through parameter values
        
        this.CVCnumber=CVCnumber;
        this.IntrestRate=IntrestRate;
        this.ExpirationDate=ExpirationDate;
        this.isGranted=false;     //Assigning the value of isGranted to false
    }
    
    public int getCVCnumber()
    {
        /* Creating a getter method for CVCnumber*/
        
        return this.CVCnumber;  //Returns the value of CVCnumber  
    }
    
    public double getCreditLimit()
    {
        /* Creating a getter method for CreditLimit*/
        
        return this.CreditLimit;  //Returns the value of CreditLimit
    }
    
    public double getIntrestRate()
    {
        /* Creating a getter method for IntrestRate*/
        
        return this.IntrestRate;  //Returns the value of IntrestRate 
    }
    
    public String getExpirationDate()
    {
        /* Creating a getter method for ExpirationDate*/
        
        return this.ExpirationDate;  //Returns the value of EpirationDate
    }
    
    public int getGracePeriod()
    {
        /* Creating a getter method for GracePeriod*/
        
        return this.GracePeriod;  //Returns the value of GracePeriod
    }
    
    public boolean getisGranted()
    {
        /* Creating a getter method for isGranted*/
        
        return this.isGranted;  //Returns the value of isGranted
    }
    
    public void setCreditLimit(double CreditLimit, int GracePeriod)
    {
        /* Creating a method to set the credit limit which accepts two parameters*/
        
        if(CreditLimit<=2.5*super.getBalanceAmount()) //Checking if the balanceAmount is greater then or equal to 2.5 times the CreditLimit
        {
            this.CreditLimit=CreditLimit;
            this.GracePeriod=GracePeriod;
            this.isGranted=true;  //Assigning the value of isGranted to true
        }
        else
        {
            System.out.println("The credit cannot be issued"); 
        }
    }
    
    public void cancelCreditCard()
    {
        /* Creating a method to remove the client's card*/
        
        //Setting the attributes to zero
        this.CreditLimit=0;
        this.GracePeriod=0;
        this.CVCnumber=0;
        this.isGranted=false;  //Setting isGranted to false
        System.out.println("Client's card has been removed");
    }
    
    @Override   
    public void display()
    {
        /* Creating a display method in CreditCard class*/
        
        if(this.isGranted==true)  //Checking if isGranted is set to true
        {
            super.display();  //Calling to the display method of the super class(BankCard)
            
            //Displaying the attributes of the CreditCard class
            
            System.out.println("The Credit Limit is: "+CreditLimit);
            System.out.println("The Grance Period is: "+GracePeriod);
            System.out.println("The CVC number is: "+CVCnumber);
            System.out.println("The Intrest rate is: "+IntrestRate);
            System.out.println("The expiration date is: "+ExpirationDate);
            System.out.println("The access granted is: "+isGranted);
        }
        else
        {
            //Displaying the attributes of CreditCard class without Creditlimit and GracePeriod
            System.out.println("The CVC number is: "+CVCnumber);
            System.out.println("The Intrest rate is: "+IntrestRate);
            System.out.println("The expiration date is: "+ExpirationDate);
            System.out.println("The access granted is: "+isGranted);
        }
    }
}