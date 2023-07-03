package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;





class BalancedParenthesesTest {

    String TrueEvenFour = "()()()()";
    String TrueRandomOrder = "((()))((()())())";
    String TrueOppositePosition = ")(";
    String FalseOneParenth = ")";

    String TrueEvenThree = "({[]})";
    String TrueRandom = "(({{}[]}))";
    String FalseMissingOpening = "{}}";

    private BalancedParenthesesTest b = new BalancedParenthesesTest();


    @Test
    void balance_TrueEvenFour() {
        assertTrue(b.balance(TrueEvenFour));
    }

    @Test
    void balance_TrueRandomOrder() {
        assertTrue(b.balance(TrueRandomOrder));
    }

    @Test
    void balance_TrueOppositePosition() {
        assertTrue(b.balance(TrueOppositePosition));
    }

    @Test
    void balance_FalseOneParenth() {
        assertFalse(b.balance(FalseOneParenth));
    }

    @Test
    void balanceAllTypes_TrueEvenThree() {
        assertTrue(b.balanceAllTypes(TrueEvenThree));
    }

    @Test
    void balanceAllTypes_TrueRandom() {
        assertTrue(b.balanceAllTypes(TrueRandom));
    }

    @Test
    void balanceAllTypes_FalseMissingOpening() {
        assertFalse(b.balanceAllTypes(FalseMissingOpening));
    }
}