/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaexperience.negocio.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author POSTGRADOS
 */
@Named(value = "agendaController")
@SessionScoped
public class AgendaController implements Serializable {
    private Contacto contacto=new Contacto();
    private Contacto contactoSeleccionado=new Contacto();
    private List<Contacto> listaContactos =new ArrayList<>();
    
    /**
     * Creates a new instance of AgendaController
     */
    public AgendaController() {
    
    
}
