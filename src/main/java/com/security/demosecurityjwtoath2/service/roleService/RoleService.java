package com.security.demosecurityjwtoath2.service.roleService;

import com.security.demosecurityjwtoath2.model.Role;



public interface RoleService {
    Iterable<Role> findAll();

    void save(Role role);

    Role findRoleByName(String name);
}
