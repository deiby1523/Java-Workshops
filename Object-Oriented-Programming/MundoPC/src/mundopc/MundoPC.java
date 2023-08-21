package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorLG = new Monitor("LG", 20);
        Teclado tecladoLimeide = new Teclado("USB","Limeide");
        Raton ratonGenerico = new Raton("USB", null);

        Computadora computadoraDeiby = new Computadora("Computadora de deiby", monitorLG, tecladoLimeide, ratonGenerico);

        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP );
        
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer );
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraDeiby);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraHP);

        orden1.mostrarOrden();

    }
}
