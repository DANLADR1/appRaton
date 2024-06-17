package mijava.paquete;

public class ratonera2 extends ratonera1 {
    private int edad; // edad del ratón en días
    private double peso; // peso del ratón en gramos
    private double tasaCrecimiento; // incremento del peso por día, en tanto porciento

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
