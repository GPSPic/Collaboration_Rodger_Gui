package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Command {

    private String commandLine;
    private List<String> sortedCommands;
    private List<String> plateauCommand;
    private List<List<String>> roverCommands;

    public Command(String commandLine) {
        this.commandLine = commandLine;
        this.sortedCommands = new ArrayList<>();
        this.plateauCommand = new ArrayList<>();
        this.roverCommands = new ArrayList<>();
    }

    public String getCommandLine() {
        return commandLine;
    }

    public void setCommandLine(String commandLine) {
        this.commandLine = commandLine;
    }

    public List<String> getSortedCommands() {
        return sortedCommands;
    }

    public void setSortedCommands(List<String> sortedCommands) {
        this.sortedCommands = sortedCommands;
    }

    public List<String> getPlateauCommand() {
        return plateauCommand;
    }

    public void setPlateauCommand(List<String> plateauCommand) {
        this.plateauCommand = plateauCommand;
    }

    public List<List<String>> getRoverCommands() {
        return roverCommands;
    }

    public void setRoverCommands(List<List<String>> roverCommands) {
        this.roverCommands = roverCommands;
    }

    public void addSortedCommand(String sortedCommand) {
        this.sortedCommands.add(sortedCommand);
    }

//    public void sortCommand() {
//        String noSpaceCommand = this.commandLine.replaceAll("[ ]+", "");
//        String[] commandsAsArrays = noSpaceCommand.split("\\n+");
//        List<String> commandsAsList = Arrays.asList(commandsAsArrays);
//        this.setSortedCommands(commandsAsList);
//        int listSize = commandsAsList.size();
//        for (int i = 0; i < listSize; i++) {
//            this.sortedCommands.add(commandsAsList.get(i));
//        }
//    }

    public boolean directionFinder(String str) {
        if (
            str.matches("N|E|S|W")
        ) {
            return true;
        } else {
            return false;
        }
    }


    public void sortCommand() {
//        String noSpaceCommand = this.commandLine.replaceAll("[ ]+", "");
        String noSpaceCommand = this.commandLine.replaceAll("\\s+", "");
        String[] commandsAsArrays = noSpaceCommand.split("");
        List<String> commandsAsList = Arrays.asList(commandsAsArrays);

        List<String> parsedPlateauCommand = commandsAsList.subList(0, 2);
        this.setPlateauCommand(parsedPlateauCommand);

        List<List<String>> roversCommand = new ArrayList<>();
        List<String> spreadRoversCommand = commandsAsList.subList(2, commandsAsList.size());

        for (int i = 2; i < spreadRoversCommand.size(); i++) {
            if (this.directionFinder(spreadRoversCommand.get(i))) {
                int commandStart = i - 2;
                for (int j = i + 1; j < spreadRoversCommand.size(); j++) {
                    try {
                        Integer.parseInt(spreadRoversCommand.get(j));
                        int commandEnd = j;
                        List<String> individualRoverCommand = spreadRoversCommand.subList(commandStart, commandEnd);
                        roversCommand.add(individualRoverCommand);
                    }
                    catch (NumberFormatException nfe) {
                        System.out.println("Attempt number: " + Integer.toString(j));
                    }
                }
            }

        }
        this.setRoverCommands(roversCommand);
    }
}
