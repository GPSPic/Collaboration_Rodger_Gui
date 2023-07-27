package models;

import java.util.ArrayList;
import java.util.List;

public class CommandCentre {

    private String name;
    private Plateau plateau;
    private List<Rover> rovers;
    private List<String> output;
    private List<Integer> plateauCommand;
    private List<List<String>> roversCommand;
    private String outputAsString;

    public CommandCentre(String name) {
        this.name = name;
        this.rovers = new ArrayList<>();
        this.plateauCommand = new ArrayList<>();
        this.roversCommand = new ArrayList<>();
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

    public List<Integer> getPlateauCommand() {
        return plateauCommand;
    }

    public void setPlateauCommand(List<Integer> plateauCommand) {
        this.plateauCommand = plateauCommand;
    }

    public List<List<String>> getRoversCommand() {
        return roversCommand;
    }

    public void setRoversCommand(List<List<String>> roversCommand) {
        this.roversCommand = roversCommand;
    }

    public String getOutputAsString() {
        return outputAsString;
    }

    public void setOutputAsString(String outputAsString) {
        this.outputAsString = outputAsString;
    }

    public void assignCommandProperties (Command command) {
        command.sortCommand();
        this.plateauCommand = command.getPlateauCommand();
        this.roversCommand = command.getRoverCommands();
    }

    public void setPlateauSize(){
        int xLength = this.plateauCommand.get(0);
        int yLength = this.plateauCommand.get(1);
        this.plateau = new Plateau(xLength, yLength);
    }

    public void addRover(Rover rover){
        this.rovers.add(rover);
    }

    public void commandRovers(){
        for (int i = 0; i < this.getRovers().size(); i++){
            List<String> roverCommandAsString = this.getRoversCommand().get(i);
            this.getRovers().get(i).processCommand((ArrayList<String>) roverCommandAsString);
        }
    }

    public void processInput(Command command) {
        List<String> commandOutput = new ArrayList<>();
        this.assignCommandProperties(command);
        this.setPlateauSize();
        this.commandRovers();

        for (int i=0; i<this.getRovers().size(); i++) {
            commandOutput.add(Integer.toString(this.getRovers().get(i).getxPosition()));
            commandOutput.add(Integer.toString(this.getRovers().get(i).getyPosition()));
            commandOutput.add(this.getRovers().get(i).getDirection().getCardinalDirection());
        }
        this.setOutput(commandOutput);
        StringBuilder strbul = new StringBuilder();
        for (String str : commandOutput) {
            strbul.append(str);
            if (str.matches("N|W|S|E")) {
                strbul.append("\n\n");
            } else {
                strbul.append(" ");
            }
        }
        String commandOutputAsString = strbul.toString();
        this.setOutputAsString(commandOutputAsString);
    }
}
