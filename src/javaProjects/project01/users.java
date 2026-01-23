package javaProjects.project01;
import java.util.Set;
public class users {
    private String name;
    private boolean active;
    private Set<String> roles;

    public users(String name, boolean active, Set<String> roles) {
        this.name = name;
        this.active = active;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
