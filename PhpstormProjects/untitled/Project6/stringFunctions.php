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
    $string = "District9 is an internment camp for alien prawns.";
    if (preg_match("/^district9/i", $string) &&
        preg_match("/prawns\.\$/i", $string) &&
        preg_match("/^D/", $string))
    //i don't know how to do the rest of this
        {
        echo "<p>A match was found.</p>";
    }

    $patterns = array('/alien/', '/9/');
    $replacement = array('extraterrestrial', '10');
    echo "<p>";
    echo preg_replace($patterns, $replacement, $string);
    echo "</p>";

    $string2 = '2001:0db8:85a3:0000:0000:8a2e:0370:7334';
    $string2 = explode(':', $string2);
    var_dump($string2);

    $phone = '865.694.6400';
    $phone = substr($phone, 3,-4);
    echo "<p>$phone</p>";
    ?>
</div>

</body>
</html>
