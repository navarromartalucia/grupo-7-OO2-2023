package com.unla.grupo7.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo7.entities.Prestamo;

//import com.unla.grupo7.helpers.ViewRouteHelper;

@Controller
@RequestMapping("/prestamo")
public class PrestamoController {
    
    @GetMapping("")
    public ModelAndView index(){
        //ModelAndView maV = new ModelAndView(ViewRouteHelper.INDEX);
        ModelAndView maV = new ModelAndView("prestamo/index");
        return maV;
    }
    @GetMapping("/misprestamos")
    public ModelAndView misprestamos(){
        //ModelAndView maV = new ModelAndView(ViewRouteHelper.INDEX);
        ModelAndView maV = new ModelAndView("prestamo/mis_prestamos");
        return maV;
    }
    @GetMapping("/misprestamos/{id}")
    public ModelAndView misprestamos(@PathVariable("id") int id){
        ModelAndView maV = new ModelAndView("prestamo/mis_prestamos");
        List<Prestamo> prestamos = new ArrayList<Prestamo>();
        prestamos.add(new Prestamo(123));
        prestamos.add(new Prestamo(456));
        prestamos.add(new Prestamo(789));
        prestamos.add(new Prestamo(012));
        maV.addObject("id", id);
        maV.addObject("prestamos", prestamos);
        return maV;
    }
}

