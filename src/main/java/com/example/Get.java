package com.example;

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

public class Get {
    
    public static void main(String[] args) throws Exception {
        Map result = Cld.cloudinary().api().resource("cld-sample-4", ObjectUtils.emptyMap());
        Cld.printJson(result);
    }
}
