package com.powernode.spring.bean;

import java.util.Arrays;

public class QianDaYe {
    private String []aihaos;

    private Women[]womens;

    @Override
    public String toString() {
        return "QianDaYe{" +
                "aihaos=" + Arrays.toString(aihaos) +
                ", womens=" + Arrays.toString(womens) +
                '}';
    }

    public void setWomens(Women[] womens) {
        this.womens = womens;
    }

    public void setAihaos(String[] aihaos) {
        this.aihaos = aihaos;
    }
}
