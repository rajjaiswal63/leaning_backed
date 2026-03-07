import org.hibernate.Session;

public class hibernateMain {
    public static void main(String[] args) {
        Session session=HibernateUtil.getsession();

        try {
            UserClassHibernate user= new UserClassHibernate(124,"Raj");
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();
            System.out.println("user save"+user.getId());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            HibernateUtil.close();
        }
    }
}
