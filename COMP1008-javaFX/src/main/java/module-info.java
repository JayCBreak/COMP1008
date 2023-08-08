module com.example.comp1008javafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.comp1008javafx to javafx.fxml;
    exports com.example.comp1008javafx;
}