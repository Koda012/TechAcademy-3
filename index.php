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
    <nav id="sidebar">
        <ul id="side_items">
            <li class="side-item active" title="Página principal">
                <a href="#">
                    <i class="fa-solid fa-house"></i>
                    <span class="item-description">
                        Home
                    </span>
                </a>
            </li>

            <li class="side-item" title="Membros">
                <a href="#">
                    <i class="fa-solid fa-person"></i>
                    <span class="item-description">
                        Membros
                    </span>
                </a>
            </li>

            <li class="side-item" title="Documentação do Jogo">
                <a href="#">
                    <i class="fa-solid fa-folder"></i>
                    <span class="item-description">
                        Documentação Jogo
                    </span>
                </a>
            </li>

            <li class="side-item">
                <a href="#">
                    <i class="fa-solid fa-image"></i>
                    <span class="item-description">
                        Imagens
                    </span>
                </a>
            </li>

            <li class="side-item">
                <a href="#">
                    <i class="fa-solid fa-gear"></i>
                    <span class="item-description">
                        Configurações
                    </span>
                </a>
            </li>
        </ul>

        <!-- <button id="open_btn">
            <i id="open_btn_icon" class="fa-solid fa-chevron-right"></i>
        </button> -->

        </div>

        <div id="logout">
            <button id="logout_btn">
                <i class="fa-solid fa-right-from-bracket"></i>
                <span class="item-description">
                    Logout
                </span>
            </button>
        </div>
    </nav>

    <div class="header-login">
        <div>
            <img class="logo-header" src="img/logo.png" alt="Judge Now" title="Judge Now">
            <button class="btn login-btn">Login</button>
            <button class="btn register-btn">Registrar</button>
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


    <script src="src/javascript/script.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>

</html>