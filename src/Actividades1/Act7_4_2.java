package Actividades1;

public class Act7_4_2 {
    public static void main(String[] args) {
        char simbolo[] = new char[10];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[8] = '+';
        simbolo[9] = 'Q';



        for (int n : simbolo){
            System.out.print(n + ", ");
        }
        System.out.println();

    }
}
