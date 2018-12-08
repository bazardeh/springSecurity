package ir.ahmadi.springProject.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

//    @Autowired
//    StudentService studentService;
//
//    @Autowired
//    StudentRepository studentRepository;
//
//    @Autowired
//    DataInsertRepository dataInsertRepository;

//    @RequestMapping(value = "/finderDataTable", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public String finderDataTable() {
//        try {
//            List<DataInsert> allDataInsert = dataInsertRepository.findAll();
//            return new Gson().toJson(allDataInsert);
//        } catch (Exception ee) {
//            ee.printStackTrace();
//            return "Error";
//        }
//    }
//
//    @RequestMapping(value = "/find", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public String processFind() {
//        try {
//            Gson gson = new Gson();
//
//            List<Student> allStudent = studentService.findAllStudent();
//            String gsonString = gson.toJson(allStudent);
//            return gsonString + "\n\n\n\t\t Count All Student : " + studentService.countAllStudent().toString();
//
//        } catch (Exception ee) {
//            ee.printStackTrace();
//            return "Error";
//        }
//    }
//
//    @RequestMapping(value = "/finder")
//    public String finder() {
//        try {
//            Gson gson = new Gson();
//
//            List<Student> allStudent = studentService.findAllStudent();
//            String gsonString = gson.toJson(allStudent);
//            return gsonString;
//
//        } catch (Exception ee) {
//            ee.printStackTrace();
//            return "Error";
//        }
//    }
//
//
//    @RequestMapping("/save")
//    public String processSave(@RequestParam("name") String name, @RequestParam("lastname") String lastname) {
////        http://localhost:8080/save?name=%22farashad%22&lastname=%22sarhandi%22
//        try {
//            name = name.trim();
//            lastname = lastname.trim();
//            System.out.println("\nname = " + name + " lastname = " + lastname);
//            if (name != null && lastname != null) {
//                studentRepository.save(new Student(name, lastname));
//                return "Save Ok \n\n\n\t\t Count All Student : " + studentService.countAllStudent().toString();
//            }
//            return "Not save Ok";
//        } catch (Exception ee) {
//            ee.printStackTrace();
//            return "Error save";
//        }
//    }
}

