package imagenviewer.ui;

import imagenviewer.model.Image;

public interface ImageDisplay {
    
    Image currentImage();
    void display (Image image);
    
}
