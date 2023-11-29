package dio.gof.facade;

import dio.subsistema1.crm.CRMService;
import dio.subsistema2.cep.CEP_API;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CEP_API.getInstance().recuperarCidade(cep);
        String estado = CEP_API.getInstance().recuperarEstado(cep);

        CRMService.gravarCliente(nome, cep, cidade, estado);
    }

}
