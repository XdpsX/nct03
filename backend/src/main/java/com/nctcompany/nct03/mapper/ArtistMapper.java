package com.nctcompany.nct03.mapper;

import com.nctcompany.nct03.constant.ApplicationConstants;
import com.nctcompany.nct03.dto.artist.ArtistResponse;
import com.nctcompany.nct03.model.Artist;

import java.io.File;

public class ArtistMapper {

    public static ArtistResponse mapToResponse(Artist artist){
        ArtistResponse artistResponse = ArtistResponse.builder()
                .id(artist.getId())
                .name(artist.getName())
                .build();

        String photo = ApplicationConstants.ARTISTS_FOLDER_PATH + File.separator + "default.jpg";
        if (artist.getPhoto() != null && !artist.getPhoto().isEmpty()){
            photo = ApplicationConstants.ARTISTS_FOLDER_PATH + File.separator + artist.getId() + File.separator + artist.getPhoto();
        }
        artistResponse.setPhoto(photo);

        return artistResponse;
    }
}
