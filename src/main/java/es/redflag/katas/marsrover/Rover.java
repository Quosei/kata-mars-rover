package es.redflag.katas.marsrover;

import java.util.*;

public class Rover {

    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private HashMap<String, Command> commandsList = new HashMap<String, Command>();

    private Compass compass;


    public Rover(){
        compass= new Compass();
        setupCommands(compass);
    }
    private void setupCommands(Compass compass)
    {
        commandsList.put(LEFT,new SpinLeftCommand(compass) );
        commandsList.put(RIGHT,new SpinRigthCommand(compass) );
    }

    public String orientation() {
        return compass.orientation();
    }

    public void executeOrder(String commands) {
        Command theCommand;
        for (char command : commands.toCharArray()) {
            theCommand = retrieveCommand(command);
            if(theCommand!=null)
                theCommand.execute();
        }
    }

    private Command retrieveCommand(char command) {
        String myCommand = String.valueOf(command);
        return commandsList.get(myCommand);
    }
    
}
