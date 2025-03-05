# language: es

Característica: Agregar un nuevo empleado en OrangeHRM
  Como usuario administrador
  Quiero agregar un nuevo empleado
  Para gestionar la información de los empleados

  Escenario: Agregar un empleado exitosamente
    Dado que el usuario inicia sesión en OrangeHRM
    Cuando ingresa a la sección de agregar empleado
    Y completa los datos del nuevo empleado
    Y guarda toda la información
    Entonces el sistema muestra un mensaje de éxito
