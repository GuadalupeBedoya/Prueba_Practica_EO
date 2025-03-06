# language: es

Característica: Inicio de Sesión en OrangeHRM

Escenario: Inicio de sesión exitoso con credenciales válidas
Dado que el usuario accede a la pagina de inicio de sesion de OrangeHRM
Cuando el usuario ingresa los datos de usuario y contraseña y de clic en Login
Entonces debería ver la página de inicio del sistema


Escenario: Intento de inicio de sesión con credenciales incorrectas
Dado que el usuario accede a la pagina de inicio de sesion de OrangeHRM
Cuando  el usuario ingresa el usuario o la contraseña de forma incorrecta
Entonces debería ver un mensaje de error
