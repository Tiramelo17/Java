public class MesException extends RuntimeException{
    String mes;

    public MesException(String atributo) {
        this.mes = atributo;
    }
    
    public String getMessage(){
        return String.format("Exceção gerada pelo atributo " + mes);
    }
}
