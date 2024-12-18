public class GenericMethods {

    // Metodo genérico que acepta tres parámetros de tipos distintos
    static <T, V, K> void genericMethod(T t, V v, K k) {
        System.out.println("Argumento 1: " + t);
        System.out.println("Argumento 2: " + v);
        System.out.println("Argumento 3: " + k);
    }
}
