package br.com.dio.desafio.domínio;

import java.time.LocalDate;

public class Mentoria extends Conteúdo{
    
    private LocalDate data;
    
    @Override
    public double calcularXP() {
        return XP_PADRÃO + 20d;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    } 
    public Mentoria() {
    }
    @Override
    public String toString() {
        return "Mentoria [título = " + getTítulo() + ", descrição = " + 
        getDescrição() + ", data = " + data + "]";
    }

    


}
