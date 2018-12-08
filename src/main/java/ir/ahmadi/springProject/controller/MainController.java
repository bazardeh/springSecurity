package ir.ahmadi.springProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    //    @RequestMapping(value = {"/", "/login"})
    @RequestMapping(path = "/")
    public String showLoginPage() {
        return "loginPage2";
    }

    @RequestMapping(path = "/table")
    public String table() {
        return "table";
    }

    @RequestMapping(path = "/admin")
    public String b() {
        return "home";
    }

    @RequestMapping(path = "/main")
    public String c() {
        return "main";
    }

    @RequestMapping(path = "/barStudent")
    public String barStudent() {
        return "barStudent";
    }

    @RequestMapping(path = "/loginPage2")
    public String loginPage2() {
        return "loginPage2";
    }

    @RequestMapping(path = "/homePage")
    public String homePage() {
        return "homePage";
    }

//    @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
//    public String welcomePage(Model model) {
//        model.addAttribute("title", "Welcome");
//        model.addAttribute("message", "This is welcome page!");
//        return "welcomePage";
//    }
//
//    @RequestMapping(value = "/admin", method = RequestMethod.GET)
//    public String adminPage(Model model, Principal principal) {
//
//        User loginedUser = (User) ((Authentication) principal).getPrincipal();
//
//        String userInfo = WebUtils.toString(loginedUser);
//        model.addAttribute("userInfo", userInfo);
//
//        return "adminPage";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String loginPage(Model model) {
//
//        return "loginPage";
//    }
//
//    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
//    public String logoutSuccessfulPage(Model model) {
//        model.addAttribute("title", "Logout");
//        return "logoutSuccessfulPage";
//    }
//
//    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
//    public String userInfo(Model model, Principal principal) {
//
//        // After user login successfully.
//        String userName = principal.getName();
//
//        System.out.println("User Name: " + userName);
//
//        User loginedUser = (User) ((Authentication) principal).getPrincipal();
//
//        String userInfo = WebUtils.toString(loginedUser);
//        model.addAttribute("userInfo", userInfo);
//
//        return "userInfoPage";
//    }
//
//    @RequestMapping(value = "/403", method = RequestMethod.GET)
//    public String accessDenied(Model model, Principal principal) {
//
//        if (principal != null) {
//            User loginedUser = (User) ((Authentication) principal).getPrincipal();
//
//            String userInfo = WebUtils.toString(loginedUser);
//
//            model.addAttribute("userInfo", userInfo);
//
//            String message = "Hi " + principal.getName() //
//                    + "<br> You do not have permission to access this page!";
//            model.addAttribute("message", message);
//
//        }
//
//        return "403Page";
//    }

}