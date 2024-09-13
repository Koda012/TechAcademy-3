<main>

  <button class="btn-voltar" id="voltar"><i class="fa-solid fa-arrow-left"></i>Voltar</button> <!-- arrumar -->

  <body>
    <div class="chat-container">
      <div class="chat-header">
        <h2>Jogo - A Última Chave</h2>
      </div>
      <div class="chat-box">
        <div class="message received">
          <p>Oi, como você está?</p>
          <span class="timestamp">10:00</span>
        </div>
        <div class="message sent">
          <p>Estou bem, obrigado! E você?</p>
          <span class="timestamp">10:01</span>
        </div>

      </div>
      <div class="chat-input">
        <input type="text" placeholder="Digite uma mensagem...">
        <button>Enviar</button>
      </div>
    </div>

</main>

<style>
  body {
    font-family: Arial, sans-serif;
    background-color: black;
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }

  .chat-container {
    width: 60%;
    margin: 50px auto;
    background: #ccc;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    display: flex;
    flex-direction: column;
    height: 800px;
  }

  .chat-header {
    background: #B8860B;
    color: #fff;
    padding: 15px;
    border-radius: 8px 8px 0 0;
    text-align: center;
  }

  .chat-box {
    flex: 1;
    padding: 15px;
    overflow-y: auto;
    background-image: url('img/chave.png');
    background-position: center center;
    background-repeat: no-repeat;
    background-size: contain;
  }

  .message {
    margin-bottom: 15px;
    padding: 10px;
    border-radius: 10px;
    position: relative;
    max-width: 70%;
  }

  .message.received {
    background: #696969;
    color: white;
    margin-left: 0;
    margin-right: auto;
  }

  .message.sent {
    background: #B8860B;
    color: #fff;
    margin-left: auto;
    margin-right: 0;
  }

  .message .timestamp {
    font-size: 0.8em;
    color: #aaa;
    position: absolute;
    bottom: 5px;
    right: 10px;
  }

  .chat-input {
    padding: 15px;
    border-top: 1px solid #ddd;
    background: #ccc;
    display: flex;
  }

  .chat-input input {
    flex: 1;
    padding: 10px;
    border: 1px solid #ddd;
    border-radius: 5px;
    margin-right: 10px;
  }

  .chat-input button {
    padding: 10px 15px;
    background: #B8860B;
    color: #fff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
  }

  .chat-input button:hover {
    background: rgb(255, 220, 0);
    transition: 0.5s;
  }

  .btn-voltar {
    display: flex;
    gap: 3px;
    width: fit-content;
    background-color: var(--primary);
    color: white;
    border: transparent;
    font-size: 15px;
    padding: 10px;
    cursor: pointer;
    text-decoration: none;
    border-radius: 5px;
  }

  .btn-voltar:hover {
    border: transparent;
    color: var(--primary);
    background-color: white;
    border-radius: 5px;
  }
</style>