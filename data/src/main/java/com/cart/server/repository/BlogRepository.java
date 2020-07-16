
package com.cart.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.server.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
