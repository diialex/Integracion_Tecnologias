<%-- 
    Document   : menuVehiculo
    Created on : 03-jun-2025, 19:02:08
    Author     : Alex
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Vehiculo</title>
    </head>
    <body>
        <h1>Histórico de vehiculos</h1>
        
        <s:if test="vehiculos!=null">
            <table border="1" cellspacing="1" cellpadding="2" width="100%" bgcolor="#FFFFFF">
                <tr>
                    <td><b>Modelo</b></td>
                    <td><b>Marca</b></td>
                    <td><b>Tipo</b></td>
                    <td><b>NumPlaca</b></td>
                    <td><b>estadoDisponibilidad</b></td>
                </tr>
                <s:iterator value="vehiculos" id="v">
                    <tr>
                                                  
                         <td><b><s:property value="v.modelo"/></b></td>
                         <td><b><s:property value="v.marca"/></b></td>
                         <td><b><s:property value="v.tipo"/></b></td>
                        <b></b>
                        <td>
                            <s:url var="datosVehiculoUrl" action="datosVehiculo">
                                <s:param name="numPlaca" value="v.numPlaca"/>
                            </s:url>
                            <a href="<s:property value='%{datosVehiculoUrl}'/>">
                                <s:property value="v.numPlaca"/>
                            </a>
                        </td>
                        
                         <td><s:property value="v.estadoDisponibilidad}"/></td>
                    </tr>
                </s:iterator>
            </table>
        </s:if>
        <s:else>
            <h3>Ningun vehiculo registrado</h3>
        </s:else>    
            
        <s:form action="crearNuevoVehiculo" method="post">
            <s:submit value="Registrar vehiculo"/>
        </s:form>
            
           
            
    </body>
</html>