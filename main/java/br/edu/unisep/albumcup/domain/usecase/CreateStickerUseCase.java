package br.edu.unisep.albumcup.domain.usecase;

import br.edu.unisep.albumcup.domain.dto.CreateStickerDto;

public interface CreateStickerUseCase {
    void execute(CreateStickerDto stickerData);
}
