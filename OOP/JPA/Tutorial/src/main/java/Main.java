import Entity.Empleado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la entidad Empleado
        Empleado empleado = new Empleado();
        empleado.setPrimerNombre("Alan");
        empleado.setPrimerApellido("Lura");
        //empleado.setId(4);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default"); // Crear el EntityManagerFactory usando la unidad de persistencia "default"
        EntityManager entityManager = entityManagerFactory.createEntityManager(); // Crear el EntityManager a partir del EntityManagerFactory
        entityManager.getTransaction().begin(); // Iniciar una transacción
        entityManager.persist(empleado); // Persistir el objeto Empleado en la base de datos
        entityManager.getTransaction().commit(); // Confirmar la transacción
        entityManager.close(); // Cerrar el EntityManager
        entityManagerFactory.close(); // Cerrar el EntityManagerFactory

        System.out.println("Empleado agregado");
    }
}
