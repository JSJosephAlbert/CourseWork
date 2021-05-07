<?php
function function_alert($message) {
    echo "<script>
            alert('$message');
            window.location.href='form.php';
          </script>";
}
$fName = $_POST["fName"];
if (strlen($fName) < 3){
function_alert("First name is too short.");
}
elseif (strlen($fName) > 15){
    function_alert("First name is too long");
}
$lName = $_POST["lName"];
if (strlen($lName) < 3){
    function_alert("Last name is too short.");
}
elseif (strlen($lName) > 50){
    function_alert("Last name is too long");
}
elseif (preg_match('/^[a-zA-Z -]*$/',$lName) == 0){
    function_alert("Please enter a valid last name.");
}
$phone = $_POST["phone"];
//copied from: https://ihateregex.io/expr/phone/
if (preg_match('/^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$/', $phone) == 0){
    function_alert("Please enter a valid phone number.");
}
$color = $_POST["color"];
if ($color == "none"){
    function_alert("You forgot to select a favorite color.");
}
$text = $_POST["text"];
if (strlen($text) > 255){
    function_alert("Text area input too is long.");
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
