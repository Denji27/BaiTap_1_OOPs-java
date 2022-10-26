
package bank_remake;

public class Expire extends Account{
    double interest= 0.035;
    public void expire(Account ac){
        
        System.out.println("Ban vua nhan duoc " + ac.getBalance()*interest+" tu dao han 1 thang! 😃 hehe");
        ac.setBalance(ac.getBalance()*interest);
    }
}
