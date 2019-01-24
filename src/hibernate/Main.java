package hibernate;

import java.util.Date;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		Session sesion = HibernateUtilities.getSessionFactory().openSession();
		
		//Festival 1
		sesion.beginTransaction();
		Festival fest1 = new Festival("nombreRND","lugarRND","20181001");;
		
		sesion.save(fest1);
		sesion.getTransaction().commit();
		
		sesion.beginTransaction();
		fest1 = null;
		fest1 = sesion.get(Festival.class, "nombreRND");
		
		
		System.out.println(fest1.toString());
		sesion.getTransaction().commit();
		
		//Festival 2
		sesion.beginTransaction();
		Festival fest2 = new Festival("festival2","lugarRND","20181001");;
		
		sesion.save(fest2);
		sesion.getTransaction().commit();
				
		sesion.beginTransaction();
		fest2 = null;
		fest2 = sesion.get(Festival.class, "festival2");
				
				
		System.out.println(fest2.toString());
		sesion.getTransaction().commit();
		
		//Actuacion 1
		sesion.beginTransaction();
		Actuacion actuacion1 = new Actuacion("1010", 3);
		
		sesion.save(actuacion1);
		sesion.getTransaction().commit();
		
		sesion.beginTransaction();
		actuacion1 = null;
		actuacion1 = sesion.get(Actuacion.class, "1010");
		
		System.out.println(actuacion1.toString());
		sesion.getTransaction().commit();
		
		//Actuacion 2
		sesion.beginTransaction();
		Actuacion actuacion2 = new Actuacion("2359", 3);

		sesion.save(actuacion2);
		sesion.getTransaction().commit();

		sesion.beginTransaction();
		actuacion2 = null;
		actuacion2 = sesion.get(Actuacion.class, "2359");

		System.out.println(actuacion2.toString());
		sesion.getTransaction().commit();
		
		//Grupo 1
		sesion.beginTransaction();
		Grupo grupo1 = new Grupo("grupo111111", "Rock?", 5);
				
		sesion.save(grupo1);
		sesion.getTransaction().commit();
				
		sesion.beginTransaction();
		grupo1 = null;
		grupo1 = sesion.get(Grupo.class, "grupo111111");
				
				
		System.out.println(grupo1.toString());
		sesion.getTransaction().commit();
		
		//Grupo 2
		sesion.beginTransaction();
		Grupo grupo2 = new Grupo("grupo 2 hehehe", "Rock?", 5);

		sesion.save(grupo2);
		sesion.getTransaction().commit();

		sesion.beginTransaction();
		grupo2 = null;
		grupo2 = sesion.get(Grupo.class, "grupo 2 hehehe");

		System.out.println(grupo2.toString());
		sesion.getTransaction().commit();
		
		sesion.close();
		HibernateUtilities.getSessionFactory().close();
	}

}
