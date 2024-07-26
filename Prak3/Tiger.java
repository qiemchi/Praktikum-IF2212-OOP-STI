public class Tiger extends Animal {
    public Tiger()
    {
        super(100, "LAND");
    }

    public Tiger(int power){
        super(power, "LAND");
    }

    public void speak(){
        System.out.println("RAWRRR!!! I'm a Tiger!");
    }
}
