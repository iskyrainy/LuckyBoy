package com.luckyboy.data;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

/**
 * className: Record
 * description:
 * author: wn
 * date: 2024/2/26
 **/
@Data
@Entity
@Table(name = "record")
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "lottery_string")
    private String lotteryString;
    @CreatedDate
    @Column(name = "create_time", updatable = false, nullable = false)
    private Date createTime;
}
