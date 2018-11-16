package com.bud.test.userorg.remote;


import com.bud.test.userorg.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-07-31
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
