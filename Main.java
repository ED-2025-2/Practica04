import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ContadorCircular contador = new ContadorCircular(1, 7, 3);
        Iterator<Integer> iterador = contador.iterator();

        while (iterador.hasNext()) {
            int num = iterador.next();
            System.out.print(num + " ");

            // Se elimina el numero 3
            if (num == 3) {
                iterador.remove(); 
            }
            // Se elimina el numero 5
            if (num == 5){
                iterador.remove();
            }
        }
    }
}
