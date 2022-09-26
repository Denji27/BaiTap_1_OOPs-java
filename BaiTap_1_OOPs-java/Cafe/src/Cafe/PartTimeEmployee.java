
package Cafe;

import java.util.*;
public class PartTimeEmployee extends Person1 {
    private String name, address, email, BankAccount, phoneNumber;
    private int  salary;
    Scanner sc = new Scanner(System.in);
    public PartTimeEmployee(){
        
    }
    public PartTimeEmployee(String name, String address, String phoneNumber, String email, String BankAccount, int salary){
        super(name, address, phoneNumber);
        this.BankAccount=BankAccount;
        this.email=email;
        this.salary=salary;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    } 
    public void setBankAccount(String BankAccount){
        this.BankAccount=BankAccount;
    }
    public String getBankAccount(){
        return BankAccount;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return super.getName() + ", " + super.getAddress() + ", " + email + ", " + BankAccount + ", " + super.getPhoneNumber() + ", "+ salary + ".";
    }
    public void TinhLuong(){
        System.out.println("So gio lam viec la: ");
        double soGio= sc.nextDouble();
        double ler=18000;
        salary= (int) (soGio*ler);
        System.out.println("Luong thang cua nhan vien partTime: " + soGio*ler);
    }
    public void PrintInfo(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-10s\n", super.getName(), super.getAddress(), email, BankAccount, super.getPhoneNumber(), salary);
    }
}