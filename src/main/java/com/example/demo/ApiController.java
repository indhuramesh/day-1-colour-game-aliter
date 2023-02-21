package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class ApiController
{
	@RequestMapping("/show")
	public String getMyFav(HttpServletRequest req)
	{
		String colourname=req.getParameter("name");
		HttpSession session=req.getSession();
		session.setAttribute("displayColor", colourname);
		return "NewFile.jsp";
	}

}
