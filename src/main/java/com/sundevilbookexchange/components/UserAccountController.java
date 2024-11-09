package com.sundevilbookexchange.components;

import com.sundevilbookexchange.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserAccountController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin/manage-accounts")
    public String showManageAccounts(Model model) {
        // Use the injected userService to fetch user data
        model.addAttribute("buyers", userService.getAllBuyers());
        model.addAttribute("sellers", userService.getAllSellers());
        return "manage_accounts";
    }

    @PostMapping("/admin/delete-account")
    public String deleteAccount(@RequestParam("userId") Long userId) {
        userService.deleteUserById(userId);
        return "redirect:/admin/manage-accounts";
    }
}
