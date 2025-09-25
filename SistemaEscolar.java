import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        double[] notas = new double[8];
        double mediaSemestre1, mediaSemestre2, mediaFinal;

        // Entrada de notas
        System.out.println("Digite as 8 notas do aluno (divididas em dois semestres):");
        
        // Notas do 1º semestre (notas 1 a 4)
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Notas do 2º semestre (notas 5 a 8)
        for (int i = 4; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias semestrais
        mediaSemestre1 = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        mediaSemestre2 = (notas[4] + notas[5] + notas[6] + notas[7]) / 4;

        // Cálculo da média final
        mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // Exibição dos resultados
        System.out.println("\nResultados:");
        System.out.println("Média do 1º semestre: " + mediaSemestre1);
        System.out.println("Média do 2º semestre: " + mediaSemestre2);
        System.out.println("Média final do aluno: " + mediaFinal);

        // Determinando a situação do aluno
        if (mediaFinal >= 7) {
            System.out.println("Situação: Aprovado!");
        } else if (mediaFinal >= 5) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }

        scanner.close();
    }
}
