<%-- 
    Document   : modificarVehiculo
    Created on : 06-jun-2025, 20:21:15
    Author     : Alex
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Editar Vehículo</title>
    </head>
    <body>
        <h1>Editar Vehículo</h1>

        <s:form action="actualizarVehiculo">
            <s:hidden name="vehiculo.id"/>

            <s:textfield name="vehiculo.modelo" label="Modelo"/>
            <s:textfield name="vehiculo.marca" label="Marca"/>
            <s:textfield name="vehiculo.tipo" label="Tipo"/>
            <s:textfield name="vehiculo.numPlaca" label="Número de Placa"/>
            <s:textfield name="vehiculo.estadoDisponibilidad" label="Estado de Disponibilidad"/>

            <s:submit value="Guardar Cambios"/>
        </s:form>

        <a href="detalleVehiculo.action?id=<s:property value='vehiculo.id'/>">Cancelar</a>
    </body>
</html>
