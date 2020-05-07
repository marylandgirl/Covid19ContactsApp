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
