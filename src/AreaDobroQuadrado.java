import java.util.Scanner;

// 7- Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

public class AreaDobroQuadrado {
    public static void main(String[] args){
        // Requisito 1: Solicitar o lado de um quadrado.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insira a medida do lado de um quadrado: ");
        double lado_quad = userInput.nextDouble();
        userInput.close();

        // Requisito 2: Calcular a área do quadrado.
        double area_quad = Math.pow(lado_quad,2);

        // Requisito 3: Calcular o dobro da área do quadrado.
        double dobro_area = area_quad * 2;

        System.out.println("A área do quadrado é de: " + area_quad + "cm. E o dobro desta área é de: " + dobro_area +"cm.");
    }
}