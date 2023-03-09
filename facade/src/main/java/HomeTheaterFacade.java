import java.util.Arrays;

public class HomeTheaterFacade {
    private Amplifier amp;
    private Tuner tuner;
    private StreamPlayer player;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,Tuner tuner,StreamPlayer player,Projector projector,Screen screen,TheaterLights lights,PopcornPopper popper) {
        this.amp = amp;
        this.player = player;
        this.projector = projector;
        this.tuner = tuner;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }
    public void watchMovie(String movie){
        System.out.println("Ready for watching movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }
    public void endMovie(){
        System.out.println("end movie...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }
    public void listenToRatio(){

    }
    public void endRadio(){

    }
}
