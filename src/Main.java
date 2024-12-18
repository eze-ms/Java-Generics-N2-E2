public class Main {
    public static void main(String[] args) {
        Person person = new Person("Joan", "Pérez", 30);

        // Llamar al metodo estático genérico con diferentes tipos de parámetros
        GenericMethods.genericMethod(person, "Hola", 25);
    }
}
