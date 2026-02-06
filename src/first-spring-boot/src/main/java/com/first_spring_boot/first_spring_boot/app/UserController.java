package com.first_spring_boot.first_spring_boot.app;

import com.first_spring_boot.first_spring_boot.User;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController{
    Map<Integer,UsersInApp> db=new HashMap<>();
    @PostMapping
    public ResponseEntity<UsersInApp>createUser(@RequestBody UsersInApp usersInApp){
        System.out.println(usersInApp.getRoll());
        db.putIfAbsent(usersInApp.getRoll(),usersInApp);
        return ResponseEntity.status(HttpStatus.CREATED) .body(usersInApp);
    }

    @PutMapping
    public ResponseEntity<UsersInApp> updateUser(@RequestBody UsersInApp usersInApp){
        if (!db.containsKey(usersInApp.getRoll())) {
            return ResponseEntity.notFound().build();
        }
        else {
            db.put(usersInApp.getRoll(), usersInApp);
            return ResponseEntity.status(HttpStatus.OK).body(usersInApp);
        }
    }
    @DeleteMapping("/{roll}")
    public ResponseEntity<String> deleteUser(@PathVariable int roll) {

        if (!db.containsKey(roll)) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("User not found");
        }

        db.remove(roll);
        return ResponseEntity.ok("User deleted");
    }


    @GetMapping
    public List<UsersInApp> getuser(){
        return new ArrayList<>(db.values());
    }
}
