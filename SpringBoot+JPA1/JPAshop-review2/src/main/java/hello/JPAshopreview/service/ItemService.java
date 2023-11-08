package hello.JPAshopreview.service;

import hello.JPAshopreview.domain.item.Item;
import hello.JPAshopreview.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void itemSave(Item item) {
        itemRepository.itemSave(item);
    }

    @Transactional
    public void updateItem(Long Id, ItemUpdateDTO dto) {
        Item item = itemRepository.itemFindOne(Id);
        item.change(dto.getName(), dto.getPrice(), dto.getStockQuantity());
    }

    public Item findOne(Long itemId) {
        return itemRepository.itemFindOne(itemId);
    }

    public List<Item> findItems() {
        return itemRepository.itemFindAll();
    }
}
