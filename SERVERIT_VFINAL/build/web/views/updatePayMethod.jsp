<%-- 
    Document   : updatePayMethod
    Created on : 07-jun-2025, 14:41:45
    Author     : Ariel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>

<s:if test="payMethod"> 
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar método de pago</title>
    </head>
    <body>
        <h1>Modificar método de pago</h1>
        <s:form action="updatePayMethodAction" method="post">
            <s:textfield name="numerotarjeta" value="payMethod.numerotarjeta" label="Número de tarjeta "/>
            <s:textfield name="fechaexp" value="payMethod.fechaexp" label="Fecha de expiración" type="date"/>
            <s:textfield name="banco" value="payMethod.banco" label="Entidad bancaria "/>
            <s:submit value="Actualizar método de pago"/>
        </s:form>
        <br><br>
        <s:form action="payMethodsRedAction">
            <s:submit value="Volver"></s:submit>
        </s:form>
    </body>
</html>
</s:if>