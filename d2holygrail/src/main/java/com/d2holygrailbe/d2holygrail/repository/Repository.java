package com.d2holygrailbe.d2holygrail.repository;

import com.d2holygrailbe.d2holygrail.entity.Item1;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Item1,Long> {
}
