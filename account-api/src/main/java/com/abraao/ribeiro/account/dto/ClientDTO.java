package com.abraao.ribeiro.account.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class ClientDTO implements Serializable {

    private String name;

    private String cpf;

    private AddressDTO address;

}
