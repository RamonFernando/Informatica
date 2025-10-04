<?php
include 'db.php';

// Insertar un nuevo item
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST['name'];
    $description = $_POST['description'];
    $price = $_POST['price'];

    $sql = "INSERT INTO menu (name, description, price) VALUES ('$name', '$description', '$price')";

    if ($conn->query($sql) === TRUE) {
        echo "New item added successfully";
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }
}

$result = $conn->query("SELECT * FROM menu");
while($row = $result->fetch_assoc()) {
    echo "<div>" . $row['name'] . " - " . $row['price'] . "</div>";
}
?>