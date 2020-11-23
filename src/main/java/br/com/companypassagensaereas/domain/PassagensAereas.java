package br.com.companypassagensaereas.domain;


import javax.validation.constraints.NotEmpty;


public class PassagensAereas {

    private Long id;
    @NotEmpty(message = "Favor preencher País")
    private String pais;
    @NotEmpty(message = "Favor preencher Estado")
    private String estado;
    @NotEmpty(message = "Favor preencher Cidade")
    private String cidade;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
