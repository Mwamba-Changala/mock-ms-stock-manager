package com.mock.main.project.mock.Repositories;

import com.mock.main.project.mock.Entites.TradingName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TradingNameRepository extends JpaRepository<TradingName, Long> {

    List<TradingName> findByCustomerId(Long customerId);
}
