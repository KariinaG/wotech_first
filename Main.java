package ThirdWeek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(" provide your temperature: ");
        double temp = sc.nextDouble();


        if (temp <= 3.0) {
            System.out.println("you need very warm clothes");
        } else if (temp > 3.0 && temp <= 12.0) {
            System.out.println("wear something warm");
        } else if (temp > 12.0 && temp <= 20.0) {
            System.out.println("you can wear almost just a T-shirt :)");
        } else if (temp > 20) {
            System.out.println("it's hot or even very hot, better wear bikini or go naked ;)");
        } else {
            System.out.println("something went wrong, try again");
        }
        System.out.println("do you like a comment? :)   how much you like  it? answer using those words: sucks, fine, great ");

        sc.nextLine();
        String textAnswer = sc.nextLine();
        if (textAnswer.equals("fine")) {
            System.out.println("That's okay");
        } else if (textAnswer.equals("great")) {
            System.out.println("I am glad!");
        } else if (textAnswer.equals("sucks")) {
            System.out.println("ouuu, so bad :(");
        }

        System.out.println("you can either answer using number 1 - 3 (where 1 = don't like and 3 = I like it a lot) ");
        int likeAsMuch = sc.nextInt();
        if (likeAsMuch == 1) {
            System.out.println("Ouuuu, I am so sorry to hear that :(");
        } else if (likeAsMuch == 2) {
            System.out.println("It's okay");
        } else if (likeAsMuch == 3) {
            System.out.println("Super! I am glad!");
        } else {
            System.out.println("something is wrong, but in general everything is super cool!");
        }

    }
}



