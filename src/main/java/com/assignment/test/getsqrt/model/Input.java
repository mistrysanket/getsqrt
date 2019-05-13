package com.assignment.test.getsqrt.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Input {
    @JsonProperty("data")
    List<Integer> data = new ArrayList();

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}
