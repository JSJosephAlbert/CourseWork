<?php
session_start();
require('validate.php');
$valObject = new validate();

$_SESSION["fName"] = $_POST["fName"];
$fName = $_SESSION["fName"];
$fName = filter_var($fName, FILTER_SANITIZE_STRING);
$_SESSION["errorfName"] = "";
if ($valObject->isAlpha($fName) == false){
    $_SESSION["errorfName"] = "";
    $_SESSION["errorfName"] = "Name is invalid.";
    $valObject->redirect();
}
elseif ($valObject->isProperLength($fName,3,50) == false){
    $_SESSION["errorfName"] = "";
    $_SESSION["errorfName"] = "Name is too short/long.";
    $valObject->redirect();
}

$_SESSION["lName"] = $_POST["lName"];
$lName = $_SESSION["lName"];
$lName = filter_var($lName, FILTER_SANITIZE_STRING);
$_SESSION["errorlName"] = "";
if ($valObject->isAlpha($lName) == false){
    $_SESSION["errorlName"] = "";
    $_SESSION["errorlName"] = "Name is invalid.";
    $valObject->redirect();
}
elseif ($valObject->isProperLength($lName,3,100) == false){
    $_SESSION["errorlName"] = "";
    $_SESSION["errorlName"] = "Name is too short/long.";
    $valObject->redirect();
}

$_SESSION["email"] = $_POST["email"];
$email = $_SESSION["email"];
$email = filter_var($email, FILTER_SANITIZE_EMAIL);
$_SESSION["erroremail"] = "";
if ($valObject->isEmail($email) == false){
    $_SESSION["erroremail"] = "";
    $_SESSION["erroremail"] = "Email address is invalid.";
    $valObject->redirect();
}

$_SESSION["phone"] = $_POST["phone"];
$phone = $_SESSION["phone"];
$phone = filter_var($phone, FILTER_SANITIZE_STRING);
$_SESSION["errorphone"] = "";
if ($phone != "") {
    if ($valObject->isPhone($phone) == false) {
        $_SESSION["errorphone"] = "";
        $_SESSION["errorphone"] = "Invalid phone number.";
        $valObject->redirect();
    }
}

$_SESSION["username"] = $_POST["username"];
$username = $_SESSION["username"];
$_SESSION[errorusername] = "";
if (empty($username)) {
    $_SESSION[errorusername] = "";
    $_SESSION[errorusername] = "Username is required.";
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
if ($valObject->isProperLength($password,6,30) == false){
    $_SESSION["errorpassword"] = "";
    $_SESSION["errorpassword"] = "Password is too long/short.";
    $valObject->redirect();
}

$_SESSION["checkbox"] = $_POST["checkbox"];
$checkbox = $_SESSION["checkbox"];
$_SESSION["errorcheckbox"] = "";
if(empty($checkbox))
{
    $_SESSION["errorcheckbox"] = "You didn't select any boxes.";
    $valObject->redirect();
}
elseif (count($checkbox) < 2){
    $_SESSION["errorcheckbox"] = "Select at least two boxes.";
    $valObject->redirect();
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

<h2 class="center"><?php echo "$fName $lName's Account Info" ?></h2>
<div class="card center">
    <p>Username: <?php echo $username?></p>
    <p>Email: <?php echo $email?></p>
    <p>Phone Number: <?php echo $phone?></p>
    <p>Choice: <div class="card">
        <?php $N = count($checkbox);
        for($i=0; $i < $N; $i++)
        {
            echo($checkbox[$i] . " ");
        } ?>
    </div></p>
</div>

</body>
</html>
