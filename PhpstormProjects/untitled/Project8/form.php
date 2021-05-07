<?php
session_start();
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
        .error {
            color: red;
        }
    </style>
</head>
<body>

<div class="card center">
    <form action="results.php" method="post">
        <label id="fName">
            First Name:
        <input type="text" name="fName" value="<?php echo $_SESSION["fName"]; ?>">
            <p class="error">
            <?php
            echo $_SESSION["errorfName"];
            ?>
            </p>
        </label>
        <label id="lName">
            Last Name:
        <input type="text" name="lName" value="<?php echo $_SESSION["lName"]; ?>">
            <p class="error">
            <?php
            echo $_SESSION["errorlName"];
            ?>
            </p>
        </label>
        <label id="phone">
            Phone Number:
        <input type="text" name="phone" value="<?php echo $_SESSION["phone"]; ?>">
            <p class="error">
            <?php
            echo $_SESSION["errorphone"];
            ?>
            </p>
        </label>
        <label id="color">
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
            <p class="error">
            <?php
            echo $_SESSION["errorcolor"];
            ?>
            </p>
        </label>
        <label id="text">Additional Information:
            <textarea name="text" rows="5" cols="50"><?php echo $_SESSION["text"]; ?></textarea>
            <p class="error">
            <?php
            echo $_SESSION["errortext"];
            ?>
            </p>
        </label>
        <input type="submit" name="Submit" value="Submit">
    </form>
    <?php

    ?>
</div>

</body>
</html>
