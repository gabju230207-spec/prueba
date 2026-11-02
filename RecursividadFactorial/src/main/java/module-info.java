module com.eduvinsystems.recursividadfactorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.eduvinsystems.recursividadfactorial to javafx.fxml;
    exports com.eduvinsystems.recursividadfactorial;
    opens com.eduvinsystems.recursividadfactorial.controller to javafx.fxml;
    exports com.eduvinsystems.recursividadfactorial.controller;
}