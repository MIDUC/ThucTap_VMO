package vmo.javaweb.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vmo.javaweb.demo.Models.Language;
import vmo.javaweb.demo.Repositories.LanguageRepo;

@Service
public class LanguageService {
    @Autowired
    LanguageRepo languageRepo;

    public Language save_language(Language language){
        return languageRepo.save(language);
    }
}
