import java.util.Scanner;
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
        String details = "";
        Patient patient;
        Symptom symptom;
        Contact contact;
        Place place;

        System.out.println("Contact Tracing Program");
        System.out.print("++++++++++++++++++++++++++++");
        System.out.print("Enter New Patient's Information");
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
            System.out.printf("How many days has %s had a fever? ",patientName);
            numOfDays = keyboard.nextInt();
            symptom.setNumOfDays(numOfDays);
            keyboard.nextLine();
            System.out.printf("Please provide additional information regarding %s's fever ",patientName);
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
            System.out.printf("Please provide additional information regarding %s's cough ",patientName);
            details = keyboard.nextLine();
            symptom.setDescription(details);
            patient.addSymptom(symptom);
        }

        System.out.print("++++++++++++++++++++++++++++");
        System.out.print("Enter Patient Contacts");
        System.out.println("++++++++++++++++++++++++++++");

        System.out.printf("Has %s had personal contact with anyone (Y/N)? ",patientName);
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
                System.out.printf("When did %s see %s? ",patientName,contactName);
                dateContacted = keyboard.nextLine();
                contact.setDateContacted(dateContacted);
                System.out.printf("What place did %s see %s? ",patientName,contactName);
                placeName = keyboard.nextLine();
                System.out.printf("What city did %s see %s? ",patientName,contactName);
                placeCity = keyboard.nextLine();
                System.out.printf("What state did %s see %s? ",patientName,contactName);
                placeState = keyboard.nextLine();
                place.setName(placeName);
                place.setCity(placeCity);
                place.setState(placeState);
                contact.addPlace(place);
                patient.addContact(contact);

                System.out.printf("Are there any more personal contacts for %s (Y/N)? ",patientName);
                response = keyboard.nextLine();
                if ( response.toUpperCase().equals("N")) {
                    hasContacts = false;
                }
            }
        }
System.out.println("Testing: +++++++++++");
for (Symptom sym: patient.getSymptomList()) {
    System.out.println(sym.toString());
}
    }
}
