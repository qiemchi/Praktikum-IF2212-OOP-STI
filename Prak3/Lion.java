public class Lion extends Animal{
    public Lion()
    {
        super(150, "LAND");
    }

    public Lion(int power){
        super(power, "LAND");
    }

    public void speak(){
        System.out.println("GRAWRRR!!! I'm a Lion!");
    }
}
