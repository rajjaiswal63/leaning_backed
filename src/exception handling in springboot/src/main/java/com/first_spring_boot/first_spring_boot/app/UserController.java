package com.first_spring_boot.first_spring_boot.app;

import com.first_spring_boot.first_spring_boot.User;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController{
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public ResponseEntity<UsersInApp>createUser(@RequestBody UsersInApp usersInApp){
        UsersInApp usercreated=UserService.createuser(usersInApp);
        return ResponseEntity.status(HttpStatus.CREATED) .body(usercreated);
    }

    @PutMapping
    public ResponseEntity<UsersInApp> updateUser(@RequestBody UsersInApp usersInApp){
            UsersInApp userupdated= UserService.update(usersInApp);
            return ResponseEntity.status(HttpStatus.OK).body(userupdated);

    }
    @DeleteMapping("/{roll}")
    public ResponseEntity<String> deleteUser(@PathVariable int roll) {
    boolean delete=UserService.delete(roll);
        if (!delete) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("User not found");
        }
        return ResponseEntity.ok("User deleted");
    }


    @GetMapping
    public List<UsersInApp> getuser(){
        List<UsersInApp> userdata=UserService.getdata();
        return userdata;
    }

    @GetMapping("/{roll}")
    public ResponseEntity<UsersInApp> getOneUser(@PathVariable int roll){
        UsersInApp user=UserService.getbyroll(roll);
        if (user==null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{roll}/order/{orderid}")
    public ResponseEntity<UsersInApp> getOneUser(
            @PathVariable int roll,
            @PathVariable int orderid
    ){
        UsersInApp user=UserService.getorder(roll,orderid);
        if (user==null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @GetMapping("/search")
    public ResponseEntity<List<UsersInApp>> search(
            @RequestParam(required = false, defaultValue = "no name") String name){
       List<UsersInApp>search=UserService.search(name);
        return ResponseEntity.ok(search);
    }
    // developed search api (same as previous)
    @GetMapping("/search2")
    public ResponseEntity<List<UsersInApp>> search2(
            @RequestParam(required = false) String name){
        List<UsersInApp>search=UserService.search2(name);
        return ResponseEntity.ok(search);
    }



//     Exception handling method for more than one
//    @ExceptionHandler(IllegalArgumentException.class)
//    public ResponseEntity<Map<String, Object>>handleIllegalArguments2(
//            IllegalArgumentException exception
//    ){
//        Map<String,Object> errorResponse=new HashMap<>();
//        errorResponse.put("message",exception.getMessage());
//        errorResponse.put("time", LocalDateTime.now());
//        errorResponse.put("message",exception.getMessage());
//        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
//    }
}
