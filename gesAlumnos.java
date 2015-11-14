class gesAlumnos
{
	public static void main(String[] args)
	{
		// Create new object
		Alumno alumno1 = new Alumno();
		alumno1.ALTA();
		// Create new object
		Alumno alumno2 = new Alumno();
		alumno2.ALTA();
		
		System.out.println();
		System.out.println();
		alumno1.MOSTRAR();
		System.out.println();
		alumno2.MOSTRAR();
		
		// Variable auxiliar para intercambiar notas de los alumno
		float auxiliar;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("INTERCAMBIANDO NOTAS...................");
		auxiliar = alumno1.getNota();
		alumno1.setNota( alumno2.getNota() );
		alumno2.setNota( auxiliar );
		System.out.println("...........................................[ OK! ]");

		System.out.println();
		alumno1.MOSTRAR();
		System.out.println();
		alumno2.MOSTRAR();

		Modulo modulo1 = new Modulo();
		modulo1.ALTA();
		modulo1.MOSTRAR();
		modulo1.CAMBIAR_HORAS(245);
		System.out.println();
		System.out.println("CAMBIANDO HORAS ..................");
		System.out.println();
		modulo1.MOSTRAR();
	}
}
