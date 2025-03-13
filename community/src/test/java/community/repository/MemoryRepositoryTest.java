package community.repository;

import community.domain.Member;
import org.junit.Test;

public class MemoryRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        //given
        Member member = new Member();
        member.setName("spring");
        //when
        repository.save(member);
        //then
        Member result = repository.findById(member.getId()).get();
        System.out.println((result == member));
    }
}
