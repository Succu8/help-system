package kz.help_system.help_system.controller;

import java.util.List;
import kz.help_system.help_system.dto.ActionPeriod;
import kz.help_system.help_system.dto.ProductDescription;
import kz.help_system.help_system.dto.ProductFilter;
import kz.help_system.help_system.model.ProductInfo;
import kz.help_system.help_system.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/product")
public class ProductController {

  private final ProductService productService;

  @GetMapping("/{id}")
  public ResponseEntity<ProductInfo> getProductById(@PathVariable("id") Long id) {
    ProductInfo product = productService.getProductById(id);
    return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
  }

  @PostMapping("/by-action-period")
  public ResponseEntity<List<ProductInfo>> getProductsByActionPeriod(@RequestBody ActionPeriod period) {
    return ResponseEntity.ok(productService.getProductsByActionPeriod(period.beginDate, period.endDate));
  }

  @PostMapping("/by-description")
  public ResponseEntity<ProductInfo> getProductByDescription(@RequestBody ProductDescription description) {
    return ResponseEntity.ok(productService.getProductByDescription(description.description));
  }

  @PostMapping("/filter")
  public ResponseEntity<ProductInfo> getProductByFilter(@RequestBody ProductFilter filter) {
    return ResponseEntity.ok(productService.getProductByFilter(filter));
  }

}
