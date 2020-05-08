import java.util.Scanner;
/* The ContactTracingApp is an implementation of week 3's programming
*    challenge for Java Bootcamp. The purpose of the application is to 
*    produce a report of COVID-19 patients along with any face-to-face
*    contacts.  The requirements state that the main method of the program
*    should handle all user interactions. And that's what this program
*    does.
*
*    Kim Levin
*    5/7/2020
*/
public class ContactTracingApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String response = "";
        String patientName = "";
        String patientPhone = "";
        String patientEmail = "";
        String patientCity = "";
        String patientState = "";
        String contactName = "";
        String contactPhone = "";
        String contactEmail = "";
        String contactCity = "";
        String contactState = "";
        String placeName = "";
        String placeCity = "";
        String placeState = "";
        String dateContacted = "";
        int numOfDays = 0;
        boolean hasContacts = false;
        boolean wentPlaces = false;
        String details = "";
        Patient patient;
        Symptom symptom;
        Contact contact;
        Place place;

        System.out.println("Contact Tracing Program\n");
        System.out.println("Enter New Patient's Information");
	    System.out.println("++++++++++++++++++++++++++++");
        System.out.print("What is the patient's name? ");
        patientName = keyboard.nextLine();
        System.out.print("What is the patient's phone number? ");
        patientPhone = keyboard.nextLine();
        System.out.print("What is the patient's email? ");
        patientEmail = keyboard.nextLine();
        System.out.print("What city does the patient live in? ");
        patientCity = keyboard.nextLine();
        System.out.print("What state does the patient live in? ");
        patientState = keyboard.nextLine();
        patient = new Patient();
        patient.setName(patientName);
        patient.setEmailAddr(patientEmail);
        patient.setPhoneNum(patientPhone);
        patient.setCity(patientCity);
        patient.setState(patientState);
        System.out.printf("Does %s have a fever (Y/N)? ",patientName);
        response = keyboard.nextLine();
        if ( response.toUpperCase().equals("Y")) {
            symptom = new Symptom("fever");
            System.out.printf("How many days has %s ",patientName);
            System.out.print("had a fever? ");
            numOfDays = keyboard.nextInt();
            symptom.setNumOfDays(numOfDays);
            keyboard.nextLine();
            System.out.print("Please provide additional information "); 
            System.out.printf("regarding %s's fever ",patientName); 
            details = keyboard.nextLine();
            symptom.setDescription(details);
            patient.addSymptom(symptom);
        }
        System.out.printf("Does %s have a cough (Y/N)? ",patientName);
        response = keyboard.nextLine();
        if ( response.toUpperCase().equals("Y")) {
            symptom = new Symptom("cough");

            System.out.printf("How many days has %s had a cough? ",patientName);

            numOfDays = keyboard.nextInt();
            symptom.setNumOfDays(numOfDays);
            keyboard.nextLine();
            System.out.print("Please provide additional information ");
            System.out.printf("regarding %s's cough ",patientName);
            details = keyboard.nextLine();
            symptom.setDescription(details);
            patient.addSymptom(symptom);
        }

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Enter Patient Contacts");
        System.out.println("++++++++++++++++++++++++++++");

        System.out.printf("Has %s had personal contact ",patientName);
        System.out.print("with anyone (Y/N)? ");
        response = keyboard.nextLine();
        if ( response.toUpperCase().equals("Y")) {
            hasContacts = true;
            while( hasContacts) {
                contact = new Contact();
                System.out.print("What is the contact's name? ");
                contactName = keyboard.nextLine();
                System.out.print("What is the contact's phone number? ");
                contactPhone = keyboard.nextLine();
                System.out.print("What is the contact's email? ");
                contactEmail = keyboard.nextLine();
                System.out.print("What city does the contact live in? ");
                contactCity = keyboard.nextLine();
                System.out.print("What state does the contact live in? ");
                contactState = keyboard.nextLine();
                contact.setName(contactName);
                contact.setEmailAddr(contactEmail);
                contact.setPhoneNum(contactPhone);
                contact.setCity(contactCity);
                contact.setState(contactState);
                place = new Place();
                System.out.printf("When did %s see ",patientName);
                System.out.printf("%s (mm/dd/yyyy)? " , contactName);
                dateContacted = keyboard.nextLine();
                contact.setDateContacted(dateContacted);
                System.out.printf("What place did %s ",patientName);
                System.out.printf("see %s? ",contactName);
                placeName = keyboard.nextLine();
                System.out.printf("What city did %s ",patientName);
                System.out.printf("see %s? ",contactName);
                placeCity = keyboard.nextLine();
                System.out.printf("What state did %s ",patientName);
                System.out.printf("see %s? ",contactName);
                placeState = keyboard.nextLine();
                place.setName(placeName);
                place.setCity(placeCity);
                place.setState(placeState);
                contact.setPlace(place);
                patient.addContact(contact);

                System.out.print("Are there any more personal contacts");
                System.out.printf(" for %s (Y/N)? ",patientName);
                response = keyboard.nextLine();
                if ( response.toUpperCase().equals("N")) {
                    hasContacts = false;
                }
            }
        }
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Enter Places Patient Has Visited");
        System.out.println("++++++++++++++++++++++++++++");

        System.out.printf("Has %s visited any places ",patientName);
        System.out.print("in the last 14 days (Y/N)? ");
        response = keyboard.nextLine();
        if ( response.toUpperCase().equals("Y")) {
           wentPlaces = true;
           place = new Place();
           while(wentPlaces) {
               System.out.printf("What place did %s ",patientName);
               System.out.print("visit ");
               placeName = keyboard.nextLine();
               System.out.printf("What city did %s ",patientName);
               System.out.print("visit ");
               placeCity = keyboard.nextLine();
               System.out.printf("What state did %s ",patientName);
               System.out.print("visit ");
               placeState = keyboard.nextLine();
               place.setName(placeName);
               place.setCity(placeCity);
               place.setState(placeState);
               patient.addPlace(place);
               System.out.print("Are there additional places ");
               System.out.printf("%s has visited ",patientName);
               System.out.print("in the last 14 days (Y/N)? ");
               response = keyboard.nextLine();
               if ( response.toUpperCase().equals("N")) {
                   wentPlaces = false;
               }
           } 
        }

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Contact Tracing Report");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(patient.toString());
        System.out.println("\t\t+++Symptoms+++");

        for (Symptom sym: patient.getSymptomList()) {
            System.out.println(sym.toString());
        }
        System.out.println("\t\t+++Contacts+++");
        for (Contact cont: patient.getContactList()) {
            System.out.println(cont.toString());
        }
        System.out.println("\t\t+++Places Visited+++");
        for (Place plc: patient.getPlaceList()) {
            System.out.println(plc.toString());
        }

    }
}
