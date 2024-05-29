module CarlosHugo_ExamenOrdinaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    opens com.CarlosHugo_ExamenOrdinaria.Ejercicio_1 to javafx.fxml;
    opens com.CarlosHugo_ExamenOrdinaria.Ejercicio_1.Interface to javafx.fxml;

    exports com.CarlosHugo_ExamenOrdinaria.Ejercicio_1;
    exports com.CarlosHugo_ExamenOrdinaria.Ejercicio_1.Interface;
}
