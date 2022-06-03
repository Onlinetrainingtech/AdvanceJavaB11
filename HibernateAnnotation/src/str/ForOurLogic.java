package str;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ForOurLogic {

	public static void main(String[] args) {
		
		//To Connect the hibernate.cfg.xml
	       StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			
			Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
			
			//To Connect the db
			SessionFactory factory=meta.getSessionFactoryBuilder().build();
			
			Session session=factory.openSession();
			
			Transaction t=session.beginTransaction();
			
			Customers c1=new Customers();
			c1.setCustomerid(1001);
			c1.setCustomerName("mohamed");
			
			session.save(c1);
			
			t.commit();
			
			System.out.println("DataInserted..");
	}

}
