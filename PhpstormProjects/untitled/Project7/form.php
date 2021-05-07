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

<div class="card center">
    <form action="results.php" method="post">
        <label>
            First Name:
        <input type="text" name="fName">
        </label>
        <label>
            Last Name:
        <input type="text" name="lName">
        </label>
        <label>
            Phone Number:
        <input type="text" name="phone">
        </label>
        <label>
            Favorite Color:
        <select name="color">
            <option value="none"></option>
            <option value="yellow">Yellow</option>
            <option value="blue">Blue</option>
            <option value="red">Red</option>
            <option value="green">Green</option>
            <option value="purple">Purple</option>
            <option value="orange">Orange</option>
            <option value="black">Black</option>
            <option value="white">White</option>
            <option value="grey">Grey</option>
        </select>
        </label>
        <label>Additional Information:
            <textarea name="text" rows="5" cols="50"></textarea>
        </label>
        <input type="submit" value="Submit">
    </form>
    <?php

    ?>
</div>

</body>
</html>
