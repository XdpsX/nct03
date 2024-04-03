package com.nctcompany.nct03.service;

import com.nctcompany.nct03.dto.genre.GenreResponse;
import com.nctcompany.nct03.model.Genre;

import java.util.List;

public interface GenreService {

    List<GenreResponse> getAllGenres();
}
