import java.util.LinkedList;
import java.util.Scanner;

class Cestion_bibliothique {
      static String typeOfBook(){
        Scanner ipute=new Scanner(System.in);
        System.out.println("Choose the type of book to add:");
        System.out.println("1. LiverPapier");
        System.out.println("2. LivreNumerique");
        System.out.println("3. Magazin");
        int type=ipute.nextInt();
        ipute.nextLine(); // Consume newline
        if (type==1) {
            return "LiverPapier";
        }else if(type==2){
            return "LivreNumerique";
        }else if(type==3){
            return "Magazin";
        }
        return "";
    }

       public static void principale() {
            Scanner ipute=new Scanner(System.in);
            LinkedList<LiverPapier>listpapier=new LinkedList<>();
            LinkedList<LivreNumerique>listnum=new LinkedList<>();
            LinkedList<Magazin>listMagazin=new LinkedList<>();

            System.out.println("how many book you want to add:");
            int n=ipute.nextInt();

             
               ipute.nextLine(); // Consume newline
             
                String bookType=typeOfBook();
           


               for(int i=0; i<n; i++){
                if (bookType== "LiverPapier") {
                      System.out.println("LiverPapier"+(i+1)+":");
                     break;
                }else if(bookType== "LivreNumerique"){

                     System.out.println("LivreNumerique"+(i+1)+":");
                      break;
                }else if(bookType== "Magazin"){
                    
                     System.out.println("Magazin"+(i+1)+":");
                }
               
                 
                System.out.println("Enter the auteur of"+bookType+":"); 
                String auteur=ipute.nextLine();
              

                System.out.println("Enter the Nomber_page:");
                int Nomber_page=ipute.nextInt();
                 ipute.nextLine(); // Consume newline
               
                 System.out.println("Enter the title of"+bookType+":");
                String title=ipute.nextLine();
               
                System.out.println("Enter the emprunt (true/false):");
                Boolean imprunt=ipute.nextBoolean();
                ipute.nextLine(); // Consume newline

                System.out.println("Enter the prix of "+bookType+":");
                double prix=ipute.nextDouble();
                ipute.nextLine(); // Consume newline

                if (bookType== "LiverPapier") {
                    LiverPapier livrepapier=new LiverPapier(auteur,Nomber_page,title,imprunt,prix);
                 listpapier.add(livrepapier);
                
                }else if(bookType== "LivreNumerique"){
                    LivreNumerique livrenumerique=new LivreNumerique(auteur,Nomber_page,title,100,imprunt,prix);
                    livrenumerique.telecharger();
                    livrenumerique.Calcule_Prix();
                    listnum.add(livrenumerique);
                }else if(bookType== "Magazin"){
                    Magazin magazin=new Magazin(auteur,Nomber_page,title,5,imprunt,prix);
                    magazin.Calcule_Prix();
                    listMagazin.add(magazin);


                
            }}
       /*    int j=1;

            if (bookType== "LiverPapier") {
                 for(LiverPapier ob:listpapier){
                
                System.out.println( "book "+(j)+":"+ "auteur: "+ob.auteur+" ,Nomber_page: "+ob.Nomber_page+" ,title: "+ob.title+" ,emprunt: "+ob.isUmprunt()+" ,prix: "+ob.Calcule_Prix());
                j++;
            }
            }else if(bookType== "LivreNumerique"){
                 for(LivreNumerique ob:listnum){
                
                System.out.println( "book "+(j)+":"+ "auteur: "+ob.auteur+" ,Nomber_page: "+ob.Nomber_page+" ,title: "+ob.title+" ,emprunt: "+ob.isUmprunt()+" ,prix: "+ob.Calcule_Prix());
                j++;
            }}
            else if(bookType== "Magazin"){
                  for(Magazin ob:listMagazin){
                    System.out.println( "book "+(j)+":"+ "auteur: "+ob.auteur+" ,Nomber_page: "+ob.Nomber_page+" ,title: "+ob.title+" ,emprunt: "+ob.isUmprunt()+" ,prix: "+ob.Calcule_Prix());
            }*/

//}
  }
}
