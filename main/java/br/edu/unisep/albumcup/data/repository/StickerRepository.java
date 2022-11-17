package br.edu.unisep.albumcup.data.repository;

import br.edu.unisep.albumcup.data.entity.Sticker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StickerRepository extends JpaRepository<Sticker, Integer> {
}
