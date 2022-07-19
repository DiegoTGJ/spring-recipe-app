package tutorial.services;

import org.springframework.stereotype.Service;
import tutorial.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
