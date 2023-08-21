package mx.com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTDORAS = 10;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTDORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras <= Orden.MAX_COMPUTDORAS ) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("No se puede agregar más computadoras a la orden");
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Computadoras de la orden: " + this.contadorComputadoras);
        for (int i = 0; i <= this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }





}
