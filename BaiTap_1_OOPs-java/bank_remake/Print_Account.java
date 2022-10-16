
package bank_remake;

public class Print_Account extends Account {
    public void printAccount(Account ac){
        System.out.printf("%-10d %-20s %-20s \n", ac.getId(), ac.getName(), ac.getBalance());
    } 
}
