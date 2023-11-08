package hello.JPAshopreview.repository;

import hello.JPAshopreview.domain.item.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepository {

    private final EntityManager em;

    public void itemSave(Item item) {
        em.persist(item);
    }

    public Item itemFindOne(Long Id) {
        return em.find(Item.class, Id);
    }

    public List<Item> itemFindAll() {
        return em.createQuery("select i from Item i", Item.class)
                .getResultList();
    }


}
