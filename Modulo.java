import java.util.Scanner;
class Modulo 
{	
	Scanner sc = new Scanner(System.in);
	int 	cod_modulo,
		num_horas;
	String nome_modulo;

	public void ALTA()
	{
		System.out.println("Introduce codigo [ entero ] de modulo: " );
		cod_modulo = sc.nextInt();	
		System.out.println("Introduce numero de horas: " );
		num_horas = sc.nextInt();
		nome_modulo = sc.nextLine();
		System.out.println("Introduce nombre del modulo: " );
		nome_modulo = sc.nextLine();
	}
	public void MOSTRAR()
	{
		System.out.println("Nombre de modulo: " + nome_modulo);
		System.out.println("Codigo de modulo: " + cod_modulo );
		System.out.println("Numero de horas: " + num_horas );
	}
	public void CAMBIAR_HORAS( int horas )
	{
		num_horas = horas;
	}
}
