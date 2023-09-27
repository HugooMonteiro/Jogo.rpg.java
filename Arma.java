/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogorpg;

/**
 *
 * @author hz14m
 */
class Arma {
    String categoria;
    int constanteDano;

    public Arma(String categoria, int constanteDano) {
        this.categoria = categoria;
        this.constanteDano = constanteDano;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getConstanteDano() {
        return constanteDano;
    }
}