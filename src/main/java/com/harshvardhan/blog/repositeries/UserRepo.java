package com.harshvardhan.blog.repositeries;
import org.springframework.data.jpa.repository.JpaRepository;

import com.harshvardhan.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	

}
