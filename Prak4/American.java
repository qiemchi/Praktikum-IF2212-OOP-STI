public class American extends Citizenship{
    private String state;

    public American(String surname, String givenName, String state)
    {
        super(surname, givenName);
        this.state = state;
    }
    
    public String getState(){
        return this.state;
    }

    public void speak(){
        System.out.println("Hello buddy!");
    }
}
