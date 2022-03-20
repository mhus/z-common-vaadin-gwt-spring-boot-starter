/**
 * Copyright (C) 2019 Mike Hummel (mh@mhus.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.summerclouds.common.vaadingwt.converter;

import java.util.Locale;

import org.summerclouds.common.core.tool.MCast;

import com.vaadin.v7.data.util.converter.Converter;

@SuppressWarnings("deprecation")
public class IntegerConverter implements Converter<String, Integer> {

    private static final long serialVersionUID = 1L;

    @Override
    public Integer convertToModel(String value, Class<? extends Integer> targetType, Locale locale)
            throws com.vaadin.v7.data.util.converter.Converter.ConversionException {
        return MCast.toint(value, 0);
    }

    @Override
    public String convertToPresentation(
            Integer value, Class<? extends String> targetType, Locale locale)
            throws com.vaadin.v7.data.util.converter.Converter.ConversionException {

        return String.valueOf(value);
    }

    @Override
    public Class<Integer> getModelType() {
        return Integer.class;
    }

    @Override
    public Class<String> getPresentationType() {
        return String.class;
    }
}
