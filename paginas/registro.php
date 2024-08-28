<?php 

    
        if (isset($_POST['submit']))
        {
            //print_r($_POST['name']);
            //print_r($_POST['email']);
            //print_r($_POST['password']);
            //print_r($_POST['phone']);
            //print_r($_POST['address']);

            include_once('config.php');

            $name = $_POST['name'];
            $email = $_POST['email'];
            $password = $_POST['password'];
            $phone = $_POST['phone'];
            $address = $_POST['address'];

            $result = mysqli_query($mysqli, "INSERT INTO usuarios(name, email, password, phone, address) 
            VALUES ('$name','$email','$password','$phone','$address')");
        }
?>
<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="scr/css/styles">
</head>
<body>
<main class="main-registro">
    <div class="div-registro">
        <form action="registro.php" method="POST">
        <h3 class="h3-rg">Registra-se</h3>
        <form action="/submit" method="post">
            <label for="name">Nome:</label><br>
            <input type="text" id="name" name="name" required><br><br>
    
            <label for="email">Email:</label><br>
            <input type="email" id="email" name="email" required><br><br>
    
            <label for="password">Senha:</label><br>
            <input type="password" id="password" name="password" required><br><br>

            <label for="phone">Telefone:</label><br>
            <input type="tel" id="phone" name="phone" required><br><br>
    
            <label for="address">Endereço:</label><br>
            <input type="text" id="address" name="address" required><br><br>
    
            <input type="submit" name='submit'>
        </form>
    </div>
    
</main>
</body>