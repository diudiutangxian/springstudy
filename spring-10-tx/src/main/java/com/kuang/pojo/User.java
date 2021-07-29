package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.ibatis.annotations.ConstructorArgs;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;

}
