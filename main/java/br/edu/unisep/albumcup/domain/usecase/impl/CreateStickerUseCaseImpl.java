package br.edu.unisep.albumcup.domain.usecase.impl;

import br.edu.unisep.albumcup.data.repository.StickerRepository;
import br.edu.unisep.albumcup.domain.builder.StickerBuilder;
import br.edu.unisep.albumcup.domain.dto.CreateStickerDto;
import br.edu.unisep.albumcup.domain.usecase.CreateStickerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateStickerUseCaseImpl implements CreateStickerUseCase {

    private final StickerRepository repository;
    private final StickerBuilder stickerBuilder;

    public void execute(CreateStickerDto stickerData) {
        var sticker = stickerBuilder.build(stickerData);
        repository.save(sticker);
    }
}
