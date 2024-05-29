package com.CarlosHugo_ExamenOrdinaria.Ejercicio_1.Interface;

public interface GlamourFinancial {
    double obtenerPrecioAccion(String mercado);
    void actualizarPrecioAccion(String mercado, double precio);
    double calcularValorMercado(int numeroAcciones);
    double calcularRelacionPrecioValorEnLibros(double valorEnLibros);
}

