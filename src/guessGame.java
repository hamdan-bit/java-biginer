import java.util.ArrayList;
import java.util.Scanner;

public class GuessGame {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      double computerMove = Math.floor(Math.random()*10) +1;
      System.out.println("Choose a number between 1-10");
      double userMove = scanner.nextDouble();
      while (computerMove != userMove){
          ArrayList<Double> pastGuesses = new ArrayList<>();
          pastGuesses.add(userMove);
      }
  }
}