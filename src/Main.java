import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("aprendendo sobre Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Aprendendo sobre Python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("aprendendo Java na prática");
        mentoria1.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para desenvolvimento em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLor = new Dev();
        devLor.setNome("Lorena");
        devLor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + devLor.getNome() + ": " + devLor.getConteudosInscritos());
        devLor.progredir();
        System.out.println(" ");
        System.out.println("Conteúdos inscritos de " + devLor.getNome() + ": " + devLor.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + devLor.getNome() + ": " + devLor.getConteudosConcluidos());
        System.out.println("XP: " + devLor.calcularTotalXp());

        System.out.println(" ");

        Dev devJulio = new Dev();
        devJulio.setNome("Julio");
        devJulio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + devJulio.getNome() + ": " + devJulio.getConteudosInscritos());
        devJulio.progredir();
        devJulio.progredir();
        System.out.println(" ");
        System.out.println("Conteúdos inscritos de " + devJulio.getNome() + ": " + devJulio.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + devJulio.getNome() + ": " + devJulio.getConteudosConcluidos());
        System.out.println("XP: " + devJulio.calcularTotalXp());

    }
    }