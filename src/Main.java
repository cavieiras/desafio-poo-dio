import java.time.LocalDate;

import br.com.dio.desafio.domínio.*;

public class Main {
   public static void main(String[] args) {
    
      Curso curso1 = new Curso();
      curso1.setTítulo("Curso Java");
      curso1.setDescrição("Descrição curso Java");
      curso1.setCargaHorária(8);

      Curso curso2 = new Curso();
      curso2.setTítulo("Curso Js");
      curso2.setDescrição("Descrição curso Js");
      curso2.setCargaHorária(4);

      Mentoria mentoria = new Mentoria();
      mentoria.setTítulo("Mentoria de Java");
      mentoria.setDescrição("Descrição mentoria Java");
      mentoria.setData(LocalDate.now());

      // System.out.println(curso1);
      // System.out.println(curso2);
      // System.out.println(mentoria);

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
      bootcamp.setDescrição("Descrição Bootcamp Developer");
      bootcamp.getConteúdos().add(curso1);
      bootcamp.getConteúdos().add(curso2);
      bootcamp.getConteúdos().add(mentoria);

      Dev devCamilaS = new Dev();
      devCamilaS.setNome("Camila S");
      devCamilaS.inscreverBootcamp(bootcamp);
      System.out.println("Conteúdos Inscritos Camila S: " + devCamilaS.getConteúdosInscritos());
      System.out.println();
      devCamilaS.progredir();
      System.out.println("Conteúdos Inscritos Camila S: " + devCamilaS.getConteúdosInscritos());
      devCamilaS.progredir();
      System.out.println("Conteúdos Concluídos Camila S: " + devCamilaS.getConteúdosConcluídos());
      System.out.println("XP: " + devCamilaS.calcularTotalXP());
      System.out.println("--");


      Dev devWilsonB = new Dev();
      devWilsonB.setNome("Wilson B");
      devWilsonB.inscreverBootcamp(bootcamp);
      System.out.println("Conteúdos Inscritos Wilson B: " + devWilsonB.getConteúdosInscritos());
      System.out.println();
      devWilsonB.progredir();
      System.out.println("Conteúdos Inscritos Wilson B: " + devWilsonB.getConteúdosInscritos());
      System.out.println("Conteúdos Concluídos Wilson B: " + devWilsonB.getConteúdosConcluídos());
      System.out.println("XP: " + devWilsonB.calcularTotalXP());
   } 
}
