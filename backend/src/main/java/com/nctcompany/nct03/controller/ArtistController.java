package com.nctcompany.nct03.controller;

import com.nctcompany.nct03.dto.artist.ArtistResponse;
import com.nctcompany.nct03.service.ArtistService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/v1/artists")
@RestController
@RequiredArgsConstructor
@Tag(
        name = "Artist API"
)
public class ArtistController {

    private final ArtistService artistService;

    @Operation(
            summary = "Read All Artists"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 OK"
    )
    @GetMapping
    public ResponseEntity<List<ArtistResponse>> getAllArtists(){
        return ResponseEntity.ok(artistService.getAllArtists());
    }
}
