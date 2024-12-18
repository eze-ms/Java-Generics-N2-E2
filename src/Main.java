import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Person
        Person yuri = new Person("Ezequiel", "Macchi", 45);

        // Llamar al metodo genérico con diferentes tipos de parámetros
        Object[] result = GenericMethods.genericMethod("Ezequiel", yuri, new File("cosmonaut_mission.dat"), "Extra string", 123);

        // Imprimir el resultado
        Arrays.stream(result).forEach(System.out::println);
    }
}