<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Baja de Usuario</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f8f9fa;
            text-align: center;
            padding: 50px;
        }
        .container {
            background: white;
            padding: 40px;
            border-radius: 10px;
            display: inline-block;
            box-shadow: 0 3px 8px rgba(0,0,0,0.1);
        }
        h1 {
            margin-bottom: 30px;
            color: #dc3545;
        }
        input, .s-submit {
            margin: 10px 0;
            padding: 10px;
            width: 250px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 6px;
        }
        .s-submit {
            background-color: #dc3545;
            color: white;
            border: none;
            cursor: pointer;
            width: 270px;
            font-weight: bold;
            transition: background-color 0.3s ease;
        }
        .s-submit:hover {
            background-color: #a71d2a;
        }
        .error {
            color: #dc3545;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Eliminar Usuario</h1>
            <s:form action="eliminarUsuario" method="post">
            <s:textfield name="nick" label="Usuario" />
            <s:password name="contrasena" label="Contraseña" />
            <s:submit value="Eliminar Cuenta"></s:submit>
        </s:form>
          <s:form action="loginUsuario" method="post">
            <s:submit value="Volver Menu"></s:submit>
        </s:form>
    </div>
</body>
</html>
