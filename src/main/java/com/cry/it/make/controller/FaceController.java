package com.cry.it.make.controller;

import com.cry.it.make.domain.Face;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class FaceController {

    @GetMapping("/faceQuestion")
    public String faceQuestion(Map<String, Object> model) {
        model.put("face", new Face().questionFace());
        return "face";
    }
    
    @GetMapping("/faceCry")
    public String faceCry(Map<String, Object> model) {
        model.put("face", new Face().cryFace());
        return "face";
    }
    
    @GetMapping("/faceSmile")
    public String faceSmile(Map<String, Object> model) {
        model.put("face", new Face().smileFace());
        return "face";
    }
}
