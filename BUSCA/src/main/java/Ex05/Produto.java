/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex05;

/**
 *
 * @author rafaelamoreira
 */
public class Produto {

    private String data;
    private double preco;

    public Produto(String data, double preco) {
        this.data = data;
        this.preco = preco;
    }

    public String getData() {
        return data;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "data: " + data + ", preco: " + preco;
    }

}
