package cartes;

public abstract class Carte {
	
	protected Type type;
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}	
	
	@Override
	public boolean equals(Object obj) {
		if(getClass() == obj.getClass()) {
			Carte carte = (Carte) obj;
			return type.equals(carte.getType());
		}
		return false;
	}
	
	
}