package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository //component 의 대상
public class ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>(); //static
    // HashMap 멀티쓰레드 이기 때문에 싱글톤에 동시에 접근하게 되면 값이 꼬일수가 있다. 사용 x
    private static long sequence = 0L; //static
    // long 도 마찬가지

    public Item save(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {
        return store.get(id);
    }

    public List<Item> findAll() {
        return new ArrayList<>(store.values()); // ArrayList로 감싸서 반환하게 되면 실제 store에는 변함이 없기때문.
        // 형변환 문제도 있음
    }

    public void update(Long itemId, Item updateParam) { //update 파라미터 정보가 넘어오면 업데이트 되도록 함
        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }

    public void clearStore() {
        store.clear();
    }
}
