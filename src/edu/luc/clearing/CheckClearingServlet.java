package edu.luc.clearing;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class CheckClearingServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json");
		resp.getWriter().print("{\"status\": \"ready\"}");
	}
}
