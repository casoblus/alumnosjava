import java.util.Scanner;

class gesAlumnos
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// Define attributes
		String _dni;
		String _nome;
		float _nota;

		// Initialize attributes
		System.out.println("\t****************************************");
		System.out.println("\t*          GESTION DE ALUMNOS          *");
		System.out.println("\t****************************************");
		System.out.println("");
		System.out.println("\t>> Nombre del alumno: ");
		_nome = sc.nextLine();
		System.out.println("\t>> DNI del alumno: ");
		_dni = sc.nextLine();
		System.out.println("\t>> Nota del alumno: ");
		_nota = sc.nextFloat();
		System.out.println("\t");


		// Create new object
		Alumno alumno1 = new Alumno();
		alumno1.ALTA( _nome, _dni, _nota );
		alumno1.MOSTRAR();
	}
}
