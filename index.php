<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="shortcut icon" href="src/images/logo.png" type="image/x-icon">
    <link rel="stylesheet" href="src/css/styles.css">
    <title>Judge NOW</title>
</head>

<body>

    <header>
        <div class="header">
            <button class="btn btn-login">Login</button>
            <button class="btn btn-register">Registrar</button>
        </div>
    </header>

    <div class="sidebar">
        <h2>Judge NOW</h2>
        <a href="#">Home</a>
        <a href="#">Membros</a>
        <a href="#">Documentação do jogo</a>
        <a href="#">Contato</a>
    </div>

    <div class="div-login">
        <div class="form-login">
            <h2><strong>Login</strong></h2>
            <form>
                <label for="email">Email:</label>
                <input type="email" id="email" required maxlength="50" placeholder="Digite seu Email:">
                <br>
                <label for="password">Senha:</label>
                <input type="password" id="password" name="password" required placeholder="Digite sua senha:">
                <br>
                <input class="botao-entrar" type="submit" value="Entrar">
            </form>
        </div>
    </div>

    <div class="div-registro">
        <div class="form-registro">
            <h2><strong>Registra-se</strong></h2>
            <form>
                <label for="nome">Nome:</label>
                <input type="text" name="nome" id="nome" placeholder="Nome Completo" required>
                <br>
                <label for="email">Email:</label>
                <input type="email" id="email" required maxlength="50" placeholder="Digite seu Email:">
                <br>
                <label for="password">Senha:</label>
                <input type="password" id="password" name="password" required placeholder="Digite sua senha:">
                <br>
                <label for="telefone">Telefone</label>
                <input type="tel" name="telefone" id="telefone" placeholder="(__) _ ____ - ____">
                <br>
                <label for="nome">Endereço:</label>
                <input type="text" name="nome" id="nome" placeholder="Seu endereço:" required>
                <br>
                <input class="botao-registrar" type="submit" value="Registrar">
            </form>
        </div>
    </div>
    
    <main>
        <?php
        //imprimir o conteudo do array do GET
        //print_r($_GET);

        //recuperar a variavel pagina
        $pagina = $_GET["pagina"] ?? "home";

        // paginas/home.php
        $pagina = "paginas/{$pagina}.php";

        //verificar se o arquivo existe
        if (file_exists($pagina)) {
            include $pagina;
        } else {
            include "paginas/erro.php";
        }

        ?>
    </main>


    <script>
        document.querySelector('.btn-login').addEventListener('click', function() {
            document.querySelector('.div-login').style.display = 'block'; 
        });

        document.querySelector('.btn-register').addEventListener('click', function() {
            document.querySelector('.div-registro').style.display = 'block'; 
        });
    </script>
    <script src="src/javascript/script.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>

</html>