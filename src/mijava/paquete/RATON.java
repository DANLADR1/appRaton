package mijava.paquete;

public class RATON {
    private int edad; // edad del ratón en días
    private double peso; // peso del ratón en gramos
    private double tasaCrecimiento; // incremento del peso por día, en tanto porciento

    public RATON(){
    }

    // Este método simula un día de crecimiento para un ratón.
    public void desarrollo() {
        this.setPeso(this.getPeso() + crecida());
        this.setEdad(this.getEdad() + 1);
    }

    private double crecida() {
        return this.getPeso() * this.getTasaCrecimiento() / 100.0;
    }

    // Este método devuelve formateada la edad y peso del ratón.
    public String infromacion() {
        return String.format("(%d;%.2f)", this.getEdad(), this.getPeso());
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTasaCrecimiento() {
        return tasaCrecimiento;
    }

    public void setTasaCrecimiento(double tasaCrecimiento) {
        this.tasaCrecimiento = tasaCrecimiento;
    }
}
