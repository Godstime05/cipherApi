package com.godstimeProjects2023.cipherApi.dto;

public class DecryptionDTO {

    private String encryptedData;

    public DecryptionDTO() {
    }

    public DecryptionDTO(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }
}
