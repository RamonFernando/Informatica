<?php
include 'db.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $user_id = $_POST['user_id'];
    $menu_item_id = $_POST['menu_item_id'];
    $quantity = $_POST['quantity'];
    $status = "Pending";

    $sql = "INSERT INTO orders (user_id, menu_item_id, quantity, status) VALUES ('$user_id', '$menu_item_id', '$quantity', '$status')";

    if ($conn->query($sql) === TRUE) {
        echo "Order placed successfully";
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }
}

$result = $conn->query("SELECT * FROM orders WHERE user_id='$user_id'");
while($row = $result->fetch_assoc()) {
    echo "<div>Order: " . $row['menu_item_id'] . " - Quantity: " . $row['quantity'] . "</div>";
}
?>