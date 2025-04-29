<!DOCTYPE html>
<html>
<head>
    <title>First Element of Array</title>
</head>
<body>
<h2>First Element of the Array</h2>
<?php
    $COLOR = array(4 => 'WHITE', 6 => 'GREEN', 11 => 'RED');
    $firstElement = reset($COLOR);  // Gets the first value in the array
    echo "The first element is: " . $firstElement;
?>
</body>
</html>



//program 6
<!DOCTYPE html>
<html>
<head>
    <title>Countries and Cities Table</title>
</head>
<body>
<h2>Countries and Their Cities</h2>
<?php
// Step 1: Create an associative array (Country => City)
$locations = array(
    "USA" => "New York",
    "France" => "Paris",
    "Japan" => "Tokyo",
    "India" => "Delhi",
    "Germany" => "Berlin"
);
// Step 2: Transform into a 2D array
$twoDimensionalArray = [];
foreach ($locations as $country => $city) {
    $twoDimensionalArray[] = array("Country" => $country, "City" => $city);
}
// Step 3: Display as a table
echo "<table border='1' cellpadding='5'>";
echo "<tr><th>Country</th><th>City</th></tr>";

foreach ($twoDimensionalArray as $row) {
    echo "<tr>";
    echo "<td>" . $row["Country"] . "</td>";
    echo "<td>" . $row["City"] . "</td>";
    echo "</tr>";
}

echo "</table>";
?>
</body>
</html>

