package com.energizeglobal.sqlgenerator.domain;

import javax.persistence.*;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "Issuer")
public class Issuer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    String code;

    @Column(name = "createdBy")
    String createdBy;

    @CreatedDate
    @Column(name = "creationDate", updatable = false)
    private Instant creationDate = Instant.now();

    @Column
    String description;

    @Column(name = "lastUpdateBy")
    String lastUpdateBy;

    @CreatedDate
    @Column(name = "lastUpdateDate", updatable = false)
    private Instant lastUpdateDate = Instant.now();

    @Column
    String name;

    @Column(name = "updateState")
    String updateState;

    @Column
    String label;

    @Column(name = "availaibleAuthentMeans")
    String availaibleAuthentMeans;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "issuer")
    private List<SubIssuer> subIssuers;


//
//        public List<SubIssuer> getSubIssuers() {
//        return subIssuers != null ? Collections.unmodifiableList(subIssuers) : null;
//    }
//
//    public void setSubIssuers(List<SubIssuer> subIssuers) {
//        if (subIssuers != null) {
//            this.subIssuers = subIssuers.stream().collect(Collectors.toList());
//        } else {
//            this.subIssuers = null;
//        }
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Instant getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Instant lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdateState() {
        return updateState;
    }

    public void setUpdateState(String updateState) {
        this.updateState = updateState;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAvailaibleAuthentMeans() {
        return availaibleAuthentMeans;
    }

    public void setAvailaibleAuthentMeans(String availaibleAuthentMeans) {
        this.availaibleAuthentMeans = availaibleAuthentMeans;
    }
}
