/*
TRABAJO PRACTICO OBLIGATORIO 1 GRUPO 3

Integrantes: GRUPO 3
- Ignacio Moyano
- Santiago Lucero
- Lucas Teruel

Enunciado:

Disponemos de 3 objetos conocidos: un Hombre, un Robot y una Bateria; sabemos que
el Robot reconoce las órdenes:
• Avanzar(cantidad de pasos)
• Retroceder(cantidad de Pasos)
• Dormir()
• Despertar()
• Recargar()
• bateriaLLena():boolean
• bateriaVacia() :boolean
• energiaActual() :int
También sabemos que un Robot tiene una batería con 1000 unidades de energía y que cada
vez que avanza o retrocede por cada 100 pasos pierde 10 unidades.
También sabemos que si damos la orden al robot de dormir, no responderá a ninguna otra
orden hasta despertarlo.
Para volver a recargar las baterías del robot, bastará con ordenarle que recargue.
La Bateria tiene como atributos carga que es un valor entero, posee un constructor que permite
inicializar su carga y los métodos get y set para dicho atributo.
Por otro lado el Hombre sabe:
• JugarConRobot(Robot).

Usted deberá modelar en UML las clases Robot y Hombre y luego darle implementación en
lenguaje java a los métodos del Robot y en la clase Hombre solamente dar implementación al
método JugarConRobot() para que: El robot Avance 500 pasos. El robot Retroceda 20 pasos.
Informe por pantalla cuanta energía tiene el robot Actualmente. Ponga el robot a dormir.
Luego desde el método main de una clase TestJuego, se pide:
a) Crear un Robot.
b) Crear un Hombre y pasarle el Robot creado en el ítem
anterior.
c) Hacer que el Hombre juegue con el Robot.
d) Crear otro Hombre y pasarle el mismo Robot
e) Hacer que el último Hombre creado juegue con el Robot,
Extra:
Modificar al método jugar con robot para que reciba por teclado los pasos que desea
que avance o retroceda el robot las veces que quiera y finalice sólo cuando ponga a
dormir al robot. (Puede utilizar la clase Scanner para leer desde el teclado)
 */
package lab1ejercicio1;

public class TestJuego {

    public static void main(String[] args) {
        Hombre h = new Hombre();
        Robot r = new Robot();
        h.jugarConRobot(r);

    }

}
