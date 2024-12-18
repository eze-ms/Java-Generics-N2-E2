public class GenericMethods {

    // Método genérico que acepta una cantidad indefinida de parámetros
    @SafeVarargs
    static <T> T[] genericMethod(T... args) {
        return args; // Retorna los argumentos como un array
    }
}