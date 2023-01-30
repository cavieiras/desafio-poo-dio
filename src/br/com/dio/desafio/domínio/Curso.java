package br.com.dio.desafio.domínio;

public class Curso extends Conteúdo {
        private int cargaHorária;

    
    @Override
        public double calcularXP() {
            return XP_PADRÃO * cargaHorária;
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
        return "Curso [título = " + getTítulo() + ", descrição = " 
        + getDescrição() + ", cargaHorária = " + cargaHorária + "]";
    }

    
    


}
