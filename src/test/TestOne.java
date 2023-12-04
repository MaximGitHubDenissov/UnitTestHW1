package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TestOne {

    @Test
    @DisplayName("Тест суммирования")
    public void testSum(){
        assertEquals(5, 2+3);
    }

    
}
