<?php


if (isset($_POST['submit'])) {
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
      font-family: fantasy;
      padding-right: 1rem;
      padding-left: 1rem;
      justify-content: center;
      background-color: black;

      label {
        color: white;
      }
    }

    h3 {
      color: #B8860B;
      font-size: 3rem;
      margin-bottom: 2rem;
      text-align: center;
      line-height: 1.2;
    }

    input {
      display: flex;
      justify-content: center;
      align-items: center;
      margin-bottom: 2rem;
      align-items: center;
      width: 100%;
      padding: 8px;
      border-radius: 6px;
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
      background-color: white;
      align-items: center;
      width: 100%;
      display: block;
      text-align: center;
      color: black;
    }


    .div-btn-voltar {
      display: flex;
      justify-content: center;
      align-items: center;

    }

    .btn-voltar {
      background-color: #B8860B;
      padding: 8px;
      border-radius: 8px;
      border: 1px solid #B8860B;
      cursor: pointer;
      margin: 20px;
    }

    .btn-voltar a {
      text-decoration: none;
      background-color: transparent;
      color: white;
    }

    .btn-voltar:hover {
      background-color: transparent;
      color: white;
      cursor: pointer;
    }

    .input-enviar {
      background-color: transparent;
      padding: 8px;
      border-radius: 8px;
      border: 1px solid #B8860B;
      cursor: pointer;
      color: white;
    }

    .input-enviar:hover {
      background-color: #B8860B;
      color: black;
      cursor: pointer;
    }
  </style>
</head>

<body>
  <div class="formulario">
    <form action="registro.php" method="POST">
      <n="registro.php" method="POST">
        <h3 class="h3-rg">Registre-se</h3>
        <label for="name">Nome:</label><br>
        <input type="text" id="name" name="name" placeholder="Digite seu Nome" required><br>

        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" placeholder="Digite seu email" required><br>

        <label for="password">Senha:</label><br>
        <input type="password" id="password" name="password" placeholder="Digite sua Senha" required><br>

        <label for="phone">Telefone:</label><br>
        <input type="tel" id="phone" name="phone" placeholder="(__) _ ____-____" required><br>

        <label for="address">Endereço:</label><br>
        <input type="text" id="address" name="address" placeholder="Digite seu Endereço" required><br>
        <?php if (isset($_GET['error']) && $_GET['error'] == 1): ?>
          <p class="error-message">usuario já existente.<br> Tente novamente.</p>
        <?php endif; ?>
        <div class="div-enviar-input">
          <input class="input-enviar" type="submit" name='submit'>
        </div>
    </form>
    <div class="div-btn-voltar">
      <button class="btn-voltar"><a class='voltar' href="../home">Voltar</a></button>
    </div>
  </div>
  </main>
</body>