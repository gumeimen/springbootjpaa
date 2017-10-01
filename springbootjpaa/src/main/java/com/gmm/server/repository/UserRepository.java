package com.gmm.server.repository;

import com.gmm.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * 此接口继承CrudRepository,他有两个参数,
 * 参数一是持久化实体类名称;参数二是主键id的类型
 * Created by john on 2017-10-01.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
