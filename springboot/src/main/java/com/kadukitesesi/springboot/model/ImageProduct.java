package com.kadukitesesi.springboot.model;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class ImageProduct {

    @Id
    @Column(name = "id_product")
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private ProductModel produto;

    private String nomeArquivo;
    private String contentType;
    private String descricao;
    private Long tamanho;

    public ImageProduct(String contentType, String descricao, UUID id, String nomeArquivo, ProductModel produto, Long tamanho) {
        this.contentType = contentType;
        this.descricao = descricao;
        this.id = id;
        this.nomeArquivo = nomeArquivo;
        this.produto = produto;
        this.tamanho = tamanho;
    }

    public ImageProduct() {
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public ProductModel getProduto() {
        return produto;
    }

    public void setProduto(ProductModel produto) {
        this.produto = produto;
    }

    public Long getTamanho() {
        return tamanho;
    }

    public void setTamanho(Long tamanho) {
        this.tamanho = tamanho;
    }
}
