/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2022 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.sanitizer.handler;

import gwt.material.design.client.sanitizer.Patterns;

public class NonWhiteSpaceC0SanitizeHandler extends AbstractSanitizeHandler {

    public NonWhiteSpaceC0SanitizeHandler() {
    }

    @Override
    public boolean sanitize(String value) {
        return matches(Patterns.NON_WHITESPACE_C0_CONTROLS, value, "Value must not contain non white space C0 controls");
    }
}
