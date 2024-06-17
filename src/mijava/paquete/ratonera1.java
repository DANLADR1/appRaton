package mijava.paquete;

public class ratonera1 {
    // Este método simula un día de crecimiento para un ratón.
    public void desarrollo() {
        this.setPeso(this.getPeso() + crecida());
        this.setEdad(this.getEdad() + 1);
    }

    private double crecida() {
        return this.getPeso() * this.getTasaCrecimiento() / 100.0;
    }
}
