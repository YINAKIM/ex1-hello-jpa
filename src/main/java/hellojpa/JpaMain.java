package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();


        //1. 객체생성
        Member member = new Member();

        //2. ***** JPA에서는 트랜잭션 매우중요 *****
        EntityTransaction tx = em.getTransaction();
        tx.begin(); //----------------------------------------------여기부터 tx

        try {
            member.setId(1L);
            member.setName("helloA");

            em.persist(member);  //  persist() : JPA에서 insert
            tx.commit(); //----------------------------------------------여기까지 tx, commit!
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }//finally
        emf.close();

/* 정상로그 : 1stJPA.txt 에 로그있음 */

    }
}
