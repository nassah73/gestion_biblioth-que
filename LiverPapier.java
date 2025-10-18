 class LiverPapier extends Livre {
    private boolean emprunt;
    private double prix;
    public LiverPapier(String auteur, int Nomber_page, String title,boolean emprunt) {
      
        super(auteur, Nomber_page, title);
        this.emprunt = emprunt;
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
        double price=prix+(Nomber_page*0.05);
        return price;
    }
}
