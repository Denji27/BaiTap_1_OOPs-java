
package list;

public class Student extends Person{
    private double averagePoint;
    private String Class;
    
    public Student() {
        
    }
    
    public Student(String name, String DoB, String Class, double averagePoint, String phoneNumber, String address){
        super(name, DoB, phoneNumber, address);
        this.Class=Class;
        this.averagePoint=averagePoint;
    }

    
    public void setClass(String Class){
        this.Class=Class;
    }
    public void setAveragePoint(double avgPoint){
        this.averagePoint=avgPoint;
    }
    public double getAveragePoint(){
        return averagePoint;
    }
    public String getCLass(){
        return Class;
    }
    @Override
    public String toString(){
        return "\"" + name +
                "\",\""+ DoB + 
                "\",\""+Class + 
                "\",\"" + averagePoint +
                "\",\""+ phoneNumber + 
                "\",\"" + address+"\"";
    }
    public void printInfo(){
        System.out.println(""+getName()+","+DoB+","+Class+","+averagePoint+","+phoneNumber+","+getAddress()+"");
    }
}
