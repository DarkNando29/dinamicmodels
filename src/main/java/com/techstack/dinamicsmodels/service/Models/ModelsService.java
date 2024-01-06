package com.techstack.dinamicsmodels.service.Models;

import com.techstack.dinamicsmodels.controller.ModelController;

import java.io.File;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface ModelsService {
    Map<String, Object> getModel(Object o) throws IllegalAccessException;

    boolean classIsAllow(String className);

    Class<?> getClass(String className) throws ClassNotFoundException;
}
