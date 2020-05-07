import java.util.ArrayList;
public class Contact extends Person {
    private String dateContacted;
    private ArrayList<Place> places;

    public Contact() {
        places = new ArrayList<Place> ();
    }

    public void setDateContacted(String date) {
        this.dateContacted = date;
    }

    public String getDateContacted() {
        return this.dateContacted;
    }

    public void setPlaces(ArrayList<Place> places) {
        this.places = places;
    }

    public ArrayList<Place> getPlaces() {
        return this.places;
    }

    public void addPlace(Place place) {
        places.add(place);
    }
}
