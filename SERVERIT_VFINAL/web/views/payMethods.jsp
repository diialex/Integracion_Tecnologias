<%-- 
    Document   : payMethods
    Created on : 05-jun-2025, 17:04:34
    Author     : Ariel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
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

        <s:iterator value="payMethods">
            <tr>
                <td><s:property value="numerotarjeta"/></td>
                <td><s:property value="fechaexp"/></td>
                <td><s:property value="banco"/></td>
                <td>
                    <s:form action="updatePayMethodAction" method="post">
                        <s:hidden name="id"></s:hidden>
                        <s:submit value="Modificar"></s:submit>
                    </s:form>
                </td>
                <td>
                    <s:form action="deletePayMethodAction" method="post">
                        <s:hidden name="id"></s:hidden>
                        <s:submit value="Eliminar"></s:submit>
                    </s:form>
                </td>
            </tr>
        </s:iterator>
    </table>
    <s:form action="formNewPayMethodAction">
        <s:submit value="Agregar método de pago"></s:submit>
    </s:form>
</body>
</html>
