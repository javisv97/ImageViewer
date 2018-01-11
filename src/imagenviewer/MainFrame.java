package imagenviewer;

import imagenviewer.control.Command;
import imagenviewer.ui.ImageDisplay;
import imagenviewer.ui.swng.SwingImageDisplay;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
    
    private Map<String, Command> commands = new HashMap<>();
    private ImageDisplay imageDisplay;
    
    public MainFrame(){
        this.setTitle("Image Viewer");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(image()); 
        this.add(tooBar(), BorderLayout.SOUTH);
        this.setVisible(true);
    }
    
    public void add(Command command){
        command.put(command.name(), command);
    }
    private Component image(){
        SwingImageDisplay display = new SwingImageDisplay();
        imageDisplay = display;
        return display;
    }

    public ImageDisplay getImageDisplay() {
        return imageDisplay;
    }

    private Component tooBar() {
        JPanel panel = new JPanel();
        panel.add(button("prev"));
        panel.add(button("next"));
        return panel;
    }

    private Component button(String name) {
        JButton button = new JButton(name);
        button.addActionListener(execute(name));
        return button;
    }

    private ActionListener execute(String name) {
        return (ActionEvent ae) -> {
            commands.get(name).execute();
        };
    }
}
