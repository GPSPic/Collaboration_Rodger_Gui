package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Command {

    private String commandLine;
    private List<String> sortedCommands;

    public Command(String commandLine) {
        this.commandLine = commandLine;
        this.sortedCommands = new ArrayList<>();
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

    public void addSortedCommand(String sortedCommand) {
        this.sortedCommands.add(sortedCommand);
    }

    public void sortCommand() {
        String noSpaceCommand = this.commandLine.replaceAll("[ ]+", "");
        String[] commandsAsArrays = noSpaceCommand.split("\\n+");
        List<String> commandsAsList = Arrays.asList(commandsAsArrays);
        this.setSortedCommands(commandsAsList);
//        int listSize = commandsAsList.size();
//        for (int i = 0; i < listSize; i++) {
//            this.sortedCommands.add(commandsAsList.get(i));
//        }
    }
}
