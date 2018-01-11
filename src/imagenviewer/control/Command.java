
package imagenviewer.control;


public interface Command {
    
    String name();
    void execute();

    public void put(String name, Command command);
}
