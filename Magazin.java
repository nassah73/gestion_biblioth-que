 class Magazin extends Livre{
    private int Liberer;
    private boolean emprunt;
    private double prix;
    public Magazin(String auteur, int Nomber_page, String title,int Liberer,boolean emprunt){
     super(auteur, Nomber_page, title);
        this.Liberer=Liberer;
        this.emprunt=emprunt;
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
        double price=prix+10;
        return price;
    }
}
