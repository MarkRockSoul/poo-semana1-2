public class SistemaMatricula {
    public static void main(String[] args) {

        Estudiante ana = new Estudiante();

        System.out.println("");
        System.out.println("######### Sistema de Matricula ###########");
        System.out.println("");

        ana.setNombres("Ana Karina");
        ana.setApellidos("Aguilar Condori");
        ana.setEdad(19);
        ana.setDni("42566321");
        ana.setEstaMatriculado(false);
        System.out.println(ana.informacionBasica());

        System.out.println("--------------------------------------------------");

        Estudiante kevin = new Estudiante("Kevin", "Perez Castro", "Ingenieria Industrial", 20, "N0051263", "45966582",
                true);

        System.out.println(kevin.informacionBasica(true));
        System.out.println("");
    }
}
