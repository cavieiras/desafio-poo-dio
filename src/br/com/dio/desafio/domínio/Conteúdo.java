package br.com.dio.desafio.domínio;

public abstract class Conteúdo {
    protected static final double XP_PADRÃO = 10;
    private String título;
    private String descrição;

    public abstract double calcularXP();

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    



}
