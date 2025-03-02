import javax.swing.*;
public class app {

    public static void main(String[] args) {
        int boardWidth = 660;
        int boardHeight = 640;
        JFrame frame = new JFrame("Flappy Bird Game");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.requestFocus();

        frame.setVisible(true);
    }
}