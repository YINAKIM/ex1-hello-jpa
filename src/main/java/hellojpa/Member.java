package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // 이게 붙어있으면 EntityManager가 JPAT쓰는거구나 함
public class Member{

    @Id // PK가 누군지 알려줌
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
