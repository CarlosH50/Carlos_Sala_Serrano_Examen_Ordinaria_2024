package com.CarlosHugo_ExamenOrdinaria.Ejercicio_1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GlamourFinancialController {
    private GlamourFinancialImplementation glamourFinanciera;

    @FXML
    private TextField campoMercado;
    @FXML
    private TextField campoPrecio;
    @FXML
    private TextField campoNumeroAcciones;
    @FXML
    private TextField campoValorEnLibros;
    @FXML
    private Label etiquetaValorMercado;
    @FXML
    private Label etiquetaRelacionPrecioValorEnLibros;
    @FXML
    private Button botonActualizar;
    @FXML
    private Button botonCalcular;

    public GlamourFinancialController() {
        glamourFinanciera = new GlamourFinancialImplementation();
    }

    @FXML
    private void initialize() {
        botonActualizar.setOnAction(event -> actualizarPrecioAccion());
        botonCalcular.setOnAction(event -> calcularIndicadoresFinancieros());
    }

    private void actualizarPrecioAccion() {
        String mercado = campoMercado.getText();
        double precio = Double.parseDouble(campoPrecio.getText());
        glamourFinanciera.actualizarPrecioAccion(mercado, precio);
    }

    private void calcularIndicadoresFinancieros() {
        int numeroAcciones = Integer.parseInt(campoNumeroAcciones.getText());
        double valorEnLibros = Double.parseDouble(campoValorEnLibros.getText());

        double valorMercado = glamourFinanciera.calcularValorMercado(numeroAcciones);
        double relacionPrecioValorEnLibros = glamourFinanciera.calcularRelacionPrecioValorEnLibros(valorEnLibros);

        etiquetaValorMercado.setText("Valor de Mercado: $" + valorMercado);
        etiquetaRelacionPrecioValorEnLibros.setText("Relación Precio/Valor en Libros: " + relacionPrecioValorEnLibros);
    }
}


