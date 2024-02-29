package lista.academia.lista.jiujitsu.controllers;


import lista.academia.lista.jiujitsu.Service.JiuJitsuService;
import lista.academia.lista.jiujitsu.doMain.JiuJitsu;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jiujitsu")
public class JiuJitsuController {


    private final JiuJitsuService jiuJitsuService;

    public JiuJitsuController(JiuJitsuService jiuJitsuService){
        jiuJitsuService =jiuJitsuService;
    }


    @GetMapping
    public ResponseEntity<List<JiuJitsu>> getJiuJitsu(){

    }
}
