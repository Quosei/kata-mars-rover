package es.redflag.katas.marsrover;


public class SpinLeftCommand extends Command {

    private Compass theCompass;

    public SpinLeftCommand(Compass compass) {
        this.theCompass =compass;
    }

    public void execute()
    {
        String orientation = theCompass.orientation();
        int index = pattern.indexOf(orientation);
        if(index==0) {
            theCompass.changeDirection(String.valueOf(pattern.charAt(3)));
            return;
        }
        index--;
        theCompass.changeDirection(String.valueOf(pattern.charAt(index)));
        return;

    }
}
