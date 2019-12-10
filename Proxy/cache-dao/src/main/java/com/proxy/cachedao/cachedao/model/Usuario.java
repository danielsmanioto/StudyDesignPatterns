package com.proxy.cachedao.cachedao.model;

public class Usuario {

    private Integer id;
    private String nome;

    public Usuario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}
