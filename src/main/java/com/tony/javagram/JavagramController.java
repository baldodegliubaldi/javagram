import org.springframework.stereotype.Controller;

public class JavagramController {
    
@Controller

@GetMapping("/")
public String getForm(Model model){
    return "sign-up";
}

@GetMapping("/result")
public String getResult(){
    return "result";
}

}
