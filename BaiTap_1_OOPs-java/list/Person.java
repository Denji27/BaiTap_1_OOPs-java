
package list;

public class Person {
    protected String name, DoB, phoneNumber, address;
    
    public Person(){
        
    }
    
    public Person(String name, String DoB, String phoneNumber, String address){
        this.name=name;
        this.DoB=DoB;
        this.phoneNumber=phoneNumber;
        this.address=address;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDoB(String DoB){
        this.DoB=DoB;
    }
    public void setPhoneNumber(String PhoneNumber){
        this.phoneNumber=PhoneNumber;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public String getDoB(){
        return DoB;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getAddress(){
        return address;
    }
}
