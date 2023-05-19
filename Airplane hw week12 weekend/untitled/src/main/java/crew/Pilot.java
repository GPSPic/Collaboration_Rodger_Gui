package crew;

public class Pilot extends CabinCrewMember{

    private String pilotLicense;

    public Pilot(String pilotLicense){

        super(name, rank);
        this.pilotLicense = pilotLicense;
    }

    public String getPilotLicense() {
        return pilotLicense;
    }

}
