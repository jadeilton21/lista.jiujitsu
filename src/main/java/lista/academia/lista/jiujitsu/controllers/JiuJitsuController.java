package lista.academia.lista.jiujitsu.controllers;


import lista.academia.lista.jiujitsu.Service.JiuJitsuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jiujitsu")
public class JiuJitsuController {


    private final JiuJitsuService jiuJitsuService;

    public JiuJitsuController(JiuJitsuService jiuJitsuService){
        jiuJitsuService =jiuJitsuService;
    }

}