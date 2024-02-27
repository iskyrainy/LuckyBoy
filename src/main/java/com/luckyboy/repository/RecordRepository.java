package com.luckyboy.repository;

import com.luckyboy.data.Record;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * className: RecordRepository
 * description:
 * author: wn
 * date: 2024/2/26
 **/
public interface RecordRepository extends JpaRepository<Record, Integer> {
}
