package com.velkoz.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author : want
 * @Team Home
 * @date : 2018-8-4 13:46 星期六
 */
@Data
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer age;

    private String address;
}
