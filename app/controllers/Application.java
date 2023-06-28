package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {
    public static void Vista3(){
        List <Menu>menu=Menu.findAll();
        System.out.println(menu);
    render (menu);
    }

   
     public static void Menu(){
      
    List<Menu> menus = Menu.findAll();

  
       render(menus);
    }
    public static void index() {
        Personas persona=Personas.findById(10L);
        List<Personas>personas=Personas.find("Nombre = ?", "Denisse").fetch();
        System.out.println("persona"+persona);
        List <Alumnos>alumnos=Alumnos.find("matricula = ?", "00524").fetch();
       render(persona);
    }
    public static void Alumnos(){
        List <Alumnos>alumnos=Alumnos.find("matricula = ?", "00524").fetch();
       render(alumnos);
    }
    public static void Informacionalumno(){
       render();
    }
    public static void Resultadoconsulta(String matricula){
     List<Historialalumnos>historialalumnos=Historialalumnos.find("alumno.matricula= ?", matricula).fetch();
        System.out.println("historialalumnos" + historialalumnos);
    render(historialalumnos);
    
    }
    public static void Vista1(){
    render();
    }
    public static void Vista2(String grupo){
        Grupos grupoa=Grupos.find("Nombre=?", grupo).first();
        List<Historialalumnos>alumnos=Historialalumnos.find("grupo.Nombre= ?", grupo).fetch();
        
    render(grupoa,alumnos);
    }
}