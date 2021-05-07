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

<h2 class="center">FizzBuzz-ish</h2>
<div class="card center">
    <?php
    $odd = 0;
    //didn't really know what to call this. its the 25th iteration skip thing.
    $x = 0;
    for ($i = 0 ; $i <= 200; $i++){
        //skips every 25th loop
        if($x == 25){
            $x = 1;
            continue;
        }
        //if number is odd
        if($i % 2 != 0){
            $odd += $i;
        }
        //if number is multiple of 5
        if($i % 5 == 0){
            echo " Fizz";
            //if number is multiple of 3
            if($i % 3 == 0){
                echo "Buzz ";
            }
        }
        /* I didn't see it specified anywhere to echo the normal numbers but this is here just incase
        else {
             echo " $i ";
        }
        */
        $x++;
    }
    echo "<p>Odd total: $odd</p>";
    ?>
</div>


</body>
</html>
