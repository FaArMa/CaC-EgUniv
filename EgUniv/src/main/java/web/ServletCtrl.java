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
import javax.servlet.http.HttpSession;

@WebServlet("/ServletCtrl")
public class ServletCtrl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action != null) {
            switch (action) {
                case "edit":
                    editStu(req, res);
                    break;
                case "delete":
                    delStu(req, res);
                    break;
                default:
                    ActDef(req, res);
                    break;
            }
        } else {
            ActDef(req, res);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action != null) {
            switch (action) {
                case "insert":
                    insertStu(req, res);
                    break;
                case "mod":
                    modStu(req, res);
                    break;
                default:
                    ActDef(req, res);
                    break;
            }
        }
    }

    protected void insertStu(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name"), surname = req.getParameter("surname");
        char sex = req.getParameter("sex").charAt(0);
        String nationality = req.getParameter("nationality");
        int dni = Integer.parseInt(req.getParameter("dni"));
        String birth = req.getParameter("birth");
        Stu S = new Stu(name, surname, sex, nationality, dni, birth);
        int C = new UnivDAO().create(S);
        //System.out.println("- Inserted: " + C);
        ActDef(req, res);
    }
    
    protected void editStu(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // TODO
    }
    
    protected void modStu(HttpServletRequest req, HttpServletResponse res) {
        // TODO
    }
    
    protected void delStu(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int idStu = Integer.parseInt(req.getParameter("idStu"));
        int C = new UnivDAO().delete(idStu);
        //System.out.println("- Deleted: " + C);
        ActDef(req, res);
    }

    private void ActDef(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List <Stu> S = new UnivDAO().read();
        HttpSession sess = req.getSession();
        //S.forEach(System.out::println);
        sess.setAttribute("stu", S);
        res.sendRedirect("stu.jsp");
    }
}
