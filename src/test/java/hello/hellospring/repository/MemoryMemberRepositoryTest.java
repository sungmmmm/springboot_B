package hello.hellospring.repository;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Member;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        System.out.println("result = " +(result ==member));

    }
}