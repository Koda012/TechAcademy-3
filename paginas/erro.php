<main>
  <div class="error">
    <h3>404: Página Não Encontrada</h3>

    <p class="sub-paragrafo">Narrador:</p>
    <p>Você acorda em uma página fria e vazia, sem muitas lembranças de como chegou aqui. No chão digital, há um bilhete misterioso.</p>

    <p class="sub-paragrafo">Comandos disponíveis:</p>

    <div class="btn-erro">
      <button><a href="home">Pagina Inicial</a></button>
      <button><a href="game">Ir para o Jogo</a></button>
      <button><a href="membros">Ir para Membros</a></button>
    </div>
  </div>

</main>

<style>
  .error {
    display: flex;
    justify-content: center;
    align-items: center;
    text-align: center;
    flex-direction: column;
    gap: 50px;
  }

  h3 {
    color: #B8860B;
    font-weight: 200;
    font-size: 50px;
  }

  p {
    font-size: 20px;
  }

  .sub-paragrafo {
    color: #B8860B;
  }
  .btn-erro{
    button{
      background-color: #B8860B;
      color: white;
      font-size: 20px;
      padding: 8px;
      border-radius: 6px;
      border: none;
      margin: 20px;
    }
    a{
      text-decoration: none;
      color: white;
    }
    button:hover{
      background-color: transparent;
      border: 1px solid #B8860B;
    }
  }
</style>