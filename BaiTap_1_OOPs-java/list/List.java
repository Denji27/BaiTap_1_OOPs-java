// Bài tập về chương trình nhập thông tin về học sinh vào file excel
package list;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class List {

    public static void main(String[] args) throws IOException {
        ArrayList<Student> stu = new ArrayList<Student>();
        ArrayList<String> tea = new ArrayList<String>();
        Scanner sc= new Scanner(System.in);
        boolean ler=true;
        File file = new File("School.csv");
        FileWriter fileWriter = new FileWriter(file);
           
        do{
            System.out.println("Ban chon lam gi: ");
            System.out.println("""
                               1. Nhap thong tin hoc sinh
                               2. Them thong tin vao file excel
                               3. ket thuc!
                               So khac de thoat""");
            int b = sc.nextInt();
            switch (b){
                case 1 -> {
                    Student st = new Student();
                    sc.nextLine();
                    System.out.println("Nhap ho va ten: ");
                    st.setName(sc.nextLine());

                    System.out.println("Nhap ngay sinh (cu phap dd/mm/yyy): ");
                    st.setDoB(sc.next());
                    sc.nextLine();
                    System.out.println("Nhap ten lop hoc: ");
                    st.setClass(sc.next());
                    sc.nextLine();
                    System.out.println("Nhap diem trung binh: ");
                    st.setAveragePoint(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Nhap so dien thoai: ");
                    st.setPhoneNumber(sc.next());
                    sc.nextLine();
                    System.out.println("Nhap dia chi: ");
                    st.setAddress(sc.nextLine());
                    System.out.println(st.toString());
                    st.printInfo();
                    stu.add(st);
                    
                    
                }
                case 2 -> {
                    for(int i=0;i<stu.size();i++){
                        StringBuilder line = new StringBuilder();
                        line.append(stu.get(i).toString());
                        line.append("\n");
                        fileWriter.write(line.toString());
                    }
                    
                    System.out.println("Da cap nhat du lieu");
                }
                case 3 -> {
                    System.out.println("DM ket thuc!");
                    fileWriter.close();
                    ler=false;
                }
            }
        }while(ler);
    }
    
}
