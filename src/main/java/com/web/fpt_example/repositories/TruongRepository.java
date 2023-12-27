
package com.web.fpt_example.repositories;

import com.web.fpt_example.models.TotNghiep;
import com.web.fpt_example.models.Truong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruongRepository extends JpaRepository<Truong, String> {


}
