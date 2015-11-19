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
		
		Modulo modulo2 = new Modulo();
		modulo2.ALTA();

		Modulo modulo3 = new Modulo();
		modulo3.ALTA();

		int code;

		code = modulo1.BUSCAR_MODULO("programacion");
		if ( code != -1 ) {
			alumno1.ASIGNA_MODULO( code );
		}
		else{
			code = modulo2.BUSCAR_MODULO("programacion");
			if( code != -1){
				alumno1.ASIGNA_MODULO( code );
			}
			else{
				code = modulo3.BUSCAR_MODULO("programacion");
				if( code != -1 ){
					alumno1.ASIGNA_MODULO( code );
				}
				else{
					System.out.println( "El modulo no se encuentra." );
				}
			}
		}
		alumno1.MOSTRAR();
	}
}
