package com.cry.it.make.controller;

import com.cry.it.make.domain.Face;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class FaceController {
	
    @GetMapping("/face")
    public String faceQuestion(Map<String, Object> model) {
        model.put("faceSmile", new Face().smileFace());
        return "face";
    }

}
