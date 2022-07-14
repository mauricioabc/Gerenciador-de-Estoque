package sys.Model;

import java.io.Serializable;

public abstract class User implements Serializable{
    
    private String user;
    private String senha;

    public User(String user, String senha) {
        this.user = user;
        this.senha = senha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "User{" + "user=" + user + ", senha=" + senha + '}';
    }
    
}
