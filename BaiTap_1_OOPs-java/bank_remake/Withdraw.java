
package bank_remake;
import java.util.Scanner;
public class Withdraw extends Account{
    public void withdraw(Account ac){
    double phi=5;
    Scanner sc= new Scanner(System.in);
        System.out.println("So tien can rut la: ");
        double rut= sc.nextDouble();
        if (rut+phi<ac.getBalance()){
            
            System.out.println("Ban vua rut so tien "+ rut +". Phi dich vu la "+phi +"\nSo du tai khoan cua quy khach hien la:"+(ac.getBalance()-rut-phi));
        }
        else{
            System.out.println("So tien rut ra khong hop le! 😃 hehe");
        }
    }
}
