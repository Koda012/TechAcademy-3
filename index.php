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
  <style>
    @media screen and (max-width: 700px) {
  html {
    width: 500px;
    place-items: center;
  }
  body{
    width: 500px;
    place-items: left;
  }
  header{
    width: 500px;
    margin-right: 0px;
    justify-content: none;
  }
  h2 {
    margin: 0px;
  }
  footer {
    width: 350px;
      
    text-align: right;
  }
  .botoes {
    width: 10px;
    font-size: 3px;
    align-items: left;
  }
  main{
    width: 500px; 
    align-self: left;
  }
  section {
    align-self: left;
  }
  ul.indexes {
    align-self: left;
    align-items: left;
  }
  img.img-footer {
    width: 50px;
  }
  div.tab-image {
    display: 
  }
  li.tab {
    align-self: right;
    height: 400px;
  }
  }
  </style>
</head>

<body>

  <main>
  <?php
    $pagina = $_GET["pagina"] ?? "home";

    $pagina = "paginas/{$pagina}.php";

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

<footer class="footer">
  <p> &copy; 2024 <img class="img-footer" src="img/LOGO1.png" alt="Judge me NOW!"> Todos os direitos reservados </p>
</footer> 

</html>