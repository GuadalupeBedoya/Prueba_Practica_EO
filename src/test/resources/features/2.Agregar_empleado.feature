# language: es

Característica: Agregar un nuevo empleado en OrangeHRM
  Como usuario administrador
  Quiero agregar un nuevo empleado
  Para gestionar la información de los empleados

  Escenario: Agregar un empleado exitosamente
    Dado que el usuario inicia sesion en OrangeHRM
    Cuando agrega un nuevo empleado con informacion valida
    Entonces el sistema redirige al usuario a la pagina de administracion
