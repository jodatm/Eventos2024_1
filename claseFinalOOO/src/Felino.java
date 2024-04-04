public abstract class Felino {
    private int tamañogarras;
    private boolean cazan;
    public Felino(int tamañogarras, boolean cazan) {
        this.tamañogarras = tamañogarras;
        this.cazan = cazan;
    }
    public int getTamañogarras() {
        return tamañogarras;
    }
    public void setTamañogarras(int tamañogarras) {
        this.tamañogarras = tamañogarras;
    }
    public boolean isCazan() {
        return cazan;
    }
    public void setCazan(boolean cazan) {
        this.cazan = cazan;
    }

    public abstract boolean arañanFuerte(String edad);

}
