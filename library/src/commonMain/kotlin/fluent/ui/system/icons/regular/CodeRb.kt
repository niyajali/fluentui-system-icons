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
 * CodeRb Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent Ruby language.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_rb_16_regular.svg)
 * 
 * @return The [ImageVector] for the CodeRb icon.
 */
public val FluentIcons.Regular.CodeRb: ImageVector
    get() {
        if (_codeRb != null) {
            return _codeRb!!
        }
        _codeRb = Builder(name = "CodeRb", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.279f, 7.9f)
                curveTo(13.507f, 7.69f, 13.688f, 7.434f, 13.812f, 7.15f)
                curveTo(13.936f, 6.867f, 14.0f, 6.56f, 14.0f, 6.25f)
                curveTo(14.0f, 5.653f, 13.762f, 5.081f, 13.34f, 4.66f)
                curveTo(12.919f, 4.238f, 12.347f, 4.001f, 11.75f, 4.0f)
                horizontalLineTo(9.5f)
                curveTo(9.367f, 4.0f, 9.24f, 4.053f, 9.146f, 4.146f)
                curveTo(9.053f, 4.24f, 9.0f, 4.367f, 9.0f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(9.0f, 11.633f, 9.053f, 11.76f, 9.146f, 11.854f)
                curveTo(9.24f, 11.947f, 9.367f, 12.0f, 9.5f, 12.0f)
                horizontalLineTo(12.0f)
                curveTo(12.597f, 12.0f, 13.169f, 11.762f, 13.59f, 11.34f)
                curveTo(14.012f, 10.919f, 14.25f, 10.347f, 14.25f, 9.75f)
                curveTo(14.25f, 9.386f, 14.161f, 9.028f, 13.992f, 8.706f)
                curveTo(13.823f, 8.383f, 13.578f, 8.107f, 13.279f, 7.9f)
                close()
                moveTo(13.0f, 6.25f)
                curveTo(13.0f, 6.581f, 12.868f, 6.899f, 12.633f, 7.133f)
                curveTo(12.399f, 7.368f, 12.081f, 7.499f, 11.75f, 7.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.75f)
                curveTo(12.081f, 5.001f, 12.399f, 5.132f, 12.633f, 5.367f)
                curveTo(12.868f, 5.601f, 13.0f, 5.919f, 13.0f, 6.25f)
                close()
                moveTo(12.0f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(12.0f)
                curveTo(12.331f, 8.501f, 12.649f, 8.632f, 12.883f, 8.867f)
                curveTo(13.118f, 9.101f, 13.25f, 9.419f, 13.25f, 9.75f)
                curveTo(13.25f, 10.081f, 13.118f, 10.399f, 12.883f, 10.633f)
                curveTo(12.649f, 10.868f, 12.331f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(8.0f, 11.065f)
                curveTo(7.947f, 10.944f, 7.872f, 10.696f, 7.815f, 10.507f)
                curveTo(7.615f, 9.692f, 7.242f, 8.929f, 6.72f, 8.271f)
                curveTo(7.102f, 8.089f, 7.425f, 7.803f, 7.651f, 7.445f)
                curveTo(7.878f, 7.087f, 7.999f, 6.673f, 8.0f, 6.25f)
                curveTo(7.999f, 5.653f, 7.762f, 5.081f, 7.34f, 4.66f)
                curveTo(6.919f, 4.238f, 6.347f, 4.001f, 5.75f, 4.0f)
                horizontalLineTo(3.5f)
                curveTo(3.367f, 4.0f, 3.24f, 4.053f, 3.146f, 4.146f)
                curveTo(3.053f, 4.24f, 3.0f, 4.367f, 3.0f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(3.0f, 11.633f, 3.053f, 11.76f, 3.146f, 11.854f)
                curveTo(3.24f, 11.947f, 3.367f, 12.0f, 3.5f, 12.0f)
                curveTo(3.633f, 12.0f, 3.76f, 11.947f, 3.854f, 11.854f)
                curveTo(3.947f, 11.76f, 4.0f, 11.633f, 4.0f, 11.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(5.0f)
                curveTo(6.07f, 8.5f, 6.488f, 9.587f, 6.854f, 10.8f)
                curveTo(7.054f, 11.472f, 7.219f, 12.0f, 7.754f, 12.0f)
                curveTo(7.887f, 12.0f, 8.014f, 11.947f, 8.108f, 11.854f)
                curveTo(8.201f, 11.76f, 8.254f, 11.633f, 8.254f, 11.5f)
                curveTo(8.254f, 11.411f, 8.23f, 11.325f, 8.186f, 11.248f)
                curveTo(8.141f, 11.172f, 8.077f, 11.108f, 8.0f, 11.065f)
                close()
                moveTo(4.0f, 5.0f)
                horizontalLineTo(5.75f)
                curveTo(6.081f, 5.001f, 6.399f, 5.132f, 6.633f, 5.367f)
                curveTo(6.868f, 5.601f, 6.999f, 5.919f, 7.0f, 6.25f)
                curveTo(6.999f, 6.581f, 6.868f, 6.899f, 6.633f, 7.133f)
                curveTo(6.399f, 7.368f, 6.081f, 7.499f, 5.75f, 7.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _codeRb!!
    }

@Suppress("ObjectPropertyName")
private var _codeRb: ImageVector? = null

@Preview
@Composable
private fun CodeRbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeRb, contentDescription = "CodeRb Icon")
    }
}

