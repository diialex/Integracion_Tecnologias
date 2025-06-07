<%-- 
    Document   : menuVehiculo
    Created on : 03-jun-2025, 19:02:08
    Author     : Alex
--%>

<%@page import="java.util.List"%>
<-- %@page import="model.Vehiculo"% !-->
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
            <table>
                <tr>
                    <th>idVehiculo?</th>
                    <th>Modelo</th>
                    <th>Marca</th>
                    <th>Tipo</th>
                    <th>NumPlaca</th>
                    <th>estadoDisponibilidad</th>
                </tr>
                <s:iterator value="vehiculos" id="v">
                    <tr>
                         <td>   <%-- EDITAR!!! --%> 
                            <s:url var="datosVehiculoUrl" action="datosVehiculo">
                                <s:param name="idVehiculo" value="%{#v.idVehiculo}"/>
                            </s:url>
                            <a href="<s:property value='%{detalleVehiculoUrl}'/>">
                                <s:property value="%{#v.idVehiculo}"/>
                            </a>
                        </td>
                                                
                         <td><s:property value="%{#v.modelo}"/></td>
                         <td><s:property value="%{#v.marca}"/></td>
                         <td><s:property value="%{#v.tipo}"/></td>
                         <td><s:property value="%{#v.numPlaca}"/></td>
                         <td><s:property value="%{#v.estadoDisponibilidad}"/></td>
                    </tr>
                </s:iterator>
            </table>
        </s:if>
        <s:else>
            <h3>Ningun vehiculo registrado</h3>
        </s:else>    
            
        <s:form action="crearVehiculoAction" method="post">
            <s:submit value="Registrar vehiculo"/>
        </s:form>
            
            
        <%-- start web service invocation --%>    
            
            
    </body>
</html>