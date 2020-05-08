import java.util.ArrayList;
/* The Contact class is a sub-class of Person and is part of the COVID-19 
*    Contact Tracing application. This application is an implementation of
*    a solution for week 3's challenge from Java Bootcamp. And this class
*    represents a person who has had face-to-face contact with a COVID-19 
*    patient.
*
* Kim Levin
* 05/07/2020
*/
public class Contact extends Person {
    private String dateContacted;
    private Place place;

    public Contact() {
    }

    public void setDateContacted(String date) {
        this.dateContacted = date;
    }

    public String getDateContacted() {
        return this.dateContacted;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return this.place;
    }

    public String toString() {
        String retStr = super.toString();
        retStr += "Contacted Location: " + place.getCity();
        retStr += "," + place.getState() + "\n";
        retStr += "Contacted Date: " + getDateContacted() + "\n";
        return retStr;
    }
}
