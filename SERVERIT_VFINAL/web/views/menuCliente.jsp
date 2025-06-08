<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Menú Cliente</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f0f4f8;
            text-align: center;
            padding: 40px;
        }
        .container {
            background: white;
            padding: 40px;
            border-radius: 12px;
            display: inline-block;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        }
        h1 {
            margin-bottom: 30px;
            color: #333;
        }
        .btn-group {
            display: flex;
            flex-direction: column;
            gap: 15px;
            max-width: 300px;
            margin: 0 auto;
        }
        s\\:submit {
            width: 100%;
            padding: 12px 0;
            font-size: 16px;
            border: none;
            border-radius: 6px;
            background-color: #007bff;
            color: white;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        s\\:submit:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Menú Cliente</h1>
        <div class="btn-group">
            <s:form action="menuAlquilerCliente" method="post">
                <s:submit value="Menú de Alquiler" />
            </s:form>

            <s:form action="menuMetodosPago" namespace="/actions" method="post">
                <s:submit value="Menú de Métodos de Pago" />
            </s:form>

            <s:form action="menuCalificaciones" namespace="/actions" method="post">
                <s:submit value="Menú de Calificaciones" />
            </s:form>

            <s:form action="menuFacturas" namespace="/actions" method="post">
                <s:submit value="Menú de Facturas" />
            </s:form>
            <s:form action="bajaUsuario" namespace="/actions" method="post">
                <s:submit value="Baja Usuario"></s:submit>
            </s:form>
            
            <s:form action="verIndex" method="post">
            <s:submit value="Volver pagina principal"></s:submit>
            </s:form>
        </div>
    </div>
</body>
</html>
