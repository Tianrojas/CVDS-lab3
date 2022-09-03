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
    * Clases de equivalecia: \
        * Para el estado DEAD, hay 2 para el paramentro `alive` en Person: basicamente true o false.
        * Para el estado UNDERAGE, hay 2 para el paramentro `age` en Person: [0, 18] y [18, +inf]
        * Para el estado INVALID_AGE, hay 3 para el paramentro `age` en Person: [-inf, 0), [0, inf] y param no Entero
        * Para el estado VALID, hay 2 en Person: El primero en el que todas las variables son adecuadas para Person y el que no las cumple.
        * Para el estado DUPLICATED, hay 2 en Person: registro de Person nueva y duplicado.
    * Se creara un caso de equivalencia para cada estado (DEAD, UNDERAGE, INVALID_AGE, VALID, DUPLICATED) evaluandolos sujetos a los parametros de entrada del constructor `Person()`. 
    
* Complete la implementación de la clase `RegistryTest.java` con (al menos) un método por cada clase de equivalencia, creandodiferentes personas y validando que el resultado sea el esperado. \
    ![9](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/9.png) \
    ![10](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/10.png)

*   Complete la implementación del método registerVoter en la clase `Registry.java` para retornar el resultado esperado según la entrada. \
    ![11](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/11.png) \
    ![12](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/12.png)

#### EJERCICIO "DESCUENTO DE TARIFAS"
##### REALIZAR DISEÑO DE PRUEBAS
* Respuestas del documento terminadas y adjuntas en el entregable.

##### IMPLEMENTACIÓN DE LAS PRUEBAS
* Descargue el archivo aerodescuentos.jar y adicione esta nueva dependencia en el archivo pom.xml de su proyecto. Para adicionar una librería personalizada al repositorio local de maven puede ejecutar el siguiente comando. ``` $ mvn install:install-file -Dfile=aerodescuentos-1.0.0.jar -DgroupId=edu.eci.cvds -DartifactId=aerodescuentos -Dversion=1.0.0 -Dpackaging=jar ``` \
    ![13](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/13.png)

* Ejecute el comando de Maven para las fases de compilación y pruebas. Verifique el resultado exitoso de todas las pruebas y el reporte generado. \
    ![14](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/14.png)





