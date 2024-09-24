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

    h2 {
      color: #B8860B;
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

    .error-message {
      font-size: 1rem;
      margin-bottom: 1rem;
      text-align: center;
    }

    p {
      color: red;
    }

    a {
      background-color: white;
      align-items: center;
      width: 100%;
      display: block;
      text-align: center;
      color: black;
    }
    .div-btn-voltar{
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
    }

    .btn-voltar a {
      text-decoration: none;
      background-color: transparent;
      color: white;
    }
    .btn-voltar:hover{
      background-color: transparent;
      color: white;
      cursor: pointer;
    }
    .input-entrar{
      width: 100%;
      background-color: transparent;
      padding: 8px;
      border-radius: 8px;
      border: 1px solid #B8860B;
      cursor: pointer;
      color: white;
    }
    .input-entrar:hover{
      background-color: #B8860B;
      color: black;
      cursor: pointer;
    }
    footer {
    display: none;
  }
  </style>

</head>

<body>
  <main class="main-login">
    <div class="div-login">
      <h2>Login</h2>
      <form action="testelogin.php" method="POST">
        <label for="email">Email</label>
        <input type="email" id="email" name="email" required placeholder="Digite seu email">

        <label class="label-senha" for="password">Senha</label>
        <input type="password" id="password" name="password" required placeholder="Digite sua Senha">
        <?php if (isset($_GET['error']) && $_GET['error'] == 1): ?>
          <p class="error-message">Email ou senha incorretos.<br> Tente novamente.</p>
        <?php endif; ?>
        <input class="input-entrar" type="submit" name="submit" value='Entrar'></input>
      </form>
      <div class="div-btn-voltar">
        <button class="btn-voltar"><a class='voltar' href="../home">Voltar</a></button>
      </div>
    </div>
    <script src="src/javascript/botao.js"></script>
  </main>
</body>