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
 * TextLineSpacing Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_line_spacing_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextLineSpacing icon.
 */
public val FluentIcons.Regular.TextLineSpacing: ImageVector
    get() {
        if (_textLineSpacing != null) {
            return _textLineSpacing!!
        }
        _textLineSpacing = Builder(name = "TextLineSpacing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.53f, 3.22f)
                lineTo(21.53f, 5.22f)
                curveTo(21.823f, 5.513f, 21.823f, 5.987f, 21.53f, 6.28f)
                curveTo(21.237f, 6.573f, 20.763f, 6.573f, 20.47f, 6.28f)
                lineTo(19.75f, 5.561f)
                verticalLineTo(10.25f)
                curveTo(19.75f, 10.664f, 19.414f, 11.0f, 19.0f, 11.0f)
                curveTo(18.586f, 11.0f, 18.25f, 10.664f, 18.25f, 10.25f)
                verticalLineTo(5.561f)
                lineTo(17.53f, 6.28f)
                curveTo(17.237f, 6.573f, 16.763f, 6.573f, 16.47f, 6.28f)
                curveTo(16.177f, 5.987f, 16.177f, 5.513f, 16.47f, 5.22f)
                lineTo(18.47f, 3.22f)
                curveTo(18.615f, 3.074f, 18.807f, 3.001f, 18.998f, 3.0f)
                lineTo(19.0f, 3.0f)
                lineTo(19.002f, 3.0f)
                curveTo(19.103f, 3.0f, 19.199f, 3.021f, 19.287f, 3.057f)
                curveTo(19.375f, 3.094f, 19.458f, 3.148f, 19.53f, 3.22f)
                close()
                moveTo(2.0f, 5.75f)
                curveTo(2.0f, 5.336f, 2.336f, 5.0f, 2.75f, 5.0f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 5.0f, 12.0f, 5.336f, 12.0f, 5.75f)
                curveTo(12.0f, 6.164f, 11.664f, 6.5f, 11.25f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 6.5f, 2.0f, 6.164f, 2.0f, 5.75f)
                close()
                moveTo(2.0f, 12.25f)
                curveTo(2.0f, 11.836f, 2.336f, 11.5f, 2.75f, 11.5f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 11.5f, 15.0f, 11.836f, 15.0f, 12.25f)
                curveTo(15.0f, 12.664f, 14.664f, 13.0f, 14.25f, 13.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.0f, 2.0f, 12.664f, 2.0f, 12.25f)
                close()
                moveTo(2.75f, 18.0f)
                curveTo(2.336f, 18.0f, 2.0f, 18.336f, 2.0f, 18.75f)
                curveTo(2.0f, 19.164f, 2.336f, 19.5f, 2.75f, 19.5f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 19.5f, 12.0f, 19.164f, 12.0f, 18.75f)
                curveTo(12.0f, 18.336f, 11.664f, 18.0f, 11.25f, 18.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(18.25f, 18.439f)
                verticalLineTo(13.75f)
                curveTo(18.25f, 13.336f, 18.586f, 13.0f, 19.0f, 13.0f)
                curveTo(19.414f, 13.0f, 19.75f, 13.336f, 19.75f, 13.75f)
                verticalLineTo(18.439f)
                lineTo(20.47f, 17.72f)
                curveTo(20.763f, 17.427f, 21.237f, 17.427f, 21.53f, 17.72f)
                curveTo(21.823f, 18.013f, 21.823f, 18.487f, 21.53f, 18.78f)
                lineTo(19.53f, 20.78f)
                curveTo(19.458f, 20.852f, 19.375f, 20.906f, 19.287f, 20.943f)
                curveTo(19.21f, 20.975f, 19.126f, 20.995f, 19.039f, 20.999f)
                curveTo(19.026f, 21.0f, 19.013f, 21.0f, 19.0f, 21.0f)
                curveTo(18.898f, 21.0f, 18.801f, 20.98f, 18.713f, 20.943f)
                curveTo(18.625f, 20.906f, 18.542f, 20.852f, 18.47f, 20.78f)
                lineTo(16.47f, 18.78f)
                curveTo(16.177f, 18.487f, 16.177f, 18.013f, 16.47f, 17.72f)
                curveTo(16.763f, 17.427f, 17.237f, 17.427f, 17.53f, 17.72f)
                lineTo(18.25f, 18.439f)
                close()
            }
        }
        .build()
        return _textLineSpacing!!
    }

@Suppress("ObjectPropertyName")
private var _textLineSpacing: ImageVector? = null

@Preview
@Composable
private fun TextLineSpacingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextLineSpacing, contentDescription = "TextLineSpacing Icon")
    }
}

