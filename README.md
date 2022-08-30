LABORATORIO 3 - PBT
===

## CLASES DE EQUIVALENCIA

#### CREAR UN PROYECTO CON MAVEN
* Dados los requerimientos se crea el proyecto
    * \ ![1](https://github.com/Tianrojas/CVDS-lab3/blob/main/Resourses/1.png)

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
