<%-- 
    Document   : menuCalificaciones
    Created on : 03-jun-2025, 19:06:22
    Author     : Alex
--%>


<%@page import="java.util.List"%>
<-- %@page import="model.Calificacion"% !-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu </title>
    </head>
    <body>
       <h2>Lista de calificaciones del cliente</h2> <%-- usar nick cliente--%>
        <table border="1" cellspacing="1" cellpadding="2" width="100%" bgcolor="#FFFFFF">
            <tr>
                <td><b>Vehiculo</b></td>
                <td><b>Estrellas</b></td>
                <td><b>Valoracion</b></td>
            </tr>
            
            <s:iterator value="listaCalificacion">
                <tr>
                    <td><b><s:property value="vehiculo.modelo" /></b></td>
                    <td><b><s:property value="vehiculo.marca" /></b></td>
                    <td><b><s:property value="vehiculo.tipo" /></b></td>
                    <td><b><s:property value="vehiculo.numPlaca" /></b></td>
                    <td><b><s:property value="estrellas" /></b></td>
                    <td><b><s:property value="valoracion" /></b></td>
                    <td><b><s:form action="deleteCalificacion" method="post">
                                <s:hidden name="id" value="%{id}" />
                                <s:submit value="Eliminar calificacion"></s:submit>
                            </s:form></b>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>