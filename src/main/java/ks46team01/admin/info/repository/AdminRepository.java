package ks46team01.admin.info.repository;

import ks46team01.admin.info.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
    List<Admin> findAll();
    Optional<Admin> findByAdminUsername(String adminUsername);



}
