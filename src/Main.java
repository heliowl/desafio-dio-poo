import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Dev aluno1 = new Dev();
        aluno1.setNome("Paulo");

        Dev aluno2 = new Dev();
        aluno2.setNome("Maria");

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso introdutório de Java");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("Spring Framework");
        curso2.setDescricao("Curso introdutório de Spring");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Tirar as dúvidas dos alunos");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java para Iniciantes");
        bootcamp.setDescricao("Curso Introdutório ao Java e Spring Framework");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        aluno1.inscrever(bootcamp);
        System.out.println("=============================================================");
        System.out.println("Conteúdos inscritos de "+ aluno1.getNome()+ " "+aluno1.getConteudosInscritos());
        System.out.println("---PROGRESSÃO---");
        aluno1.progredir();
        aluno1.progredir();
        System.out.println("Conteúdos inscritos de "+ aluno1.getNome()+ " "+aluno1.getConteudosInscritos());
        System.out.println("--------------------------------------------------------------");
        System.out.println("Conteúdos Concluídos de "+ aluno1.getNome()+ " "+aluno1.getConteudosConcluidos());
        System.out.println("Total de XP: "+aluno1.calcularTotalXp());
        System.out.println("=============================================================");

        aluno2.inscrever(bootcamp);
        System.out.println("=============================================================");
        System.out.println("Conteúdos inscritos de "+ aluno2.getNome()+ " "+aluno2.getConteudosInscritos());
        System.out.println("---PROGRESSÃO---");
        aluno2.progredir();
        System.out.println("Conteúdos inscritos de "+ aluno2.getNome()+ " "+aluno2.getConteudosInscritos());
        System.out.println("--------------------------------------------------------------");
        System.out.println("Conteúdos Concluídos de "+ aluno2.getNome()+ " "+aluno2.getConteudosConcluidos());
        System.out.println("Total de XP: "+aluno2.calcularTotalXp());
        System.out.println("=============================================================");


    }
}