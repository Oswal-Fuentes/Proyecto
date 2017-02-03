package prueba;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("---MENU---  \n"
                    + "1) Figura 1 \n"
                    + "2) Figura 2 \n"
                    + "3) Figura 3");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (j >= 10 / 2 - i && j <= 10 / 2 + i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:

                    break;
            }
            System.out.println("¿Continuar?[s/n]: ");
            resp = sc.next().charAt(0);
        }
    }
}
/*
1)git add --all
2)git commit -m "Cualquier comentario"
3)git push origin master
 */
