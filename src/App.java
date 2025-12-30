import java.time.LocalDate;
import br.com.dio.desafio.model.bootcamp.Bootcamp;
import br.com.dio.desafio.model.bootcamp.Curso;
import br.com.dio.desafio.model.bootcamp.Mentoria;
import br.com.dio.desafio.model.dev.Dev;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso("Introdução java", "O início da sua jornada no mundo de Java.", 8);
        Curso curso2 = new Curso("Java POO", "Programação Orientada a Objeto em Java.", 4);
        Mentoria mentoria = new Mentoria("Mentoria Java e Spring Boot", "O universo das APIs em Java.", LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer", "Este bootcamp é o seu portal de entrada para o mundo da programação em Java.");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        System.out.println("\n----------------------------BOOTCAMP SYSTEM:---------------------------------\n");

        System.out.println("Desenvolvedor 01 - HIGOR MORIYAMA: ");
        Dev devHigor = new Dev("Higor Moriyama");
        devHigor.inscreverBootcamp(bootcampJava);
        System.out.println("\nConteúdos Inscritos: " + devHigor.getConteudosInscritos() + "\n");
        
        devHigor.progredir();
        devHigor.progredir();
        devHigor.progredir();

        System.out.println("Conteúdos Concluídos: " + devHigor.getConteudosConcluidos() + "\n");
        System.out.println("Conteúdos Inscritos: " + devHigor.getConteudosInscritos() + "\n");
        System.out.println("XP: " + devHigor.calcularTotalXP());
        
        System.out.println("\n================================================================\n");
        
        System.out.println("Desenvolvedor 01 - MARIA MARTA: ");
        Dev devMaria = new Dev("Maria Marta");
        devMaria.inscreverBootcamp(bootcampJava);
        System.out.println("\nConteúdos Inscritos Maria: " + devMaria.getConteudosInscritos() + "\n");
        
        devMaria.progredir();
        
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos() + "\n");
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos() + "\n");
        System.out.println("XP: " + devMaria.calcularTotalXP());
        System.out.println("\n-------------------------------------------------------------\n");
    }
}
