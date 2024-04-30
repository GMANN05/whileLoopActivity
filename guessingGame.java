import javax.swing.*;

public class guessingGame {
    public static void main(String[] args) {
        int target = 75;
        int counter = 0;
        while(true){
            String input = JOptionPane.showInputDialog("Guess the number 1-100. [Type q to quit]");
            counter ++;
            if (input == null || input.equalsIgnoreCase("q")){
                JOptionPane.showMessageDialog(null, "You quit, the correct number is " + target);
                break;
            }else{
                int guess = Integer.parseInt(input);
                if(guess ==target) {
                    JOptionPane.showMessageDialog(null, "You Guessed correctly" + target);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "Wrong guess! Try Again!");
                } if( guess < target){
                    JOptionPane.showMessageDialog(null, "Too low Try again!");
                } if(guess  > target){
                    JOptionPane.showMessageDialog(null, "Too high! Try again!");
                }
            }


        } JOptionPane.showMessageDialog(null, "Number of guesses " + counter);

    }
}
