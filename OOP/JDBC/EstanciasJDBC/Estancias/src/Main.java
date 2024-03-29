/*
Estancias en el extranjero
Nos han pedido que hagamos una aplicación Java de consola para una pequeña empresa que
se dedica a organizar estancias en el extranjero dentro de una familia. El objetivo es el
desarrollo del sistema de reserva de casas para realizar estancias en el exterior, utilizando el
lenguaje JAVA, una base de datos MySQL y JDBC para realizar la ejecución de operaciones
sobre la base de datos (BD).
Creación de la Base de Datos MySQL
La información que se desea almacenar en la base de datos es la siguiente:
• Se tienen contactos con familias de diferentes países que ofrecen alguna de las
habitaciones de su hogar para acoger algún chico (por un módico precio). De cada una de
estas familias se conoce el nombre, la edad mínima y máxima de sus hijos, número de
hijos y correo electrónico.
• Cada una de estas familias vive en una casa, de la que se conoce la dirección (calle,
numero, código postal, ciudad y país), el periodo de disponibilidad de la casa
(fecha_desde, fecha_hasta), la cantidad de días mínimo de estancia y la cantidad máxima
de días, el precio de la habitación por día y el tipo de vivienda.
• Se dispone también de información de los clientes que desean mandar a sus hijos a
alguna de estas familias: nombre, dirección (calle, numero, código postal, ciudad y país) y
su correo electrónico.
• En la BD se almacena información de las reservas y estancias realizadas por alguno de los
clientes. Cada estancia o reserva la realiza un cliente, y además, el cliente puede reservar
varias habitaciones al mismo tiempo (por ejemplo para varios de sus hijos), para un
periodo determinado (fecha_llegada, fecha_salida).
• El sistema debe también almacenar información brindada por los clientes sobre las casas
en las que ya han estado (comentarios).
Según todas estas especificaciones se debe realizar:
Para este ejercicio vamos a usar el script de la base de datos llamada “estancias_exterior.sql”
lo van a encontrar en el archivo persistencia.zip Deberá obtener un diagrama de entidad
relación igual al que se muestra a continuación:

15

Paquetes del Proyecto Java
Crear un nuevo proyecto en Netbeans del tipo “Java Application” con el nombre Estancias y
agregar dentro 3 paquetes, a uno se lo llamará entidades, al otro se lo llamará servicios y al
otro persistencia:

16

Paquete persistencia
En este paquete estará la clase DAO encarga de conectarse con la base de datos y de
comunicarse con la base de datos para obtener sus datos. Además, estará las clases de
EntidadDaoExt para cada entidad / tabla de nuestro proyecto.
Es importante tener la conexión creada a la base de datos, como lo explica el Instructivo en la
pestaña de Services en Netbeans.
Agregar en “Libraries” la librería “MySQL JDBC Driver” para permitir conectar la aplicación de
Java con la base de datos MySQL.
Paquete entidades
Dentro de este paquete se deben crear todas las clases necesarias que queremos persistir en
la base de datos. Por ejemplo, una de las clases a crear dentro de este paquete es la clase
“Familia.java” con los siguientes atributos:
• private int id;
• private String nombre;
• private int edad_minima;
• private int edad_maxima;
• private int num_hijos;
• private String email;
Agregar a cada clase el/los constructores necesarios y los métodos públicos getters y setters
para poder acceder a los atributos privados de la clase.
Paquete servicios:
En este paquete se almacenarán aquellas clases que llevarán adelante lógica del negocio. En
general se crea un servicio para administrar cada una de las entidades y algunos servicios
para manejar operaciones muy específicas como las estadísticas.
Para realizar las consultas con la base de datos, dentro del paquete servicios, creamos las
clases para cada una de las entidades con los métodos necesarios para realizar consultas a la
base de datos. Una de las clases a crear en este paquete será: FamiliaServicio.java, y en esta
clase se implementará, por ejemplo, un método para listar todas las familias que ofrecen
alguna habitación para realizar estancias.
Realizar un menú en java a través del cual se permita elegir qué consulta se desea realizar.
Las consultas a realizar sobre la BD son las siguientes:
a) .
b) .
c) .
d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
y un número de días específico.
e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
descripción de la casa donde la realizaron.

17
f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a
la anterior
g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios
actualizados.
h) Obtener el número de casas que existen para cada uno de los países diferentes.
i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
que están ‘limpias’.
j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
Para finalizar, pensar junto con un compañero cómo sería posible optimizar las tablas de la BD
para tener un mejor rendimiento.
 */

import java.util.Scanner;
import servicios.casasService;

public class Main {

    static casasService casa = new casasService();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int operacion = 0;
            while (operacion != 10) {
                System.out.println("1. Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.");
                System.out.println("2. Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.");
                System.out.println("3. Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.");
                System.out.println("4. Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico.");
                System.out.println("5. Listar los datos de todos los clientes que en algún momento realizaron una estancia y la descripción de la casa donde la realizaron.");
                System.out.println("6. Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y ciudad del cliente y además la información de la casa que reservó.");
                System.out.println("7. Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios actualizados.");
                System.out.println("8. Obtener el número de casas que existen para cada uno de los países diferentes.");
                System.out.println("9. Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’.");
                System.out.println("10. Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.");
                operacion = leer.nextInt();
                switch (operacion) {
                    case 1:
                        casa.casaInsertar();
                        break;
                    case 2:
                        System.out.println("8");
                        break;
                    case 3:
                        System.out.println("8");
                        break;
                    case 4:
                        System.out.println("8");
                        break;
                    case 5:
                        System.out.println("8");
                        break;
                    case 6:
                        System.out.println("8");
                        break;
                    case 7:
                        System.out.println("8");
                        break;
                    case 8:
                        System.out.println("8");
                        break;
                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            //producto.cerrarScanner();
            //fabricante.cerrarScanner();
            leer.close(); // Cerrar el recurso Scanner al salir del programa
        }
    }
}