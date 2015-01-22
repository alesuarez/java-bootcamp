



public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author autor1 = new Author("Tony Stark","tonys@iron.man",'m');
		Book libro1 = new Book("more java for dummy",autor1,19.95,1000);
		System.out.println(autor1);
		autor1.setEmail("starktony@stark.com");
		System.out.println(autor1);
		System.out.println(libro1);
		System.out.println("Nombre del autor: "+libro1.getAuthor().getName());
		System.out.println("Email del autor: " + libro1.getAuthor().getEmail());
		System.out.println("Nombre del autor: "+libro1.getAuthorName());
		System.out.println("Email del autor: "+libro1.getAuthorEmail());
		System.out.println("Genero del autor: "+libro1.getAuthorGender());
	}

}
