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
 * TextAddSpaceAfter icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, add, space, after
 * - Source: ic_fluent_text_add_space_after_24_regular.svg
 * 
 * @return The [ImageVector] for the TextAddSpaceAfter icon.
 */
public val FluentIcons.Regular.TextAddSpaceAfter: ImageVector
    get() {
        if (_textAddSpaceAfter != null) {
            return _textAddSpaceAfter!!
        }
        _textAddSpaceAfter = Builder(name = "TextAddSpaceAfter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.75f)
                curveTo(3.0f, 6.336f, 3.336f, 6.0f, 3.75f, 6.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 6.0f, 21.0f, 6.336f, 21.0f, 6.75f)
                curveTo(21.0f, 7.164f, 20.664f, 7.5f, 20.25f, 7.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 7.5f, 3.0f, 7.164f, 3.0f, 6.75f)
                close()
                moveTo(3.0f, 12.75f)
                curveTo(3.0f, 12.336f, 3.336f, 12.0f, 3.75f, 12.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 12.0f, 21.0f, 12.336f, 21.0f, 12.75f)
                curveTo(21.0f, 13.164f, 20.664f, 13.5f, 20.25f, 13.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 13.5f, 3.0f, 13.164f, 3.0f, 12.75f)
                close()
                moveTo(9.47f, 18.22f)
                curveTo(9.177f, 18.513f, 9.177f, 18.987f, 9.47f, 19.28f)
                curveTo(9.763f, 19.573f, 10.237f, 19.573f, 10.53f, 19.28f)
                lineTo(12.0f, 17.811f)
                lineTo(13.47f, 19.28f)
                curveTo(13.763f, 19.573f, 14.237f, 19.573f, 14.53f, 19.28f)
                curveTo(14.823f, 18.987f, 14.823f, 18.513f, 14.53f, 18.22f)
                lineTo(12.53f, 16.22f)
                curveTo(12.237f, 15.927f, 11.763f, 15.927f, 11.47f, 16.22f)
                lineTo(9.47f, 18.22f)
                close()
            }
        }
        .build()
        return _textAddSpaceAfter!!
    }

@Suppress("ObjectPropertyName")
private var _textAddSpaceAfter: ImageVector? = null

@Preview
@Composable
private fun TextAddSpaceAfterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextAddSpaceAfter, contentDescription = null)
    }
}

