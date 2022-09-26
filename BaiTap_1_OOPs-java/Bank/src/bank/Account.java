
package bank;
import java.util.*;
public class Account {
    private long id;
    private String name;
    private double balance;
    double interest=0.035;
    
    Scanner sc = new Scanner(System.in);
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
    @Override
    public String toString(){
        return id+", "+name+", "+balance+".";
    }
    public void naptien(){
        System.out.println("So tien can nap la: ");
        double nap= sc.nextDouble();
        if (nap>0){
            balance= balance+nap;
            System.out.println("Ban vua nap thanh cong "+nap + "\nSo du tai khoan cua quy khach hien la: "+balance);
        }
        else{
            System.out.println("So tien nap vao khong hop le! 😃 hehe");
        }
    }
    public void ruttien(){
        double phi=5;
        System.out.println("So tien can rut la: ");
        double rut= sc.nextDouble();
        if (rut+phi<balance){
            balance=balance-rut-phi;
            System.out.println("Ban vua rut so tien "+ rut +". Phi dich vu la "+phi +"\nSo du tai khoan cua quy khach hien la:"+balance);
        }
        else{
            System.out.println("So tien rut ra khong hop le! 😃 hehe");
        }
    }
    public void daohan(){
        balance=balance+balance*interest;
        System.out.println("Ban vua nhan duoc" + balance*interest+" tu dao han 1 thang! 😃 hehe");
    }
    public void printAccount(){
        System.out.printf("%-10d %-20s %-20s \n", id, name, balance);
    } 
}
