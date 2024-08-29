<?php 
if (isset($_POST['email']) && isset($_POST['password'])) {
  $email = $_POST['email'];
  $password = $_POST['password'];

if ($email == 'usuario' && $password == 'senha') {
   
  $_SESSION['login'] = true;
  $_SESSION['email'] = $email;
        exit();  
    } else {
        echo "Usuário ou senha incorretos.";
    }
    header("Location: ../index.php");}
?>
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
  h2 {
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
    </style>
</head>
<body>
<main class="main-login">
    <div class="div-login">
        <h2>Login</h2>
        <form action="" method="POST">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" required placeholder="Digite seu email">

            <label class="label-senha" for="password">Senha</label>
            <input type="password" id="password" name="password" required placeholder="Digite sua Senha">

            <input type="submit" name = "submit" value='entrar'> </input>
    </form>
    </div>
    <script src="src/javascript/botao.js"></script>
</main>
</body>