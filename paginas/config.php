<?php
    //não apagar, arquivo importante;
    $usuario = 'root';
    $senha = '';
    $database = 'login';
    $host = 'localhost';

    $mysqli = new mysqli($host,$usuario,$senha,$database);

    if($mysqli->error) {
        die("falha na conexao". $mysqli->error);
    }
?> 