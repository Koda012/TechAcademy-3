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

header("Location: ../paginas/login.php");
        }
?>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=chrome">
    <meta name="viewport" content="width=device-width, initial scale=1.0">
    <link rel="shortcut icon" href="img/courthouse_3122429.png" type="image/x-icon">
    <link rel="stylesheet" href="src/css/styles.css">
    <style>
   body {
    width: 100%;
    display: flex;
    align-items: center;
    flex-direction: column;
    font-family:fantasy;
    padding-right: 1rem ; padding-left: 1rem;
    justify-content: center;
    background-color: black;
    label{ color: white;}
  }
  h3 {
    color:#B8860B;
    font-size: 3rem;
    margin-bottom: 2rem;
    text-align: center;
    line-height: 1.2;
  }
  input {
    margin-bottom: 2rem;
    align-items: center;
    width: 100%;
    display: block;
  }
  textarea {
    width: 100%;
    max-width: 400px; 
    padding: 10px;
    margin-bottom: 10px;
    box-sizing: border-box; 
    display: block;
}
  p {
    color: red;
  }
.error-message {
    font-size: 1rem;
    margin-bottom: 1rem;
    text-align: center;
  }
  a {
    background-color:white;
    align-items: center;
    width: 100%;
    display: block;
    text-align: center;
    color: black;
  }

    </style>
</head>
<body>
    <div class="formulario">
      <form action="registro.php" method="POST">
        <n="registro.php" method="POST">
        <h3 class="h3-rg">Registre-se</h3>
            <label for="name">Nome:</label><br>
            <input type="text" id="name" name="name" required><br>
    
            <label for="email">Email:</label><br>
            <input type="email" id="email" name="email" required><br>
    
            <label for="password">Senha:</label><br>
            <input type="password" id="password" name="password" required><br>

            <label for="phone">Telefone:</label><br>
            <input type="tel" id="phone" name="phone" required><br>
    
            <label for="address">Endereço:</label><br>
            <input type="text" id="address" name="address" required><br>
            <?php if (isset($_GET['error']) && $_GET['error'] == 1): ?>
            <p class="error-message">usuario já existente.<br> Tente novamente.</p>
        <?php endif; ?>
            <input type="submit" name='submit'>
            <a class='voltar' href="../home" ></i>Voltar</a>
        </form>
    </div>    
</main>
</body>