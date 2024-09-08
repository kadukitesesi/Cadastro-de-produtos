package com.kadukitesesi.springboot.controllers;


import com.kadukitesesi.springboot.dtos.FotoProdutoInput;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.nio.file.Path;
import java.util.UUID;

@RestController
@RequestMapping("/products/{productsId}/foto")
public class FotoProdutoController {


    @PutMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void atualizarFoto(@PathVariable UUID productsId, @Valid FotoProdutoInput fotoProdutoInput) {

        var nomeArquivo = UUID.randomUUID().toString() + "_" + fotoProdutoInput.arquivo().getOriginalFilename();

        var arquivoFoto = Path.of("/Users/kaduk/Documents/Uploads", nomeArquivo);


        System.out.println(fotoProdutoInput.descricao());
        System.out.println(arquivoFoto);

        System.out.println(fotoProdutoInput.arquivo().getContentType());

        try {
            fotoProdutoInput.arquivo().transferTo(arquivoFoto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
