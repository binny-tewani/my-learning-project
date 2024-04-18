package org.learning.dao;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class UsersDao {

    private Long id;

    @NotNull
    private String name;
}
