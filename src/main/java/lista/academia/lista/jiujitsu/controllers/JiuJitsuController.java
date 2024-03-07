package lista.academia.lista.jiujitsu.controllers;


import lista.academia.lista.jiujitsu.Service.JiuJitsuService;
import lista.academia.lista.jiujitsu.doMain.JiuJitsu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jiujitsu")
public class JiuJitsuController {
    private final JiuJitsuService jiuJitsuService;

    public JiuJitsuController(JiuJitsuService jiuJitsuService, JiuJitsuService jiuJitsuService1){
        this.jiuJitsuService = jiuJitsuService1;
        jiuJitsuService =jiuJitsuService;
    }


    @GetMapping
    public ResponseEntity<List<JiuJitsu>> getJiuJitsu(){
        List<JiuJitsu> jiuJitsus = this.jiuJitsuService.getJiuJitsuFromLibriary();

        return ResponseEntity.ok().body(jiuJitsus);


    }
}
