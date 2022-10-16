
package bank_remake;

public class Account {
    private long id;
    private String name;
    private double balance;
    
    public Account(){
            
    }    
    public Account(long id, String name, double balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(long id){
        this.id=id;
    }
    public long getId(){
        return id;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
}
