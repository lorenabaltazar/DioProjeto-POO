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

        Dev devMel = new Dev();
        devMel.setNome("Melissa");
        devMel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + devMel.getNome() + ": " + devMel.getConteudosInscritos());
        devMel.progredir();
        System.out.println(" ");
        System.out.println("Conteúdos inscritos de " + devMel.getNome() + ": " + devMel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + devMel.getNome() + ": " + devMel.getConteudosConcluidos());
        System.out.println("XP: " + devMel.calcularTotalXp());

        System.out.println(" ");

        Dev devBergson = new Dev();
        devBergson.setNome("Bergson");
        devBergson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + devBergson.getNome() + ": " + devBergson.getConteudosInscritos());
        devBergson.progredir();
        devBergson.progredir();
        System.out.println(" ");
        System.out.println("Conteúdos inscritos de " + devBergson.getNome() + ": " + devBergson.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + devBergson.getNome() + ": " + devBergson.getConteudosConcluidos());
        System.out.println("XP: " + devBergson.calcularTotalXp());

    }
    }