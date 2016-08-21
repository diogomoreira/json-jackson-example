package br.edu.ifpb.padroes.json;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by diogomoreira on 21/08/16.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
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
