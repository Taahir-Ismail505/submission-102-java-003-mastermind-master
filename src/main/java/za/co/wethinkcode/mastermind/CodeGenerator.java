package za.co.wethinkcode.mastermind;

import java.util.Random;

public class CodeGenerator {
    private final Random random;

    public CodeGenerator() {
        this.random = new Random();
    }

    public CodeGenerator(Random random) {
        this.random = random;
    }

    public String generateCode() {
        //TODO: implement using this.random
        /**
         * this adds a random digit from 1 to 8
         * to the string and then returns the code
         */
        String code = "";

        for (int i = 0; i < 4; i++) {
            int no= random.nextInt(9-1)+1;
            code = code + no;
        }

        System.out.println("4-digit Code has been set. Digits in range 1 to 8. You have 12 turns to break it.");
        return code;
    }
}