public class Japanese extends Citizenship{
    private String favouriteAnime;

    public Japanese(String surname, String givenName, String favouriteAnime)
    {
        super(surname, givenName);
        this.favouriteAnime = favouriteAnime;
    }

    public String getFavouriteAnime(){
        return favouriteAnime;
    }

    public void speak(){
        System.out.println("Hai, Watashi wa Mal-San desu!");
    }
}
