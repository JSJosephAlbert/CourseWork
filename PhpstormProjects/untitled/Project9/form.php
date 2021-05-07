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
    <form action="process.php" method="post">
        <div class="form-group" id="fName">
            <label for="fName">First Name:</label>
            <input type="text" class="form-control text-center" name="fName" value="<?php echo $_SESSION["fName"]; ?>">
            <span class="error">
                <?php
                echo $_SESSION["errorfName"];
                ?>
            </span>
        </div>
        <div class="form-group" id="lName">
            <label for="lName">Last Name:</label>
            <input type="text" class="form-control text-center" name="lName" value="<?php echo $_SESSION["lName"]; ?>">
            <span class="error">
                <?php
                echo $_SESSION["errorlName"];
                ?>
            </span>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
        <input type="text" class="form-control text-center" id="email" name="email" value="<?php echo $_SESSION["email"]; ?>">
        <span class="error">
            <?php
            echo $_SESSION["erroremail"];
            ?>
        </span>
        </div>
        <div class="form-group" id="phone">
            <label for="phone">Phone:</label>
        <input type="text" class="form-control text-center" name="phone" value="<?php echo $_SESSION["phone"]; ?>">
            <span class="error">
            <?php
            echo $_SESSION["errorphone"];
            ?>
            </span>
        </div>
        <div class="form-group" id="username">
            <label for="username">Username:</label>
            <input type="text" class="form-control text-center" name="username" value="<?php echo $_SESSION["username"]; ?>">
            <span class="error">
                <?php
                echo $_SESSION["errorusername"];
                ?>
            </span>
        </div>
        <div class="form-group" id="password">
            <label for="password">Password:</label>
            <input type="text" class="form-control text-center" name="password" value="<?php echo $_SESSION["password"]; ?>">
            <span class="error">
                <?php
                echo $_SESSION["errorpassword"];
                ?>
            </span>
        </div>
        <div class="form-group center">
            Label:
            <div class="card">
                <div class="form-check">
                <input type="checkbox" class="form-check-input" name="checkbox[]" value="1">
                <label class="form-check-label" for="1"> 1</label>
                </div>
                <div class="form-check">
                <input type="checkbox" class="form-check-input" id="2" name="checkbox[]" value="2">
                <label class="form-check-label" for="2"> 2</label>
                </div>
                <div class="form-check">
                <input type="checkbox" class="form-check-input" id="3" name="checkbox[]" value="3">
                <label class="form-check-label" for="3"> 3</label>
                </div>
                <div class="form-check">
                <input type="checkbox" class="form-check-input" id="4" name="checkbox[]" value="4">
                <label class="form-check-label" for="4"> 4</label>
                </div>
            </div>
            <span class="error">
                <?php
                echo $_SESSION["errorcheckbox"];
                ?>
            </span>
        </div>
        <input type="submit" class="form-control" name="Submit" value="Submit">
    </form>
    <?php

    ?>
</div>

</body>
</html>
