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

package fluent.ui.system.icons.filled

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
 * TextBulletListCheckmark icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: text, bullet, list, checkmark
 * - Source: ic_fluent_text_bullet_list_checkmark_20_filled.svg
 * 
 * @return The [ImageVector] for the TextBulletListCheckmark icon.
 */
public val FluentIcons.Filled.TextBulletListCheckmark: ImageVector
    get() {
        if (_textBulletListCheckmark != null) {
            return _textBulletListCheckmark!!
        }
        _textBulletListCheckmark = Builder(name = "TextBulletListCheckmark", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.25f, 6.0f)
                curveTo(3.94f, 6.0f, 4.5f, 5.44f, 4.5f, 4.75f)
                curveTo(4.5f, 4.06f, 3.94f, 3.5f, 3.25f, 3.5f)
                curveTo(2.56f, 3.5f, 2.0f, 4.06f, 2.0f, 4.75f)
                curveTo(2.0f, 5.44f, 2.56f, 6.0f, 3.25f, 6.0f)
                close()
                moveTo(7.0f, 4.75f)
                curveTo(7.0f, 4.336f, 7.336f, 4.0f, 7.75f, 4.0f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 4.0f, 18.0f, 4.336f, 18.0f, 4.75f)
                curveTo(18.0f, 5.164f, 17.664f, 5.5f, 17.25f, 5.5f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 5.5f, 7.0f, 5.164f, 7.0f, 4.75f)
                close()
                moveTo(7.75f, 9.0f)
                curveTo(7.336f, 9.0f, 7.0f, 9.336f, 7.0f, 9.75f)
                curveTo(7.0f, 10.164f, 7.336f, 10.5f, 7.75f, 10.5f)
                horizontalLineTo(13.205f)
                curveTo(13.904f, 10.179f, 14.681f, 10.0f, 15.5f, 10.0f)
                curveTo(16.243f, 10.0f, 16.952f, 10.147f, 17.598f, 10.414f)
                curveTo(17.837f, 10.289f, 18.0f, 10.038f, 18.0f, 9.75f)
                curveTo(18.0f, 9.336f, 17.664f, 9.0f, 17.25f, 9.0f)
                horizontalLineTo(7.75f)
                close()
                moveTo(7.75f, 14.0f)
                horizontalLineTo(10.207f)
                curveTo(10.072f, 14.477f, 10.0f, 14.98f, 10.0f, 15.5f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 15.5f, 7.0f, 15.164f, 7.0f, 14.75f)
                curveTo(7.0f, 14.336f, 7.336f, 14.0f, 7.75f, 14.0f)
                close()
                moveTo(4.5f, 9.75f)
                curveTo(4.5f, 10.44f, 3.94f, 11.0f, 3.25f, 11.0f)
                curveTo(2.56f, 11.0f, 2.0f, 10.44f, 2.0f, 9.75f)
                curveTo(2.0f, 9.06f, 2.56f, 8.5f, 3.25f, 8.5f)
                curveTo(3.94f, 8.5f, 4.5f, 9.06f, 4.5f, 9.75f)
                close()
                moveTo(3.25f, 16.0f)
                curveTo(3.94f, 16.0f, 4.5f, 15.44f, 4.5f, 14.75f)
                curveTo(4.5f, 14.06f, 3.94f, 13.5f, 3.25f, 13.5f)
                curveTo(2.56f, 13.5f, 2.0f, 14.06f, 2.0f, 14.75f)
                curveTo(2.0f, 15.44f, 2.56f, 16.0f, 3.25f, 16.0f)
                close()
                moveTo(20.0f, 15.5f)
                curveTo(20.0f, 17.985f, 17.985f, 20.0f, 15.5f, 20.0f)
                curveTo(13.015f, 20.0f, 11.0f, 17.985f, 11.0f, 15.5f)
                curveTo(11.0f, 13.015f, 13.015f, 11.0f, 15.5f, 11.0f)
                curveTo(17.985f, 11.0f, 20.0f, 13.015f, 20.0f, 15.5f)
                close()
                moveTo(17.146f, 13.646f)
                lineTo(14.5f, 16.293f)
                lineTo(13.854f, 15.646f)
                curveTo(13.658f, 15.451f, 13.342f, 15.451f, 13.146f, 15.646f)
                curveTo(12.951f, 15.842f, 12.951f, 16.158f, 13.146f, 16.354f)
                lineTo(14.146f, 17.354f)
                curveTo(14.342f, 17.549f, 14.658f, 17.549f, 14.854f, 17.354f)
                lineTo(17.854f, 14.354f)
                curveTo(18.049f, 14.158f, 18.049f, 13.842f, 17.854f, 13.646f)
                curveTo(17.658f, 13.451f, 17.342f, 13.451f, 17.146f, 13.646f)
                close()
            }
        }
        .build()
        return _textBulletListCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _textBulletListCheckmark: ImageVector? = null

@Preview
@Composable
private fun TextBulletListCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBulletListCheckmark, contentDescription = null)
    }
}

