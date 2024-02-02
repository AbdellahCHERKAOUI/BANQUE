package com.example.BANQUE.DAO;

import com.example.BANQUE.ENTITY.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface OperationRepository extends JpaRepository<Operation,Long> {
    @Query("select o from Operation o where o.compte.codecompte=:x order by o.dateopertion desc")
    public List<Operation> listoperation(@Param("x")String codecompte/*, Pageable pageable*/);
}
