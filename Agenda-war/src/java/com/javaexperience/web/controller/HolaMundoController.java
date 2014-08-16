/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaexperience.web.controller;

import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author POSTGRADOS
 */
@Named(value = "holaMundoController")
@ViewScoped
public class HolaMundoController {
    private String nombre;
    private String saludo;
    public void saludar(){
        saludo="Hola "+nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    /**
     * Creates a new instance of HolaMundoController
     */
    public HolaMundoController() {
    }
    
}
