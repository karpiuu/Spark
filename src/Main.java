import java.util.concurrent.TimeUnit;

/**
 * Created by tomaszkropiwnicki on 24.10.2016.
 */
public class Main {
    public static void main(String[] argc) {

        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);

        boolean game_run = true;
        Long FRAMES_PER_SECOND = 25L;
        Long SKIP_TICKS = 1000 / FRAMES_PER_SECOND;
        Long next_game_tick = System.currentTimeMillis();
        Long sleep_time = 0L;

        while( game_run ) {

            mainFrame.drawingPanel.repaint();
            mainFrame.drawingPanel.gameEngine.update();

            next_game_tick += SKIP_TICKS;
            sleep_time = next_game_tick - System.currentTimeMillis();
            if( sleep_time >= 0 ) {

            }
            else {
                System.out.print("FPSy nie tak");
            }
        }

    }
}