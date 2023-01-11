package com.ghostcz.walletback.repository;

import com.ghostcz.walletback.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IUserRepository extends JpaRepository <UserModel,Long> {


}
