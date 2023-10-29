package Utilidades;

public class ConectorLogin {
    private static ConectorLogin instance;
    private String[][] usuarios;

    private ConectorLogin(String[][] usuarios) {
        this.usuarios = usuarios;
    }

    public static ConectorLogin getInstance(String[][] usuarios) {
        if (instance == null) {
            instance = new ConectorLogin(usuarios);
        }
        return instance;
    }

    public String[][] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String[][] value) {
        usuarios = value;
    }
}

