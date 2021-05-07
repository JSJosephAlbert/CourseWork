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

<h2 class="center">Task 1</h2>
<div class="card center">
<?php
//Task 1
function helloWorld() {
  echo "<p>Hello world! </p>";
}
helloWorld();
?>
</div>
<h2 class="center">Task 2</h2>
<div class="card center">
<?php
//Task 2
$string = "<p>An Array is an object that can store multiple values of the same datatype (as far as I know) that can be
selected with their index counting up from 0. </p>";
print $string;
?>
</div>
<h2 class="center">Task 3</h2>
<div class="card center">
<form action="Project2.php" method="post">
    Enter Diameter:
    <input type="text" name="diameter">
    <input type="submit" value="Calculate Radius">
</form>
<?php
//Task 3
$diameter = $_POST{"diameter"};
function radius($diameter){
$radius = $diameter / 2;
echo "<p>Radius is: $radius</p>";
}
radius($diameter);
?>
</div>

</body>
</html>