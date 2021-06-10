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


        //3. PK에 값넣는다
        member.setId(1L);
        member.setName("helloA");

        //4. 생성된 객체를 넣는다
        em.persist(member);  //  persist() : JPA에서 insert

        tx.commit(); //----------------------------------------------여기까지 tx, commit!

        //5. 확인 끝난 매니저, 팩토리 는 닫는다
        em.close();
        emf.close();

/* 정상로그 : 1stJPA.txt 에 로그있음 */

    }
}
