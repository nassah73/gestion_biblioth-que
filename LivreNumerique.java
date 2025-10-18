 class LivreNumerique extends Livre implements Telechargeable{
    private int Mo;
    private double prix;
    private boolean emprunt;
    LivreNumerique(String auteur, int Nomber_page, String title, int Mo, boolean emprunt,double prix){
        super(auteur, Nomber_page, title);
        this.Mo=Mo;
        this.emprunt=emprunt;
        this.prix=prix;
    }

    public void telecharger() {
        System.out.println("Le livre numerique de " + Mo + " Mo est telecharge.");
    }
    public double Calcule_Prix(){
       double price=this.prix*0.8;
         return price;
    }

    public boolean isUmprunt() {
        return this.emprunt;
    }
    public boolean returned() {
        if (!isUmprunt()) {
            emprunt = false;
            return true;
        }
        return false;
    }
}
