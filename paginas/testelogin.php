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

       
        if(mysqli_num_rows($result) < 1)
        {
            print_r('Não existe');
        }
        else 
        {
            print_r('Existe');
        }
}
else
{
    header('Location: login.php');
}
?>