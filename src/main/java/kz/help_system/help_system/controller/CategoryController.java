package kz.help_system.help_system.controller;

import kz.help_system.help_system.model.CategoryInfo;
import kz.help_system.help_system.service.category.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/category")
public class CategoryController {

  private final CategoryService categoryService;

  @GetMapping("/{id}")
  public ResponseEntity<CategoryInfo> getCategoryById(@PathVariable("id") Long id) {
    CategoryInfo category = categoryService.getCategoryById(id);
    return category != null ? ResponseEntity.ok(category) : ResponseEntity.notFound().build();
  }

}
