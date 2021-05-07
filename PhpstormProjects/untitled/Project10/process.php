<?php
session_start();
require('validate.php');
$valObject = new validate();
if (!empty($_POST['token'])) {
    if (hash_equals($_SESSION['token'], $_POST['token'])) {
        $_SESSION["username"] = $_POST["username"];
        $username = $_SESSION["username"];
        $_SESSION[errorusername] = "";
        if ($valObject ->isProperLength($username,5,20) == false) {
            $_SESSION[errorusername] = "";
            $_SESSION[errorusername] = "Username is too long/short";
            $valObject->redirect();
        }
        elseif ($valObject->isAlphaNum($username) == false){
            $_SESSION[errorusername] = "";
            $_SESSION[errorusername] = "Username is alpha numeric only.";
            $valObject->redirect();
        }

        $_SESSION["password"] = $_POST["password"];
        $password = $_SESSION["password"];
        $_SESSION["errorpassword"] = "";
        if ($valObject->isProperLength($password,5,20) == false){
            $_SESSION["errorpassword"] = "";
            $_SESSION["errorpassword"] = "Password is too long/short.";
            $valObject->redirect();
        }
        $hash = password_hash($password, PASSWORD_DEFAULT);
    }

    else{
        $_SESSION['errors'] = "Connection not secure.";
        $valObject ->redirect();
        exit();
    }
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <title>Title</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 20px;
            background-color: #414141;
        }

        .center {
            margin: auto;
            width: 60%;
            padding: 10px;
        }

        h2 {
            color: #d7d7d7;
        }

        .card {
            background-color: #414141;
            color: #d7d7d7;
            padding: 20px;
            margin-top: 20px;
            margin-bottom: 20px;
            width: 50%;
            border-style: inset;
            border-width: medium;
            border-color: gray;
        }
    </style>
</head>
<body>

<h2 class="center"><?php echo "Account Info" ?></h2>
<div class="card center">
    <p>Username: <?php echo $username?></p>
    <p>Password Hash: <?php echo $hash?></p>
</div>

</body>
</html>
