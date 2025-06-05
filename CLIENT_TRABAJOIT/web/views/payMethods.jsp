<%-- 
    Document   : payMethods
    Created on : 05-jun-2025, 17:04:34
    Author     : Ariel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>

<s:if test="payMethods!=null">
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Métodos de pago</title>
    </head>
    <body>
        <h1>Todos los métodos de pago de <s:property value="usuario.nombre"/></h1>
        
        <table>
                <th>
                <td><b>Número de la tarjeta</b></td>
                <td><b>Fecha de expedición</b></td>
                <td><b>Entidad bancaria</b></td>
            </th>

            <s:iterator value="payMethods" id="p">
                <tr>
                    <td><s:property value="%{#p.numerotarjeta}"/></td>
                    <td><s:property value="%{#p.fechaexp}"/></td>
                    <td><s:property value="%{#p.banco}"/></td>
                </tr>
            </s:iterator>

        </table>
    </body>
</html>

</s:if>
<s:else>
    <s:action name="payMethodsAction"/>
</s:else>