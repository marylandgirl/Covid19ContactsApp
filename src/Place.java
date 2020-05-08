/* The Place class is part of the Contract Tracing application which 
*    implements week 3's challenge from Java Bootcamp. The purpose of the 
*    application is to trace all the face-to-face encounters a COVID-19
*    patient has had. And this class represents the place where those encounters
*    happened.
*
*  Kim Levin
*  05/07/2020
*/
public class Place {
    private String name;
    private String city;
    private String state;

    public Place() {
    }

    public Place(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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
        retStr += "Location Name: " + getName() + "\n";
        retStr += "Location City: " + getCity() + "," ;
        retStr += "Location State: " + getState() + "\n" ;
        return retStr;
    }
}
