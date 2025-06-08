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
        <table border="1" cellpadding="5" cellspacing="0">
            <tr>
                <th>ID</th>
                <td><s:property value="vehiculo.id"/></td>
            </tr>
            <tr>
                <th>Modelo</th>
                <td><s:property value="vehiculo.modelo"/></td>
            </tr>
            <tr>
                <th>Marca</th>
                <td><s:property value="vehiculo.marca"/></td>
            </tr>
            <tr>
                <th>Tipo</th>
                <td><s:property value="vehiculo.tipo"/></td>
            </tr>
            <tr>
                <th>Placa</th>
                <td><s:property value="vehiculo.numPlaca"/></td>
            </tr>
            <tr>
                <th>Disponibilidad</th>
                <td><s:property value="vehiculo.estadoDisponibilidad"/></td>
            </tr>
        </table>

    <br>
        
        <!-- Botón para ir a editar el vehículo MODIFICAR ID-->
        <s:url var="editarVehiculoUrl" action="editarVehiculo">
            <s:param name="id" value="%{vehiculo.id}"/>
        </s:url>
        <form action="<s:property value='%{editarVehiculoUrl}'/>" method="post">
            <input type="submit" value="Modificar Vehículo"/>
        </form>

            
        <!-- Botón para eliminar el vehículo POR MODIFICAR CON ID -->
        <s:form action="eliminarVehiculo" method="post" onsubmit="return confirm('¿Estás seguro de que deseas eliminar este vehículo?');">
            <s:hidden name="idVehiculo" value="%{vehiculo.idVehiculo}"/>
            <s:submit value="Eliminar Vehículo"/>
        </s:form>

            
            
        <br>
        <a href="menuVehiculo.action">Volver al listado</a>
        
   
    </body>
</html>
