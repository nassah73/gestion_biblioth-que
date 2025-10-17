 class LiverPapier extends Livre {
    private boolean emprunt;

    public LiverPapier(String auteur, int Nomber_page, String title) {
        this.auteur = auteur;
        this.Nomber_page = Nomber_page;
        this.title = title;
        this.emprunt = false;
    }

    @Override
    public boolean isUmprunt() {
        return emprunt;
    }

    @Override
    public boolean returned() {
        if (isUmprunt()) {
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
}
