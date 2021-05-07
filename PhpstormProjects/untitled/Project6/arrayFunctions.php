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
    $array = [
        'fruit'   => 'apple',
        'goal'    => 'pass',
        'weather' => 'cold',
        'bool'    => false,
        'int'     => 123
    ];
    $array2 = [
        'planet' => 'earth',
        'device' => 'pc'
    ];

    if (in_array('apple', $array)){
        echo "<p>'fruit' is in array</p>";
    }

    $result = array_merge($array, $array2);
    echo "<p>";
    print_r($result);
    echo "</p>";

    echo "<p>";
    print_r(array_keys($result, 'pc'));
    echo "</p>";

    echo "<p>";
    print_r(array_slice($result, 4, 1));
    echo"</p>";

    echo "<p>";
    print_r(implode(", ",$result));
    echo "</p>";
    ?>
</div>

</body>
</html>
