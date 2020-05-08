/* The Symptom class is part of the COVID-19 Contract Tracing application.
*  This application was created to meet the reqirements of week 3's 
*    challenge from Java Bootcamp. It's overall purpose is to trace the 
*    fact-to-face contacts that COVID-19 patients have had. By doing so,
*    emerging clusters can be contained. And as part of the process,
*    the patient's symptoms are recorded. This class represents a
*    COVID-19 patient's symptom. 
*/
public class Symptom {
    private String name;
    private int numOfDays;
    private String description;

    public Symptom() {
    }

    public Symptom(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getName() {
        return this.name;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public int  getNumOfDays() {
        return this.numOfDays;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String  getDescription() {
        return this.description;
    }

    public String toString() {
        String retStr = "";
        retStr = "Symptom: " + getName() + "\n";
        retStr += "Number of Days: " + getNumOfDays() + "\n";
        retStr += "Description: " + getDescription() + "\n";
        return retStr;
    }
}
