package za.co.wethinkcode.mastermind;

public class Mastermind {
    private final String code;
    private final Player player;


    public Mastermind(CodeGenerator generator, Player player) {
        this.code = generator.generateCode();
        this.player = player;
    }

    public Mastermind() {
        this(new CodeGenerator(), new Player());
    }

    public void runGame() {
        /**
         * the user has 12 guesses
         * i made a for loop to check each char and if
         * the char matches completed the player wins
         * and if its not the exact match then it checks each individual char
         * depending on if the player is correct or incorrect the appropriate
         * message will be displayed
         */
        //TODO: implement the main run loop logic
        String GenCode = code;
        int chancesLeft = 12;
        int i = 0;
        while (i != 12) {
            int CorrectlyPlaced = 0;
            int CorrectOutOfPLace = 0;
            String playGame = player.getGuess();

            for (int o = 0; o < 4; o++) {
                char c = GenCode.charAt(o);
                if (playGame.charAt(o) == GenCode.charAt(o)) {
                    CorrectlyPlaced++;
                } else {
                    if (playGame.contains(String.valueOf(c))) {
                        CorrectOutOfPLace++;
                    }
                }
            }
            if (CorrectlyPlaced == 4) {
                System.out.println("Number of correct digits in correct place: " + CorrectlyPlaced);
                System.out.println("Number of correct digits not in correct place: " + CorrectOutOfPLace);
                System.out.println("Congratulations! You are a codebreaker!");
                System.out.println("The code was: " + GenCode);
                break;

            } else {
                System.out.println("Number of correct digits in correct place: " + CorrectlyPlaced);
                System.out.println("Number of correct digits not in correct place: " + CorrectOutOfPLace);
            }
            int chance = (chancesLeft -1 )- i ;
            if (chance == 0){
                System.out.println("No more turns left.");
                System.out.println("The code was: " + GenCode);
            }else{
                System.out.println("Turns left: " + ((chancesLeft - 1) - i));
            }
            i++;
        }
    }

    public static void main(String[] args){
        Mastermind game = new Mastermind();
        game.runGame();
    }
}
