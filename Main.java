import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LivreNumerique LivreNumirique= new LivreNumerique("Auteur1", 300, "Livre Numirique 1", 500, false,200);
        LivreNumirique.telecharger();
        
        System.out.println("Le prix du livre numerique est: " +  LivreNumirique.Calcule_Prix()+"dhs");

        LinkedList<LivreNumerique>liver_numerique=new LinkedList<LivreNumerique>();

        liver_numerique.add(LivreNumirique);

        for(LivreNumerique liver: liver_numerique){
            System.out.println("titre:"+liver.title+" auteur:"+liver.auteur+" nombre de page:"+liver.Nomber_page);
        }

    }
}
