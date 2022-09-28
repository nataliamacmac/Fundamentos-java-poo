public class Pessoas {

    public static void main(String[] args) {
        
        Fisica fis = new Fisica();

        fis.nome = "Natalia";
        fis.cpf = "000000000000";
        fis.identidade = "153486";
        fis.situacaoPessoa = "A";

        Juridica jur = new Juridica();
        jur.nome = "BELISSI";
        jur.cnpj = "14559452455";
        jur.inscEstadual = "4622666131";
        jur.situacaoPessoa = "I";

        System.out.println("Dados da Pessoa Fisica");
        System.out.println(fis.toString());
        System.out.println("Dados da Pessoa Juridica");
        System.out.println(jur.toString());
    }
    
}