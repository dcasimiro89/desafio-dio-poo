import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java Beginners");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso MySQL");
        curso2.setDescricao("Curso para iniciantes");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Iniciantes em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDeivison = new Dev();
        devDeivison.setNome("Deivison");
        devDeivison.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Deivison: " + devDeivison.getConteudosInscritos());
        devDeivison.progredir();
        devDeivison.progredir();
        devDeivison.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Deivison: " + devDeivison.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Deivison: " + devDeivison.getConteudosConcluidos());
        System.out.println("XP: " + devDeivison.calcularTotalXp());

        System.out.println("=============");

        Dev devRose = new Dev();
        devRose.setNome("Rose");
        devRose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rose: " + devRose.getConteudosInscritos());
        devRose.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rose: " + devRose.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rose: " + devRose.getConteudosInscritos());
        System.out.println("XP: " + devRose.calcularTotalXp());





    }
}