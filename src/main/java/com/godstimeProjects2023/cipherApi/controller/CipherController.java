package com.godstimeProjects2023.cipherApi.controller;

import com.godstimeProjects2023.cipherApi.cipherService.CipherService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class CipherController {

    private final CipherService1 cipherService;

    @Autowired
    public CipherController(CipherService1 cipherService) {
        this.cipherService = cipherService;
    }

    @PostMapping("/encrypt")
    public String encrypt(@RequestBody String data) throws Exception {

        return cipherService.encrypt(data);
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestBody String data) throws Exception {
        return cipherService.decrypt(data);
    }

}
