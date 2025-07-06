/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * TextFontInfo Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_font_info_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextFontInfo icon.
 */
public val FluentIcons.Regular.TextFontInfo: ImageVector
    get() {
        if (_textFontInfo != null) {
            return _textFontInfo!!
        }
        _textFontInfo = Builder(name = "TextFontInfo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.511f, 2.0f)
                curveTo(9.824f, 2.005f, 10.102f, 2.204f, 10.207f, 2.499f)
                lineTo(13.389f, 11.465f)
                curveTo(12.952f, 11.822f, 12.563f, 12.234f, 12.232f, 12.691f)
                lineTo(9.47f, 4.907f)
                lineTo(6.337f, 13.0f)
                lineTo(12.022f, 13.0f)
                curveTo(11.725f, 13.463f, 11.486f, 13.967f, 11.314f, 14.5f)
                lineTo(5.756f, 14.5f)
                lineTo(4.2f, 18.521f)
                curveTo(4.05f, 18.907f, 3.616f, 19.099f, 3.229f, 18.949f)
                curveTo(2.843f, 18.8f, 2.651f, 18.365f, 2.801f, 17.979f)
                lineTo(8.801f, 2.479f)
                curveTo(8.914f, 2.187f, 9.197f, 1.996f, 9.511f, 2.0f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineTo(19.0f)
                curveTo(17.0f, 19.276f, 17.224f, 19.5f, 17.5f, 19.5f)
                curveTo(17.776f, 19.5f, 18.0f, 19.276f, 18.0f, 19.0f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 15.724f, 17.776f, 15.5f, 17.5f, 15.5f)
                curveTo(17.224f, 15.5f, 17.0f, 15.724f, 17.0f, 16.0f)
                close()
                moveTo(18.25f, 13.75f)
                curveTo(18.25f, 14.164f, 17.914f, 14.5f, 17.5f, 14.5f)
                curveTo(17.086f, 14.5f, 16.75f, 14.164f, 16.75f, 13.75f)
                curveTo(16.75f, 13.336f, 17.086f, 13.0f, 17.5f, 13.0f)
                curveTo(17.914f, 13.0f, 18.25f, 13.336f, 18.25f, 13.75f)
                close()
                moveTo(23.0f, 16.5f)
                curveTo(23.0f, 19.538f, 20.538f, 22.0f, 17.5f, 22.0f)
                curveTo(14.462f, 22.0f, 12.0f, 19.538f, 12.0f, 16.5f)
                curveTo(12.0f, 13.462f, 14.462f, 11.0f, 17.5f, 11.0f)
                curveTo(20.538f, 11.0f, 23.0f, 13.462f, 23.0f, 16.5f)
                close()
                moveTo(22.0f, 16.5f)
                curveTo(22.0f, 14.015f, 19.985f, 12.0f, 17.5f, 12.0f)
                curveTo(15.015f, 12.0f, 13.0f, 14.015f, 13.0f, 16.5f)
                curveTo(13.0f, 18.985f, 15.015f, 21.0f, 17.5f, 21.0f)
                curveTo(19.985f, 21.0f, 22.0f, 18.985f, 22.0f, 16.5f)
                close()
            }
        }
        .build()
        return _textFontInfo!!
    }

@Suppress("ObjectPropertyName")
private var _textFontInfo: ImageVector? = null

@Preview
@Composable
private fun TextFontInfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextFontInfo, contentDescription = "TextFontInfo Icon")
    }
}

