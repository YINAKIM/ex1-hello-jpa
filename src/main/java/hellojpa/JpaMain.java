package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        //1. [엔티티 매니저 팩토리] 가져오는지 확인
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
                // persistenceUnitName : persistence.xml에서 선언한 <persistence-unit name="hello">

        //2. [엔티티 매니저] 만들어서 넣고 확인
        EntityManager entityManager = emf.createEntityManager();

        // 확인 끝난 매니저, 팩토리 는 닫는다
        entityManager.close();
        emf.close();

/* 정상로그 **************************************************************************************
6월 10, 2021 10:20:23 오후 org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
INFO: HHH000204: Processing PersistenceUnitInfo [
	name: hello
	...]
6월 10, 2021 10:20:23 오후 org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {5.3.10.Final}
6월 10, 2021 10:20:23 오후 org.hibernate.cfg.Environment <clinit>
INFO: HHH000206: hibernate.properties not found
6월 10, 2021 10:20:23 오후 org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
6월 10, 2021 10:20:23 오후 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
6월 10, 2021 10:20:23 오후 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [org.h2.Driver] at URL [jdbc:h2:tcp://localhost/~/test]
6월 10, 2021 10:20:23 오후 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=sa}
6월 10, 2021 10:20:23 오후 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
6월 10, 2021 10:20:23 오후 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
6월 10, 2021 10:20:23 오후 org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
6월 10, 2021 10:20:23 오후 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl stop
INFO: HHH10001008: Cleaning up connection pool [jdbc:h2:tcp://localhost/~/test]

Process finished with exit code 0
***************************************************************************************/

    }
}
