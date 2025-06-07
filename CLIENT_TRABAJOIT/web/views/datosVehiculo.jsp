<%-- 
    Document   : datosVehiculo
    Created on : 07-jun-2025, 0:33:14
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Detalle Vehículo</title>
    </head>
    <body> <%-- HACER TABLA!!!!!--%>
                
        <h1>Detalles del Vehículo</h1>
        <p>ID: <s:property value="vehiculo.idVehiculo"/></p>
        <p>Modelo: <s:property value="vehiculo.modelo"/></p>
        <p>Marca: <s:property value="vehiculo.marca"/></p>
        <p>Tipo: <s:property value="vehiculo.tipo"/></p>
        <p>Placa: <s:property value="vehiculo.numPlaca"/></p>
        <p>Disponibilidad: <s:property value="vehiculo.estadoDisponibilidad"/></p>
        <a href="menuVehiculo.action">Volver al listado</a>
    </body>
</html>
