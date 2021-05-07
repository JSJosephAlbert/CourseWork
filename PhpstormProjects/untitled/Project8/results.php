<?php
session_start();
function function_redirect() {
    echo "<script>
            window.location.href='form.php';
          </script>";
}
$_SESSION["fName"] = $_POST["fName"];
$fName = $_SESSION["fName"];
filter_var($fName, FILTER_SANITIZE_STRING);
if (strlen($fName) < 3){
    $_SESSION["errorfName"] = "First name is too short.";
    function_redirect();
}
elseif (strlen($fName) > 15){
    $_SESSION["errorfName"] = "First name is too long.";
    function_redirect();
}

$_SESSION["lName"] = $_POST["lName"];
$lName = $_SESSION["lName"];
filter_var($lName, FILTER_SANITIZE_STRING);
if (strlen($lName) < 3){
    $_SESSION["errorlName"] = "Last name is too short. ";
    function_redirect();
}
elseif (strlen($lName) > 50){
    $_SESSION["errorlName"] = "Last name is too long. ";
    function_redirect();
}
elseif (preg_match('/^[a-zA-Z -]*$/',$lName) == 0){
    $_SESSION["errorlName"] .= "Please enter a valid last name.";
    function_redirect();
}

$_SESSION["phone"] = $_POST["phone"];
$phone = $_SESSION["phone"];
filter_var($phone, FILTER_SANITIZE_STRING);
//copied from: https://ihateregex.io/expr/phone/
if (preg_match('/^[\+]?[(]?[0-9]{3}[)]?[-\.]?[0-9]{3}[-\.]?[0-9]{4,6}$/', $phone) == 0){
    $_SESSION["errorphone"] = "Please enter a valid phone number.";
    function_redirect();
}

$_SESSION["color"] = $_POST["color"];
$color = $_SESSION["color"];
if ($color == "none"){
    $_SESSION["errorcolor"] = "You forgot to select a favorite color.";
    function_redirect();
}
$_SESSION["text"] = $_POST["text"];
$text = $_SESSION["text"];
filter_var($text, FILTER_SANITIZE_STRING);
if (strlen($text) > 255){
    $_SESSION["errortext"] = "Text area input too is long.";
    function_redirect();
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

<h2 class="center">Results</h2>
<div class="card center">
    <p>First Name: <?php echo $fName?></p>
    <p>Last Name: <?php echo $lName?></p>
    <p>Phone Number: <?php echo $phone?></p>
    <p>Favorite Color: <?php echo $color?></p>
    <p>Additional Information: <?php echo $text?></p>
</div>

</body>
</html>
