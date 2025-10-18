abstract class Livre{
    protected String auteur ;
    protected int Nomber_page;
    protected String title;
     public Livre(String auteur, int Nomber_page, String title){
        this.auteur=auteur;
        this.Nomber_page=Nomber_page;
        this.title=title;

     }
    abstract public boolean isUmprunt();
    abstract public boolean returned();
}