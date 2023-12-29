package com.web.fpt_example.repositories;

import com.web.fpt_example.models.CongViec;
import com.web.fpt_example.models.TotNghiep;
import com.web.fpt_example.models.TotNghiepId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotNghiepRepository extends JpaRepository<TotNghiep, TotNghiepId> {
}
