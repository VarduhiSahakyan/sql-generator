package com.energizeglobal.sqlgenerator.repository;

import org.springframework.stereotype.Repository;
import com.energizeglobal.sqlgenerator.domain.SubIssuer;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface SubIssuerRepository extends JpaRepository<SubIssuer,Long> {

}
