<!DOCTYPE html>
<html lang='pt-br'>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=chrome">
    <meta name="viewport" content="width=device-width, initial scale=1.0">
    <link rel="shortcut icon" href="img/courthouse_3122429.png" type="image/x-icon">
    <link rel="stylesheet" href="src/css/styles.css">
    <title>Formulario Jogo</title>
    <style>
    main {
    width: 100%;
    display: flex;
    align-items: center;
    flex-direction: column;
    font-family:fantasy;
    padding-right: 1rem ; padding-left: 1rem;
    justify-content: center;
    background-color: black;
    label{ color: white;}
  }
  h3 {
    color:#B8860B;
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

  a {
    background-color:white;
    align-items: center;
    width: 100%;
    display: block;
    text-align: center;
    color: black;
  }
  .input-enviar{
      background-color: transparent;
      padding: 8px;
      border-radius: 8px;
      border: 1px solid #B8860B;
      cursor: pointer;
      color: white;
    }
    .input-enviar:hover{
      background-color: #B8860B;
      color: black;
      cursor: pointer;
    }
</style>
</head>
<div class="formulario">
    <main>
        <h1>CONTE MAIS</h1>
            <form action="https://formsubmit.co/016d8d441cb6320df0c2627c712e145e" method="POST">
                Seu Nome:<br/>
                <input name = "nome" type="text" placeholder="Digite seu Nome" required/>
                Seu email:<br/>
                <input name = "email" type="email" placeholder="Digite seu Email" required/>
                Sua mensagem:<br/>
                <textarea name="mensagem" rows="4" cols="100%" placeholder="Digite sua mensagem"></textarea>
                <input type="hidden" name="_captcha" value="true">
                <input class="input-enviar" type="submit" value="enviar">
                
            </form>
    </main>
</div> 
</html>