package com.luckyboy.data;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

/**
 * className: BasicData
 * description:
 * author: wn
 * date: 2024/2/26
 **/
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
public class BasicData {
    @Id
    @GeneratedValue
    private int id;

    @CreatedDate
    @Column(name = "createTime", updatable = false, nullable = false)
    private Date createTime;
}
