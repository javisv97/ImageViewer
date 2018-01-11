package imagenviewer.model;

public interface Image {
    
    byte [] bitmap(); 

    Image next();
    Image prev();
}