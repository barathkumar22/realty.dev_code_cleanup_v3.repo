package com.example.realty.requirementrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository

public interface Requirementrepo extends JpaRepository <Requirementrepo,Long> {

    @Query("SELECT u FROM Feature u WHERE u.status = 1")
    List<Requirementrepo> findAllRequirement();

    @Query("UPDATE Requirement c SET c.Requirement = :Requirement WHERE c.id = :RequirementId")
    List updatepublishRequirement(@Param("RequirementId") String[] RequirementId);
   // int updateRequirement(@Param("RequirementId") int RequirementId,@Param("Requirement") String Requirement);

    @Query ("UPDATE Requiremnet c SET c.Requirement = :Requirement WHERE c.id = :RequirementId")
    List updateunPublishRequirement(@Param("RequirementId") String[] RequirementId);

    @Query ("SELECT u FROM Requirement u WHERE u.status = 1")
    Collection<Requirementrepo> save(Long a);

    @Query("SELECT u FROM Requirement u WHERE u.status = 1")
    Collection<Requirementrepo> delete(Long a);

    @Query("UPDATE SubRequirement c SET c.SubRequirement = :SubRequirement WHERE c.id = :SubRequirementId")
    int updateSubRequirement(@Param("SubRequirementId") int SubRequirementId, @Param("SubRequirement") String Requirement);

    @Query("UPDATE Requirement c SET c.Requirement = :Requirement WHERE c.id = :RequirementId")
    List updateRequirement(@Param("RequirementId") Requirementrepo RequirementId);


    //void update(Long valueOf);

}

