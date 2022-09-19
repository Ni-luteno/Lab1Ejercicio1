package lab1ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hombre {

    private String nombre;

    private String apellido;

    private int edad;

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public String toString() {
        return "Hombre{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    /*
    Enunciado:
    en la clase Hombre solamente dar implementación al método JugarConRobot() para que: El robot Avance 500 pasos. 
    El robot Retroceda 20 pasos. Informe por pantalla cuanta energía tiene el robot Actualmente. Ponga el robot a dormir.
     */
    public void jugarConRobot(Robot r) {

        System.out.println("La persona agarra el robot y lo enciende");
        r.despertar();

        System.out.println("Hace al robot avanzar 500 pasos");
        r.avanzar(500);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Hace al robot retroceder 20 pasos");
        r.retroceder(20);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Energia restante del robot: " + r.energiaActual());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Pone el robot a dormir");
        r.dormir();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");

        /*Extra:
         Modificar al método jugar con robot para que reciba por teclado los pasos que desea
         que avance o retroceda el robot las veces que quiera y finalice sólo cuando ponga a
         dormir al robot. (Puede utilizar la clase Scanner para leer desde el teclado)*/
        boolean sale = false;
        System.out.println("Ahora que ya ha cumplido la consigna, ¿Que mas desearia hacer?");
        int opc;
        do {
            try {
                System.out.println("1 - Encender.");
                System.out.println("2 - Avanzar.");
                System.out.println("3 - Retroceder.");
                System.out.println("4 - Comprobar estado de bateria.");
                System.out.println("5 - Recargar bateria.");
                System.out.println("6 - Dormir.");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        if (r.isPrendido()) {
                            System.out.println("El robot ya está prendido");
                        } else {
                            r.despertar();
                            System.out.println("Robot Encendido");
                        }
                        break;
                    case 2:
                        if (!r.isPrendido()) {
                            System.out.println("Robot apagado");
                        } else {
                            System.out.println("¿Cuántos pasos desea avanzar? (Múltiplo de 10)");
                            int p = leer.nextInt();
                            if (p % 10 == 0) {
                                r.avanzar(p);
                            } else {
                                System.out.println("Cantidad de pasos no válida (ingresar múltiplo de 10)");
                            }
                        }
                        break;
                    case 3:
                        if (!r.isPrendido()) {
                            System.out.println("Robot apagado");
                        } else {
                            System.out.println("¿Cuántos pasos desea retroceder? (Múltiplo de 10)");
                            int p = leer.nextInt();
                            if (p % 10 == 0) {
                                r.retroceder(p);
                            } else {
                                System.out.println("Cantidad de pasos no válida (ingresar múltiplo de 10)");
                            }
                        }
                        break;
                    case 4:
                        if (!r.isPrendido()) {
                            System.out.println("Robot apagado");
                        } else {
                            System.out.println("Batería actual: " + r.energiaActual());
                        }
                        break;
                    case 5:
                        if (!r.isPrendido()) {
                            System.out.println("Robot apagado");
                        } else if (r.bateriaLlena()) {
                            System.out.println("La batería ya está llena!");
                        } else {
                            System.out.println("Batería cargada.");
                            r.recargar();
                        }
                        break;
                    case 6:
                        if (!r.isPrendido()) {
                            System.out.println("El robot ya está apagado");
                        } else {
                            r.dormir();
                            System.out.println("El robot se pone a dormir... dulces sueños amigo de metal");
                            sale = true;
                        }
                        break;
                    default:
                        System.out.println("Opcion invalida, ingrese un numero del 1 al 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion invalida, ingrese un numero del 1 al 6");
                leer.next();
            } catch (Exception e) {
                System.out.println("Algo salió mal, volvé a intentarlo");
                leer.next();
            }

        } while (!sale);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
