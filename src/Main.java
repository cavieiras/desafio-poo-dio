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

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
      bootcamp.setDescrição("Descrição Bootcamp Developer");
      bootcamp.getConteúdos().add(curso1);
      bootcamp.getConteúdos().add(curso2);
      bootcamp.getConteúdos().add(mentoria);

      Dev devCamilaS = new Dev();
      devCamilaS.setNome("Camila S");
      devCamilaS.inscreverBootcamp(bootcamp);
      System.out.println(bootcamp.getNome());
      System.out.println(bootcamp.getDescrição() + "\n");

      System.out.println(bootcamp.getDataInicial());
      System.out.println(bootcamp.getDataFinal() + "\n");

      System.out.println("Conteúdos Inscritos Camila S: " );
      System.out.println(devCamilaS.getConteúdosInscritos() + "\n");
      devCamilaS.progredir();
      System.out.println("Conteúdos Inscritos Camila S: ");
      System.out.println(devCamilaS.getConteúdosInscritos() + "\n");
      System.out.println("Conteúdos Concluídos Camila S: ");
      System.out.println(devCamilaS.getConteúdosConcluídos() + "\n");
      devCamilaS.progredir();
      devCamilaS.progredir();
      System.out.println("Conteúdos Inscritos Camila S: ");
      System.out.println(devCamilaS.getConteúdosInscritos() + "\n");
      System.out.println("Conteúdos Concluídos Camila S: ");
      System.out.println(devCamilaS.getConteúdosConcluídos() + "\n");
      System.out.println();
      if (devCamilaS.getConteúdosInscritos().isEmpty()) {
         System.out.println("Data Término: " + bootcamp.getDataTérmino());
     };
      System.out.println("XP: " + devCamilaS.calcularTotalXP()+ "\n");

      
      System.out.println("--------------------------------------------- \n");


      Dev devWilsonB = new Dev();
      devWilsonB.setNome("Wilson B");
      devWilsonB.inscreverBootcamp(bootcamp);
      System.out.println(bootcamp.getNome());
      System.out.println(bootcamp.getDescrição() + "\n");

      System.out.println(bootcamp.getDataInicial());
      System.out.println(bootcamp.getDataFinal() + "\n");

      System.out.println("Conteúdos Inscritos Wilson B: " );
      System.out.println(devWilsonB.getConteúdosInscritos() + "\n");
      devWilsonB.progredir();
      System.out.println("Conteúdos Inscritos Wilson B: ");
      System.out.println(devWilsonB.getConteúdosInscritos() + "\n");
      System.out.println("Conteúdos Concluídos Wilson B: ");
      System.out.println(devWilsonB.getConteúdosConcluídos() + "\n");
      devWilsonB.progredir();
      System.out.println("Conteúdos Inscritos Wilson B: ");
      System.out.println(devWilsonB.getConteúdosInscritos() + "\n");
      System.out.println("Conteúdos Concluídos Wilson B: ");
      System.out.println(devWilsonB.getConteúdosConcluídos() + "\n");
      System.out.println();
      if (devWilsonB.getConteúdosInscritos().isEmpty()) {
         System.out.println("Data Término: " + bootcamp.getDataTérmino());
     };
      System.out.println("XP: " + devWilsonB.calcularTotalXP());
   } 
}
