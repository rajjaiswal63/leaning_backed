package com.first_spring_boot.first_spring_boot.app;

import com.first_spring_boot.first_spring_boot.User;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
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

    @GetMapping("/{roll}")
    public ResponseEntity<UsersInApp> getOneUser(@PathVariable int roll){
        if (!db.containsKey(roll)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(db.get(roll));
    }

    @GetMapping("/{roll}/order/{orderid}")
    public ResponseEntity<UsersInApp> getOneUser(
            @PathVariable int roll,
            @PathVariable int orderid
    ){
        System.out.println("orderid = "+ orderid);
        if (!db.containsKey(roll)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(db.get(roll));
    }

    @GetMapping("/search")
    public ResponseEntity<List<UsersInApp>> search(
            @RequestParam(required = false, defaultValue = "no name") String name){
        System.out.println("searched name ="+name);
        return ResponseEntity.ok(new ArrayList<>(db.values()));


    }
    // developed search api (same as previous)
    @GetMapping("/search2")
    public ResponseEntity<List<UsersInApp>> search2(
            @RequestParam(required = false) String name){
        System.out.println("searched name ="+name);
        List<UsersInApp>users=db.values().stream()
                .filter(u->u.getName().equalsIgnoreCase(name))
                .toList();
        return ResponseEntity.ok(users);


    }
}
