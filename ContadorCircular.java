import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase que implementa un contador circular con un rango de valores definido
 * y un número de repeticiones determinado.
 * Implementa la interfaz {@code Iterable<Integer>} para permitir la iteración
 * sobre los valores del contador.
 */
class ContadorCircular implements Iterable<Integer> {

    private final int inicio;
    private final int fin;
    private final int repeticiones;

    /**
     * Constructor de la clase ContadorCircular.
     *
     * @param inicio Valor inicial del contador.
     * @param fin Valor final del contador.
     * @param repeticiones Número de veces que el contador recorrerá el rango.
     * @throws IllegalArgumentException Si el inicio es mayor que el fin o si las repeticiones son menores a 1.
     */
    public ContadorCircular(int inicio, int fin, int repeticiones) {
        if (inicio > fin || repeticiones < 1) {
            throw new IllegalArgumentException("Rango inválido o repeticiones incorrectas.");
        }
        this.inicio = inicio;
        this.fin = fin;
        this.repeticiones = repeticiones;
    }

    /**
     * Retorna un iterador para recorrer el contador circularmente.
     *
     * @return Un iterador de enteros sobre el rango definido.
     */
    @Override
    public Iterator<Integer> iterator() {
        return new ContadorCircularIterator();
    }

    /**
     * Clase interna que implementa el iterador del ContadorCircular.
     */
    private class ContadorCircularIterator implements Iterator<Integer> {

        private int actual = inicio;
        private int vueltas = 0;
        private Integer ultimoRetornado = null;
        private boolean[] eliminados = new boolean[fin - inicio + 1]; // Para marcar los números eliminados

        /**
         * Verifica si hay más elementos disponibles en la iteración.
         *
         * @return {@code true} si hay más elementos, {@code false} en caso contrario.
         */
        @Override
        public boolean hasNext() {
            // Aqui va su codigo
        }

        /**
         * Retorna el siguiente valor disponible en la iteración.
         *
         * @return El siguiente número en el contador circular.
         * @throws NoSuchElementException Si no hay más elementos disponibles.
         */
        @Override
        public Integer next() {
            // Aqui va su codigo
        }

        /**
         * Elimina el último elemento retornado por {@code next()}.
         *
         * @throws IllegalStateException Si {@code next()} no ha sido llamado antes de {@code remove()}.
         */
        @Override
        public void remove() {
            // Aqui va su codigo
        }
    }
}
