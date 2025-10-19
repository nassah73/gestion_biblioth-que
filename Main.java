import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner ipute=new Scanner(System.in);
            LinkedList<LiverPapier>listpapier=new LinkedList<>();
            LinkedList<LivreNumerique>listnum=new LinkedList<>();
            LinkedList<Magazin>listMagazin=new LinkedList<>();

            System.out.println("how many book you want to add:");
            int n=ipute.nextInt();

              System.out.println("quelle type of book you want to add  click 1 for LiverPapier click 2 for LivreNumerique click 3 for Magazin:");
              int type=ipute.nextInt();
               ipute.nextLine(); // Consume newline
           
                



               for(int i=0; i<n; i++){
                if (type==1) {
                      System.out.println("LiverPapier"+(i+1)+":");
                }else if(type==2){
                     System.out.println("LivreNumerique"+(i+1)+":");
                }else if(type==3){
                     System.out.println("Magazin"+(i+1)+":");
                }
               
                 
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

                if (type==1) {
                    LiverPapier livrepapier=new LiverPapier(auteur,Nomber_page,title,imprunt,prix);
                 listpapier.add(livrepapier);
                
                }else if(type==2){
                    LivreNumerique livrenumerique=new LivreNumerique(auteur,Nomber_page,title,100,imprunt,prix);
                    livrenumerique.telecharger();
                    livrenumerique.Calcule_Prix();
                    listnum.add(livrenumerique);
                }else if(type==3){
                    Magazin magazin=new Magazin(auteur,Nomber_page,title,5,imprunt);
                    magazin.Calcule_Prix();
                    listMagazin.add(magazin);


                
            }}
            int j=1;

            if (type==1) {
                 for(LiverPapier ob:listpapier){
                
                System.out.println( "book "+(j)+":"+ "auteur: "+ob.auteur+" ,Nomber_page: "+ob.Nomber_page+" ,title: "+ob.title+" ,emprunt: "+ob.isUmprunt()+" ,prix: "+ob.Calcule_Prix());
                j++;
            }
            }else if(type==2){
                 for(LivreNumerique ob:listnum){
                
                System.out.println( "book "+(j)+":"+ "auteur: "+ob.auteur+" ,Nomber_page: "+ob.Nomber_page+" ,title: "+ob.title+" ,emprunt: "+ob.isUmprunt()+" ,prix: "+ob.Calcule_Prix());
                j++;
            }}
            else if(type==3){
                  for(Magazin ob:listMagazin){
                    System.out.println( "book "+(j)+":"+ "auteur: "+ob.auteur+" ,Nomber_page: "+ob.Nomber_page+" ,title: "+ob.title+" ,emprunt: "+ob.isUmprunt()+" ,prix: "+ob.Calcule_Prix());
            }

}
  }
       
}
