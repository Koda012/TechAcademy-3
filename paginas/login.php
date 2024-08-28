<head>
    <link rel="stylesheet" href="src/css/styles.css">
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

            <input type="submit" name = "submit" value=entrar> </input>
    </form>
    </div>
    <script src="src/javascript/botao.js"></script>
</main>
</body>