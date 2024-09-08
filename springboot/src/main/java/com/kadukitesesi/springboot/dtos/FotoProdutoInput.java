package com.kadukitesesi.springboot.dtos;

import com.kadukitesesi.springboot.validation.FileContentType;
import com.kadukitesesi.springboot.validation.FileSize;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;

import static org.springframework.http.MediaType.*;

public record FotoProdutoInput(@NotNull @FileSize(max = "500kb") @FileContentType(allowed = {IMAGE_PNG_VALUE, IMAGE_JPEG_VALUE}) MultipartFile  arquivo, @NotBlank String descricao) {
}
