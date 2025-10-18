import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner ipute=new Scanner(System.in);
            LinkedList<LiverPapier>listpapier=new LinkedList<>();
            System.out.println("how many book you want to add:");
            int n=ipute.nextInt();

            for(int i=0; i<n; i++){
                System.out.println("Book "+(i+1)+":");
                    ipute.nextLine(); // Consume newline
                System.out.println("Enter the auteur of book:");
                String auteur=ipute.nextLine();
              

                System.out.println("Enter the Nomber_page:");
                int Nomber_page=ipute.nextInt();
                 ipute.nextLine(); // Consume newline
               
                 System.out.println("Enter the title of book:");
                String title=ipute.nextLine();
               
                System.out.println("Enter the emprunt (true/false):");
                Boolean imprunt=ipute.nextBoolean();
                ipute.nextLine(); // Consume newline

                System.out.println("Enter the prix of book:");
                double prix=ipute.nextDouble();
                ipute.nextLine(); // Consume newline

                LiverPapier livrepapier=new LiverPapier(auteur,Nomber_page,title,imprunt,prix);
                 listpapier.add(livrepapier);
            }
            int i=1;
            for(LiverPapier ob:listpapier){
                
                System.out.println( "book "+(i)+":"+ "auteur: "+ob.auteur+" ,Nomber_page: "+ob.Nomber_page+" ,title: "+ob.title+" ,emprunt: "+ob.isUmprunt()+" ,prix: "+ob.Calcule_Prix());
                i++;
            }

    }
}
