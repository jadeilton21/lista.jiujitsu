package lista.academia.lista.jiujitsu.feinCliente;

import lista.academia.lista.jiujitsu.response.JiuJitsuListResponse;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "jiujitsu-api",url = "")
public interface JiuJitsuCliente() {


    JiuJitsuListResponse getJiuJitsu();
}
