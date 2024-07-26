
import java.util.ArrayList;
import java.util.List;

public class ComputerManager {
    private List<Computer> list = new ArrayList<Computer>();

    public void addComputer(Computer computer){
        list.add(computer);
    }

    public void turnOnAllMonitors(){
        for (Computer computer : this.list){
            if (computer instanceof Monitor){
                ((Monitor) computer).turnOnMonitor();
            }
        }
    }

    public void turnOffAllMonitors(){
        for (Computer computer : this.list){
            if (computer instanceof Monitor){
                ((Monitor) computer).turnOffMonitor();
            }
        }
    }

    public void printAllSpecifications(){
        for (Computer computer : this.list){
            computer.printSpecification();
        }
    }

    public void moveAllPortableComputers(){
        for (Computer computer : this.list){
            if (computer instanceof Portable){
                ((Portable) computer).move();
            }
        }
    }

    public void useAllKeyboards(){
        for (Computer computer : this.list){
            if (computer instanceof Keyboard){
                ((Keyboard) computer).useKeyboard();
            }
        }
    }
}
