 class LiverPapier extends Livre {
    private boolean emprunt;
    private double prix;
    public LiverPapier(String auteur, int Nomber_page, String title,boolean emprunt,double prix){ 
      
        super(auteur, Nomber_page, title);
        this.emprunt = emprunt;
        this.prix=prix;
    }

    @Override
    public boolean isUmprunt() {
        return emprunt;
    }

    @Override
    public boolean returned() {
        if (!isUmprunt()) {
            emprunt = false;
            return true;
        }
        return false;
    }

    public boolean emprunter() {
        if (isUmprunt()) {
            emprunt = true;
            return true;
        }
        return false;
    }

    public double Calcule_Prix(){
        double price=this.prix+(Nomber_page*0.05);
        return price;
    }
}
