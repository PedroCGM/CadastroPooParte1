/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private int id;
    private String nome;

    // Construtor padrão
    public Pessoa() {}

    // Construtor com todos os campos
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método exibir
    public void exibir() {
        System.out.println("ID: " + id + ", Nome: " + nome);
    }
}