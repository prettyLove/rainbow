package com.rainbow.server.system.service.controller;



import com.rainbow.common.core.entity.QueryRequest;
import com.rainbow.common.core.utils.RainbowUtil;
import com.rainbow.server.system.api.entity.Article;
import com.rainbow.server.system.service.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
*  @Description article Controller
*  @author liuhu
*  @Date 2020-6-10 10:58:59
*/
@RestController
@RequestMapping("article")
@RequiredArgsConstructor
@Api(tags = "文章接口")
public class ArticleController {

    private final ArticleService articleService;

    /**
     * @Description 新增文章
     * @author liuhu
     * @createTime 2020-06-10 17:28:43
     * @param article
     * @return org.springframework.http.ResponseEntity
     */
    @GetMapping
    @ApiOperation("新增文章")
    public ResponseEntity add(@RequestBody Article article){
       return ResponseEntity.ok(articleService.addArticle(article));
    }

    /**
     * @Description 新增文章
     * @author liuhu
     * @createTime 2020-06-10 17:28:43
     * @param id
     * @return org.springframework.http.ResponseEntity
     */
    @GetMapping("{id}")
    @ApiOperation("新增文章")
    public ResponseEntity add(@PathVariable("id") Integer id){
        return ResponseEntity.ok(articleService.getById(id));
    }

    @GetMapping("page")
    @ApiOperation("新增文章")
    public ResponseEntity page(QueryRequest queryRequest,Article article){
        return ResponseEntity.ok(articleService.page(queryRequest,article));
    }
}
