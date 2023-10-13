package entities;

public class Empresa {

    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String inscricaoEstadual;
    private String situacaoCnpj;
    private String situacaoIe;
    private String uf;
    private String cep;
    private String municipio;
    private String bairro;
    private String logradouro;
    private String complemento;
    private String numero;


    public Empresa(EmpresaConsulta empresaConsulta) {

        this.razaoSocial = empresaConsulta.nome_empresarial();
        this.nomeFantasia = empresaConsulta.nome_fantasia();
        this.cnpj = empresaConsulta.cnpj();
        this.inscricaoEstadual = empresaConsulta.inscricao_estadual();
        this.situacaoCnpj = empresaConsulta.situacao_cnpj();
        this.situacaoIe = empresaConsulta.situacao_ie();
        this.uf = empresaConsulta.uf();
        this.cep = empresaConsulta.cep();
        this.municipio = empresaConsulta.municipio();
        this.bairro = empresaConsulta.bairro();
        this.logradouro = empresaConsulta.logradouro();
        this.complemento = empresaConsulta.complemento();
        this.numero = empresaConsulta.numero();

    }

    @Override
    public String toString() {

        return "\n" +
               "Razão Social: " + this.razaoSocial + "\n" +
               "UF: " + this.uf + "\n" +
               "CNPJ: " + this.cnpj + ", IE: " + this.inscricaoEstadual + "\n" +
               "\n" +
               "Situação CNPJ: " + this.situacaoCnpj + ", Situação IE: " + this.situacaoIe + "\n" +
               "\n" +
               "Municipio: " + this.municipio + ", UF: " + this.uf + "\n" +
               "Logradouro: " + this.logradouro + ", Nro: " + this.numero + "\n" +
               "Bairro: " + this.bairro + "\n" +
               "CEP: " + this.cep +
               "\n";

    }
}
