package com.techstack.dinamicsmodels.controller;

import com.techstack.dinamicsmodels.service.Models.ModelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@RestController
@RequestMapping("/models")
public class ModelController {
    private final ModelsService modelsService;
    @Autowired
    public ModelController(ModelsService modelsService) {
        this.modelsService = modelsService;
    }

    @GetMapping("/get-attributes/{className}")
    public Map<String, Object> getAttributes(@PathVariable String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (!modelsService.classIsAllow(className)) {
            throw new IllegalArgumentException("Model not found!");
        }

        Class<?> claseObjeto = modelsService.getClass(className);
        Object instanciaObjeto = claseObjeto.getDeclaredConstructor().newInstance();

        return modelsService.getModel(instanciaObjeto);
    }


}
