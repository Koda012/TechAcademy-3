<head>
    <link rel="stylesheet" href="src/css/styles.css">
</head>
<main class="main-login">
    <div class="div-login">
        <h2>Login</h2>
        <form class="form-login" action="/login" method="post">
            <label for="email">Email</label>
            <input type="email" id="username" name="username" required placeholder="Digite seu email">

            <label class="label-senha" for="password">Senha</label>
            <input type="password" id="password" name="password" required placeholder="Digite sua Senha">

            <button id="entrar-login" type="submit">Entrar</button>
        </form>
    </div>
    <script src="src/javascript/botao.js"></script>
</main>