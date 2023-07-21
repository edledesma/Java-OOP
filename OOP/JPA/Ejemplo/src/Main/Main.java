package Main;

import javax.persistence.*;
import Entity.producto;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        try {
            // Begin transaction
            em.getTransaction().begin();

            // Create a new Product entity and set its attributes
            producto producto = new producto();
            producto.setNombre("Sample Product");

            // Persist the entity to the database
            em.persist(producto);

            // Commit the transaction
            em.getTransaction().commit();

            // Now the Product entity is saved to the database with an ID

            // Retrieve the entity from the database using its ID
            producto retrievedProducto = em.find(producto.class, producto.getCodigo());

            // Print the retrieved entity's name to verify that it's working
            System.out.println("Retrieved Product Name: " + retrievedProducto.getNombre());

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            // Close EntityManager and EntityManagerFactory
            em.close();
            emf.close();
        }
    }
}