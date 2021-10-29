package com.xworkz.mobile.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.mobile.entity.MobileEntity;

public class MobileDAOImpl implements MobileDAO{

	public void saveMobileEntity(MobileEntity mobileEntity) {
//		System.out.println("INVOKED SAVE MOBILE ENTITY");
//		SessionFactory sessionFactory = null;
//		Transaction transaction = null;
//		Session session = null;
//		
//		try {
//			Configuration configuration = new Configuration();
//
//			configuration.addAnnotatedClass(MobileEntity.class);
//
//			configuration.configure("hibernate.cfg.xml");
//
//			 sessionFactory = configuration.buildSessionFactory();
//
//			 session = sessionFactory.openSession();
//			 
//			 session.beginTransaction();
//				
//			session.getTransaction().commit();
//			System.out.println("one row inserted");
//		} catch (Exception e) {
//			System.out.println("inside catch block !!!");
//		}finally {
//			if (session != null) {
//
//				session.close();
//				System.out.println(" session is closed");
//
//			} else {
//
//				System.out.println("session is not closed");
//
//			}
//			if (sessionFactory != null) {
//
//				sessionFactory.close();
//				System.out.println(" sessionFactory is closed");
//			} else {
//
//				System.out.println("sessionFactory is not closed");
//
//			}
//			
//		}
//		
		Configuration configure=new Configuration();
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		Transaction ts=session.beginTransaction();
		MobileEntity ent=(MobileEntity)session.save(mobileEntity);
		ts.commit();
		session.clear();
		factory.close();
		
	}

	

//	public void getMobileEntity() {
//		System.out.println("INVOKED GET MOBILE ENTITY");
//		SessionFactory sessionFactory = null;
//		Session session = null;
//		try {
//
//			Configuration configuration = new Configuration();
//
//			configuration.addAnnotatedClass(MobileEntity.class);
//
//			configuration.configure("MobileHibernate.xml");
//
//			sessionFactory = configuration.buildSessionFactory();
//
//			session = sessionFactory.openSession();
//
//			MobileEntity mobileEntity = session.get(MobileEntity.class, 3);
//
//			System.out.println("read is done" + mobileEntity);
//		
//		}catch (Exception e) 
//		  {
//
//				System.out.println("inside catch block!!!");
//
//			} finally {
//
//				if (session != null) {
//					System.out.println("session closed");
//				} else {
//					System.out.println("session is not closed");
//				}
//				if (sessionFactory != null) {
//					System.out.println("sessionFactory is closed");
//				} else {
//					System.out.println("sessionFactory is not closed");
//				}
//			}
//	
//	}
//
//	public void updateMobileEntity() {
//		
//		System.out.println("INVOKED UPDATE MOBILE ENTITY");
//		SessionFactory sessionFactory = null;
//		Session session = null;
//		Transaction transaction = null;
//		try {
//
//			Configuration configuration = new Configuration();
//
//			configuration.addAnnotatedClass(MobileEntity.class);
//
//			configuration.configure("MobileHibernate.xml");
//
//			sessionFactory = configuration.buildSessionFactory();
//
//			session = sessionFactory.openSession();
//
//			MobileEntity mobileEntity = session.get(MobileEntity.class, 4);
//
//			System.out.println("MobileEntity"+ mobileEntity);
//			
//			mobileEntity.setMobileBrand("iphone");
//			mobileEntity.setOsType("IOS");
//			mobileEntity.setColor("GREY");
//			
//			 transaction = session.beginTransaction();			
//			
//			 session.update(mobileEntity);
//			
//			 transaction.commit();
//			
//			
//			System.out.println("Update");
//		
//		}catch (Exception e) 
//		  {
//
//				System.out.println("inside catch block!!!");
//				transaction.rollback();
//				
//			} finally {
//
//				if (session != null) {
//					System.out.println("session closed");
//				} else {
//					System.out.println("session is not closed");
//				}
//				if (sessionFactory != null) {
//					System.out.println("sessionFactory is closed");
//				} else {
//					System.out.println("sessionFactory is not closed");
//				}
//			}
//	
//	}
//
//	public void deleteMobileEntity() {
//		
//		System.out.println("INVOKED DELETE MOBILE ENTITY");
//		SessionFactory sessionFactory = null;
//		Session session = null;
//		Transaction transaction = null;
//		try {
//
//			Configuration configuration = new Configuration();
//
//			configuration.addAnnotatedClass(MobileEntity.class);
//
//			configuration.configure("MobileHibernate.xml");
//
//			sessionFactory = configuration.buildSessionFactory();
//
//			session = sessionFactory.openSession();
//
//			MobileEntity mobileEntity = session.get(MobileEntity.class, 2);
//
//			System.out.println("MobileEntity"+ mobileEntity);
//			
//		
//			
//			 transaction = session.beginTransaction();			
//			
//			 session.delete(mobileEntity);
//			
//			 transaction.commit();
//			
//			
//			System.out.println("delete");
//		
//		}catch (Exception e) 
//		  {
//
//				System.out.println("inside catch block!!!");
//				transaction.rollback();
//				
//			} finally {
//
//				if (session != null) {
//					System.out.println("session closed");
//				} else {
//					System.out.println("session is not closed");
//				}
//				if (sessionFactory != null) {
//					System.out.println("sessionFactory is closed");
//				} else {
//					System.out.println("sessionFactory is not closed");
//				}
//			}
//		
//		
//	}

}
