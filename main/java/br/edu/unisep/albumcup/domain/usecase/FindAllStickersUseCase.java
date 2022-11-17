package br.edu.unisep.albumcup.domain.usecase;

import br.edu.unisep.albumcup.domain.dto.StickerDto;

import java.util.List;

public interface FindAllStickersUseCase {
    List<StickerDto> execute();
}
