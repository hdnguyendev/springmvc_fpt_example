package com.web.fpt_example.repositories;

import com.web.fpt_example.models.CongViec;
import com.web.fpt_example.models.CongViecId;
import com.web.fpt_example.models.TotNghiepId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CongViecRepository extends JpaRepository<CongViec, CongViecId> {
}
