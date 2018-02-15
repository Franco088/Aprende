package estudiando_java;

public class Libro {

			
		private int isbn;
		private String titulo;
		private String autor;
		private int numPaginas;
		//constructores
		public Libro (int isbn, String titulo, String autor, int numPginas) {
	    isbn=isbn;
		titulo=titulo;		
		autor=autor;
		numPaginas=numPaginas;		
				
		}
		
		//metodos
		public int getIsbn() {
			return isbn;
		}

		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public int getNumPaginas() {
			return numPaginas;
		}

		public void setNumPaginas(int numPaginas) {
			this.numPaginas = numPaginas;
		}

		public String toString() {
			return "El libro"+titulo+"Con ISBN"+isbn+""
					+" Creado por el autor"+autor+"Tíene"+numPaginas+"Páginas";
		}
		
		
	}


