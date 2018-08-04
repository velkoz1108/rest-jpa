package com.velkoz.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author : want
 * @Team Home
 * @date : 2018-8-4 16:39 星期六
 */
@Data
@Entity
public class People {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String info;
}
