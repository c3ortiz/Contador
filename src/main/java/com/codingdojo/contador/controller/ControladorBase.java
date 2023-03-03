package com.codingdojo.contador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ControladorBase {
    @GetMapping("/")
    public String index(HttpSession session){
        if(session.getAttribute("count") == null )
            session.setAttribute("count", 0);
        else
            session.setAttribute("count", ((Integer) session.getAttribute("count") + 1));
        return "index.jsp";
    }

    @GetMapping("/contador")
    public String mostrarCuenta(HttpSession session, Model model){
        Integer cuentaActual = session.getAttribute("count") == null ? 0 : (Integer) session.getAttribute("count");
        model.addAttribute("cuentaActual", cuentaActual);
        return "contador.jsp";
    }

    @GetMapping("/2")
    public String index2(HttpSession session){
        if(session.getAttribute("count") == null )
            session.setAttribute("count", 0);
        else
            session.setAttribute("count", ((Integer) session.getAttribute("count") + 2));
        return "index2.jsp";
    }

    @GetMapping("/reiniciar")
    public String reset(HttpSession session) {
        session.invalidate();
        return "redirect:/contador";
    }
}
