package cartes;

public class Borne extends Carte {
	
	int km;

	public Borne(int km) {
		this.km = km;
	}
	
    public int getKm() {
        return km;
    }

    @Override
    public String toString() {
        return "Borne de " + km + " km";
    }
    
    @Override
    public boolean equals(Object obj) {

    	// Verify if the object is of type borne
    	if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
    	
    	// Compare km
    	Borne objBorne = (Borne) obj;
    	return this.km == objBorne.km;
    }

}
