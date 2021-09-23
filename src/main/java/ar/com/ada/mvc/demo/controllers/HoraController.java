package ar.com.ada.mvc.demo.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.com.ada.mvc.demo.models.UserInfo;


@Controller // a diferencia de Rest API, aca son controller y no Restcontroller
@RequestMapping("/hora") // coloca el requestmapping a nivel general
public class HoraController {
  
    //ruta .html se puede poner lo que quiera
   @GetMapping("/ver-hora-actual") 
   //el metodo es String por que devuelve la vista a procesar
   public String getHoraActual(Model model){
     UserInfo userInfo = new UserInfo();
     userInfo.nombre ="Victoria";
     userInfo.apellido = "Penaloza";
     
     model.addAttribute("usuario", userInfo);
     model.addAttribute("hora", "La hora actual en este momento es: "+ (new Date()).toString());
       return "hora-actual"; // esta es la vista(buscara en la carpeta templates hora-actual)
   }


}
