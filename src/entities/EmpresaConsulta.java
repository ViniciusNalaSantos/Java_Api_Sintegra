package entities;

public record EmpresaConsulta(

    String nome_empresarial,
    String nome_fantasia,
    String cnpj,
    String inscricao_estadual,
    String situacao_cnpj,
    String situacao_ie,
    String uf,
    String cep,
    String municipio,
    String bairro,
    String logradouro,
    String complemento,
    String numero

) {}
