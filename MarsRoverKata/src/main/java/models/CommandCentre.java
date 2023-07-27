package models;

import java.util.ArrayList;
import java.util.List;

public class CommandCentre {

    private String name;
    private Plateau plateau;
    private List<Rover> rovers;
    private Command command;
    private List<String> output;

    public CommandCentre(String name, Plateau plateau, Command command) {
        this.name = name;
        this.plateau = plateau;
        this.rovers = new ArrayList<>();
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public List<Rover> getRovers() {
        return rovers;
    }

    public void setRovers(List<Rover> rovers) {
        this.rovers = rovers;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public List<String> getOutput() {
        return output;
    }

    public void setOutput(List<String> output) {
        this.output = output;
    }

    public void getSortedCommand(){
        this.getCommand().sortCommand();
    }

    public void setPlateauSize(){
        this.getSortedCommand();
        this.plateau.setxLength(this.getCommand().getPlateauCommand().get(0));
        this.plateau.setyLength(this.getCommand().getPlateauCommand().get(1));
    }

    public void addRover(Rover rover){
        this.rovers.add(rover);
    }

    public void commandRovers(){
        this.getSortedCommand();
        for (int i = 0; i < this.getRovers().size(); i++){
            
        }
    }
}
