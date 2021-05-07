<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <title>Favorite Songs</title>
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

<h2 class="center">Favorite Songs</h2>
<div class="card center">
    <?php
    echo "<form>";
    function arraySelect($array){
        $i = 0;
        echo "<select name='music'>";
        foreach ($array as $item){
            echo "<option value='$item'>$item</option>";
            $i++;
        }
        echo "</select>";
    }
    $songs = array(
        "Summertime Gladness - Dance Gavin Dance",
        "The Offering - Sleep Token",
        "3005 - Childish Gambino",
        "Reptile - Periphery",
        "Divinity - Porter Robinson",
        "Skyline - ERRA",
        "My Favorite Things - John Coltrane",
        "Lily & The Moon - Thornhill",
        "Eiley - Too Close To Touch",
        "The Chain - Fleetwood Mac"
    );
    arraySelect($songs);
    echo "</form>";
    ?>
</div>

</body>
</html>
