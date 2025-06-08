<%-- 
    Document   : crearCalificacion
    Created on : 05-jun-2025, 20:37:03
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Registrar Calificación</title>
</head>
<body>
    <h1>Registrar Calificación</h1>

    <s:form action="CrearNuevaCalificacion" method="post">
        <!-- Selector de vehículo (solo los que el cliente ha usado) -->
        <s:select 
            name="idVehiculo" 
            label="Vehículo" 
            list="#session.vehiculosFacturados" 
            listKey="idVehiculo" 
            listValue="modelo" 
            headerKey="" 
            headerValue="--Seleccionar vehículo--" />

        <s:select 
            name="estrellas" 
            label="Estrellas" 
            list="{'⭐','⭐⭐','⭐⭐⭐','⭐⭐⭐⭐','⭐⭐⭐⭐⭐'}"
            headerKey="" 
            headerValue="--Seleccionar--" />

        <s:textarea name="valoracion" label="Valoración"/>

        <s:submit value="Guardar Calificación"/>
    </s:form>

    <br>
    <a href="menuCliente.action">Cancelar</a>
</body>
</html>

