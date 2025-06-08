<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
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
            <h1>Iniciar Sesión</h1>
            <s:form action="loginUsuario" method="post">
                <s:textfield name="correo" label="Correo electronico" />
                <s:hidden name="correo"/>
                <s:password name="contrasena" label="Contraseña" />
                <s:submit value="Entrar"></s:submit>
            </s:form>
            <s:form action="irmenujefe" namespace="/actions" method="post">
                <s:submit value="Ir menu Jefe (desarollo)"></s:submit>
            </s:form>
            
            <s:form action="verIndex" method="post">
                <s:submit value="Volver pagina principal"></s:submit>
                
            </s:form>
        </div>
    </body>
</html>
