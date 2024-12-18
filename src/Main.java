import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Person one = new Person("Ezequiel", "Macchi", 45);

        // Llamar al método genérico con diferentes tipos de parámetros
        String result = GenericMethods.genericMethod("Ezequiel", one, new File("cosmonaut_mission.dat"));

        // Imprimir el resultado
        System.out.println(result);
    }
}