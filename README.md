ENTIDADES
----------

JAVI:
- ALQUILER
- NOTIFICACION

ALE:
- USUARIO
- CLIENTE
- JEFE

ALEX:
- VEHICULO
- CALIFICACIÓN

ARIEL:
- FACTURA 
- METODOPAGO

conexiones:
- cliente y jefe extienden de usuario
- un cliente tiene N alquileres
- un alquiler genera N notificaciones
- un alquiler tiene 1 vehículo asociado
- una calificación tiene 1 cliente y 1 vehículo asociados
- un vehículo tiene N notificaciones
- un cliente tiene N facturas
- un alquiler tiene 1 factura asociada
- un cliente tiene N métodos de pago

EL DAO DE CADA ENTIDAD TIENE COMO MINIMO 4 METODOS (los métodos CRUD, alta, baja, modificación y obtención) y el resto que se necesiten pa las vistas

VISTAS
-----------

JAVI:
-crear alquiler(ALTA) - jefe
-eliminar alquiler(BAJA) -jefe
-mod alquiler -jefe
-> ya pensare que coño hacer con las vistas de notificaciones
- MENU ALQUILER JEFE-> botones a las tres vistas de alquiler
- MENU ALQUILER CLIENTE -> botones a buscar alquileres y registro alquileres
-MENU JEFE -> botones al menú alquiler y menú vehiculos, tienes q estar loggeado

ALE:
-INDEX - presentación de la web - botones de login y registro
-LOGIN -> si es jefe, action al menú jefe, si no, action al menú cliente
-BAJA - eliminación del usuario, pide usuario y contraseña
-reset contraseña(UPDATE) - modificación contraseña
-REGISTRO(ALTA)
-MENU CLIENTE -> botones al menú de cliente de alquiler, menú de métodos de pago, menú de calificaciones, menú de facturas 

ALEX:
-crear, eliminar y modificar vehiculo, cada uno es una vista indep.
- MENU VEHICULO -> botones a las vistas anteriores
- vistas de crear, eliminar y modificar calificación (tienes que ser cliente)
- MENU CALIFICACIONES -> botones a los tres anteriores y lista de calificaciones hechas por el cliente (tabla con columnas: texto, vehiculo asociado (matricula), estrellas, botón para eliminar, botón para modificar)

ARIEL:
- MENU FACTURAS (no hay botones de crear y modificar facturas pq no tiene sentido) -> botón de ver lista de facturas asociadas al cliente -> tabla de columnas: factura, datoscliente, idAlquiler, botón para eliminarla, etc) no hay botón de get pero se necesita el método del dao pa generar la tabla de facturas etc
- vistas de crear, modificar, eliminar y lista de métodos de pago del cliente
- MENÚ METODOS DE PAGO -> botones de las vistas de métodos de pago anteriores



