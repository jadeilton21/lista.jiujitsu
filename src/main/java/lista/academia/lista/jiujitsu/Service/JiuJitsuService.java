package lista.academia.lista.jiujitsu.Service;

import lista.academia.lista.jiujitsu.doMain.JiuJitsu;
import lista.academia.lista.jiujitsu.feinCliente.JiuJitsuCliente;
import lista.academia.lista.jiujitsu.response.JiuJitsuListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JiuJitsuService {

    @Autowired
    public final JiuJitsuCliente jiuJitsuCliente;



    public JiuJitsuService(JiuJitsuService jiuJitsuService){
        jiuJitsuService = jiuJitsuService;
    }

    public List<JiuJitsu> getJiuJitsuFromLibriary() {

        JiuJitsuListResponse response = this.jiuJitsuCliente.getCidade();

        return response.getCidadeList();
    }
}
