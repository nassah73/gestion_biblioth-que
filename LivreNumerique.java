 class LivreNumerique extends Livre implements Telechargeable{
    private int Mo;
    private double prix;
    private boolean emprunt;
    LivreNumerique(String auteur, int Nomber_page, String title, int Mo, boolean emprunt){
        super(auteur, Nomber_page, title);
        this.Mo=Mo;
        this.emprunt=emprunt;
    }

    public void telecharger() {
        System.out.println("Le livre numerique de " + Mo + " Mo est telecharge.");
    }
    public double Calcule_Prix(){
       double price=prix*0.8;
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
