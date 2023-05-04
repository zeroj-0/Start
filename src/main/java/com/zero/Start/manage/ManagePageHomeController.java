package com.zero.Start.manage;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.Map;

@WebServlet(name="managePageHomeController", urlPatterns = "/manage/*")
public class ManagePageHomeController extends HttpServlet {


    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

    }
}
