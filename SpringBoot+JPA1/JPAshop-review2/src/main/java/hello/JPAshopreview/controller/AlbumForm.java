package hello.JPAshopreview.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter @Setter
public class AlbumForm {

    private Long id;
    private String name;
    private int price;

    @NotNull(message = "수량입력은 필수입니다.")
    private int stockQuantity;

    private String artist;
    private String etc;
}
