package es.redflag.katas.marsrover;

public class SpinRigthCommand extends Command {

    private Compass theCompass;

    public SpinRigthCommand(Compass compass)
    {
        this.theCompass=compass;
    }

    public void execute() {
        String orientation = theCompass.orientation();
        int i = pattern.indexOf(orientation);
        if(i==3) {
            theCompass.changeDirection(String.valueOf(pattern.charAt(0)));
            return;
        }
        i++;
        theCompass.changeDirection(String.valueOf(pattern.charAt(i)));
        return;
    }

}
