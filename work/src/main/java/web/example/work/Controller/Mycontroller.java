package web.example.work.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class Mycontroller {

    @GetMapping("/")
    public String home() {
        return "home";
    }
    

    @GetMapping("/bread")
    public String getMethodName() {
        return "bread";
    }

    @PostMapping("/bread/answer")
    public String breadAnswer(@RequestParam("breadname") String breadname,
                            @RequestParam("price") Integer price,
                            @RequestParam("num") Integer num, Model mo)
    {
        mo.addAttribute("breadname", breadname);
        mo.addAttribute("price", price*num);
        mo.addAttribute("num", num);
        return "breadAnswer";
    }
    
}
