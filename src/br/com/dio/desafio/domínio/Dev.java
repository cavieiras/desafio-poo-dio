package br.com.dio.desafio.domínio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteúdo> conteúdosInscritos = new LinkedHashSet<>();
    private Set<Conteúdo> conteúdosConcluídos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteúdosInscritos.addAll(bootcamp.getConteúdos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir () {
        Optional <Conteúdo> conteudo = this.conteúdosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteúdosConcluídos.add(conteudo.get());
            this.conteúdosInscritos.remove(conteudo.get());
        } else 
            System.err.println("Você não está matriculado em nenhuma conteúdo!");  
    }

    public double calcularTotalXP() {
       return this.conteúdosConcluídos.stream()
       .mapToDouble(conteudo -> conteudo.calcularXP())
       .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteúdo> getConteúdosInscritos() {
        return conteúdosInscritos;
    }

    public void setConteúdosInscritos(Set<Conteúdo> conteúdosInscritos) {
        this.conteúdosInscritos = conteúdosInscritos;
    }

    public Set<Conteúdo> getConteúdosConcluídos() {
        return conteúdosConcluídos;
    }

    public void setConteúdosConcluídos(Set<Conteúdo> conteúdosConcluídos) {
        this.conteúdosConcluídos = conteúdosConcluídos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteúdosInscritos == null) ? 0 : conteúdosInscritos.hashCode());
        result = prime * result + ((conteúdosConcluídos == null) ? 0 : conteúdosConcluídos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteúdosInscritos == null) {
            if (other.conteúdosInscritos != null)
                return false;
        } else if (!conteúdosInscritos.equals(other.conteúdosInscritos))
            return false;
        if (conteúdosConcluídos == null) {
            if (other.conteúdosConcluídos != null)
                return false;
        } else if (!conteúdosConcluídos.equals(other.conteúdosConcluídos))
            return false;
        return true;
    }

    
}
