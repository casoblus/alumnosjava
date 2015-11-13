class Alumno
{
	private String nome;
	private String dni;
	private float nota;

	public void ALTA( String nom, String dn, float not ) 
	{
		nome = nom;
		dni = dn;
		nota = not;
	}

	public void MOSTRAR()
	{
		System.out.println("\t****************************************");
		System.out.println("\t**  Nombre del alumno: "+nome+";      **");
		System.out.println("\t****************************************");
		System.out.println("\t**  Dni del alumno: "+dni+";          **");
		System.out.println("\t**  Nota del alumno: " +nota+"        **");
		System.out.println("\t****************************************");
	}
}
