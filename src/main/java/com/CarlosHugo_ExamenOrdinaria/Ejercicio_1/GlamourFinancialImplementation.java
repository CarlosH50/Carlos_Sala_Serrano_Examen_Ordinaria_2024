package com.CarlosHugo_ExamenOrdinaria.Ejercicio_1;

import com.CarlosHugo_ExamenOrdinaria.Ejercicio_1.Interface.GlamourFinancial;

import java.util.HashMap;
import java.util.Map;

public class GlamourFinancialImplementation implements GlamourFinancial {
    private Map<String, Double> preciosAcciones;

    public GlamourFinancialImplementation() {
        preciosAcciones = new HashMap<>();
    }

    @Override
    public double obtenerPrecioAccion(String mercado) {
        return preciosAcciones.getOrDefault(mercado, 0.0);
    }

    @Override
    public void actualizarPrecioAccion(String mercado, double precio) {
        preciosAcciones.put(mercado, precio);
    }

    @Override
    public double calcularValorMercado(int numeroAcciones) {
        double valorTotal = 0.0;
        for (double precio : preciosAcciones.values()) {
            valorTotal += precio * numeroAcciones;
        }
        return valorTotal;
    }

    @Override
    public double calcularRelacionPrecioValorEnLibros(double valorEnLibros) {
        double valorMercado = calcularValorMercado(1); // Supongamos 1 acción para simplicidad
        return valorMercado / valorEnLibros;
    }

    public static void main(String[] args) {
        GlamourFinancialImplementation glamourFinanciera = new GlamourFinancialImplementation();
        glamourFinanciera.actualizarPrecioAccion("NYSE", 150.0);
        glamourFinanciera.actualizarPrecioAccion("NASDAQ", 155.0);

        System.out.println("Precio de Acción en A: $" + glamourFinanciera.obtenerPrecioAccion("NYSE"));
        System.out.println("Precio de Acción en B: $" + glamourFinanciera.obtenerPrecioAccion("NASDAQ"));

        int numeroAcciones = 1000;
        System.out.println("Valor de Mercado: $" + glamourFinanciera.calcularValorMercado(numeroAcciones));

        double valorEnLibros = 120.0;
        System.out.println("Relación Precio/Valor en Libros: " + glamourFinanciera.calcularRelacionPrecioValorEnLibros(valorEnLibros));
    }
}
