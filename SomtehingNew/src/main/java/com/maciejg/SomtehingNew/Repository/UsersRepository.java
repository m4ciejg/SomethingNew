package com.maciejg.SomtehingNew.Repository;

import com.maciejg.SomtehingNew.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
}
