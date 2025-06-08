<%-- 
    Document   : updateAlquilerJefe
    Created on : 08-jun-2025, 13:30:56
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
        <h1>Menú de modificación de alquiler (Jefe)</h1>
        <h2>Modifica el alquiler con id <s:property value="id"/></h2>
        
        <s:form action="updateAlquiler" method="post">
            <s:hidden name="idAlquiler" value="%{id}" />
            <s:select label="Elige el vehículo que modificar" name="numplaca" list="listaVehiculos" listKey="numplaca" listValue ="numplaca"> </s:select>
            <s:select label="Elige el cliente al que asignar" 
                      name="idCliente" 
                      list="listaClientes" 
                      listKey="id" 
                      listValue ="usuario.nick"
                      headerKey=""
                      headerValue="--Sin asignar--"> </s:select>
            <!--Campo de fecha usando HTML5 -->
            <label>&nbsp;Fecha fin del alquiler: </label>
            <input type="date" name="fechaRegistro" />
            <s:submit value="Modificar alquiler"></s:submit>
        </s:form>
        
        <s:form action="listarAlquileres" method="post">
            <s:submit value="Volver al menú principal"></s:submit>
        </s:form>    
            
        
    </body>
</html>
