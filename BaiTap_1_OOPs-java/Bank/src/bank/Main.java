
package bank;

import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static void nhapTK(Account tk) {
        System.out.println("Nhap so tai khoan: ");
        tk.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten tai khoan: ");
        tk.setName(sc.nextLine());
        tk.setBalance(50);
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
                    System.out.printf("%-10s %-20s %-20s\n", "So TK", "Ten TK", "So tien trong TK");
                    for (int i = 0; i < n; i++) {
                        a[i].printAccount();
                    }
                }
                case 3 -> {
                    System.out.println("Nhap so tai khoan cua khach hang can nap tien: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getId();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan: " + d);
                            a[i].naptien();
                        } else {
                            System.out.println("");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Nhap so tai khoan khach hang can rut tien: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getId();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan: " + d);
                            a[i].ruttien();
                        }
                    }
                }
                case 5 -> {
                    System.out.println("hap so tai khoan khach hang can dao han: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getId();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan: " + d);
                            a[i].daohan();
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
