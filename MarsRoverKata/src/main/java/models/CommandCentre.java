package models;

import java.util.ArrayList;
import java.util.List;

public class CommandCentre {

    private String name;
    private Plateau plateau;
    private List<Rover> rovers;
    private List<String> output;

    public CommandCentre(String name) {
        this.name = name;
        this.rovers = new ArrayList<>();
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

    public List<String> getOutput() {
        return output;
    }

    public void setOutput(List<String> output) {
        this.output = output;
    }

    public List<Integer> getPlateauCommand (Command command){
        command.sortCommand();
        return command.getPlateauCommand();
    }

    public List<List<String>> getRoversCommand (Command command){
        command.sortCommand();
        return command.getRoverCommands();
    }

    public void setPlateauSize(Command command){
        List<Integer> plateauDimensions = this.getPlateauCommand(command);
        int xLength = plateauDimensions.get(0);
        int yLength = plateauDimensions.get(1);
        this.plateau = new Plateau(xLength, yLength);
    }

    public void addRover(Rover rover){
        this.rovers.add(rover);
    }

    public void commandRovers(Command command){
        List<List<String>> allRoverCommands = this.getRoversCommand(command);
        for (int i = 0; i < this.getRovers().size(); i++){
            List<String> roverCommandAsString = allRoverCommands.get(i);
            this.getRovers().get(i).processCommand((ArrayList<String>) roverCommandAsString);
        }
    }


}
