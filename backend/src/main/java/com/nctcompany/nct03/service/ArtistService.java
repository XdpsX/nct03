package com.nctcompany.nct03.service;

import com.nctcompany.nct03.dto.artist.ArtistResponse;

import java.util.List;

public interface ArtistService {

    List<ArtistResponse> getAllArtists();
}
