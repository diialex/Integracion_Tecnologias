<%-- 
    Document   : menuAlquilerCliente
    Created on : 06-jun-2025, 19:27:01
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
                    <td><b><s:form action="seleccionAlquilerCliente" method="post">
                                <s:hidden name="id" value="%{id}" />
                                <s:submit value="Elegir alquiler"></s:submit>
                            </s:form></b></td>
                    
                </tr>
            </s:iterator>
        </table>
        
        <s:form action="verVistaLogin" method="post">
            <s:submit value="Volver pagina principal"></s:submit>
        </s:form>
    </body>
</html>
