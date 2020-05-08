/* The Person class is part of the COVID-19 Contact Tracing Application
*    assigned for week 3's challenge at Java Bootcamp. It model's a person
*    and is a super class to the Patient and (patient) Contact classes.
*    
* Kim Levin
* 5/7/2020
*/
public class Person {
    private String name;
    private String emailAddr;
    private String phoneNum;
    private String city;
    private String state;

    public Person() {
    }

    public Person(String name, String emailAddr, String phoneNum, String city, String state) {
        this.name = name;
        this.emailAddr = emailAddr;
        this.phoneNum = phoneNum;
        this.city = city;
        this.state = state;
    }
  
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
  
    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getEmailAddr() {
        return this.emailAddr;
    }
  
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }
  
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public String toString() {
        String retStr = "";
        retStr =  "Name: " + getName() + "\n";
        retStr += "Phone: " + getPhoneNum() + "\n";
        retStr += "Email: " + getEmailAddr() + "\n";
        retStr += "City: " + getCity() + "\t";
        retStr += "State: " + getState() + "\n";
        return retStr;
    }

}
