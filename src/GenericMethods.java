public class GenericMethods {

    // Método genérico que acepta un parámetro específico (String) y dos genéricos
    static <T, V> String genericMethod(String s, T t, V v) {
        return s + "\n" + t + "\n" + v;
    }
}
