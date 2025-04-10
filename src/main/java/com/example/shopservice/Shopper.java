package com.example.shopservice;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
public class Shopper {
    @Tool(name = "shopAdvisor", description = "Use this tool to find the best clothing for a given type of clothing")
    String shopAdvisor(@ToolParam(description = "the item user wanted to shop and get it right away") String item) {
        var shop = "www.amazon.com";
        System.out.println("item: " + item + " advisor started working to see where to shop");
        return "You can find %s at %s and get it in 2 hours".formatted(item, shop);
    }


}

