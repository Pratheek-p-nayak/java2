package rest1.java2.pkg1;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class P1 {
    @GetMapping("/hello")
    public String printHello() {
        return "Hello Pratheek";
    }

    @GetMapping("/names")
    public List<String> printNames() {
        var names = List.of("Pratheek", "Rakesh", "CS", "Shiva");
        return names;
    }

}
