package com.energizeglobal.sqlgenerator.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CryptoConfig")
public class CryptoConfig {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "cryptoConfigEntity")
    @JsonIgnore
    private List<SubIssuer> linkedSubIssuers = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<SubIssuer> getLinkedSubIssuers() {
        return linkedSubIssuers;
    }

    public void setLinkedSubIssuers(List<SubIssuer> linkedSubIssuers) {
        this.linkedSubIssuers = linkedSubIssuers;
    }
}
