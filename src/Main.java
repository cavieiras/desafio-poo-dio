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

      System.out.println(curso1);
      System.out.println(curso2);
      System.out.println(mentoria);
    

   } 
}
