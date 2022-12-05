package my.dhlee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestLineTest {

    private final String request = "GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1";

    @Test
    void create() {
        RequestLine requestLine = new RequestLine(request);

        assertNotNull(requestLine);
        assertEquals(new RequestLine("GET", "/calculate", "operand1=11&operator=*&operand2=55"), requestLine);
    }


}
