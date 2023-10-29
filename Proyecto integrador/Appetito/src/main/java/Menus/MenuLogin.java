package Menus;/*MODULO: Menu Principal--------------------------------------------------------------------------------------------------------menu principal */


import Carrito.Carrito;
import Carrito.FinalizarCompra;
import Utilidades.ConectorLogin;


import java.util.Scanner;


public class MenuLogin {

    public static String[][] Usuarios = new String[12][2];
    public static int X = 0;
    public static int I = 0;
    public static boolean VC = false;
    public static boolean C = false;
    private  MenuPrincipal menuPrincipal;
    private  Carrito carrito;
    String prueba = "prueba BASE";
    public String getPrueba() {
        return prueba;
    }


    public MenuLogin( Carrito carrito) {
        this.carrito = carrito;
    }

    public static void Guardar(String Usuario, String Contrasena, String Pago, String Direccion, String Telefono, String Correo) {
        Usuarios[0][0] = "Nombre de usuario = ";
        Usuarios[0][1] = Usuario;

        Usuarios[1][0] = "Contraseña = ";
        Usuarios[1][1] = Contrasena;

        Usuarios[2][0] = "Medio de pago = ";
        Usuarios[2][1] = Pago;

        Usuarios[3][0] = "Dirección = ";
        Usuarios[3][1] = Direccion;

        Usuarios[4][0] = "Número de teléfono = ";
        Usuarios[4][1] = Telefono;

        Usuarios[5][0] = "Correo electrónico = ";
        Usuarios[5][1] = Correo;
// usuario defaul de pruebas
        Usuarios[6][0] = "Nombre de usuario Admin = ";
        Usuarios[6][1] = Usuario;

        Usuarios[7][0] = "Contraseña Admin = ";
        Usuarios[7][1] = Contrasena;

        Usuarios[8][0] = "Medio de pago Admin = ";
        Usuarios[8][1] = "Efectivo";

        Usuarios[9][0] = "Dirección Admin = ";
        Usuarios[9][1] = "Publica N° 1";

        Usuarios[10][0] = "Número de teléfono Admin = ";
        Usuarios[10][1] = "2604123456";

        Usuarios[11][0] = "Correo electrónico Admin = ";
        Usuarios[11][1] = "admin@appetito.com";
    }

    public static boolean ValidarCorreo(String Correo, int I) {
        int Arroba, Punto;
        boolean C = false;

        for (int i = 0; i < Correo.length(); i++) {
            if (Correo.charAt(i) == '@') {
                if (i + 1 < Correo.length() && Correo.charAt(i + 1) != '.') {
                    C = true;
                }
            }
        }
        return C;
    }

    public static boolean Validar(String Contrasena, int I, int X) {
        boolean V, Digito, Mayus, CE;
        String Num = "0123456789";
        String Especial = "!@#$%^&*(),.?{}|<>";

        Digito = false;
        Mayus = false;
        CE = false;

        V = false;

        if (Contrasena.length() >= 6 && Contrasena.length() <= 20) {
            for (X = 0; X < Contrasena.length(); X++) {
                for (I = 0; I < Num.length(); I++) {
                    if (Contrasena.charAt(X) == Num.charAt(I)) {
                        Digito = true;
                    }
                }

                if (Contrasena.charAt(X) >= 'A' && Contrasena.charAt(X) <= 'Z') {
                    Mayus = true;
                }

                for (I = 0; I < Especial.length(); I++) {
                    if (Contrasena.charAt(X) == Especial.charAt(I)) {
                        CE = true;
                    }
                }
            }

            if (Digito && Mayus && CE) {
                V = true;
            } else {
                V = false;
            }
        }

        return V;
    }

    public void menuLogin(String procedencia) {
        String Usuario, Contrasena, Pago, Direccion, Telefono, Correo, UsuarioAdm, ContrasenaAdm;
        int Op;

        Scanner scanner = new Scanner(System.in);
        ConectorLogin conector = ConectorLogin.getInstance(null);
        FinalizarCompra finalizarCompra = new FinalizarCompra(carrito);

        Usuario = " ";
        Contrasena = " ";
        Pago = " ";
        Direccion = " ";
        Telefono = " ";
        Correo = " ";
        UsuarioAdm = "admin";
        ContrasenaAdm = "admin123#";

        do {
            System.out.println("=== Menú de Usuarios ===");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Iniciar sesión Admin");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            Op = scanner.nextInt();

            switch (Op) {
                case 1:
                    do {
                        System.out.println("=== Registro de usuario ===");
                        System.out.print("Ingrese el nombre de usuario: ");
                        Usuario = scanner.next();

                        if (Usuario.equals("admin")) {
                            System.out.println("El nombre de usuario ya ha sido utilizado. Ingrese uno distinto.");
                        } else {
                            System.out.print("Ingrese la contraseña (de 6 a 20 caracteres, combinación necesaria de mayúsculas, minúsculas, números y signos especiales. Ej: 'Hola123#'): ");
                            Contrasena = scanner.next();

                            System.out.print("Ingrese el medio de pago: ");
                            Pago = scanner.next();

                            System.out.print("Ingrese su dirección: ");
                            Direccion = scanner.next();
                            Direccion += scanner.next();
                            /* PROBLEMA EN INGRESO DE DIRECCIÓN CON ESPACIOS */

                            System.out.print("Ingrese su número de teléfono: ");
                            Telefono = scanner.next();

                            System.out.print("Ingrese su Correo electrónico: ");
                            Correo = scanner.next();

                            VC = Validar(Contrasena, I, X);
                            C = ValidarCorreo(Correo, I);
                        }

                        if (!Usuario.equals(" ") && !Contrasena.equals(" ") && !Pago.equals(" ") && !Direccion.equals(" ") && !Telefono.equals(" ") && !Correo.equals(" ")) {
                            if (VC && C) {
                                Guardar(Usuario, Contrasena, Pago, Direccion, Telefono, Correo);
                                System.out.println("Los datos han sido ingresados correctamente.");
                                System.out.println(" ");
                                break;
                            } else {
                                if (!VC) {
                                    System.out.println("La contraseña no cumple con los requisitos.");
                                }
                                if (!C) {
                                    System.out.println("El correo no ha sido ingresado correctamente.");
                                }
                                System.out.println("Por favor, ingrese los datos nuevamente.");
                                System.out.println("---------------------------------------");
                                System.out.println(" ");
                                break;
                            }
                        } else {
                            System.out.println("Datos ingresados incorrectamente.");
                        }
                        System.out.println(" ");
                        break;
                    } while (VC && C);
                    break;

                case 2:
                    if (!Usuario.equals(" ") && !Contrasena.equals(" ")) {
                        System.out.println("=== Iniciar sesión ===");
                        System.out.print("Ingrese su nombre de usuario: ");
                        String inputUsuario = scanner.next();
                        System.out.print("Ingrese su contraseña: ");
                        String inputContrasena = scanner.next();

                        if (Usuarios[0][1].equals(inputUsuario) && Usuarios[1][1].equals(inputContrasena)) {

                            if(!procedencia.equals("CC")){
                                    System.out.println("Inicio de sesión exitoso");
                                    System.out.println(" ");
                                    Op = 4;
                                    conector.setUsuarios(Usuarios);
                                    menuPrincipal.menuPrincipal();
                            }else{
                                System.out.println("Inicio de sesión exitoso");
                                System.out.println(" ");
                                conector.setUsuarios(Usuarios);

                                FinalizarCompra.imprimir(carrito.local,carrito.getListaCompra());
                                Op = 4;
                            }

                        } else {
                            System.out.println("Nombre de usuario o contraseña incorrectos");
                            System.out.println(" ");
                        }
                        System.out.println(" ");
                    } else {
                        System.out.println("No se ha agregado ningun usuario");
                        System.out.println(" ");
                    }
                    break;

                case 3:
                    System.out.println("=== Iniciar sesión (Admin) ===");
                    System.out.print("Ingrese su nombre de usuario Admin (admin): ");
                    String inputUsuarioAdmin = scanner.next();
                    System.out.print("Ingrese su contraseña Admin (admin123#): ");
                    String inputContrasenaAdmin = scanner.next();


                    if (inputUsuarioAdmin.equals("admin") && inputContrasenaAdmin.equals("admin123#")) {
                        Guardar(inputUsuarioAdmin, inputContrasenaAdmin, Pago, Direccion, Telefono, Correo);
                        Usuarios[0][1] = inputUsuarioAdmin;
                        Usuarios[1][1] = inputContrasenaAdmin;
                        conector.setUsuarios(Usuarios);
                        System.out.println("Inicio de sesión exitoso");
                        System.out.println(" ");
                        Op = 4;
                        conector.setUsuarios(Usuarios);
                        if ( !procedencia.equals("CC")){
                            menuPrincipal.menuPrincipal();
                        } else {
                            FinalizarCompra.imprimir(carrito.local,carrito.getListaCompra());
                        }
                    } else {
                        System.out.println("Nombre de usuario o contraseña incorrectos");
                        System.out.println(" ");
                    }
                    break;

                case 4:
                    salir();
                    break;

                default:
                    System.out.println("Opción no válida");
                    System.out.println(" ");
                    break;
            }
        } while (Op != 4);
    }

    public static String[][] getUsuarios() {
        return Usuarios;
    }
    public MenuLogin(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    public static void salir() {
        System.out.println("Saliendo del programa...");
        System.exit(0);
    }
}
    

