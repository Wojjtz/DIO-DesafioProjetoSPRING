package dio.subsistema2.cep;

public class CEP_API {
    private static CEP_API instancia = new CEP_API();

    private CEP_API(){
        super();
    }

    public static CEP_API getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Ouro Branco";
    }

    public String recuperarEstado(String cep){
        return "MG";
    }
}
