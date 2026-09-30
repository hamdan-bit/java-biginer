import java.util.ArrayList;
import java.util.Scanner;

public class guessGame {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      double computerMove = Math.floor(Math.random()*10) +1;
      System.out.println("Choose a number between 1-10");
      double userMove = scanner.nextDouble();

      ArrayList<Double> pastGuesses = new ArrayList<>();
      while (computerMove != userMove){
          pastGuesses.add(userMove);
          break;
      }
      System.out.println(pastGuesses);

      scanner.close();

  }
}