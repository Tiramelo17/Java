public class AnoException  extends RuntimeException{

    String ano;

    public AnoException(String ano) {
        this.ano = ano;
    }
    
    public String getMenssage(){
        return String.format("Exceção gerada pelo atributo " + ano);
    }
}
