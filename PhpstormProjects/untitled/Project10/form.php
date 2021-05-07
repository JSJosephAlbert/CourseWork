<?php
session_start();
if (empty($_SESSION['token'])) {
    if (function_exists('mcrypt_create_iv')) {
        $_SESSION['token'] = bin2hex(mcrypt_create_iv(32, MCRYPT_DEV_URANDOM));
    } else {
        $_SESSION['token'] = bin2hex(openssl_random_pseudo_bytes(32));
    }
}
$token = $_SESSION['token'];
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
        <input type="hidden" name="token" value="<?php echo $token; ?>" />
        <span class="error">
            <?php
            echo $_SESSION["errors"];
            ?>
        </span>
        <div class="form-group" id="username">
            <label for="username">Username:</label>
            <input type="text" class="form-control text-center" name="username" value="<?php echo $_SESSION["username"]; ?>" required>
            <span class="error">
                <?php
                echo $_SESSION["errorusername"];
                ?>
            </span>
        </div>
        <div class="form-group" id="password">
            <label for="password">Password:</label>
            <input type="password" class="form-control text-center" name="password" value="<?php echo $_SESSION["password"]; ?>" required>
            <span class="error">
                <?php
                echo $_SESSION["errorpassword"];
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
