package Sathyatech.dao;

import org.hibernate.Session;
import org.hibernate.jpa.HibernateEntityManager;

import com.Sathyatech.entity.Account;

public class HibernateReadApplication {
private HibernateEntityManager sessionProvider;
@SuppressWarnings("deprecation")
Session session=sessionProvider.getSession();
Account 
=(Account)session.get(Account.class,1001);
if(account!=null) {
	System.out.println("A/C Number:"+account.getAccno());
	System.out.println("A/C HolderName:"+((Object) account).getName());
	System.out.println("A/C Balance:"+((Object) account).getBalance());
}
else {
	System.out.println("Account does not exist ");
}
session.close();	
}}
