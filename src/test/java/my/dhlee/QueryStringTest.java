package my.dhlee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueryStringTest {

    // operand1=11&operator=*&operand2=5
    @Test
    void create() {
        QueryString queryString = new QueryString("operand1", "11");

        assertNotNull(queryString);
    }
}
