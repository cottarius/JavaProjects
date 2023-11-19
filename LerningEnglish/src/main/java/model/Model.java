package model;

import java.util.HashMap;
import java.util.Map;

public class Model {
    Map<String, String> dict;

    public Model(Map<String, String> dict) {
        this.dict = dict;
    }

    public Map<String, String> getDict() {
        return dict;
    }

    public void setDict(Map<String, String> dict) {
        this.dict = dict;
    }
}
