/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.unifiedpush.message.sender;

import javax.enterprise.util.AnnotationLiteral;

import org.jboss.aerogear.unifiedpush.api.VariantType;

public class SenderTypeLiteral extends AnnotationLiteral<SenderType> implements SenderType {
    private final VariantType value;

    @Override
    public VariantType value() {
        return value;
    }

    public SenderTypeLiteral(VariantType value) {
        this.value = value;
    }
}
