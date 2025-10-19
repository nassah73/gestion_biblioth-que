import java.util.LinkedList;
import java.util.Scanner;
public class Main {

    public static void main(String[]args){
        Scanner ipute=new Scanner(System.in);
        Cestion_bibliothique cb=new Cestion_bibliothique();

          
        System.out.println("type book you want to add :");
        System.out.println("1.LiverPapier");
        System.out.println("2.LivreNumerique");
        System.out.println("3.Magazin");
        int choice=ipute.nextInt();
        ipute.nextLine();
        while (true) {
              System.out.println("enter name autheur of Book or mgazin:");
               String name=ipute.nextLine();

               System.out.println("enter title of book or magazin:");
                String title=ipute.nextLine();

                System.out.println("this book is emprunt true/false:");
                boolean emprunt=ipute.nextBoolean();
                ipute.nextLine();

                System.out.println("enter prix of page:");
                int Nbr_pr=ipute.nextInt();
                ipute.nextLine();
                System.out.println("enter nomber page of book or magazin:");
                int Nbr=ipute.nextInt();
                ipute.nextLine();

                if(choice==1){
                    LinkedList<LiverPapier>listbook=new LinkedList<>();
                    LiverPapier lp=new LiverPapier(name,Nbr,title,true,Nbr_pr);
                    listbook.add(lp);
                display(listbook);
                }else if(choice==2){
                    LinkedList<LivreNumerique>listnum=new LinkedList<>();
                    LivreNumerique ln=new LivreNumerique(name,Nbr,title,Nbr,true,Nbr_pr);
                    listnum.add(ln);
                   display(listnum) ;
                }
              
              
              
                System.out.println("do you wand to add another book yes/no:");
              String rep=ipute.nextLine();
                if(rep.equals("no")){
                    break;
                }

          }
           

        }

         static public void display(LinkedList<LiverPapier>listbook){
            for(LiverPapier l:listbook){
        System.out.println("auteur:"+l.auteur+" title:"+l.title+" nomber page:"+l.Nomber_page+" emprunt:"+l.isUmprunt()+" prix:"+l.Calcule_Prix());
    }
        }
    
}
