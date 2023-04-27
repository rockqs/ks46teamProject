package ks46team01.admin.info.controller;

import ks46team01.admin.info.entity.Admin;
import ks46team01.admin.info.service.AdminService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@AllArgsConstructor
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    @GetMapping("/listAdmin")
    public String adminList(Model model) {
        List<Admin> adminList = adminService.getAllAdmins();
        model.addAttribute("adminList", adminList);
        log.info("adminList={}", adminList);
        return "admin/listAdmin";
    }

    @GetMapping("/addAdmin")
    public String showAddAdminForm(Model model) {
        model.addAttribute("admin", new Admin());
        log.info("관리자 추가 양식 표시");
        return "admin/addAdmin";
    }

    @PostMapping("/addAdmin")
    public String addAdmin(@ModelAttribute Admin admin) {
        adminService.addAdmin(admin);
        log.info("Admin: {}", admin);
        return "redirect:/admin/listAdmin";
    }

}


