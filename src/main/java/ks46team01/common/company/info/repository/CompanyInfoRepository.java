package ks46team01.common.company.info.repository;

import ks46team01.admin.company.entity.Company;
import ks46team01.admin.inventory.entity.Inventory;
import ks46team01.common.company.info.entity.CompanyInfo;
import ks46team01.user.info.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyInfoRepository
        extends JpaRepository<CompanyInfo, Long> {

    List<CompanyInfo> findAll();

    CompanyInfo findByUsername(User user);

    List<CompanyInfo> findByCompanyIdx(Company companyInfo);

    List<CompanyInfo> findByInventoryIdx(Inventory companyInfo);
}