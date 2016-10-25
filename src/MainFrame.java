/**
 * Created by tomaszkropiwnicki on 24.10.2016.
 */
import java.awt.Component;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    public DrawingPanel drawingPanel;

    public MainFrame() {
        this.initUI();
    }

    private void initUI() {
        drawingPanel = new DrawingPanel();
        this.add(drawingPanel);
        this.setTitle("PlatformGame");
        this.setSize(800, 770);
        this.setLocationRelativeTo((Component)null);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
    }
}
