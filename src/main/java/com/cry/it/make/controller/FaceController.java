package com.cry.it.make.controller;

import com.cry.it.make.domain.Face;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class FaceController {

    @GetMapping("/faceQuestion")
    public String faceQuestion(Map<String, Object> model) {
        model.put("faceQuestion", new Face().questionFace());
        return "faceQuestion";
    }
    
    @GetMapping("/faceCry")
    public String faceCry(Map<String, Object> model) {
        model.put("faceCry", new Face().cryFace());
        return "faceCry";
    }
    
    @GetMapping("/faceSmile")
    public String faceSmile(Map<String, Object> model) {
        model.put("faceSmile", new Face().smileFace());
        return "faceSmile";
    }
}
