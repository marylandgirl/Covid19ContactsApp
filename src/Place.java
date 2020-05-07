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
}
