<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"
    integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA=="
    crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="shortcut icon" href="img/courthouse_3122429.png" type="image/x-icon">
  <link rel="stylesheet" href="src/css/styles.css">
  <title>Judge NOW</title>
</head>

<body>

  <main>
  <?php
    // Imprimir o conteúdo do array do GET
    // print_r($_GET);

    // Recuperar a variável página
    $pagina = $_GET["pagina"] ?? "home";

    // Constrói o caminho do arquivo da página
    $pagina = "paginas/{$pagina}.php";

    // Verificar se o arquivo existe
    if (file_exists($pagina)) {
        include $pagina;
    } else {
        include "paginas/erro.php";
    }
?>

  </main>

  <script src="javascript/script.js"></script>
  <script src="src/javascript/script.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"></script>
  <script src="src/javascript/vanilla-tilt.js"></script>
  <script>VanillaTilt.init(document.querySelectorAll(".card"), {
      max: 35,
      speed: 400,
      glare: true,
      "max-glare": 1,
    })
  </script>
</body>
<footer>
  <p> &copy; 2024 <img src="img/LOGO1.png" alt="Judge me NOW!" style="width: 70px; height: auto;"> Todos os direitos
    reservados </p>
</footer>

</html>