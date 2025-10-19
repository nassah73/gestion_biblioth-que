 class Magazin extends Livre{
    private int Liberer;
    private boolean emprunt;
    private double prix;
    public Magazin(String auteur, int Nomber_page, String title,int Liberer,boolean emprunt,double prix){
     super(auteur, Nomber_page, title);
        this.Liberer=Liberer;
        this.emprunt=emprunt;
        this.prix=prix;
    }
    @Override
    public boolean isUmprunt() {
        return emprunt;
    }
    @Override
    public boolean returned() {
        if(!isUmprunt()==true){
            emprunt=false;
            return true;

        }
        return false;
    }
    public double Calcule_Prix(){
        double price=this.prix+10;
        return price;
    }
}
