package lista.academia.lista.jiujitsu.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JiuJitsuService {

    @Autowired
    privar final JiuJitsuCliente jiuJitsuCliente;



    public JiuJitsuService(JiuJitsuService jiuJitsuService){
        jiuJitsuService = jiuJitsuService;
    }
}
