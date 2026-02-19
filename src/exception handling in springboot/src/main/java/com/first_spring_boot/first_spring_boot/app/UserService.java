package com.first_spring_boot.first_spring_boot.app;

import com.first_spring_boot.first_spring_boot.Exception.UserNotFoundException;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserService {
    static Map<Integer,UsersInApp> db=new HashMap<>();
    private static final Logger logger= LoggerFactory.getLogger(UserService.class);

    public static UsersInApp createuser(UsersInApp users) {
        logger.info("creating user---- info");
        logger.debug("creating user ----- debug");
        logger.trace("creating user ----- trace");
        logger.warn("creating user ----- warn");
        logger.error("creating user ----- errors");
        db.put(users.getRoll(),users);
        return users;
    }

    public static UsersInApp update(UsersInApp usersInApp) {
        if (!db.containsKey(usersInApp.getRoll())) {
          throw  new UserNotFoundException("user id not exist"+usersInApp.getRoll());
        }

            db.put(usersInApp.getRoll(), usersInApp);
            return usersInApp;

    }

    public static boolean delete(int roll) {
        if (!db.containsKey(roll)) return false;
        db.remove(roll);
        return true;
    }

    public static List<UsersInApp> getdata() {
        if (db.isEmpty()){
            logger.error("error when finding user");
            throw new NullPointerException("no user found-----------");
        }
        return new ArrayList<>(db.values());
    }

    public static UsersInApp getbyroll(int roll) {
        if (!db.containsKey(roll)) {
            return null;
        }
        return db.get(roll);
    }

    public static UsersInApp getorder(int roll, int orderid) {
        System.out.println("orderid = "+ orderid);
        if (!db.containsKey(roll)) {
            return null;
        }
        return db.get(roll);
    }

    public static List<UsersInApp> search(String name) {
        System.out.println("searched name ="+name);
        return new ArrayList<>(db.values());
    }



    public static List<UsersInApp> search2(String name) {
        System.out.println("searched name ="+name);
        List<UsersInApp>users=db.values().stream()
                .filter(u->u.getName().equalsIgnoreCase(name))
                .toList();
        return users;
    }


}
