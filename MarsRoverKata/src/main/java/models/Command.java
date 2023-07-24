package models;

public class Command {

    private String commandLine;

    public Command(String commandLine) {
        this.commandLine = commandLine;
    }

    public String getCommandLine() {
        return commandLine;
    }

    public void setCommandLine(String commandLine) {
        this.commandLine = commandLine;
    }

}
