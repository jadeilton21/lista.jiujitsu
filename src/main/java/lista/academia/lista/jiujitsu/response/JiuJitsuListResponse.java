package lista.academia.lista.jiujitsu.response;


import lista.academia.lista.jiujitsu.doMain.JiuJitsu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JiuJitsuListResponse {
    private List<JiuJitsu> jiuJitsusList;
}
