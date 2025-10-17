abstract class Livre{
    protected String auteur ;
    protected int Nomber_page;
    protected String title;

    abstract public boolean isUmprunt();
    abstract public boolean returned();
}