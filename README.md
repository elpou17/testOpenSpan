# testOpenSpan
Prueba automatizacion de compras de artículos.
Realizar compras en la pagina de prueba http://training.openspan.com/login, con un usuario.

Se requiere:

Crear un testcase que se autentique en la aplicación y realice una compra de varios productos:

a. El usuario al utilizar, la categoría de los productos, la cantidad y los productos deben estar en un datafile.

b. El testcase de compra debe completar toda la información requerida de dirección, nombre de persona, apellido, etc. Con información random.

c. Dentro de la carpeta Keyword se debe de crear un paquete llamado entidad, dentro de este paquete crear una clase que lleve como nombre OpcionComun.

d. Dentro de la clase OpcionComun, crear varios métodos:

    a. Método darClick(): que haga la acción de click, debe de esperar por parámetro el objeto a seleccionar. Antes de dar el click debe de validar que el objeto esta presente en la pantalla y disponible para accionarse.
  
    b. Método escribirTexto(): que escriba un texto en un campo, debe de esperar por parámetro el objeto donde se va a escribir. Antes de escribir el testo debe de validar que el objeto esta presente en la pantalla y disponible para accionarse.

Dentro del flujo de autentificación y compra cada validación que se haga a un objeto debe de hacerse con el método realizado en el punto 3.

El testcase debe de tener validación para cada pantalla y screenshots a la cual se mueva, por ejemplo (Si entra al carrito debe de validar que la pantalla a la cual se accedió sea la del carrito y no a otra.)

Los productos a comprar son:
  a. Beverages:
    i. 1 unidad de Ipoh Coffee.
    ii. 1 unidad de Outback Lager.
    iii. 1 unidad de Chai.
  b. Seasonings
    i. 1 unidad de Genen Shouyu.
    ii. 1 unidad de Guia Malacca.

Al finalizar la ejecución del testcase debe de generar el reporte, en el cual se visualizara todos los pasos realizados, capturas de pantalla, testo de verificación exitoso o fallido.


