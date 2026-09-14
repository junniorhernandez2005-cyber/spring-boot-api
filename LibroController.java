 import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibroController {

    @PostMapping("/libros")
    public String crearLibro(@RequestBody Libro libro) {
        // La anotación @RequestBody mapea el JSON automáticamente a tu objeto Libro
        System.out.println("Título recibido de la petición: " + libro.getTitulo());
        System.out.println("Autor recibido de la petición: " + libro.getAutor());
        
        return "Mapeo exitoso. Libro: " + libro.getTitulo();
    }
}
