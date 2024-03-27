package com.mock.main.project.mock.Repositories;

import com.mock.main.project.mock.Entites.Bases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository extends JpaRepository<Bases, Long> {
}
