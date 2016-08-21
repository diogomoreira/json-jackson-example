package br.edu.ifpb.padroes.json;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by diogomoreira on 21/08/16.
 */
/*
    A anotação @JsonTypeInfo serve para configurar como as informações
     de tipos serão serializadas e deserializadas no JSON.
     Neste caso, estamos pedindo para que ele utilize uma propriedade "type" para
     guardar as informações sobre qual tipo concreto precisamos instanciar ao deserializar.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
/*
    Com @JsonSubTypes, vamos mapear as possíveis classes concretas.
    Execute este exemplo e verá que existe um atributo chamado "type" dentro de Endereço
    que tem como valor "endimpl". Isso indica que a classe "Endereco" deve ser a
     escolhida na hora da deserialização
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = Endereco.class, name = "endimpl"),
        @JsonSubTypes.Type(value = EnderecoNuloImpl.class, name = "endnuloimpl")})
public interface IEndereco {
    String getRua();

    void setRua(String rua);

    String getBairro();

    void setBairro(String bairro);

    String getCidade();

    void setCidade(String cidade);

    String getEstado();

    void setEstado(String estado);

    String getCep();

    void setCep(String cep);
}
