<?php
    if (isset($_POST['submit']) == false){
        echo "Not loaded from proper page";
        return;
    }
    if  (empty($_POST['achternaam']) or
        empty($_POST['email'])){
            echo "Some required fields are empty";
    }

    $film = $_POST['film'];
    $filmVol = "Kong skull Island";

    echo "<br/>Voornaam: ", $_POST['voornaam'];
    echo "<br/>Achternaam: ", $_POST['achternaam'];
    echo "<br/>Adres: ", $_POST['adres'];
    echo "<br/>Postcode: ", $_POST['postcode'];
    echo "<br/>Plaats: ", $_POST['plaats'];
    echo "<br/>E-mailadres: ", $_POST['email'];
    

    echo "<p>";
    if($film == $filmVol){
        echo "Helaas de film $filmVol is vol";
    }
    else{
        echo "je hebt gereserveerd voor $film";
    } 
    echo "</p>";        
?>