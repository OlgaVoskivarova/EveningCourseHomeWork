import myHomeWork.Game;

import java.util.Random;
import java.util.Scanner;

//Напишите консольную игру «Камень, ножницы, бумага». Пользователь вводит свой выбор (в виде строки или числа).
// Программа случайным образом делает свой выбор и выводит на экран. Далее программа показывает,
// кто победитель – пользователь или программа.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        Random random = new Random();
        int comp = random.nextInt(0,3);

        System.out.println("Let s start the game! Please enter your option 0 - 3!");
        Game option = switch (comp){
        case 0  -> Game.PAPER;
        case 1  -> Game.SCISSORS;
        case 2  -> Game.STONE;
        default -> throw new RuntimeException("Такой вариант не предлагается");
        };


          if (user == comp ){
            System.out.println("Ничья");
        } else {
              if (user==0 && comp == 2 || user == 1 && comp == 0 || user==2 && comp ==1 ){
                  System.out.println("Победил участник");
              }else{
            System.out.println("Победил компьтер");
        }


               }
    }
}