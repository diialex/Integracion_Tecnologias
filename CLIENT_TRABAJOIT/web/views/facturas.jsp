<%-- 
    Document   : facturas
    Created on : 03-jun-2025, 17:47:12
    Author     : Ariel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>

<s:if test="facturas!=null">
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Facturas</title>
    </head>
    <body>
        <h1>Facturas de <s:property value="usuario"/></h1>
        <table>
            <th>
                <td><b>Id</b></td>
                <td><b>Importe</b></td>
                <td><b>Cliente</b></td>
                <td><b>Id Alquiler</b></td>
            </th>
            
            
            <tr>
                <td></td>
            </tr>
        </table>
    </body>
</html>

</s:if>
<s:else>
    <s:action name="facturasAction"/>
</s:else>