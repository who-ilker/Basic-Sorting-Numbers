import java.util.Scanner;
// Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
public class Main {
    public static void main(String[] args){

        double n1, n2, n3, min, middle, max;
        Scanner inp = new Scanner(System.in);

        System.out.print("Number 1: ");
        n1 = inp.nextDouble();
        System.out.print("Number 2: ");
        n2 = inp.nextDouble();
        System.out.print("Number 3: ");
        n3 = inp.nextDouble();

        if (n1 < n2 && n1 < n3){
            if (n2 < n3){
                System.out.println("n1 < n2 < n3");
            }
            else
                System.out.println("n1 < n3 < n2");
        }
        else if (n2 < n1 && n2 < n3){
            if(n1 < n3){
                System.out.println("n2 < n1 < n3");
            }
            else
                System.out.println("n2 < n3 < n1");
        }
        else if (n3 < n1 && n3 < n2){
            if(n1 < n2)
                System.out.println("n3 < n1 < n2");
            else
                System.out.println("n3 < n2 < n1");
        }

    }
}