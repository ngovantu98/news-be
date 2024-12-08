package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vti.entity.News;
import java.util.List;


public interface INewsRepository extends JpaRepository<News, Integer> {

}
