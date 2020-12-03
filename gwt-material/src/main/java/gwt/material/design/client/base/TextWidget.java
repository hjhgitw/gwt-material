/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
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
package gwt.material.design.client.base;

import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HasText;
import gwt.material.design.client.base.mixin.TextMixin;

public class TextWidget extends MaterialWidget implements HasSafeText, HasText {

    private TextMixin<TextWidget> textMixin;

    public TextWidget() {
        super(DOM.createDiv());
    }

    public TextWidget(Element element) {
        super(element);
    }

    public TextWidget(Element element, String... initialClass) {
        super(element, initialClass);
    }

    @Override
    public String getText() {
        return getTextMixin().getText();
    }

    @Override
    public void setText(String text) {
        getTextMixin().setText(text);
    }

    @Override
    public void setText(SafeHtml html) {
        getTextMixin().setText(html);
    }

    public TextMixin<TextWidget> getTextMixin() {
        if (textMixin == null) {
            textMixin = new TextMixin<>(this);
        }
        return textMixin;
    }
}