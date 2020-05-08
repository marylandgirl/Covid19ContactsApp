import java.util.ArrayList;
/* The Patient class represents a COVID-19 patient in the Contract Tracing 
*    application implemented for week 3's challenge at Java Bootcamp.
*    
*  Kim Levin
*  05/07/2020
*/
public class Patient extends Person {
    private ArrayList<Contact> contactList;
    private ArrayList<Symptom> symptomList;
    private ArrayList<Place> placeList;

    public Patient() {
        contactList = new ArrayList<Contact>();
        symptomList = new ArrayList<Symptom>();
        placeList = new ArrayList<Place>();
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList =  contactList;
    }

    public ArrayList<Contact> getContactList() {
        return this.contactList;
    }

    public void setSymptomList(ArrayList<Symptom> symptomList) {
        this.symptomList =  symptomList;
    }

    public ArrayList<Symptom> getSymptomList() {
        return this.symptomList;
    }

    public void setPlaceList(ArrayList<Place> placeList) {
        this.placeList =  placeList;
    }

    public ArrayList<Place> getPlaceList() {
        return this.placeList;
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void addSymptom(Symptom symptom) {
        symptomList.add(symptom);
    }

    public void addPlace(Place place) {
        placeList.add(place);
    }
}
