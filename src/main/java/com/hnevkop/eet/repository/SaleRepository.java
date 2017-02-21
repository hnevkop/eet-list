package com.hnevkop.eet.repository;

import com.hnevkop.eet.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    Sale save(Sale sale);

}
