<?php 

    if(isset($_POST['submit']))
    {
        include_once('config.php');

        $name = $_POST['name'];
        $email = $_POST['email'];
        $Password = $_POST['Password'];
        $phone = $_POST['phone'];
        $address = $_POST['address'];

        $result = mysqli_query($conexao, "INSERT INTO usuario(Nome, email, senha, telefone, endereço) 
        VALUES ('$name', '$email', '$Password', '$phone', '$address1)");
        
    }
?>
<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="src/css/styles.css">
</head>
<main class="main-registro">
    <div class="div-registro">
        <form action="paginas/registro.php" method="POST">
        <h3 class="h3-rg">Registra-se</h3>
        <form action="/submit" method="post">
            <label for="name">Nome:</label><br>
            <input type="text" id="name" name="name" required><br><br>
    
            <label for="email">Email:</label><br>
            <input type="email" id="email" name="email" required><br><br>
    
            <label for="password">Senha:</label><br>
            <input type="password" id="password" name="password" required><br><br>
    
            <label for="confirm_password">Confirmar Senha:</label><br>
            <input type="password" id="confirm_password" name="confirm_password" required><br><br>
    
            <label for="phone">Telefone:</label><br>
            <input type="tel" id="phone" name="phone" required><br><br>
    
            <label for="address">Endereço:</label><br>
            <input type="text" id="address" name="address" required><br><br>
    
            <input type="submit" name='submit' >
        </form>
    </div>
    <script src="src/javascript/botao.js"></script>
</main>