/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogorpg;

/**
 *
 * @author hz14m
 */
class Adversario {
    String nome;
    int pv;
    int dano;
    int defesa;
    int agilidade;
    boolean defesaDobrada;

    public Adversario(String nome, int pv, int dano, int defesa, int agilidade) {
        this.nome = nome;
        this.pv = pv;
        this.dano = dano;
        this.defesa = defesa;
        this.agilidade = agilidade;
    }
}