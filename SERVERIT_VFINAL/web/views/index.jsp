<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Inicio - Mi Web</title>
    </head>
    <body>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f9f9f9;
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
            h1 {
                color: #333;
            }
            .form-btn {
                margin: 15px;
            }
        </style>
        <h1>Bienvenido a la Plataforma</h1>
        <p>Accede a tu cuenta o regístrate para comenzar.</p>

        <!-- BOTÓN LOGIN -->

        <s:form action="verVistaLogin" method="post">
            <s:submit value="Login"></s:submit>
        </s:form>



        <s:form action="verVistaRegistroUsuario" method="post">
            <s:submit value="Registrarse"></s:submit>
        </s:form>


        <s:form action="verVistaResetContra" method="post">
            <s:submit value="Cambiar Contraseña"></s:submit>
        </s:form>


    </body>
</html>
