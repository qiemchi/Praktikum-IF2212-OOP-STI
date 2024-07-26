import java.util.ArrayList;
import java.util.List;

public class CitizenPrinter {
    private List<Citizenship> citizenshipList = new ArrayList<Citizenship>();

    public void addCitizen(Citizenship citizenship){
        citizenshipList.add(citizenship);
    }

    public List<Citizenship> getCitizenshipList(){
        return citizenshipList;
    }

    public void printCitizenshipList(){
        for (Citizenship citizenship : this.citizenshipList) {
            if (citizenship instanceof American){
                American cAM = (American) citizenship;

                System.out.println("American");

                System.out.println(cAM.getSurname() + " " + cAM.getGivenName());

                cAM.speak();

                System.out.println(cAM.getState());
            }
            else if (citizenship instanceof Indonesian){
                Indonesian cID = (Indonesian) citizenship;

                System.out.println("Indonesian");

                System.out.println(cID.getSurname() + " " + cID.getGivenName());

                cID.speak();

                cID.speakLocalLanguage();
            }
            else if (citizenship instanceof Japanese){
                Japanese cJP = (Japanese) citizenship;

                System.out.println("Japanese");

                System.out.println(cJP.getSurname() + " " + cJP.getGivenName());

                cJP.speak();

                System.out.println(cJP.getFavouriteAnime());
            }
        }
    }
}
