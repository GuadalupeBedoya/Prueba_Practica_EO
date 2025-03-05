# language: es

Característica: Agregar un nuevo empleado en OrangeHRM
  Como usuario administrador
  Quiero agregar un nuevo empleado
  Para gestionar la información de los empleados

  Escenario: Agregar un empleado exitosamente
    Dado que el usuario inicia sesión en OrangeHRM
    Cuando agrega un nuevo empleado con informacion valida
    Entonces el sistema confirma el registro con un mensaje de exito
