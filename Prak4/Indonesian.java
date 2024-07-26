public class Indonesian extends Citizenship{
    private IndonesianLocalLanguage localLanguage;

    public Indonesian(String surname, String givenName, IndonesianLocalLanguage localLanguage)
    {
        super(surname, givenName);
        this.localLanguage = localLanguage;
    }
    
    public IndonesianLocalLanguage getLocalLanguage(){
        return this.localLanguage;
    }

    public void speakLocalLanguage(){
        if (this.localLanguage == IndonesianLocalLanguage.JAVANESE){
            System.out.println("Nami Kulo Tuan Mal!");
        }
        else
        {
            System.out.println("Nepangkeun wasta sim kuring Tuan Mal!");
        }
    }

    public void speak(){
        System.out.println("Halo, aku Tuan Mal!");
    }
}
