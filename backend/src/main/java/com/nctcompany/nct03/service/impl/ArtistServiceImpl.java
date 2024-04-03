package com.nctcompany.nct03.service.impl;

import com.nctcompany.nct03.dto.artist.ArtistResponse;
import com.nctcompany.nct03.mapper.ArtistMapper;
import com.nctcompany.nct03.model.Artist;
import com.nctcompany.nct03.repository.ArtistRepository;
import com.nctcompany.nct03.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    @Override
    public List<ArtistResponse> getAllArtists() {
        List<Artist> artists = artistRepository.findAll();
        return artists.stream()
                .map(ArtistMapper::mapToResponse)
                .collect(Collectors.toList());
    }
}
