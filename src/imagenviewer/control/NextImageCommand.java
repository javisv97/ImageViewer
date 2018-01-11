
package imagenviewer.control;

import imagenviewer.ui.ImageDisplay;

public class NextImageCommand implements Command{
    
    private final ImageDisplay imageDisplay;
    
    public NextImageCommand(ImageDisplay imageDisplay){
        this.imageDisplay= imageDisplay;
    }
    
    @Override
    public String name() {
        return "next";
    }

    @Override
    public void execute() {
        imageDisplay.display(imageDisplay.currentImage().next());
    }

    @Override
    public void put(String name, Command command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
