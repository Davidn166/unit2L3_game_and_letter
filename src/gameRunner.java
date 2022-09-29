public class gameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer();
        game.increaseScore(8);
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        double avg = game.averageScorePerPlayer();
        System.out.println("Avg score per player: " + avg);

    }
}
