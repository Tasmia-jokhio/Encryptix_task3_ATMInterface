
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jokhi
 */
public class Balance {
    
    private  int accountbalance;
 
    public Balance(){
           
    }
    
    public  void withdrawamount(int amount,ATM atm,withdrawal  w){
        
    if(amount==0 || amount>20000  ){
  
    JOptionPane.showMessageDialog(w,"enter a correct amount ");
    w.inputamount_txt.setText("");
      }
    
    else if(accountbalance<amount){
     
        JOptionPane.showMessageDialog(w,"you don't have anough amount plz check your balance");
        w.inputamount_txt.setText("");    
    }
    
    else{
    accountbalance-=amount;
    
        atm.setVisible(true);
       w.setVisible(false);
        JOptionPane.showMessageDialog(atm,"amount withdrawn successfully " );
              
    }
   
    }
    
    
    public void depositedamount(int amount,ATM atm,Deposit  dep){
        
        
        if(amount==0){
        dep.setVisible(true);
        JOptionPane.showMessageDialog(dep, "enter a correct amount to deposit");
        dep.inputamount_txt.setText("");
        }
        else{
       accountbalance+=amount;  
       atm.setVisible(true);
       dep.setVisible(false);
       JOptionPane.showMessageDialog(atm," amount deposited successfuly");
        }
    
    }
    
    
    public void accountbalance(ATM atm){
    JOptionPane.showMessageDialog(atm,"your account balance is : " + accountbalance);
    
    }
    
    
     public static void main(String args[]) {
        
    }
}
