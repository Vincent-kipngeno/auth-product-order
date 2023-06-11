package com.example.SpringAngularAuth.repo;

import com.example.SpringAngularAuth.dto.UserInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.hibernate.procedure.ProcedureOutputs;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class UserInfoRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<UserInfo> getUerInfo() {
        List<UserInfo> list = new ArrayList<>();
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("USER_INFO", "UserInfo");
        try {
            // Execute query
            query.execute();
            list = query.getResultList();
        } finally {
            try {
                query.unwrap(ProcedureOutputs.class).release();
            } catch (Exception e) {
            }
        }
        return list;
    }
}
