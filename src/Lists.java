import java.util.ArrayList;
import java.util.List;


public class Lists {

    public static void main(String[] args) {
        List<Imprimivel> lista = new ArrayList<>();
        Impressora impressora = new Impressora();
        Contrato contrato = new Contrato("Contrato","PDF");
        Foto foto= new Foto("Foto","JPG");
        Documento documento = new Documento("Documento","DOCX");

        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(foto);
        impressora.adicionarImprimivel(documento);
        impressora.imprimirTudo();

    }
}
