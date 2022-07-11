package web;

import data.UnivDAO;
import entity.Stu;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCtrl")
public class ServletCtrl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List <Stu> S = new UnivDAO().read();
        //S.forEach(System.out::println);
        req.setAttribute("stu", S);
        req.getRequestDispatcher("stu.jsp").forward(req, res);
    }
}
