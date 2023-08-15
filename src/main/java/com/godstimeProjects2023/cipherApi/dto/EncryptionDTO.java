package com.godstimeProjects2023.cipherApi.dto;

public class EncryptionDTO {
    private String data;

    public EncryptionDTO() {
    }

    public EncryptionDTO(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
