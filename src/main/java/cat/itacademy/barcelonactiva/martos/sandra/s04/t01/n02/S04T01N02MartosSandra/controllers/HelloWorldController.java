package cat.itacademy.barcelonactiva.martos.sandra.s04.t01.n02.S04T01N02MartosSandra.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public static String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom){
        return "Hola, " + nom + ". Estàs executant un projecte Gradle";
    }
    @GetMapping(value = {"/HelloWorld2/{nom}", "/HelloWorld2"})
    public static String saluda2(@PathVariable(required = false) String nom){
        if(nom != null){
            return "Hola, " + nom + ". Estàs executant un projecte Gradle";
        }
        else{
            return "Hola, estàs executant un projecte Maven";
        }
    }
}
