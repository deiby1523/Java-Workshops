package mx.com.gm.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double size;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double size) {
        this();
        this.marca = marca;
        this.size = size;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor [ idMonitor=" + idMonitor + ", marca=" + marca + ", size=" + size + "]";
    }

    
}


