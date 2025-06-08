<%-- 
    Document   : menuAlquilerJefe
    Created on : 06-jun-2025, 19:26:48
    Author     : jsaco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Menú de Alquiler (Jefe)</h1>
        <h2>Crear nuevo Alquiler</h2>
        <s:form action="createAlquiler" method="post">
            <s:select label="Elige el vehículo" name="numplaca" list="listaVehiculos" listKey="numplaca" listValue ="numplaca"> </s:select>
            <!-- Campo de fecha usando HTML5 -->
            <!--<label>Fecha fin del alquiler</label>
            <input type="date" name="fechaRegistro" />-->
            <s:submit value="Registrar nuevo alquiler"></s:submit>
        </s:form>
        
        <h2>Lista de Alquileres</h2>
        <table border="1" cellspacing="1" cellpadding="2" width="100%" bgcolor="#FFFFFF">
            <tr>
                <td><b>ID</b></td>
                <td><b>Cliente</b></td>
                <td><b>Vehículo</b></td>
                <td><b>Fecha fin alquiler</b></td>
                <td><b>Estado del alquiler</b></td>
            </tr>
            
            <s:iterator value="listaAlquileres">
                <tr>
                    <td><b><s:property value="id" /></b></td>
                    <td><b><s:property value="cliente.id" /></b></td>
                    <td><b><s:property value="vehiculo.numplaca" /></b></td>
                    <td><b><s:property value="fechafin" /></b></td>
                    <td><b><s:property value="estadoalquiler" /></b></td>
                    <td><b><s:form action="updateAlquiler" method="post">
                                <s:hidden name="id" value="%{id}" />
                                <s:submit value="Modificar alquiler"></s:submit>
                            </s:form></b></td>
                    <td><b><s:form action="deleteAlquiler" method="post">
                                <s:hidden name="id" value="%{id}" />
                                <s:submit value="Eliminar alquiler"></s:submit>
                            </s:form></b></td>
                    
                </tr>
            </s:iterator>
        </table>
            
        <!--
        <h2>Lista de Vehiculos</h2>
        <table border="1" cellspacing="1" cellpadding="2" width="100%" bgcolor="#FFFFFF">
            <tr>
                <td><b>Modelo</b></td>
                <td><b>Marca</b></td>
                <td><b>Tipo</b></td>
                <td><b>Número de placa</b></td>
                <td><b>Estado de disponibilidad</b></td>
            </tr>
            
            <s:iterator value="listaVehiculos">
                <tr>
                    <td><b><s:property value="modelo" /></b></td>
                    <td><b><s:property value="marca" /></b></td>
                    <td><b><s:property value="tipo" /></b></td>
                    <td><b><s:property value="numplaca" /></b></td>
                    <td><b><s:property value="estadodisponibilidad" /></b></td>
                </tr>
            </s:iterator>
        </table>
        -->
        
    </body>
</html>
