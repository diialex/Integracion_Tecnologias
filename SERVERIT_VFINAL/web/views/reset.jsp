<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Restablecer Contraseña</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                text-align: center;
                padding: 60px;
            }
            .form-container {
                background-color: #fff;
                padding: 40px;
                border-radius: 12px;
                display: inline-block;
                box-shadow: 0 4px 10px rgba(0, 0, 0, 0.15);
            }
            h2 {
                color: #333;
            }
            .form-field {
                margin: 15px 0;
            }
        </style>
    </head>
    <body>

        <div class="form-container">
            <h2>Restablecer Contraseña</h2>

            <s:form action="resetearContrasena" method="post">
                <div class="form-field">
                    <s:textfield name="nick" label="Nombre de Usuario"/>
                </div>
                <div class="form-field">
                    <s:textfield name="correo" label="Correo electrónico"/>
                </div>
                <div class="form-field">
                    <s:password name="nuevaContrasena" label="Nueva Contraseña"/>
                </div>
                <div class="form-field">
                    <s:submit value="Restablecer"></s:submit>
                </div>
            </s:form>
            <s:form action="verIndex" method="post">
            <s:submit value="Volver pagina principal"></s:submit>
        </s:form>

            <s:actionerror />
            <s:actionmessage />
        </div>

    </body>
</html>
