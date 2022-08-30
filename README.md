LABORATORIO 3 - PBT
===

## CLASES DE EQUIVALENCIA

#### CREAR UN PROYECTO CON MAVEN
* Dados los requerimientos se crea el proyecto
    *  \ 
        ![1](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/1.png)

### Actualizar y crear dependencias en el proyecto

* Busque en internet el repositorio central de maven. \
    [https://search.maven.org//](https://search.maven.org/)
* Busque el artefacto JUnit y entre a la versión más nueva \
    [https://search.maven.org/artifact/junit/junit/4.13.2/jar](https://search.maven.org/artifact/junit/junit/4.13.2/jar)
* Ingrese a la pestaña de Maven y haga click en el texto de la dependencia para copiarlo al portapapeles. \
    ![2](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/2.png)
* Edite el archivo pom.xml y realice las siguientes actualizaciones:
    * Agregue la dependencia copiada a la sección de dependencias. \
        ![3](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/3.png)
    * Hay que cambiar la versión del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias: \
        ![4](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/4.png)

#### COMPILAR Y EJECUTAR

* Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó correctamente y los cambios realizados al archivo pom no generan inconvenientes. \
    ![5](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/5.png)

* Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la claseAppTest con resultado exitoso. \
    ![6](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/6.png)

#### EJERCICIO “REGISTRADURÍA”

Se va a crear un proyecto base para un requerimiento de la registraduría en el cual se registrarán personas con intención de votar paras las próximaselecciones y se generarán los certificados electorales de aquellas personas cuyo voto sea válido.
Se usará la clase de persona que ya fue creada. El servicio de la registradiría permitirá registrar personas que sean votantes.

###### PROPIEDADES

* Solo se registrarán votantes válidos
* Solo se permite una inscripción por número de documento

##### HACER EL ESQUELETO DE LA APLICACION

* Archivos de `edu.eci.cvds.tdd.registry` creados \
    ![7](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/7.png)
* Cree la misma estructura de paquetes `edu.eci.cvds.tdd.registry` en la ruta `src/test/java`. Todos los archivos relacionados específicamente con los temas de pruebas, siempre deben ir bajo la carpeta test. \
    ![8](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/8.png)
* Se creo `RegistryTest.java` en el directorio `edu.eci.cvds.tdd.registry` de la manera indicada.

##### EJECUTAR LAS PRUEBAS

* Usando ya sea `mvn package` o `mvn test` es el mismo resultado

##### FINALIZAR EL EJERCICIO

* Piense en los casos de equivalencia que se pueden generar del ejercicio para la registraduría, dadas las condiciones. Deben ser al menos 5.
    * Se creara un caso de equivalencia para cada estado (DEAD, UNDERAGE, INVALID_AGE, VALID, DUPLICATED) evaluandolos sujetos a los parametros de entrada del constructor `Person()`.
* 


