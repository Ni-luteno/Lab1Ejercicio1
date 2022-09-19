package lab1ejercicio1;

public class Bateria {

    private int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Bateria(int carga) {
        this.carga = carga;
    }

    public Bateria() {
        carga = 1000;
    }

}
