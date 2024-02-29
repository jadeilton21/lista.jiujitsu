package lista.academia.lista.jiujitsu.Service;

import lista.academia.lista.jiujitsu.feinCliente.JiuJitsuCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JiuJitsuService {

    @Autowired
    public final JiuJitsuCliente jiuJitsuCliente;



    public JiuJitsuService(JiuJitsuService jiuJitsuService){
        jiuJitsuService = jiuJitsuService;
    }
}
