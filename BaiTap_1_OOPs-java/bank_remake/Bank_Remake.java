
package bank_remake;
import java.util.Scanner;
public class Bank_Remake {
    static Scanner sc = new Scanner(System.in);
    static void nhapTK(Account ac) {
        System.out.println("Nhap so tai khoan: ");
        ac.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten tai khoan: ");
        ac.setName(sc.nextLine());
        ac.setBalance(50);
    }
    public static void main(String[] args) {
        Account a[] = null;
        int b, n = 0;
        long s, d, c, f;
        boolean flag = true;
        do {
            System.out.println("Ban chon lam gi: ");
            System.out.println("""
                               1.Nhap thong tin cua cac khach hang 
                               2.Xuat danh sach thong tin cua khach hang
                               3.Nap tien
                               4.Rut tien
                               5.Dao han
                               6.Chuyen khoan
                               So khac de thoat""");
            b = sc.nextInt();
            switch (b) {
                case 1 -> {
                    System.out.println("Nhap so luong khach hang muon nhap: ");
                    n = sc.nextInt();
                    a = new Account[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Khach hang so: " + (i+1));
                        a[i] = new Account();
                        
                        nhapTK(a[i]);
                    }
                }
                case 2 -> {
                    Print_Account pr = new Print_Account();
                    System.out.printf("%-10s %-20s %-20s\n", "So TK", "Ten TK", "So tien trong TK");
                    for (int i = 0; i < n; i++) {
                        pr.printAccount(a[i]);
                    }
                }
                case 3 -> {
                    Deposit depo= new Deposit();
                    System.out.println("Nhap so tai khoan cua khach hang can nap tien: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getId();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan: " + d);
                            depo.deposit(a[i]);
                        } else {
                            System.out.println("");
                        }
                    }
                }
                case 4 -> {
                    Withdraw wi = new Withdraw();
                    System.out.println("Nhap so tai khoan khach hang can rut tien: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getId();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan: " + d);
                            wi.withdraw(a[i]);
                        }
                    }
                }
                case 5 -> {
                    Expire ex= new Expire();
                    System.out.println("Nhap so tai khoan khach hang can dao han: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getId();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan: " + d);
                            ex.expire(a[i]);
                        } else {
                            System.out.println("");
                        }
                    }
                }
                case 6 -> {
                    double chuyen,
                            nhan,
                            tienChuyen;
                    System.out.print("Nhap so tai khoan cua khach hang chuyen tien: ");
                    s = sc.nextLong();
                    System.out.print("Nhap so tai khoan cua khach hang nhan tien: ");
                    c = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getId();
                        if (s == d) {
                            chuyen = a[i].getBalance();
                            for (int j = 0; j < n; j++) {
                                f = a[j].getId();
                                if (c == f) {
                                    nhan = a[j].getBalance();
                                    System.out.println("Nhap so tien can chuyen");
                                    tienChuyen = sc.nextDouble();
                                    if (tienChuyen <= chuyen) {
                                        chuyen = chuyen - tienChuyen;
                                        nhan = nhan + tienChuyen;
                                        a[i].setBalance(chuyen);
                                        a[j].setBalance(nhan);
                                        System.out.println("Tai khoan so " + d + " cua chuyen: $" + tienChuyen);
                                        System.out.println("Tai khoan so " + f + " vua nhan: $" + tienChuyen);
                                    } else {
                                        System.out.println("So tien nhap khong hop le!");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                }
                default -> {
                    System.out.println("Bye!!");
                    flag = false;
                }
            }
        } while (flag);
    }
}
