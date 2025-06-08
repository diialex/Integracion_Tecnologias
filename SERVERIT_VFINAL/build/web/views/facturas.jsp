<%-- 
    Document   : facturas
    Created on : 03-jun-2025, 17:47:12
    Author     : Ariel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Facturas</title>
    </head>
    <body>
        <h1>Facturas de tuvieja</h1>

        <table>
            <th>
            <td><b>Id</b></td>
            <td><b>Importe</b></td>
            <td><b>Cliente</b></td>
            <td><b>Id Alquiler</b></td>
        </th>
            <s:iterator value="facturas">
                <tr>
                    <td><s:property value="id"/></td>
                    <td><s:property value="importe"/></td>
                    <td><s:property value="cliente.usuario.nombre"/></td>
                    <td><s:property value="alquiler.id"/></td>
                    <td>
                        <s:form action="deleteFacturaAction" method="post">
                            <s:hidden name="id"></s:hidden>
                            <s:submit value="Eliminar"></s:submit>
                        </s:form>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>