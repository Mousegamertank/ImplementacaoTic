package br.com.unifacef.Implementacao.models;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "Admin")
public class Admin extends Users implements Serializable {
    public static final long serialVersionUID = -1465127544951190990L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean permission_create_adm;
    private boolean active;
}
