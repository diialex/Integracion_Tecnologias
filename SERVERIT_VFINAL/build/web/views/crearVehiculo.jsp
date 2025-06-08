<%-- 
    Document   : crearVehiculo
    Created on : 05-jun-2025, 20:36:51
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Registrar Vehículo</title>
</head>
<body>
    <h1>Registrar Nuevo Vehículo</h1>

    <s:form action="guardarVehiculo" method="post">
        <s:textfield name="vehiculo.modelo" label="Modelo" required="true"/>
        <s:textfield name="vehiculo.marca" label="Marca" required="true"/>
        <s:textfield name="vehiculo.tipo" label="Tipo" required="true"/>
        <s:textfield name="vehiculo.numPlaca" label="Número de Placa" required="true"/>
        <s:textfield name="vehiculo.estadoDisponibilidad" label="Estado de Disponibilidad" required="true"/>

        <s:submit value="Registrar"/>
    </s:form>

    <br>
    <a href="menuVehiculo.action">Cancelar y volver</a>
</body>
</html>
