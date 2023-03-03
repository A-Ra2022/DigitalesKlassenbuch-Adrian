package academy.mischok.MVCAusprobieren;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/Spielwiese")
    public String Spielwiese() {
        return "Spielwiese";
    }

    @GetMapping("/MicrosoftTeile")
    public String MicrosoftTeile() {
        return "MicrosoftTeile";
    }

    @GetMapping("/NeonLoop")
    public String NeonLoop(){
        return "NeonLoop";
    }
    @GetMapping("/NeonFloor")
    public String NeonFloor(){
        return "NeonFloor";
    }
    @GetMapping("/NeonLoading")
    public String NeonLoading(){
        return "NeonLoading";
    }
}