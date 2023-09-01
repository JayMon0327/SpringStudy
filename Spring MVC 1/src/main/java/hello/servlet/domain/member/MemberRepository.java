package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 동시성 문제가 고려되어 있지 않음 , 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 */

public class MemberRepository {

    private Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository(); //싱글톤생성

    public static MemberRepository getInstance() { // 싱글톤 조회할 수있게 public
        return instance;
    }

    private MemberRepository() { //private 으로 싱글톤 추가생성 막음
    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values()); // 바깥에서 list를 조작해도 store 값을 건들고 싶지 않기 때문
    }

    public void clearStore() {
        store.clear();
    }




}
