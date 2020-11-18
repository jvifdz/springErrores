package com.javierfernandez.springboot.error.app.controllers;


import com.javierfernandez.springboot.error.app.errors.UsuarioNoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;


@ControllerAdvice
public class ErrorHandlerController {
//poner llaves si quiuero añadir mas excepciones para un solo metodo no solo aritmetic exception
    @ExceptionHandler(ArithmeticException.class)
    public String aritmeticaError(Exception ex, Model model){

        model.addAttribute("error","Error de aritmética");
        model.addAttribute("message",ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp",new Date());
        return "error/generica";
    }

    @ExceptionHandler(NumberFormatException.class)
    //Se podria poner solo exception
    public String numeroFormatoError (NumberFormatException ex , Model model){

        model.addAttribute("error","Formato número inválido!!");
        model.addAttribute("message",ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp",new Date());

        return "error/numero-formato";
    }
    @ExceptionHandler(UsuarioNoEncontradoException.class)
    //Se podria poner solo exception
    public String usuarioNoEncontrado (UsuarioNoEncontradoException ex , Model model){

        model.addAttribute("error","Error usuario no encontrado");
        model.addAttribute("message",ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp",new Date());

        return "error/usuario";
    }


}
