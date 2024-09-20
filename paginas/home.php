<header>
    <?php
    session_start();
    ?>
  <h2>A Última <span>Chave</span></h2>
  <div class="botoes">
    <?php if (!isset($_SESSION['logado']) || $_SESSION['logado'] !== true) : ?>
      <button class="btn-login" id="login">Login</button>
      <button class="btn-registro" id="registro">Registra-se</button>
    <?php endif; ?>
    <a class="contato" href="Formulario.html">Entre em contato</a>
  </div>

  <div id="drop-menu"class="dropdown">
      <button class="btn btn-drop" type="button" data-bs-toggle="dropdown" aria-expanded="false">
      <i class="fa-solid fa-bars"></i>
      </button>
      <ul class="dropdown-menu">
        <li><a class="dropdown-item" href="login">Login</a></li>
        <li><a class="dropdown-item" href="registro">Registra-se</a></li>
        <li><a class="dropdown-item" href="formulario.html">Entre em contato</a></li>
      </ul>
    </div>
</header>
<section class="section">
  <ul class='indexes'>
    <li data-index='0'>HOME</li>
    <li data-index='2'>DOC</li>
    <li><a href="game">JOGO</a></li>
    <li><a href="membros">MEMBROS</a></li> <!-- AJUSTAR O A HREF PARA LEVAR A PAGINA MEMBROS. FAZE COM JS -->
  </ul> 
  <ul class='tabs'>

    <li class='tab'>
      <article class='tab-content'>
        <h3>INTRODUÇÃO</h3>
        <p>Você acorda em uma cela fria, sem lembranças da noite anterior. 
          Um bilhete no chão é sua única pista: "A chave está escondida onde 
          o silêncio ecoa." Agora, você deve explorar o ambiente, encontrar a 
          chave e escapar antes que seja tarde demais. Cada decisão pode ser 
          sua salvação.</p>
        <button>Read More</button>
      </article>
      <!--<div class='tab-image'><img src='img/autoridade.jpg'></div> -->
    </li>

    <li class='tab'>
      <article class='tab-content'>
        <h3>DOCUMENTAÇÃO</h3>
        <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit.
          Voluptas nihil sequi doloribus obcaecati. Aut vel, recusandae ipsa
          voluptate blanditiis nemo magnam sit modi architecto officia
          maiores magni. Necessitatibus, iste aut.</p>
        <button>Read More</button>
      </article>
     <!-- <div class='tab-image'><img src='img/martelo.jpg'></div> -->
    </li>

    <li class='tab'>
      <article class='tab-content'>
        <h3>SUB TITULO</h3>
        <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit.
          Voluptas nihil sequi doloribus obcaecati. Aut vel, recusandae ipsa
          voluptate blanditiis nemo magnam sit modi architecto officia
          maiores magni. Necessitatibus, iste aut.</p>
        <button>Read More</button>
      </article>
     <!-- <div class='tab-image'><img src='img/tribunal.jpg'></div> -->
    </li>

  </ul>

  </ul>
</section>