<%@ page import="java.util.*" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="by.teachmeskills.store.entity.*" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Добавление товара</title>
    <style>
        /* Основные стили */
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        label {
            display: block;
            margin-bottom: 10px;
        }
        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            font-size: 14px;
        }
        button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 3px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <form method="post"
      action="http://localhost:8080/january30/controller">
    <div class="container">
        <h1>Добавление товара</h1>
        <form action="/submit" method="post">
            <label for="product-id">ID товара:</label>
            <input type="text" id="product-id" name="product-id" required>

            <label for="product-articul">Артикул:</label>
            <input type="text" id="product-articul" name="product-articul" required>

            <label for="product-name">Наименование товара:</label>
            <input type="text" id="product-name" name="product-name" required>

            <label for="product-category">Категория товара:</label>
            <input type="text" id="product-category" name="product-category" required>

            <label for="product-price">Стоимость:</label>
            <input type="number" id="product-price" name="product-price" min="0" required>

            <label for="product-quantity">Количество:</label>
            <input type="number" id="product-quantity" name="product-quantity" min="1" required>

            <button type="submit" class="registerbtn">Добавить</button>
        </form>
    </div>
</body>
</html>