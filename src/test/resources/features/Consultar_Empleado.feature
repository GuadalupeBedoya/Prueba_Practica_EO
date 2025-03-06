# language: es

Característica: Consultar un empleado en OrangeHRM
  Como usuario administrador
  Quiero consultar un empleado existente
  Para verificar que su información sea correcta


  Escenario: Consulta exitosa de un empleado
    Dado que el usuario administrador esta en la pagina de Admin de OrangeHRM
    Cuando busca al empleado previamente registrado con el Username
    Entonces el sistema debe mostrar los datos correctos del empleado
    Y despues de visualizar los datos el administrador elimina al empleado
    Y finalmente el administrador cierra sesion
