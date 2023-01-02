package com.example;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;
import com.google.gson.*;

/**
 * Hello world!
 *
 */

public class Upload {
    
    public static void main(String[] args) throws IOException {
        
        Map params = ObjectUtils.asMap(
                "public_id", "java-video",
                "resource_type", "video");
        Map uploadResult = Cld.cloudinary().uploader().upload(new File(ClassLoader.getSystemClassLoader().getResource("video.mp4").getPath()), params);
        Cld.printJson(uploadResult);
    }
}
