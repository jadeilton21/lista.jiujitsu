package lista.academia.lista.jiujitsu.feinCliente;

import lista.academia.lista.jiujitsu.response.JiuJitsuListResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jiujitsu-api",url = "")
public interface JiuJitsuCliente() {

    @GetMapping
    JiuJitsuListResponse getJiuJitsu();
}
