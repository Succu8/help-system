package kz.help_system.help_system.service.category;

import kz.help_system.help_system.exception.DataNotFound;
import kz.help_system.help_system.model.CategoryInfo;
import kz.help_system.help_system.repository.CategoryRepository;
import kz.help_system.help_system.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

  private final CategoryRepository categoryRepository;

  @Override
  public CategoryInfo getCategoryById(Long id) {
    return categoryRepository.findById(id).map(Mapper::toCategoryInfo)
                             .orElseThrow(() -> new DataNotFound("N6LwPMJ", "category", id));
  }

}
