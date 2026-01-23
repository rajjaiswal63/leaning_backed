package javaProjects.project01;
import java.util.Set;
import java.util.*;
public class main {
    public static void main(String[] args) {
        List<users> user=new ArrayList<>();
        user.add(new users("Raj",true, new HashSet<>(Arrays.asList("manager", "cto", "cfo"))));
        user.add(new users("Rajan",true, new HashSet<>(Arrays.asList("ceo"))));
        user.add(new users("zyx",false, new HashSet<>(Arrays.asList("user", "cto"))));
        user.add(new users("grgr",true, new HashSet<>(Arrays.asList("user"))));

        // remove inactive user
//        Iterator<users> it= user.iterator();
//        while (it.hasNext()){
//            if(it.hasNext()==false){
//                it.remove();
//            }
//        }
        System.out.println("Active Users");
        for (users u:user){
            System.out.println(u.getName());
        }




    }
}
