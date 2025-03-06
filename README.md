 # **Prueba Práctica EO** 


Este proyecto de automatización de pruebas se basa en Serenity BDD con patron de diseño Screenplay, con el objetivo de validar el flujo completo de un sistema de gestión de empleados. Se incluyen pruebas para:

·Inicio de sesión  
·Agregar un empleado  
·Consultar un empleado  
·Cerrar sesión  

## :computer:**Tecnologías Utilizadas**

·Serenity BDD  
·Screenplay  
·Java  
·Gradle   
·Cucumber  


## :hammer_and_wrench:Instalación y Configuración 

Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instaladas las siguientes herramientas:

·Java 16  
·Gradle v8.10.2  
·WebDriver Chrome   
·IDE IntelliJ (o cualquier otro IDE compatible con Java)  
·Cucumber 4.2.8  
·Screenplay 4.2.8  
 

## :gear:Clonar el Proyecto 

Para descargar el código fuente, ejecuta el siguiente comando en la terminal:  
`git clone https://github.com/GuadalupeBedoya/Prueba_Practica_EO.git`

## :page_facing_up:Estructura del Proyecto 

El proyecto está organizado de la siguiente manera:

Prueba_Practica_EO/  
│── src/  
│   ├── main/java/co/com/orangeHRM/  
│   │   ├── questions/         Clases para validar condiciones  
│   │   ├── tasks/             Definición de tareas en Screenplay  
│   │   ├── userinterface/     Localizadores de elementos UI  
│   │   ├── utils/             Utilidades y configuraciones auxiliares  
│   ├── test/  
│   │   ├── java/  
│   │   ├── stepsdefinitions/  Definición de pasos en Cucumber  
│   │   ├── runner/            Clases para ejecutar las pruebas  
│   │   ├── resources/  
│   │   │   ├── features/      Escenarios de Cucumber  
│── serenity.conf/             Configuración de Serenity  
│── build.gradle/              Dependencias y configuraciones de Gradle  

## :wrench:Ejecución de Pruebas 

Ejecutar las pruebas individualmente

Cada feature tiene su propio runner, por lo que puedes ejecutarlos de forma independiente desde IntelliJ o la terminal.

## :crossed_swords:Ejecutar todas las pruebas (E2E) 

Se ha creado un runner general llamado E2E_runner.java que permite ejecutar todas las pruebas de principio a fin. 

## :chart_with_upwards_trend:Reportes de Serenity 

Los reportes de ejecución se generan automáticamente en la carpeta:  
target/site/serenity/index.html
