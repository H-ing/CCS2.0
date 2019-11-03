package app.entity;

import java.util.List;

import lombok.Data;

@Data
public class User {
	private String username;
    private String password;
    private String salt;
    private List<String> permis;
}

