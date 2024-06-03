//importing all the necessary requirements
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;

public class BankGUI implements ActionListener //creating a class BankGUI imlementing ActionListener
{
    //creating objects of three classes
    private BankCard bcd;
    private DebitCard dcd;
    private CreditCard ccd;
    private boolean added, withdrawl;   //creating boolean variables
    private ArrayList<BankCard> al= new ArrayList<BankCard>(); //creating arraylist of bank card
    private int dcdid,dpin,dbalamnt,ccdid,ccvcno,cbalamnt,withcrdid,withpinno,withwithdrawamnt,setcrcdid,setcrgrper,cancrcdid;
    private String dclntname,dissbank,dbnkacc,cclntname,cissbank,cbnkacc,cexp,withdowith;
    private double cint,setcrcdlmt;
    private JFrame jf1, jf2, jf3, jf4, jf5, jf6; //creating JFrame
    private JTextField tfcdid, tfclntname, tfissbank, tfbnkacc, tfbalamnt, tfpin,
            tfcdtcdid, tfcdtclntname, tfcdtbnkacc, tfcdtissbank, tfcdtbalamnt, tfcdtcvcno, tfcdtint, tfcdtexp,
            tfwithcdid, tfwithamnt, tfwithpin,tfsetcdid, tfsetcdlmt, tfsetgrper, tfcnlcdid;
    private JLabel bnkcrdhead, dbtcrdhead, cdid, clntname, issbank, bnkacc, balamnt, pin, cdtcrdhead,
            cdtcdid, cdtclntname, cdtbnkacc, cdtissbank, cdtbalamnt, cdtcvcno, cdtint, cdtexp,
            withhead, withcdid, withamnt, withdow, withpin,
            sethead, setcdid, setcdlmt, setgrper, cnlcdthead, cnlcdid; //creating JLabel 
    private JComboBox<String> datewith, withexpdate;  //creating combobox
    private JButton dbtcrdgo, cdtcrdgo, dbtadd, dbtwith, dbtdis, dbtclr, cdtadd, cdtcnl, cdtlmt, cdtdis, cdtclr,
            withdraw, withdis, withclr, setcredit, setdis, setclr, cnlcdtcard, cnlcdtclr;  
    public BankGUI()
    {
        //Jframe section of BankCard class
        jf1= new JFrame("Bank Card-Himanshu-22068759");
        bnkcrdhead= new JLabel("Bank Card");
        
        //JButtons for BankCard
        dbtcrdgo= new JButton("Go to Debit Card");
        cdtcrdgo= new JButton("Go to Credit Card");
        
        //Setting bounds for JLabel and JButtons
        bnkcrdhead.setBounds(173, 43, 160, 42);
        dbtcrdgo.setBounds(39, 213, 146, 66);
        cdtcrdgo.setBounds(315, 213, 146, 66);
        jf1.add(bnkcrdhead);
        jf1.add(dbtcrdgo);
        jf1.add(cdtcrdgo);
        
        //Adding action listener to it
        dbtcrdgo.addActionListener(this);
        cdtcrdgo.addActionListener(this);
        bnkcrdhead.setFont(new Font("SansSerif",Font.BOLD,30));
        
        Color blue=new Color(51, 204 ,255);  //creating an object of color 
        
        jf1.getContentPane().setBackground(blue);   //adding color in the background
        jf1.setLayout(null); //layout is null
        jf1.setVisible(true);  //setting visibility to true
        jf1.setResizable(false);  //setting no option for resizing 
        jf1.setSize(500, 400);  //giving the size of frame
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this closes the GUI from the background as well
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)  
    {
        if(ae.getSource()==dbtcrdgo)  //checking the source for going to Debit Card Button
        {
            jf2= new JFrame("Debit Card-Himanshu-22068759");  //JFrame of debit card
            
            //JLabels of Debit Card
            dbtcrdhead= new JLabel("Debit Card");
            cdid= new JLabel("Card ID:");
            clntname= new JLabel("Client Name:");
            bnkacc= new JLabel("Bank Account:");
            issbank= new JLabel("Issuer Bank:");
            balamnt= new JLabel("Balance Amount:");
            pin= new JLabel("PIN Number:");
            
            //JTextfields of Debit card
            tfcdid= new JTextField();
            tfclntname= new JTextField();
            tfbnkacc= new JTextField();
            tfissbank= new JTextField();
            tfbalamnt= new JTextField();
            tfpin= new JTextField();
            
            //JButtonsof Debit Card
            dbtadd= new JButton("Add Debit Card");
            dbtwith= new JButton("Withdraw from Debit Card");
            dbtdis= new JButton("Display");
            dbtclr= new JButton("Clear");
            
            //Setting bounds and width to all JLabel, JTextField, JButtons
            dbtcrdhead.setBounds(367, 38, 190, 50);
            cdid.setBounds(167, 156, 80, 28);
            clntname.setBounds(167, 237, 140, 28);
            bnkacc.setBounds(167, 318, 140, 28);
            issbank.setBounds(167, 398, 127, 28);
            balamnt.setBounds(167, 480, 170, 28);
            pin.setBounds(167, 561, 127, 28);
            tfcdid.setBounds(363, 152, 325, 32);
            tfclntname.setBounds(363, 237, 325, 32);
            tfbnkacc.setBounds(363, 318, 325, 32);
            tfissbank.setBounds(363, 399, 325, 32);
            tfbalamnt.setBounds(363, 480, 325, 32);
            tfpin.setBounds(363, 561, 325, 32);
            dbtadd.setBounds(147, 693, 185, 47);
            dbtwith.setBounds(650, 693, 185, 47);
            dbtdis.setBounds(147, 800, 185, 47);
            dbtclr.setBounds(650, 800, 185, 47);
            
            //Adding components into JFrame
            jf2.add(dbtcrdhead);
            jf2.add(cdid);
            jf2.add(clntname);
            jf2.add(bnkacc);
            jf2.add(issbank);
            jf2.add(balamnt);
            jf2.add(pin);
            jf2.add(tfcdid);
            jf2.add(tfclntname);
            jf2.add(tfbnkacc);
            jf2.add(tfissbank);
            jf2.add(tfbalamnt);
            jf2.add(tfpin);
            jf2.add(dbtadd);
            jf2.add(dbtwith);
            jf2.add(dbtdis);
            jf2.add(dbtclr);
            
            //Adding action listener to the buttons
            dbtadd.addActionListener(this);
            dbtwith.addActionListener(this);
            dbtdis.addActionListener(this);
            dbtclr.addActionListener(this);
            
            //Setting the font size in the components
            dbtcrdhead.setFont(new Font("SansSerif",Font.BOLD,36));
            cdid.setFont(new Font("SansSerif",Font.BOLD,20)); 
            clntname.setFont(new Font("SansSerif",Font.BOLD,20));
            issbank.setFont(new Font("SansSerif",Font.BOLD,20));
            bnkacc.setFont(new Font("SansSerif",Font.BOLD,20));
            balamnt.setFont(new Font("SansSerif",Font.BOLD,20));
            pin.setFont(new Font("SansSerif",Font.BOLD,20));
            
            Color blue=new Color(51, 204 ,255);  //creating object of color
            
            jf2.getContentPane().setBackground(blue);  //setting background color of Debit Card
            
            jf2.setLayout(null);
            jf2.setVisible(true);
            jf2.setResizable(false);
            jf2.setSize(905, 912);
            jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
        }
        else if(ae.getSource()==dbtclr)  //checking the source for clear button for debit card
        {
            //Clears all the text field by setting it to an empty string
            tfcdid.setText("");
            tfclntname.setText("");
            tfbnkacc.setText("");
            tfissbank.setText("");
            tfbalamnt.setText("");
            tfpin.setText("");
        }
        else if(ae.getSource()==cdtcrdgo)  //checking the source for gooing to credit card
        {
            jf3= new JFrame("Credit Card-Himanshu-22068759");  //JFrame of credit card
            
            //JLabels of credit card
            cdtcrdhead= new JLabel("Credit Card");
            cdtcdid= new JLabel("Card ID:");
            cdtclntname= new JLabel("Client Name:");
            cdtbnkacc= new JLabel("Bank Account:");
            cdtissbank= new JLabel("Issuer Bank:");
            cdtbalamnt= new JLabel("Balance Amount:");
            cdtcvcno= new JLabel("CVC Number:");
            cdtint= new JLabel("Intrest Rate:");
            cdtexp= new JLabel("Expiration Date:");
            
            //JtextFields for credit card
            tfcdtcdid= new JTextField();
            tfcdtclntname= new JTextField();
            tfcdtbnkacc= new JTextField();
            tfcdtissbank= new JTextField();
            tfcdtbalamnt= new JTextField();
            tfcdtcvcno= new JTextField();
            tfcdtint= new JTextField();
            
            //Creating an array to store it in combo box
            String expdate[]={"2024-09-09", "2025-10-10", "2028-12-12", "2023-12-10", "2030-10-13"};  
            withexpdate= new JComboBox<String>(expdate);  //JComboBox of credit card
            
            //JButtons of credit card 
            cdtadd= new JButton("Add Credit Card");
            cdtcnl= new JButton("Cancel Credit Card");
            cdtlmt= new JButton("Set Credit Limit");
            cdtdis= new JButton("Display");
            cdtclr= new JButton("Clear");
            
            //Setting the bounds of the components which is their height, width, x-axis and y-axis
            cdtcrdhead.setBounds(560, 34, 210, 50);
            cdtcdid.setBounds(167, 156, 80, 28);
            cdtclntname.setBounds(167, 237, 140, 28);
            cdtbnkacc.setBounds(167, 318, 140, 28);
            cdtissbank.setBounds(167, 398, 127, 28);
            cdtbalamnt.setBounds(167, 480, 170, 28);
            cdtcvcno.setBounds(749, 147, 130, 28);
            cdtint.setBounds(749, 237, 130, 28);
            cdtexp.setBounds(749, 327, 160, 28);
            tfcdtcdid.setBounds(363, 152, 325, 32);
            tfcdtclntname.setBounds(363, 237, 325, 32);
            tfcdtbnkacc.setBounds(363, 318, 325, 32);
            tfcdtissbank.setBounds(363, 399, 325, 32);
            tfcdtbalamnt.setBounds(363, 480, 325, 32);
            tfcdtcvcno.setBounds(915, 147, 325, 32);
            tfcdtint.setBounds(915, 233, 325, 32);
            withexpdate.setBounds(915, 319, 325, 32);
            cdtadd.setBounds(94, 583, 218, 67);
            cdtcnl.setBounds(997, 583, 218, 67);
            cdtlmt.setBounds(1009, 831, 218, 67);
            cdtdis.setBounds(94, 831, 218, 67);
            cdtclr.setBounds(565, 724, 218, 67);
            
            //Adding the components in jframe
            jf3.add(cdtcrdhead);
            jf3.add(cdtcdid);
            jf3.add(cdtclntname);
            jf3.add(cdtbnkacc);
            jf3.add(cdtissbank);
            jf3.add(cdtbalamnt);
            jf3.add(cdtcvcno);
            jf3.add(cdtint);
            jf3.add(cdtexp);
            jf3.add(tfcdtcdid);
            jf3.add(tfcdtclntname);
            jf3.add(tfcdtbnkacc);
            jf3.add(tfcdtissbank);
            jf3.add(tfcdtbalamnt);
            jf3.add(tfcdtcvcno);
            jf3.add(tfcdtint);
            jf3.add(withexpdate);
            jf3.add(cdtadd);
            jf3.add(cdtcnl);
            jf3.add(cdtlmt);
            jf3.add(cdtdis);
            jf3.add(cdtclr);
            
            //adding the listener to the buttons
            cdtadd.addActionListener(this);
            cdtcnl.addActionListener(this);
            cdtlmt.addActionListener(this);
            cdtdis.addActionListener(this);
            cdtclr.addActionListener(this);
            
            //setting the font and size of the comonents
            cdtcrdhead.setFont(new Font("SansSerif",Font.BOLD,36));
            cdtcdid.setFont(new Font("SansSerif",Font.BOLD,20)); 
            cdtclntname.setFont(new Font("SansSerif",Font.BOLD,20));
            cdtissbank.setFont(new Font("SansSerif",Font.BOLD,20));
            cdtbnkacc.setFont(new Font("SansSerif",Font.BOLD,20));
            cdtbalamnt.setFont(new Font("SansSerif",Font.BOLD,20));
            cdtcvcno.setFont(new Font("SansSerif",Font.BOLD,20));
            cdtint.setFont(new Font("SansSerif",Font.BOLD,20));
            cdtexp.setFont(new Font("SansSerif",Font.BOLD,20));
            
            Color blue=new Color(51, 204 ,255);  //creating object of color
            
            jf3.getContentPane().setBackground(blue);  //setting background color to blue
            
            jf3.setLayout(null);
            jf3.setVisible(true);
            jf3.setResizable(false);
            jf3.setSize(1276, 975);
            jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        }
        else if(ae.getSource()==cdtclr)  //if user goes to clear button
        {
            //Clearing all the text fields by setting it into empty string
            tfcdtcdid.setText("");
            tfcdtclntname.setText("");
            tfcdtbnkacc.setText("");
            tfcdtissbank.setText("");
            tfcdtbalamnt.setText("");
            tfcdtcvcno.setText("");
            tfcdtint.setText("");
            tfcdtexp.setText("");
        }
        else if(ae.getSource()==dbtwith)  //if user goes to withdraw from debit card
        {
            jf4= new JFrame("Withdraw from Debit Card-Himanshu-22068759");  //creating JFrame for it
            
            //JLabels of the GUI
            withhead= new JLabel("Withdraw from Debit Card");
            withcdid= new JLabel("Card ID:");
            withamnt= new JLabel("Withdraw Amount:");
            withdow= new JLabel("Date of Withdraw:");
            withpin= new JLabel("PIN Number:");
            
            //JTextFields ofthe GUI
            tfwithcdid= new JTextField();
            tfwithamnt= new JTextField();
            tfwithpin= new JTextField();
            
            //Creating an array to store the dates in the combo box
            String dowith[]= {"2022-09-09", "2023-01-04", "2018-09-08", "2022-12-16", "2020-09-05", "2023-04-05"};
            datewith= new JComboBox<String>(dowith);  //creating combo box
            
            //Buttons for the GUI
            withdraw= new JButton("Withdraw from Debit Card");
            withdis= new JButton("Display");
            withclr= new JButton("Clear");
            
            //Setting the size, width, height of the components
            withhead.setBounds(356, 35, 455, 50);
            withcdid.setBounds(167, 156, 80, 28);
            withamnt.setBounds(167, 237, 190, 28);
            withdow.setBounds(167, 318, 190, 28);
            withpin.setBounds(167, 399, 168, 28);
            tfwithcdid.setBounds(363, 152, 325, 32);
            tfwithamnt.setBounds(363, 237, 325, 32);
            datewith.setBounds(363, 318, 325, 32);
            tfwithpin.setBounds(363, 399, 325, 32);
            withdraw.setBounds(825, 152, 194, 53);
            withdis.setBounds(825, 265, 194, 53);
            withclr.setBounds(825, 378, 194, 53);
            
            //Adding the components on the jframe
            jf4.add(withhead);
            jf4.add(withcdid);
            jf4.add(withamnt);
            jf4.add(withdow);
            jf4.add(withpin);
            jf4.add(tfwithcdid);
            jf4.add(tfwithamnt);
            jf4.add(datewith);
            jf4.add(tfwithpin);
            jf4.add(withdraw);
            jf4.add(withdis);
            jf4.add(withclr);
            
            //setting the font size of the components
            withhead.setFont(new Font("SansSerif",Font.BOLD,36));
            withcdid.setFont(new Font("SansSerif",Font.BOLD,20)); 
            withamnt.setFont(new Font("SansSerif",Font.BOLD,20));
            withdow.setFont(new Font("SansSerif",Font.BOLD,20));
            withpin.setFont(new Font("SansSerif",Font.BOLD,20));
            
            //adding addActionListener to the button
            withdraw.addActionListener(this);
            withdis.addActionListener(this);
            withclr.addActionListener(this);
            
            Color blue=new Color(51, 204 ,255);  //creating an object for color
            
            jf4.getContentPane().setBackground(blue);  //setting the background color of jframe
            
            jf4.setLayout(null);
            jf4.setVisible(true);
            jf4.setResizable(false);
            jf4.setSize(1135, 550);
            jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        }
        else if(ae.getSource()==withclr)  //if user clicks on clear button of withdraw GUI
        {
            //Clears all the fields by setting it into empty string
            tfwithcdid.setText("");
            tfwithamnt.setText("");
            tfwithpin.setText("");
        }
        else if(ae.getSource()==cdtlmt)  //if user clicks into set the credit limit button
        {
            jf5= new JFrame("Set Credit Limit-Himanshu-22068759");  //JFrame of the set credit limit
            
            //JLabels for that GUI
            sethead= new JLabel("Set the Credit Limit");
            setcdid= new JLabel("Card ID:");
            setcdlmt= new JLabel("Credit Limit:");
            setgrper= new JLabel("Grace Period:");
            
            //textfields for that GUI
            tfsetcdid= new JTextField();
            tfsetcdlmt= new JTextField();
            tfsetgrper= new JTextField();
            
            //buttons for that GUI
            setcredit= new JButton("Set Credit Limit");
            setdis= new JButton("Display");
            setclr= new JButton("Clear");
            
            //setting the size of the components
            sethead.setBounds(382, 32, 330, 50);
            setcdid.setBounds(167, 156, 80, 28);
            setcdlmt.setBounds(167, 277, 140, 28);
            setgrper.setBounds(167,398, 140, 28);
            tfsetcdid.setBounds(363, 152, 325, 32);
            tfsetcdlmt.setBounds(363, 261, 325, 32);
            tfsetgrper.setBounds(363, 386, 325, 32);
            setcredit.setBounds(825, 152, 194, 53);
            setdis.setBounds(825, 265, 194, 53);
            setclr.setBounds(825, 378, 194, 53);
            
            //adding the components in the jframe
            jf5.add(sethead);
            jf5.add(setcdid);
            jf5.add(setcdlmt);
            jf5.add(setgrper);
            jf5.add(tfsetcdid);
            jf5.add(tfsetcdlmt);
            jf5.add(tfsetgrper);
            jf5.add(setcredit);
            jf5.add(setdis);
            jf5.add(setclr);
            
            //adding actionlistener to the buttons
            setcredit.addActionListener(this);
            setdis.addActionListener(this);
            setclr.addActionListener(this);
            
            //setting the font size of the components
            sethead.setFont(new Font("SansSerif",Font.BOLD,36));
            setcdid.setFont(new Font("SansSerif",Font.BOLD,20)); 
            setcdlmt.setFont(new Font("SansSerif",Font.BOLD,20));
            setgrper.setFont(new Font("SansSerif",Font.BOLD,20));
    
            Color blue=new Color(51, 204 ,255);  //creating object of color
            
            jf5.getContentPane().setBackground(blue);  //setting the background color to blue
            jf5.setLayout(null);
            jf5.setVisible(true);
            jf5.setResizable(false);
            jf5.setSize(1135, 550);
            jf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        }
        else if(ae.getSource()==setclr)  //if user clicks on the clear button for set credit limit
        {
            //clears all text fields by setting it to empty string
            tfsetcdid.setText("");
            tfsetcdlmt.setText("");
            tfsetgrper.setText("");
        }
        else if(ae.getSource()==cdtcnl)  //if user clicks on cancel credit card
        {
            jf6= new JFrame("Cancel Credit Card-Himanshu-22068759");  //jframe for calel credit card
            
            //jlabels for cancel credit card
            cnlcdthead= new JLabel("Cancel the Credit Card");
            cnlcdid= new JLabel("Card ID:");
            
            //buttons for the GUI
            tfcnlcdid= new JTextField();
            cnlcdtcard= new JButton("Cancel Credit Card");
            cnlcdtclr= new JButton("Clear");
            
            //setting the size of the components
            cnlcdthead.setBounds(382, 32, 390, 50);
            cnlcdid.setBounds(167, 156, 80, 28);
            tfcnlcdid.setBounds(363, 152, 325, 32);
            cnlcdtcard.setBounds(126, 248, 194, 53);
            cnlcdtclr.setBounds(715, 248, 194, 53);
            
            //adding the components in the jframe
            jf6.add(cnlcdthead);
            jf6.add(cnlcdid);
            jf6.add(tfcnlcdid);
            jf6.add(cnlcdtcard);
            jf6.add(cnlcdtclr);
            
            //adding add action listener to the buttons
            cnlcdtcard.addActionListener(this);
            cnlcdtclr.addActionListener(this);
            
            //setting the font size of the components
            cnlcdthead.setFont(new Font("SansSerif",Font.BOLD,36));
            cnlcdid.setFont(new Font("SansSerif",Font.BOLD,20)); 
            Color blue=new Color(51, 204 ,255);
            
            jf6.getContentPane().setBackground(blue);
            jf6.setLayout(null);
            jf6.setVisible(true);
            jf6.setResizable(false);
            jf6.setSize(1135, 423);
            jf6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        }
        else if(ae.getSource()==cnlcdtclr)  //if user clicks on clear button of cancel credit card
        {
            tfcnlcdid.setText("");  //clears the text fields by setting it into empty string
        }
        else if(ae.getSource()==dbtadd)  //if user clicks in add debit card
        {
            if(tfcdid.getText().isEmpty()  || tfclntname.getText().isEmpty() || tfbnkacc.getText().isEmpty() || tfissbank.getText().isEmpty() || tfbalamnt.getText().isEmpty() || tfpin.getText().isEmpty() )
           {
               //if any of those fields are empty then it displays an error message on the screen 
               JOptionPane.showMessageDialog(jf3,"Empty field found. Please fill the fields properly.","Alert",JOptionPane.ERROR_MESSAGE);
           }
           else
           {
               try{
                   //getting all the vales from the text fields and storing it in variables
                   dcdid= Integer.parseInt(tfcdid.getText());
                   dpin= Integer.parseInt(tfpin.getText());
                   dbalamnt= Integer.parseInt(tfbalamnt.getText());
                   dclntname= tfclntname.getText();
                   dissbank=  tfissbank.getText();
                   dbnkacc= tfbnkacc.getText();
                   added = false;
                   if(al.isEmpty())  //if the array list is empty
                   {
                       DebitCard ob= new DebitCard(dbalamnt,dcdid,dbnkacc,dissbank,dclntname,dpin);  //creating an object of debit card class
                       al.add(ob);  //adding it into array list
                       JOptionPane.showMessageDialog(jf3,"Data is added to the Debit Card system.");
                       added=false;
                   }
                   else
                   {
                       for(BankCard card:al)  //using for each loop
                       {
                           if(card instanceof DebitCard)  //checking if card is instance of debit card class or not
                           {
                               DebitCard dbtcd=(DebitCard)card;  //downcasting
                               if(card. getCardId()==dcdid)  //checking if the card is is same or not
                               {
                                   JOptionPane.showMessageDialog(jf3,"This Card ID already exists. Please re-enter your card id.","Alert",JOptionPane.ERROR_MESSAGE);
                                   break;
                               }
                               else
                               {
                                   DebitCard ob= new DebitCard(dbalamnt,dcdid,dbnkacc,dissbank,dclntname,dpin);  //creating object of debit card class
                                   al.add(ob);  //adding it into array list
                                   JOptionPane.showMessageDialog(jf3,"Data is added to the Debit Card system.");
                                   added = false;
                                   break;
                               }
                           }
                           else
                           {
                               DebitCard ob= new DebitCard(dbalamnt,dcdid,dbnkacc,dissbank,dclntname,dpin);  //creating object of debit card class
                               al.add(ob);  //adding it into array list
                               JOptionPane.showMessageDialog(jf3,"Data is added to the Debit Card system.");
                               added = false;
                               break;
                           }
                        }
                   }
               }
       
               catch(NumberFormatException nf)
               {
                   //if number format exception occcurs, then it we handle it by showing a message dialog box
                   JOptionPane.showMessageDialog(jf3,"Number format exception detected. Cannot convert string into int.","Alert",JOptionPane.ERROR_MESSAGE);
               }
           }
        }
        else if(ae.getSource()==cdtadd)  //if user clicks on add credit card
       {
           if(tfcdtcdid.getText().isEmpty()  || tfcdtclntname.getText().isEmpty() || tfcdtbnkacc.getText().isEmpty() || tfcdtissbank.getText().isEmpty() || tfcdtbalamnt.getText().isEmpty() || tfcdtcvcno.getText().isEmpty() || tfcdtint.getText().isEmpty())
           {
               //if the fields are empty then an error message is shown on the screen 
               JOptionPane.showMessageDialog(jf2,"Empty field found. Please enter the fields properly.","Alert",JOptionPane.ERROR_MESSAGE);
           }
           else
           {
               try{
                   //getting all the values from the text field and storing it in vairables
                   ccdid= Integer.parseInt(tfcdtcdid.getText());
                   ccvcno= Integer.parseInt(tfcdtcvcno.getText());
                   cbalamnt= Integer.parseInt(tfcdtbalamnt.getText());
                   cint= Double.parseDouble(tfcdtint.getText());
                   cclntname= tfcdtclntname.getText();
                   cissbank= tfcdtissbank.getText();
                   cbnkacc= tfcdtbnkacc.getText();
                   cexp= withexpdate.getSelectedItem().toString();
                   added = false;
                   if(al.isEmpty())  //checking if array list is empty 
                   {
                       CreditCard ob1= new CreditCard(ccdid,cclntname,cissbank,cbnkacc,cbalamnt,ccvcno,cint,cexp);  //creating object of credit card class
                       al.add(ob1);  //adding in array list
                       JOptionPane.showMessageDialog(jf2,"Data is aded to the Credit Card system");
                       added = false;
                   }
                   else
                   {
                       for(BankCard card:al)  //using for each loop to iterate to through array list
                       {
                           if(card instanceof CreditCard)  //checking if card istance of credit card or not
                           {
                               CreditCard cdtcard=(CreditCard)card;   //downcasting
                               if(cdtcard. getCardId()==ccdid)   
                                   {
                                       //if the card id is same then it shows an error message
                                       JOptionPane.showMessageDialog(jf2,"This Card ID already exists. Please re-enter it.","Alert",JOptionPane.ERROR_MESSAGE);
                                   }
                               else
                                   {
                                       CreditCard ob1= new CreditCard(ccdid,cclntname,cissbank,cbnkacc,cbalamnt,ccvcno,cint,cexp);  //creating object of credit card class
                                       al.add(ob1);  //adding in array list
                                       JOptionPane.showMessageDialog(jf2,"Data is added to the Credit Card system.");
                                       added = false;
                                   }
                           }
                           else
                           {
                              CreditCard ob1= new CreditCard(ccdid,cclntname,cissbank,cbnkacc,cbalamnt,ccvcno,cint,cexp);  //creating object of class
                              al.add(ob1);   //adding in array list
                              JOptionPane.showMessageDialog(jf2,"Data is added to the Credit Card System.");
                              added = false;
                           }
                       }
                   }
               }
               catch(NumberFormatException nf)
               {
                   JOptionPane.showMessageDialog(jf2,"Number format exception detected. Cannot convert string into int.","Alert",JOptionPane.ERROR_MESSAGE);
               }
           }
       }
       else if(ae.getSource()==withdraw)  //if user clicks on withdraw button
       {
          if(tfwithcdid.getText().isEmpty()  || tfwithpin.getText().isEmpty() || tfwithamnt.getText().isEmpty())
            {
               //if the fields are empty then it displays an error message on the screen
                JOptionPane.showMessageDialog(jf4,"Empty field found. Please fill the fields properly.","Alert",JOptionPane.ERROR_MESSAGE);
            }

          else
            {
               try{
                   //getting the values form text fields and storing it in variables
                   withcrdid= Integer.parseInt(tfwithcdid.getText());
                   withpinno= Integer.parseInt(tfwithpin.getText());
                   withwithdrawamnt= Integer.parseInt(tfwithamnt.getText());
                   withdowith=datewith.getSelectedItem().toString();
                   added=false;
                   if(al.isEmpty())  //if the array list is empty
                   {
                       JOptionPane.showMessageDialog(jf4,"There is no Debit Card. Please enter your debit card properly.","Alert",JOptionPane.ERROR_MESSAGE);
                   }
                   else
                   {
                       for(BankCard all: al)  //iterates through array list
                       {
                           if(all instanceof DebitCard)  //if all id instance of debit card
                           {
                                DebitCard with=(DebitCard)all;  //downcasting
                             if(withcrdid!=with.getCardId())  //checking if the card id is put correct
                               {
                                   JOptionPane.showMessageDialog(jf4,"The Card ID is invalid. Please check your Card ID .","Alert",JOptionPane.ERROR_MESSAGE);
                                   break;
                                } 
                               else
                               {
                                  if(withpinno== with.getPinNo())  //checking if the pin no is put correct
                                  {
                                        if(withwithdrawamnt> with.getBalanceAmount())  //checking the balance amount
                                        {
                                            JOptionPane.showMessageDialog(jf4,"You don't have enough balance. Please check your balance amount.","Alert",JOptionPane.ERROR_MESSAGE);
                                            break;
                                        }
                                        else
                                        {
                                            DebitCard bcd=(DebitCard) all;  //downcasting
                                            bcd.withdraw(withwithdrawamnt,withdowith,withpinno);  //runs the withdraw method from debit card
                                            JOptionPane.showMessageDialog(jf4,"Money withdrawal is successful.");
                                        }
                                 }
                                 else
                                 {
                                       JOptionPane.showMessageDialog(jf4,"Invalid Pin Number entered.Please re-check it.","Alert",JOptionPane.ERROR_MESSAGE);
                                       break;
                                 }
                            }
                           }
                        }
                   }
               }
               catch(NumberFormatException f)
               {
                   JOptionPane.showMessageDialog(jf4,"Number format exception detected. Cannot convert string into int.","Alert",JOptionPane.ERROR_MESSAGE);
               }
            }
       }
       else if(ae.getSource()==setcredit)  //if user clicks on set credit limit
       {
           BankCard bcd= new CreditCard(ccdid,cclntname,cissbank,cbnkacc,cbalamnt,ccvcno,cint,cexp);  //upcasting
           CreditCard ccd=(CreditCard)bcd;//downcasting
           if(tfsetcdid.getText().isEmpty()  || tfsetcdlmt.getText().isEmpty() || tfsetgrper.getText().isEmpty())
           {
               //if the fields are empty then it shows error message on the screen
               JOptionPane.showMessageDialog(jf5,"Empty field found. Please fill the fields properly.","Alert",JOptionPane.ERROR_MESSAGE);
           }
            else
            {
               try{
                   //getting the values from text field and storing it in variables
                   setcrcdid= Integer.parseInt(tfsetcdid.getText());
                   setcrgrper= Integer.parseInt(tfsetgrper.getText());
                   setcrcdlmt= Double.parseDouble(tfsetcdlmt.getText());
                   added=false;
                   if(al.isEmpty())  //if array list is empty
                   {
                       JOptionPane.showMessageDialog(jf5,"There is no Credit Card. Please enter your credit card properly.","Alert",JOptionPane.ERROR_MESSAGE);
                   }
                   else
                   {
                   for(BankCard each: al)  //iterating through array list
                   {
                       if(setcrcdid!=each.getCardId())  //if the card id is not equal
                       {
                           JOptionPane.showMessageDialog(jf5,"The Card ID is invalid. Please check your Card ID.","Alert",JOptionPane.ERROR_MESSAGE);
                           break;
                       }
                       else
                       {
                           if(setcrcdlmt>(2.5*(each.getBalanceAmount())))  //checking the condition of set crredit limit
                           {
                               JOptionPane.showMessageDialog(jf5,"The amount is insufficient for the credit limit.","Alert",JOptionPane.ERROR_MESSAGE);
                               break;
                           }
                           else
                           {
                               CreditCard aa =(CreditCard) each;  //downcasting
                               aa.setCreditLimit(setcrcdlmt,setcrgrper);  //running the method from credit card class
                               added = true;
                               JOptionPane.showMessageDialog(jf5,"The Credit Limit is sucessfully set.");
                           }
                       }
                   }
                   }
               }
               catch(NumberFormatException f)
               {
                   JOptionPane.showMessageDialog(jf5,"Number format exception detected. Cannot convert string into int.","Alert",JOptionPane.ERROR_MESSAGE);
               }
            }
       }
       else if(ae.getSource()==cnlcdtcard)  //if user clicks on cancel credit card
       {
          if(tfcnlcdid.getText().isEmpty())  //if the field is empty
          {
              JOptionPane.showMessageDialog(jf6,"Empty field found, please re-check it.","Alert",JOptionPane.ERROR_MESSAGE);
          }
          else
          {
              try{
              cancrcdid=Integer.parseInt(tfcnlcdid.getText());  //getting the value and storing it in variable
              added= false;
              for(BankCard all: al)  //iterating through arraylist
              {
                 if(all instanceof CreditCard)  //checking if all is instance of credit card
                 {
                     if(cancrcdid==all.getCardId())
                     {
                         CreditCard ccd =(CreditCard)all;  //downcasting
                         ccd.cancelCreditCard();  //running the method cancelCredit Card()
                         added= false;
                         JOptionPane.showMessageDialog(jf6,"The Credit Card is cancelled.");
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(jf6,"The Card ID is invalid.","Alert",JOptionPane.ERROR_MESSAGE);
                     }
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(jf6,"There is no any credit card detected.","Alert",JOptionPane.ERROR_MESSAGE);
                 }
              }
              }
              catch(NumberFormatException f)
               {
                   JOptionPane.showMessageDialog(jf5,"Number format exception detected. Cannot convert string into int.","Alert",JOptionPane.ERROR_MESSAGE);
               }
          }
       }
       else if(ae.getSource()==dbtdis)  //if user clicks on display button
       {
           if(al.isEmpty())
           {
               JOptionPane.showMessageDialog(jf2,"There is no an debit card added. Please fill your debit card properly.","Alert",JOptionPane.ERROR_MESSAGE);
           }
           else
           {
               for(BankCard all: al)
               {
                   if(all instanceof DebitCard)
                   {
                       DebitCard dis= (DebitCard)all; //downcasting
                       dis.display();  //running the display method
                   }
               }  
           }
       }
       else if(ae.getSource()==cdtdis)  //if user clicks on display button on credit card
       {
           if(al.isEmpty())
           {
               JOptionPane.showMessageDialog(jf3,"There is no an credit card added. Please fill your credit card properly.","Alert",JOptionPane.ERROR_MESSAGE);
           }
           else
           {
               for(BankCard all: al)
               {
                   if(all instanceof CreditCard)
                   {
                       CreditCard dis= (CreditCard)all; //downcasting
                       dis.display();
                   }
               }
           }
       }
       else if(ae.getSource()==withdis) //if user clicks display button ofw withdraw
       {
           if(al.isEmpty())
           {
               JOptionPane.showMessageDialog(jf2,"There is no an debit card added. Please fill your debit card properly.","Alert",JOptionPane.ERROR_MESSAGE);
           }
           else
           {
               for(BankCard all: al)
               {
                   if(all instanceof DebitCard)
                   {
                       DebitCard dis= (DebitCard)all; //downcating
                       dis.display(); //running the display method
                   }
               }  
           }
       }
       else if(ae.getSource()==setdis) 
       {
           if(al.isEmpty())
           {
               JOptionPane.showMessageDialog(jf3,"The field is empty. Please provide the fields properly.","Alert",JOptionPane.ERROR_MESSAGE);
           }
           else
           {
               for(BankCard all: al)
               {
                   if(all instanceof CreditCard)
                   {
                       CreditCard dis= (CreditCard)all; //downcasting
                       dis.display(); //running the display method
                   }
               }
           }
       }
    }
        
    public static void main(String[]args)
    {
        new BankGUI(); //calling the constructor in the main method
    }
}