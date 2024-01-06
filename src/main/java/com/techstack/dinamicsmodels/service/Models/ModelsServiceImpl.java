package com.techstack.dinamicsmodels.service.Models;

import com.techstack.dinamicsmodels.controller.ModelController;
import org.springframework.stereotype.Service;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@Service
public class ModelsServiceImpl implements ModelsService {

    private static final String MODEL_PATH = "com.techstack.dinamicsmodels.models";
    @Override
    public Map<String, Object> getModel(Object o) throws IllegalAccessException {
        Map<String, Object> attributes = new HashMap<>();
        Class<?> classModel = o.getClass();

        for(Field field : classModel.getDeclaredFields()){
            field.setAccessible(true);
            if (!field.getName().equals("id")) {
                attributes.put(field.getName(), field.get(o));
            }
        }
        return attributes;
    }

    @Override
    public boolean classIsAllow(String className) {
        List<Class<?>> classInPackage = getClassInPackage();

        for (Class<?> classModel : classInPackage) {
            if (classModel.getName().equals(MODEL_PATH +"."+  className)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Class<?> getClass(String className) throws ClassNotFoundException {
        return Class.forName(MODEL_PATH +"."+ className);
    }

    private List<Class<?>> getClassInPackage() {
        List<Class<?>> classInPackage = new ArrayList<>();

        try {
            String packagePath = MODEL_PATH.replace('.', '/') + "/";
            packagePath = packagePath.replace("/", File.separator);

            URI uri = Objects.requireNonNull(getClass().getClassLoader().getResource(packagePath)).toURI();
            File directory = new File(uri);

            if (directory.isDirectory()) {
                for (String file : Objects.requireNonNull(directory.list())) {
                    String className = file.substring(0, file.lastIndexOf('.'));
                    Class<?> classFromPath = Class.forName(MODEL_PATH + "." + className);
                    if (!Modifier.isAbstract(classFromPath.getModifiers())) {
                        classInPackage.add(classFromPath);
                    }
                }
            }
        } catch (ClassNotFoundException | URISyntaxException e) {
            e.printStackTrace();
        }

        return classInPackage;
    }
}
