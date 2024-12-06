import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int roll1 = 0;
        int roll2 = 0;
        boolean done = false;
        boolean finite = false;
        boolean wo = false;
        do {
            roll1 = rand.nextInt(6) + 1;
            roll2 = rand.nextInt(6) + 1;
            System.out.println("");
            System.out.println("First die: " + roll1);
            System.out.println("Second die: " + roll2);
            int point = roll1 + roll2;
            System.out.println("Sum: " + point);
            if(point==7 || point==11) {
                System.out.println("You hit the natural! You win!");
                System.out.println("");
                do {
                    System.out.println("Play again? Y/N");
                    String again = scan.nextLine();
                    if(again.equalsIgnoreCase("Y")) {
                        finite = true;
                    } else if(again.equalsIgnoreCase("N")) {
                        done = true;
                        finite = true;
                    } else {
                        System.out.println("Invalid input. Please enter Y or N.");
                        System.out.println("");
                    }
                } while(!finite);
                finite = false;
            } else if(point==2 || point==3 || point==12) {
                System.out.println("You crapped out! You lose!");
                System.out.println("");
                do {
                    System.out.println("Play again? Y/N");
                    String again = scan.nextLine();
                    if(again.equalsIgnoreCase("Y")) {
                        finite = true;
                    } else if(again.equalsIgnoreCase("N")) {
                        done = true;
                        finite = true;
                    } else {
                        System.out.println("Invalid input. Please enter Y or N.");
                        System.out.println("");
                    }
                } while(!finite);
                finite = false;
            } else {
                System.out.println("The point is now " + point);
                System.out.println("");
                do {
                    roll1 = rand.nextInt(6) + 1;
                    roll2 = rand.nextInt(6) + 1;
                    int sum = roll1 + roll2;
                    if(sum==point) {
                        System.out.println("You hit the point sum! You win!");
                        System.out.println("");
                        do {
                            System.out.println("Play again? Y/N");
                            String again = scan.nextLine();
                            if(again.equalsIgnoreCase("Y")) {
                                finite = true;
                                wo = true;
                            } else if(again.equalsIgnoreCase("N")) {
                                done = true;
                                finite = true;
                                wo = true;
                            } else {
                                System.out.println("Invalid input. Please enter Y or N.");
                                System.out.println("");
                            }
                        } while(!finite);
                        finite = false;
                    } else if(sum==7) {
                        System.out.println("You rolled a 7! You lose!");
                        System.out.println("");
                        do {
                            System.out.println("Play again? Y/N");
                            String again = scan.nextLine();
                            if(again.equalsIgnoreCase("Y")) {
                                finite = true;
                                wo = true;
                            } else if(again.equalsIgnoreCase("N")) {
                                done = true;
                                finite = true;
                                wo = true;
                            } else {
                                System.out.println("Invalid input. Please enter Y or N.");
                                System.out.println("");
                            }
                        } while(!finite);
                        finite = false;
                    } else {
                        System.out.println("The sum of your rolls is " + sum + ".");
                        System.out.println("Rolling again! Must hit a " + point + " or a 7 to end.");
                        System.out.println("");
                    }
                } while(!wo);
                wo = false;
            }
        } while(!done);
    }
}
