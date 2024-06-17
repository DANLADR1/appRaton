import mijava.paquete.RATON;

public class Main {
    public static void main(String[] args) {
        RATON mickey=new RATON();
        mickey.setEdad(1);
        mickey.setPeso(10);
        mickey.setTasaCrecimiento(0.5);

        RATON ratatouille=new RATON();
        ratatouille.setEdad(1);
        ratatouille.setPeso(8);
        ratatouille.setTasaCrecimiento(0.2);

        while(ratatouille.getPeso() <= mickey.getPeso()){
            System.out.printf("%s->%s   %s->%s\n","Ratatouille",ratatouille.infromacion(),"Mickey",mickey.infromacion());
            evolucion(ratatouille, mickey);
            if(ratatouille.getEdad() >=60) ratatouille.setTasaCrecimiento(ratatouille.getTasaCrecimiento() +1);
        }
    }

    private static void evolucion(RATON Raton_a, RATON Raton_b) {
        Raton_a.desarrollo();
        Raton_b.desarrollo();
    }
}