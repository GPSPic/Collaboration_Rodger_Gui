package crew;

public class Pilot extends CabinCrewMember{

    private String pilotLicense;

    public Pilot(String name, Rank rank, String pilotLicense){
        super(name, rank);
        this.pilotLicense = pilotLicense;
    }

    public String getPilotLicense() {
        return pilotLicense;
    }

    public void fly(){
        System.out.println("Up up and awaaaaaay!");
    }
}
