package application;

public class Program {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Jorge", 25, "M");
        p[1] = new Pessoa("Patricia", 18, "F");

        l[0] = new Livro("Arrependimento verdadeiro", "Yeshua", 300,  p[0]);
        l[1] = new Livro("Meu primeiro emprego", "Julia Martins", 185, p[1]);
        l[1] = new Livro("Harry Potter", "J.K. Rowling", 1500, p[1]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].acancarPag();
        System.out.println(l[0].detalhes());
        System.out.println();

        System.out.println(l[1].detalhes());
    }
}
