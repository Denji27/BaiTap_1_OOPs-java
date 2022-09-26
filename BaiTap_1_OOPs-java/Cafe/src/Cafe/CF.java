
package Cafe;

import java.util.Scanner;

public class CF {
    static Scanner sc= new Scanner(System.in);
    static void nhapThongTin(PartTimeEmployee NVpt){
        sc.nextLine();
        System.out.println("Nhap ten cua nhan vien part-time: ");
        NVpt.setName(sc.nextLine());
    //    sc.nextLine();
        System.out.println("Nhap dia chi cua nhan vien part-time: ");
        NVpt.setAddress(sc.nextLine());
    //    sc.nextLine();
        System.out.println("Nhap dia chi Email cua nhan vien part-time: ");
        NVpt.setEmail(sc.next());
        sc.nextLine();
        System.out.println("Nhap so tai khoan ngan hang cua nhan vien: ");
        NVpt.setBankAccount(sc.nextLine());
    //    sc.nextLine();
        System.out.println("Nhap so dien thoai cua nhan vien: ");
        NVpt.setPhoneNumber(sc.next());
        NVpt.setSalary(0);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       PartTimeEmployee P[]=null;
        int b,n=0;
        String na,d;
        d = null;
        boolean flag=true;
        do{
            System.out.println("Selection:");
            System.out.println("""
                               1. Nhap thong tin nhan vien part-time
                               2. Hien thi thong tin nhan vien part-time
                               3. Tinh tien luong thang cho nhan vien part-time
                               nhap so khac de thoat
                               """);
            b= sc.nextInt();
            switch (b){
                case 1 -> {
                    System.out.println("Nhap thong tin nhan vien part-time");
                    System.out.println("Nhap so luong nhan vien: ");
                    n= sc.nextInt();
                    P = new PartTimeEmployee[n];
                    for (int i=0; i<n; i++){
                        System.out.println("Nhan vien so " + (i+1) + " la: ");
                        P[i]= new PartTimeEmployee();
                        nhapThongTin(P[i]);
                    }
                }
                case 2 -> {
                    System.out.println("Hien thi thong tin nhan vien part-time");
                    System.out.printf("%-20s %-20s %-20s %-20s %-10s %-10s\n", "Name", "Address", "Email", "BankAccount", "PhoneNumber", "Salary");
                    for (int i=0; i<n; i++){
                        P[i].PrintInfo();
                    }
                }
                case 3 -> {
                    System.out.println("Tinh tien luong thang cho nhan vien part-time");
                    System.out.println("Nhap ten nhan vien: ");
                    na= sc.next();
                    for (int i=0; i<n; i++){
                        d= P[i].getName();
                        if (na.equals(d)){
                            P[i].TinhLuong();
                        }
                        else {
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
