package hello.hellospring.domain;

public class Member {

    private Long id;//임의의 값-시스템 저장 아이디 (아이디 식별자)
    private String name;//그냥 이름

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
