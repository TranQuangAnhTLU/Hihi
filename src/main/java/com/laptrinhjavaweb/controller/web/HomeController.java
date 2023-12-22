package com.laptrinhjavaweb.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.service.impl.ICategoryService;
import com.laptrinhjavaweb.service.impl.INewService;


@WebServlet(urlPatterns =   {"/trang-chu"})
public class HomeController extends HttpServlet{
	
    @Inject
    private ICategoryService categoryService;
    
    @Inject INewService newService;
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long code =  1L;
		req.setAttribute("categories", categoryService.findAll());
		req.setAttribute("news",newService.findByCategoryId(code));
		RequestDispatcher rd = req.getRequestDispatcher("views/web/home.jsp");
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
