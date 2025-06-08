<%-- 
    Document   : updateAlquilerJefe
    Created on : 08-jun-2025, 13:30:56
    Author     : jsaco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Menú de modificación de alquiler (Jefe)</h1>
        <h2>Modifica el alquiler con id {}</h2>
        
        <s:form action="updateAlquiler" method="post">
            <s:select label="Elige el vehículo" name="numplaca" list="listaVehiculos" listKey="numplaca" listValue ="numplaca"> </s:select>
            <!-- Campo de fecha usando HTML5 -->
            <!--<label>Fecha fin del alquiler</label>
            <input type="date" name="fechaRegistro" />-->
            <s:submit value="Registrar nuevo alquiler"></s:submit>
        </s:form>
        
        
    </body>
</html>
