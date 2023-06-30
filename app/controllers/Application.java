package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void Vista3() {
        List<Menu> menu = Menu.findAll();
        System.out.println(menu);
        render(menu);
    }

    public static void Menu() {

        List<Menu> menus = Menu.findAll();

        render(menus);
    }

    public static void index() {
        Personas persona = Personas.findById(10L);
        List<Personas> personas = Personas.find("Nombre = ?", "Denisse").fetch();
        System.out.println("persona" + persona);
        List<Alumnos> alumnos = Alumnos.find("matricula = ?", "00524").fetch();
        render(persona);
    }

    public static void Alumnos() {
        List<Alumnos> alumnos = Alumnos.find("matricula = ?", "00524").fetch();
        render(alumnos);
    }

    public static void Informacionalumno() {
        render();
    }

    public static void Resultadoconsulta(String matricula) {
        List<Historialalumnos> historialalumnos = Historialalumnos.find("alumno.matricula= ?", matricula).fetch();
        System.out.println("historialalumnos" + historialalumnos);
        render(historialalumnos);

    }

    public static void Vista1() {
        List<Periodo> periodo = Periodo.findAll();
        List<Grupos> Grupo2 = Grupos.findAll();
        render(periodo, Grupo2);
    }

    public static void Vista2(String grupo) {
        Grupos grupoa = Grupos.find("Nombre=?", grupo).first();
        List<Historialalumnos> alumnos = Historialalumnos.find("grupo.Nombre= ?", grupo).fetch();

        render(grupoa, alumnos);
    }

    public static void GuardarPersona(String nombre, String apellidopaterno, String apellidomaterno, String matricula, String grupo, int periodo) {
        Personas persona1 = new Personas();
        persona1.Activo = true;
        persona1.ApellidoMaterno = apellidomaterno;
        persona1.ApellidoPaterno = apellidopaterno;
        persona1.Nombre = nombre;
        persona1.save();
        Alumnos alumno1 = new Alumnos();
        alumno1.Persona = persona1;
        alumno1.activo = true;
        alumno1.matricula = matricula;
        alumno1.save();
        Historialalumnos historialalumno1 = new Historialalumnos();
        historialalumno1.alumno = alumno1;
        historialalumno1.activo = true;
        Periodo periodos1 = Periodo.findById(2L);
        historialalumno1.Periodo = periodos1;
        Grupos grupo1 = Grupos.find("Nombre=?", grupo).first();
        historialalumno1.grupo = grupo1;
        historialalumno1.save();
        render(persona1, alumno1, historialalumno1, grupo1);
    }
}
