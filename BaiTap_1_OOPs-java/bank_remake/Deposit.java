
package bank_remake;
import java.util.Scanner;
public class Deposit extends Account{
    public void deposit(Account ac){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("So tien can nap la: ");
        double nap= sc.nextDouble();
        if (nap>0){
            System.out.println("Ban vua nap thanh cong "+nap + "\nSo du tai khoan cua quy khach hien la: "+(ac.getBalance()+nap));
            ac.setBalance(ac.getBalance()+nap);
        }
        else{
            System.out.println("So tien nap vao khong hop le! 😃 hehe");
        }
    }
}
