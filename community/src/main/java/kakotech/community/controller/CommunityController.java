package kakotech.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommunityController {
    
    // API 방식
    @GetMapping("community")
    @ResponseBody
    public Community communityApi(@RequestParam("name") String name) {
        Community community = new Community();
        community.setName(name);
        return community;
    }

    static class Community {
        private String name;

        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
