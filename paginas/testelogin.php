<?php

//print_r($_REQUEST);
//assim como o outro não apagar

if(isset($_POST['submit']) && !empty($_POST['email'])  && !empty($_POST['password']))
{
        include_once('config.php');
        $email = $_POST['email'];
        $password = $_POST['password'];
         

        $sql = "SELECT * FROM usuarios WHERE email = '$email' and password = '$password'";

        $result = $mysqli->query($sql);

       
        if ($result->num_rows > 0) {
            header("Location: ../index.php"); // Redirecione para a página do dashboard ou sucesso
            session_start();
            $_SESSION['logado'] = true;
        } else {
            // Usuário não encontrado
            header("Location: login.php?error=1"); // Redirecione de volta ao formulário de login com uma mensagem de erro
        }
        
        $stmt->close();
        $conn->close();}
?>