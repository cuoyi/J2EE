package com.crtb.oss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crtb.oss.model.TVersionstatus;

@Repository //ָ����ע�����һ���ֿ����DAO
public interface VersionStatusRepository extends JpaRepository<TVersionstatus, Integer> {
	
}
