package com.StatusAware.The.Status_Aware.In_Memory.User.Registry.UserController;

import com.StatusAware.The.Status_Aware.In_Memory.User.Registry.User;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/users")
public class Controller {
    HashMap<Integer, User> userdb=new HashMap<>();

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
            userdb.put(user.getId(), user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<User>updateuser(@PathVariable Integer id, @RequestBody User user){
        if(!userdb.containsKey(id)) return ResponseEntity.notFound().build();
        user.setId(id);
        userdb.put(id,user);
        return ResponseEntity.ok(user);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteuser(@PathVariable Integer id){
        if (!userdb.containsKey(id)) return ResponseEntity.notFound().build();
        userdb.remove(id);
        return ResponseEntity.noContent().build();
    }
}
