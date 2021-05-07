<?php
session_start();

$servername = "web2603.chrisgoode.me";
$username = "web2603_student";
$password = "?DhHCq#9TR";

try {
    $dbConnection = new PDO("mysql:host=$servername;dbname=web2603", $username, $password);
    // set the PDO error mode to exception
    $dbConnection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch(PDOException $e) {
    echo "Connection failed: " . $e->getMessage();
}


// set default sort
$sortColumnName = 'orderNumber';

// check if a desired sort was clicked
if( isset($_GET['sort']) ){
    $desiredSort = $_GET['sort'];

    switch ($desiredSort){
        case ($desiredSort == 'oid'):
            $sortColumnName = 'orderNumber';
            break;
        case ($desiredSort == 'date'):
            $sortColumnName = 'orderDate';
            break;
        case ($desiredSort == 'sdate'):
            $sortColumnName = 'shippedDate';
            break;
        case ($desiredSort == 'status'):
            $sortColumnName = 'status';
            break;
        case ($desiredSort == 'cid'):
            $sortColumnName = 'customerNumber';
            break;
    }
}

// raw query
$sql = "SELECT orderNumber, DATE_FORMAT(orderDate, '%m/%d/%Y') as orderDate, shippedDate, status, orders.customerNumber,
       customerName FROM orders join customers c on c.customerNumber = orders.customerNumber ORDER BY $sortColumnName";

// prepare query and generate statement to execute.
$stmt = $dbConnection->prepare($sql);

// execute query
$stmt->execute();

// set fetch mode
$stmt->setFetchMode(PDO::FETCH_ASSOC);

// get ALL results
$orders = $stmt->fetchAll();

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
            padding: 5%;
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

<body>
<div class="table-responsive">
<table class="badge-dark center table table-bordered">
    <thead class="thead-dark">
    <tr>
        <th scope="col">O# <a href="customers.php?sort=oid">sort</a></th>
        <th scope="col">Order Date <a href="customers.php?sort=date">sort</a></th>
        <th scope="col">Ship Date <a href="customers.php?sort=sdate">sort</a></th>
        <th scope="col">Status <a href="customers.php?sort=status">sort</a></th>
        <th scope="col">C# <a href="customers.php?sort=cid">sort</a></th>
    </tr>
    </thead>
    <tbody>
    <?php foreach ($orders as $order):?>
        <tr <?php
        if($order['status'] == 'Cancelled'){echo 'class="error"';}
        if(is_null($order['shippedDate'])){$order['shippedDate'] = "Not Shipped";}
        ?>>
            <th scope="row"><a href="detail.php?cid=<?= $order['customerNumber'] ?>"><?= $order['orderNumber'] ?></a></th>
            <td><?= $order['orderDate'] ?></td>
            <td><?= $order['shippedDate'] ?></td>
            <td><?= $order['status'] ?></td>
            <td><?= $order['customerName'] ?></td>
        </tr>
    <?php endforeach; ?>
    </tbody>
</table>

</div>
</body>
</html>