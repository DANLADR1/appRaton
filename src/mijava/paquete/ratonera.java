package mijava.paquete;

public class ratonera extends ratonera2 implements ratonera3 {

    public ratonera(){
    }

    // Este método devuelve formateada la edad y peso del ratón.
    @Override
    public String infromacion() {
        return String.format("(%d;%.2f)", this.getEdad(), this.getPeso());
    }

}
