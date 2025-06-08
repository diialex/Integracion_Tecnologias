<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Registro</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #eef2f3;
                text-align: center;
                padding: 50px;
            }
            .container {
                background-color: white;
                padding: 40px;
                border-radius: 12px;
                display: inline-block;
                box-shadow: 0 4px 10px rgba(0,0,0,0.1);
            }
            input {
                margin: 10px;
                padding: 8px;
                width: 200px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Registro de Usuario</h1>
            <s:form action="registrarUsuario" method="post">
                <s:textfield name="nick" label="Nombre de usuario" />
                <s:password name="contrasena" label="Contraseña" />
                <s:textfield name="correo" label="Email" />
                <s:textfield name="telefono" label="Telefono" />
                <s:textfield name="nombre" label="Nombre" />
                <s:textfield name="apellido1" label="Apellido1" />
                <s:textfield name="apellido2" label="Apellido2" />
                <s:submit value="Registrarse"></s:submit>
            </s:form>
            <s:form action="verIndex" method="post">
                <s:submit value="Volver pagina principal"></s:submit>
            </s:form>
        </div>
    </body>
</html>
