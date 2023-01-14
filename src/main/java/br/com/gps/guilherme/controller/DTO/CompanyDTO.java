package br.com.gps.guilherme.controller.DTO;

import java.math.BigDecimal;
import java.sql.Date;

public class CompanyDTO {
    private String cnpj = "";
    private String razao_social = "";
    private String nome_fantasia = "";
    private BigDecimal capital_social;
    private String site = "";
    private String mercado = "";
    private Integer cnae_fiscal;
    private String cnae_fiscal_descricao = "";
    private String email = "";
    private String ddd_telefone_1 = "";
    private String cep = "";
    private String street = "";
    private String numero = "";
    private String neighborhood = "";
    private String city = "";
    private String state = "";
    private String complemento = "";
    private String nome_socio = "";
    private String qualificacao_socio = "";
    private Date data_entrada_sociedade;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public BigDecimal getCapital_social() {
        return capital_social;
    }

    public void setCapital_social(BigDecimal capital_social) {
        this.capital_social = capital_social;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public Integer getCnae_fiscal() {
        return cnae_fiscal;
    }

    public void setCnae_fiscal(Integer cnae_fiscal) {
        this.cnae_fiscal = cnae_fiscal;
    }

    public String getCnae_fiscal_descricao() {
        return cnae_fiscal_descricao;
    }

    public void setCnae_fiscal_descricao(String cnae_fiscal_descricao) {
        this.cnae_fiscal_descricao = cnae_fiscal_descricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDdd_telefone_1() {
        return ddd_telefone_1;
    }

    public void setDdd_telefone_1(String ddd_telefone_1) {
        this.ddd_telefone_1 = ddd_telefone_1;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNome_socio() {
        return nome_socio;
    }

    public void setNome_socio(String nome_socio) {
        this.nome_socio = nome_socio;
    }

    public String getQualificacao_socio() {
        return qualificacao_socio;
    }

    public void setQualificacao_socio(String qualificacao_socio) {
        this.qualificacao_socio = qualificacao_socio;
    }

    public Date getData_entrada_sociedade() {
        return data_entrada_sociedade;
    }

    public void setData_entrada_sociedade(Date data_entrada_sociedade) {
        this.data_entrada_sociedade = data_entrada_sociedade;
    }
}