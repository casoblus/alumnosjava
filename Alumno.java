import java.util.Scanner;
class Alumno
{
	private String nome;
	private String dni;
	private float nota;
	private int modulo;

	public void ALTA() 
	{	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t****************************************");
		System.out.println("\t*            ALTA DE ALUMNOS           *");
		System.out.println("\t****************************************");
		System.out.println("");
		System.out.println("\t>> Nombre del alumno: ");
		nome = sc.nextLine();
		System.out.println("\t>> DNI del alumno: ");
		dni = sc.nextLine();
		System.out.println("\t>> Nota del alumno: ");
		nota = sc.nextFloat();
		System.out.println("\t");
	}

	public void MOSTRAR()
	{
		System.out.println("\t****************************************");
		System.out.println("\t**  Nombre del alumno: "+nome+";      **");
		System.out.println("\t****************************************");
		System.out.println("\t**  Dni del alumno: "+dni+";          **");
		System.out.println("\t**  Nota del alumno: " +nota+"        **");
		System.out.println("\t**  Modulo del alumno: " +modulo+"  **");
		System.out.println("\t****************************************");
	}
	
	public float getNota()
	{
		return nota;
	}

	public void setNota( float _nota )
	{
		nota = _nota;
	}
	
	public void ASIGNA_MODULO( int code )
	{
		modulo = code;
	}

}
