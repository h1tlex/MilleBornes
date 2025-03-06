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
    	// Check if the object is itself
    	if (this == obj) {
			return true;
		}
    	
    	// Verify if the object is an instance of the class Carte
    	if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
    	
    	// Compare km
    	Borne objBorne = (Borne) obj;
    	return this.km == objBorne.km;
    }

}
