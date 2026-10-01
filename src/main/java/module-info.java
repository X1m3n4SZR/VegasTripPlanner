module finalproject.vegastripplanner {
    requires javafx.controls;
    requires javafx.fxml;


    opens finalproject.vegastripplanner to javafx.fxml;
    exports finalproject.vegastripplanner;
}