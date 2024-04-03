package com.nctcompany.nct03.service.impl;

import com.nctcompany.nct03.dto.genre.GenreResponse;
import com.nctcompany.nct03.mapper.GenreMapper;
import com.nctcompany.nct03.model.Genre;
import com.nctcompany.nct03.repository.GenreRepository;
import com.nctcompany.nct03.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Override
    public List<GenreResponse> getAllGenres() {
        List<Genre> genres = genreRepository.findAll();
        return genres.stream()
                .map(GenreMapper::mapToResponse)
                .collect(Collectors.toList());
    }
}
