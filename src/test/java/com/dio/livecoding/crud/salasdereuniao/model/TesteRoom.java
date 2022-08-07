package com.dio.livecoding.crud.salasdereuniao.model;

import com.openpojo.reflection.filters.FilterPackageInfo;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

public class TesteRoom {

    private static final String POJO_PACKAGE = "com.dio.livecoding.crud.salasdereuniao.model";

    @Test
    public void testePojoEstruturaNComportamento() {
        Validator validator = ValidatorBuilder.create()
                .with(new GetterMustExistRule())
                .with(new SetterMustExistRule())
                .with(new SetterTester())
                .with(new GetterTester())
                .build();

        validator.validate(POJO_PACKAGE, new FilterPackageInfo());
    }

    @Test
    public void testeGettersNSetters() {
        EqualsVerifier.forClass(Room.class)
                .usingGetClass()
                .verify();
    }

}
