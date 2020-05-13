import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet",urlPatterns = "/caculator")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product_description = request.getParameter("product_description");
        double list_price = Double.parseDouble(request.getParameter("list_price"));
        double discount_percent = Double.parseDouble(request.getParameter("discount_percent"));

        double discount_amount =(list_price * discount_percent *0.01);
        double discount_price = list_price - discount_amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<fieldset>");
        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("<label>Description: </label>"+ "<span>"+product_description+"</span>" +"<br>");
        writer.println("<label>List Price: </label>"+ "<span>"+list_price+"</span>" +"<br>");
        writer.println("<label>Discount Percent: </label>"+ "<span>"+discount_percent+"%</span>" +"<br>");
        writer.println("<label>Discount Amount: </label>"+ "<span>"+discount_amount+"</span>" +"<br>");
        writer.println("<label>Discount Price: </label>"+ "<span>"+discount_price+"</span>" +"<br>");
        writer.println("</fieldset>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
