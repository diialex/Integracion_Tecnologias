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
        <!-- 
        <s:form action="registroAtleta" method="post">
            <s:textfield label="Edad" name="edad" />
            <s:select label="Género" name="genero" list="{'M', 'F', 'Otro'}" value ="genero"> </s:select>
            <s:textfield label="Peso" name="peso" />
            <s:textfield label="Altura" name="altura" />
            <s:submit value="Registrar Atleta"></s:submit>
        </s:form>-->
        
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
        
    </body>
</html>
