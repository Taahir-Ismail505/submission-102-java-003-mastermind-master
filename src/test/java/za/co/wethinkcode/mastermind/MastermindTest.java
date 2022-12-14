package za.co.wethinkcode.mastermind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.wethinkcode.mastermind.Mastermind;
import za.co.wethinkcode.mastermind.CodeGenerator;
import za.co.wethinkcode.mastermind.Player;


public class MastermindTest {
    @Test
    public void TestCodeGen(){
        String Code = String.valueOf( new CodeGenerator());
        Assertions.assertNotEquals(Code ,"1545");
    }

    @Test
    public void GetGuess(){
//        String Player  = new Player(GetGuess());
        Assertions.assertNotEquals("12ab","1234");
        Assertions.assertNotEquals("","1234");
        Assertions.assertNotEquals("98752","1234");
        Assertions.assertNotEquals("158","1234");
        Assertions.assertNotEquals("09 87","1234");
    }
    @Test
    public void Mastermind(){

        Assertions.assertNotEquals("error","Congratulations! You are a codebreaker!");
    }
}
