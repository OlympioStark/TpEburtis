package com.tpeburtis.TP1.validator;

import com.tpeburtis.TP1.domain.person.PersonVO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntityValidator {

    public static List<String> persValidate(PersonVO pVO) {
        List<String> errors = new ArrayList<>();

        if (pVO == null) {
            errors.add("Veuillez saisir le nom");
            errors.add("Veuillez saisir le(s) prénom(s)");
            errors.add("Veuillez saisir l'âge");
            return errors;
        }

        if (!StringUtils.hasLength(pVO.getLastName())){
            errors.add("Veuillez saisir le nom");
        }

        if (!StringUtils.hasLength(pVO.getFirstName())){
            errors.add("Veuillez saisir le(s) prénom(s)");
        }
        return errors;
    }
}
