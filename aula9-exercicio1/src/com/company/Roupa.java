package com.company;

public class Roupa {
    private Tamanho tamanho;
    private Tipo tipo;
    private Boolean eNovo;
    private Boolean eImportado;
    private static Integer contador = 0;

    public Roupa(Tamanho tamanho, Tipo tipo, Boolean eNovo, Boolean eImportado) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.eNovo = eNovo;
        this.eImportado = eImportado;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Boolean geteNovo() {
        return eNovo;
    }

    public void seteNovo(Boolean eNovo) {
        this.eNovo = eNovo;
    }

    public Boolean geteImportado() {
        return eImportado;
    }

    public void seteImportado(Boolean eImportado) {
        this.eImportado = eImportado;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Roupa.contador = contador;
    }
}
