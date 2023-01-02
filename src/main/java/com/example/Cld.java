package com.example;

import java.util.Map;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvBuilder;
import io.github.cdimascio.dotenv.DotenvEntry;
public class Cld {
    private static Cloudinary instance = null;

    static Cloudinary cloudinary() {
        if (Cld.instance == null) {
            Dotenv dotenv = new DotenvBuilder().load();
            Cld.instance = new Cloudinary(ObjectUtils.asMap("cloud_name", dotenv.get("CLOUD_NAME"), "api_key",
            dotenv.get("API_KEY"), "api_secret", dotenv.get("API_SECRET"), "secure", true));
        }
        return Cld.instance;
    }

    static void printJson(Map result) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJsonString = gson.toJson(result);
        System.out.println(prettyJsonString);
    }
}
