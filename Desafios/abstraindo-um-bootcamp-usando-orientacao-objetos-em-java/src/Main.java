import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java Basico");
        curso.setDescricao("Backend em Java");
        curso.setCargaHoraria(34);
        System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Mongo DB");
        curso2.setDescricao("Banco de dados");
        curso2.setCargaHoraria(26);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Vai ou racha");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJP = new Dev();
        devJP.setNome("João Pedro");
        devJP.inscreverBootcamp(bootcamp);
        devJP.progredir();
        devJP.progredir();
        System.out.println("Conteudo inscritos " + devJP.getConteudosInscritos());
        System.out.println("Conteudo concluido  " + devJP.getConteudosConcluidos());
    }
}