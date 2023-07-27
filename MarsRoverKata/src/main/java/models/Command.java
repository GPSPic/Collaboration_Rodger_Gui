package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Command {

    private String commandLine;
    private List<String> sortedCommands;
    private List<Integer> plateauCommand;
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

    public List<Integer> getPlateauCommand() {
        return plateauCommand;
    }

    public void setPlateauCommand(List<Integer> plateauCommand) {
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

    public void addAllcommand(List<String> allCommands) {
        this.roverCommands.add(allCommands);
    }


//    public boolean directionFinder(String str) {
//        if (
//            str.matches("N|E|S|W")
//        ) {
//            return true;
//        } else {
//            return false;
//        }
//    }


    public void sortCommand() {
//        String noSpaceCommand = this.commandLine.replaceAll("[ ]+", "");
        String noSpaceCommand = this.commandLine.replaceAll("\\s+", "");
        String[] commandsAsArrays = noSpaceCommand.split("");
        List<String> commandsAsList = Arrays.asList(commandsAsArrays);

        List<String> parsedPlateauCommand = commandsAsList.subList(0, 2);
        int xLength = Integer.parseInt(parsedPlateauCommand.get(0));
        int yLength = Integer.parseInt(parsedPlateauCommand.get(1));
        List<Integer> plateauCommandasIntegers = new ArrayList<>();
        plateauCommandasIntegers.add(xLength);
        plateauCommandasIntegers.add(yLength);
        this.setPlateauCommand(plateauCommandasIntegers);

        List<List<String>> roversCommand = new ArrayList<>();
        List<String> spreadRoversCommand = commandsAsList.subList(2, commandsAsList.size());
        List<String> currentCommand = new ArrayList<>();
//        [1, 2, N, L, M, L, M, L, M, L, M, M, 3, 3, E, M, M, R, M, M, R, M, R, R, M]
//        [[1, 2, N, L, M, L, M, L, M, L, M, M], [3, 3, E, M, M, R, M, M, R, M, R, R, M]]

        for (int j = 0; j < spreadRoversCommand.size(); j++) {
            String commandElement = spreadRoversCommand.get(j);
            currentCommand.add(commandElement);
                try {
                    Integer.parseInt(commandElement);
                    if (j+2 < spreadRoversCommand.size() && j!=0) {
                        String nextItem = spreadRoversCommand.get(j + 1);
                        String thirdItem = spreadRoversCommand.get(j + 2);
                        try {
                            Integer.parseInt(nextItem);
                            if (thirdItem.matches("N|S|E|W")) {
                                currentCommand.remove(currentCommand.size()-1);
                                roversCommand.add(currentCommand);
                                currentCommand = new ArrayList<>();
                                currentCommand.add(commandElement);

                            }
                        } catch (NumberFormatException nfe2) {}
                    }
                } catch (NumberFormatException nfe) {}
        }

        if (!currentCommand.isEmpty()) {
            roversCommand.add(currentCommand);
        }
        this.setRoverCommands(roversCommand);
    }
}

