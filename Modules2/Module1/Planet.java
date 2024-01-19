package Module1;

public class Planet {
    private String designation;

    private double massKg;

    private double orbitEarthYears;

    public enum PlanetType{HOT, COLD};

    private PlanetType type = PlanetType.COLD;

    public Planet(String designation, PlanetType type){
        this.designation = designation;
        this.type = type;
    }

    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) {
        this.designation = designation;
        this.massKg = massKg;
        this.orbitEarthYears = orbitEarthYears;
        this.type = type;
    }

    @Override
    public int hashCode() {
        return designation.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Planet){
            Planet other = (Planet) obj;
            if (this.designation.equals(other.designation)){
                return true;
            }
        }
        return super.equals(obj);
    }

    @Override
    public String toString(){
        return "This planet is type " + this.type + " and designation " + this.designation + ".";
    }
}
