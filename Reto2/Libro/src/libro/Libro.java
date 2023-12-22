
package libro;

public class Libro {
    //atributos
    public String titulo;
    public String autor;
    public int ISBN;
    public int numeroPaginas;
    
    //constructor
    public Libro(String titulo, String autor, int ISBN, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }
    
    //metodos

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    @Override
    public String toString(){
        return "El libro " + titulo + "con codigo ISBN " + ISBN + "creado "
                + "por el autor " + autor + "tiene " + numeroPaginas + 
                "numero de paginas";
    }
    
    
    public static void main(String[] args) {
        Libro libro1 = new Libro("El quijote", "Cervantes", 4321, 123);
        Libro libro2 = new Libro("English", "Diego", 1234, 45);
        int resta1;
        int resta2;
        
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("ISBN: " + libro1.getISBN());
        System.out.println("Numero de paginas: " + libro1.getNumeroPaginas());
        System.out.println();
        
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("ISBN: " + libro2.getISBN());
        System.out.println("Numero de paginas: " + libro2.getNumeroPaginas());
        System.out.println();
        
        if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()){
            resta1 = libro1.getNumeroPaginas() - libro2.getNumeroPaginas();
            System.out.println("el libro 1 tiene " + resta1 + " paginas de mas que el libro 2");
        }else{
            resta2 = libro2.getNumeroPaginas() - libro1.getNumeroPaginas();
            System.out.println("el libro 1 tiene " + resta2 + " paginas de mas que el libro 1");
            
        }
    }
}
