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
        <h1>Registro de calificacion</h1>
        <s:form action="registrarAtletaAction">
            
            <s:textfield name="valoracion" label="Valoracion " cssStyle="{color: red}"/>
            
            <s:select list="{'1', '2', '3', '4', '5'}" name="estrellas" label="estrellas"/>
            
            <s:textfield name="peso" label="Peso "/>
            
            <s:textfield name="altura" label="Altura "/>
            
            <s:submit name="accion" value="Registrar calificacion"/>
        </s:form>
    </body>
</html>