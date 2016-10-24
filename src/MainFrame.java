/**
 * Created by tomaszkropiwnicki on 24.10.2016.
 */
import java.awt.Component;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    public MainFrame() {
        this.initUI();
    }

    private void initUI() {
        this.add(new DrawingPanel());
        this.setTitle("PlatformGame");
        this.setSize(800, 800);
        this.setLocationRelativeTo((Component)null);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
    }
}
