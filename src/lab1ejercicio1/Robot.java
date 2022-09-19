package lab1ejercicio1;

public class Robot {

    private Bateria bat = new Bateria();

    private boolean prendido;

    public void avanzar(int pasos) {
        if (!prendido) {
            System.out.println("El robot esta dormido. Encender para usar");
        } else if (pasos / 10 > bat.getCarga()) {
            System.out.println("No queda suficiente energia para avanzar esa cantidad de pasos");
            System.out.println("Se avanzan solo " + energiaActual() * 10 + " pasos");
        } else {
            System.out.println("Se avanzan " + pasos);
            bat.setCarga(energiaActual() - pasos / 10);
        }
    }

    public void retroceder(int pasos) {
        if (!prendido) {
            System.out.println("El robot esta dormido. Encender para usar");
        } else if (pasos / 10 > bat.getCarga()) {
            System.out.println("No queda suficiente energia para retroceder esa cantidad de pasos");
            System.out.println("Se retroceden solo " + energiaActual() * 10 + " pasos");
            bat.setCarga(0);
        } else {
            System.out.println("Se retroceden " + pasos);
            bat.setCarga(energiaActual() - pasos / 10);
        }
    }

    public void despertar() {
        prendido = true;
    }

    public void dormir() {
        prendido = false;
    }

    public void recargar() {
        System.out.println("Se recarga la bateria a su capacidad maxima.");
        bat.setCarga(1000);
    }

    public boolean bateriaLlena() {
        return energiaActual() == 1000;
    }

    public boolean bateriaVacia() {
        return energiaActual() == 0;
    }

    public int energiaActual() {
        return bat.getCarga();
    }

    public Bateria getBat() {
        return bat;
    }

    public void setBat(Bateria bat) {
        this.bat = bat;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }
}
