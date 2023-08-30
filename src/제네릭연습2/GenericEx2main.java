package 제네릭연습2;
//0830
public class GenericEx2main {
    public static void main(String[] args) {
        GenericPrint<Powder> powderPrint = new GenericPrint<>();
        powderPrint.setMaterial(new Powder());
        Powder powder = powderPrint.getMaterial();
        System.out.println(powder);
    }
}
