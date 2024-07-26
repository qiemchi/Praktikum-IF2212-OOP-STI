public class GameConsole implements Computer, Monitor{
    public void compute(int x, int y){
        System.out.println(String.format("GameConsole computing %d + %d = %d", x, y, x+y));
    }

    public void printSpecification(){
        System.out.println("GameConsole spec is r9");
    }

    public void turnOnMonitor(){
        System.out.println("GameConsole monitor turned on");
    }

    public void turnOffMonitor(){
        System.out.println("GameConsole monitor turned off");
    }

    public void printResolution(){
        System.out.println("GameConsole resolution is 7680x4320");
    }
}
