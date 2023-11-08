package hello.JPAshopreview.controller;

import hello.JPAshopreview.domain.item.Album;
import hello.JPAshopreview.domain.item.Book;
import hello.JPAshopreview.domain.item.Item;
import hello.JPAshopreview.service.ItemService;
import hello.JPAshopreview.service.ItemUpdateDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping("/items/new")
    public String createForm(Model model) {
        model.addAttribute("form", new AlbumForm());
        return "items/createItemForm";
    }

    @PostMapping("/items/new")
    public String create(@Valid AlbumForm form, BindingResult result) {
        if (result.hasErrors()) {
            return "items/createItemForm";
        }

        Album album = new Album();
        album.setName(form.getName());
        album.setPrice(form.getPrice());
        album.setStockQuantity(form.getStockQuantity());
        album.setArtist(form.getArtist());
        album.setEtc(form.getEtc());

        itemService.itemSave(album);

        return "redirect:/";
    }

    @GetMapping("/items")
    public String list(Model model) {
        List<Item> items = itemService.findItems();
        model.addAttribute("items", items);
        return "items/itemList";
    }

    @GetMapping("items/{itemId}/edit")
    public String updateItemForm(@PathVariable("itemId") Long itemId, Model model) {
        Album item = (Album) itemService.findOne(itemId);
        Album album = new Album();
        album.setId(item.getId());
        album.setName(item.getName());
        album.setPrice(item.getPrice());
        album.setStockQuantity(item.getStockQuantity());
        album.setArtist(item.getArtist());
        album.setEtc(item.getEtc());

        model.addAttribute("form", album);
        return "items/updateItemForm";
    }

    @PostMapping("items/{itemId}/edit")
    public String updateItem(@PathVariable("itemId") Long itemId, @ModelAttribute("form") AlbumForm form) {

        ItemUpdateDTO dto = new ItemUpdateDTO();
        dto.setName(form.getName());
        dto.setPrice(form.getPrice());
        dto.setStockQuantity(form.getStockQuantity());

        itemService.updateItem(itemId, dto);

        return "redirect:/items";
    }
}
