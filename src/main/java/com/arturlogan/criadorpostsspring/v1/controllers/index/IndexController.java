package com.arturlogan.criadorpostsspring.v1.controllers.index;

import com.arturlogan.criadorpostsspring.v1.dto.request.CreatePostRequest;
import com.arturlogan.criadorpostsspring.v1.dto.response.GetPostResponse;
import com.arturlogan.criadorpostsspring.v1.dto.response.ListPostResponse;
import com.arturlogan.criadorpostsspring.v1.services.CreatePostService;
import com.arturlogan.criadorpostsspring.v1.services.GetPostService;
import com.arturlogan.criadorpostsspring.v1.services.ListPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final CreatePostService createPostService;
    private final GetPostService getPostService;
    private final ListPostService listPostService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts(){
        ModelAndView modelAndView = new ModelAndView();
        List<ListPostResponse> getPostResponses = listPostService.listPostResponses();
        modelAndView.addObject("posts", getPostResponses);

        return modelAndView;
    }

    @RequestMapping(value = "posts/{id}", method = RequestMethod.GET)
    public ModelAndView getPostDetails(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView();
        GetPostResponse getPostResponse = getPostService.obter(id);
        modelAndView.addObject("post", getPostResponse);

        return modelAndView;
    }

    @RequestMapping(value = "/newpost", method = RequestMethod.GET)
    public String getPostForm(){
        return "postForm";
    }

    @RequestMapping(value = "/newpost", method = RequestMethod.POST)
    public String savePost(@Valid CreatePostRequest request, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
            return "redirect:/newpost";
        }
        createPostService.salvar(request);
        return "redirect:/posts";
    }
}
