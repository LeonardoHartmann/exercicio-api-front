package br.edu.unisep.albumcup.domain.usecase.impl;

import br.edu.unisep.albumcup.data.repository.StickerRepository;
import br.edu.unisep.albumcup.domain.usecase.DeleteStickerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteStickerUseCaseImpl implements DeleteStickerUseCase {
    private final StickerRepository repository;

    @Override
    public void execute(Integer id) {
        repository.deleteById(id);
    }
}
