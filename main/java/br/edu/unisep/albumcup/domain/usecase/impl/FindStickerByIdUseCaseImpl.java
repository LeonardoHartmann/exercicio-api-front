package br.edu.unisep.albumcup.domain.usecase.impl;

import br.edu.unisep.albumcup.data.repository.StickerRepository;
import br.edu.unisep.albumcup.domain.builder.StickerBuilder;
import br.edu.unisep.albumcup.domain.dto.StickerDto;
import br.edu.unisep.albumcup.domain.usecase.FindStickerByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class FindStickerByIdUseCaseImpl implements FindStickerByIdUseCase {
    private final StickerRepository repository;
    private final StickerBuilder stickerBuilder;

    @Override
    public void execute(Integer id) {
        var sticker = repository.findById(id);
        if (sticker.isEmpty()) {
            return null;
        }
        return stickerBuilder.build(sticker);
    }
}
