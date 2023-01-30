package br.com.dio.desafio.domínio;

public class Curso {
    private String título;
    private String descrição;
    private int cargaHorária;

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
    public int getCargaHorária() {
        return cargaHorária;
    }
    public void setCargaHorária(int cargaHorária) {
        this.cargaHorária = cargaHorária;
    }
    public Curso() {
    }
    @Override
    public String toString() {
        return "Curso [título = " + título + ", descrição = " 
        + descrição + ", cargaHorária = " + cargaHorária + "]";
    }

    
    


}
