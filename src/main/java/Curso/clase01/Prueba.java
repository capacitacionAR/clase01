package Curso.clase01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Prueba {
    @GetMapping("/")
    public String hola(){
        return "Hola";
    }

    @GetMapping("/n")
    public int numero(){
        return 42;
    }
    @GetMapping("/v")
    public int[] vector(){
        return new Random().ints(100,1000).limit(20).toArray();
    }
    int contador = 0;
    @GetMapping("/contador")
        public int contador(){
        return ++contador;
    }
    @GetMapping("/p")
    public Persona[] per(){
        Persona p = new Persona(1111,"juan","perez");
        return new Persona[]{p,p,p,p,p,p,p};
         //new Persona(1111,"juan","perez");
    }
    @GetMapping("sumar/{s1}/{s2}")
    public int sumar(@PathVariable int s1, @PathVariable int s2){
        return s1 + s2;
    }

}
