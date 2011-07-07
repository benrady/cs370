package edu.luc.clearing;

import org.junit.Test;

public class CheckClearingServletTest {
    @Test
    public void shouldReturnAnEmptyObjectForAnEmptyRequest() throws Exception {
        new CheckClearingServlet();
    }
}
