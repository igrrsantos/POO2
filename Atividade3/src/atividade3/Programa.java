package atividade3;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
        System.out.print("Nome do curso: ");
        String nomeCurso = scanner.nextLine();

        System.out.print("Código do curso: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Data de início do curso no formato (dd/MM/yyyy): ");
        String dataInicioInput = scanner.nextLine();
        LocalDate dataInicio = LocalDate.parse(dataInicioInput, formatter);

        Curso curso = new Curso(codigo, nomeCurso, dataInicio);
        System.out.println(curso.toString());
        System.out.println("Curso cadastrado com sucesso!");
        
        System.out.println("----------------------------------------------------------");
        
        System.out.print("Número da matrícula: ");
        int numMatricula = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Data de nascimento no formato (dd/MM/yyyy): ");
        String dataNascInput = scanner.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascInput, formatter);
        
        Aluno aluno = new Aluno(numMatricula , nomeAluno, dataNascimento);
        System.out.println(aluno.toString());
        System.out.println("Aluno cadastrado com sucesso!");
        
        System.out.println("----------------------------------------------------------");
        

	}

}
