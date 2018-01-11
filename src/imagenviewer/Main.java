package imagenviewer;

import imagenviewer.control.NextImageCommand;
import imagenviewer.control.PrevImageCommand;
import imagenviewer.persistence.ImageLoader;
import imagenviewer.persistence.files.FileImageLoader;


public class Main  {

    public static void main(String[] args) {
        ImageLoader imageLoader= new FileImageLoader("images");
        MainFrame mainFrame = new MainFrame();
        mainFrame.add(new NextImageCommand(mainFrame.getImageDisplay()));
        mainFrame.add(new PrevImageCommand(mainFrame.getImageDisplay()));
        mainFrame.getImageDisplay().display(imageLoader.load());
        
    }
}
