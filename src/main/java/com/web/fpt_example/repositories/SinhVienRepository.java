
package com.web.fpt_example.repositories;

import com.web.fpt_example.models.SinhVien;
import com.web.fpt_example.models.TotNghiep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, String> {
}
