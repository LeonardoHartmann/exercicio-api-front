package br.edu.unisep.albumcup.controller;

import br.edu.unisep.albumcup.domain.dto.CreateStickerDto;
import br.edu.unisep.albumcup.domain.dto.StickerDto;
import br.edu.unisep.albumcup.domain.usecase.CreateStickerUseCase;
import br.edu.unisep.albumcup.domain.usecase.DeleteStickerUseCase;
import br.edu.unisep.albumcup.domain.usecase.FindAllStickersUseCase;
import br.edu.unisep.albumcup.domain.usecase.FindStickerByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sticker")
@RequiredArgsConstructor
public class StickerController {

    private final FindStickerByIdUseCase findStickerByIdUseCase;
    private final CreateStickerUseCase createStickerUseCase;
    private final FindAllStickersUseCase findAllStickersUseCase;
    private final DeleteStickerUseCase deleteStickerUseCase;

    @PostMapping
    public ResponseEntity save(@RequestBody CreateStickerDto stickerData) {
        createStickerUseCase.execute(stickerData);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<StickerDto>> findAll() {
        var temp = findAllStickersUseCase.execute();

        if (temp.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(temp);
    }

    @GetMapping("/{sticker/{id}")
    public ResponseEntity<StickerDto> findById(@PathVariable(value="sticker_id" ) Integer id) {
        var temp = findStickerByIdUseCase.execute(id);

        if (temp == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(temp);
    }

    @DeleteMapping("/{sticker/{id}")
    public ResponseEntity deleteById(@PathVariable(value="sticker_id" ) Integer id) {
        deleteStickerUseCase.execute(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
