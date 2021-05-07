<?php

if( !isset($_GET['cid']) ){
    $noCidError = 'No CID given, please go back to <a href="customers.php">customer list</a>.';
}else{
    $customerId = $_GET['cid'];

    $data = getCustomerDetails($customerId);
}

function getCustomerDetails($id)
{

    if( intval($id) == 0 ) return 'Customer ID is not valid';

    $servername = "web2603.chrisgoode.me";
    $username = "web2603_student";
    $password = "?DhHCq#9TR";

    try {
        $dbConnection = new PDO("mysql:host=$servername;dbname=web2603", $username, $password);
        // set the PDO error mode to exception
        $dbConnection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    } catch(PDOException $e) {
        die( "Connection failed: " . $e->getMessage() );
    }

    // raw query
    $sql = "SELECT * FROM customers where customerNumber = :cid";

    // prepare query and generate statement to execute.
    $stmt = $dbConnection->prepare($sql);

    // execute query
    $stmt->execute(['cid'=>$id]);

    // get fetch mode
    $stmt->setFetchMode(PDO::FETCH_ASSOC);

    // get ALL results
    return $stmt->fetch();

}
?>

<html lang="en">
<head>
    <title>Database Stuff</title>
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
            margin-top: 5%;
            margin-bottom: 5%;
            width: 70%;
            border-style: inset;
            border-width: medium;
            border-color: gray;
        }
        .error {
            color: red;
        }
    </style>
</head>

<body class="card center">

<?php if( isset($noCidError) ): ?>
    <div style="background-color: lightcoral; border: red; padding: 1em; margin: 1em; border-radius: 10px;">
        <p style="color: red"><?= $noCidError ?></p>
    </div>
<?php endif ?>

<!--<pre>--><?php //var_dump($data) ?><!--</pre>-->

<?php if( isset($data)): ?>

    <?php if( is_array($data)): ?>
        <table class="table-dark">
            <tr>
                <th scope="col">CID:</th>
                <td><?= $data['customerNumber'] ?></td>
            </tr>
            <tr>
                <th scope="col">Business Name:</th>
                <td><?= $data['customerName'] ?></td>
            </tr>
            <tr>
                <th scope="col">Last Name:</th>
                <td><?= $data['contactLastName'] ?></td>
            </tr>
            <tr>
                <th scope="col">First Name:</th>
                <td><?= $data['contactFirstName'] ?></td>
            </tr>
            <tr>
                <th scope="col">Phone:</th>
                <td><?= $data['phone'] ?></td>
            </tr>
            <tr>
                <th scope="col">Address:</th>
                <td>
                    <p><?= $data['addressLine1'] ?></p>
                    <p><?= $data['addressLine2'] ?></p>
                    <p><?= $data['city'] ?>,<?= $data['state'] ?> <?= $data['postalCode'] ?></p>
                    <p><?= $data['country'] ?></p>
                </td>
            </tr>
            <tr>
                <th scope="col">Credit Limit:</th>
                <td><?= $data['creditLimit'] ?></td>
            </tr>
        </table>
    <?php else: ?>
        <div style="background-color: lightcoral; border: red; padding: 1em; margin: 1em; border-radius: 10px;">
            <p style="color: red"><?= $data ?></p>
        </div>
    <?php endif; ?>

<?php else: ?>
    <div style="background-color: lightblue; border: blue; padding: 1em; margin: 1em; border-radius: 10px;">
        <p style="color: cornflowerblue">No customer records found by that ID</p>
    </div>
<?php endif; ?>
<form action="customers.php">
<button class="form-control" type="submit">Back to Customer List</button>
</form>
</body>
</html>