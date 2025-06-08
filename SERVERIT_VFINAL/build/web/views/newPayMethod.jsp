<%-- 
    Document   : newPayMethod
    Created on : 05-jun-2025, 16:52:42
    Author     : Ariel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Metodo de Pago</title>
    </head>
    <body>
        <h1>Agregar un método de pago</h1>
        <s:form action="newPayMethodAction" method="post">
            <s:textfield name="numerotarjeta" label="Número de tarjeta "/>
            <label>Fecha de expiración</label>
            <input type="date" name="fechaexp"/>
            <s:textfield name="banco" label="Entidad bancaria "/>
            <s:submit value="Registrar método de pago"/>
        </s:form>
        <br><br>
        <s:form action="payMethodsAction">
            <s:submit value="Volver"></s:submit>
        </s:form>
    </body>
</html>
