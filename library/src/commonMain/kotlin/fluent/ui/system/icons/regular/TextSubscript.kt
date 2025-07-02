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
 * TextSubscript icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, subscript
 * - Source: ic_fluent_text_subscript_24_regular.svg
 * 
 * @return The [ImageVector] for the TextSubscript icon.
 */
public val FluentIcons.Regular.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) {
            return _textSubscript!!
        }
        _textSubscript = Builder(name = "TextSubscript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.488f, 4.431f)
                curveTo(16.803f, 4.7f, 16.839f, 5.174f, 16.569f, 5.488f)
                lineTo(10.988f, 12.0f)
                lineTo(16.02f, 17.871f)
                curveTo(15.718f, 18.281f, 15.465f, 18.777f, 15.338f, 19.38f)
                lineTo(10.0f, 13.152f)
                lineTo(4.569f, 19.488f)
                curveTo(4.3f, 19.803f, 3.826f, 19.839f, 3.512f, 19.569f)
                curveTo(3.197f, 19.3f, 3.161f, 18.826f, 3.431f, 18.512f)
                lineTo(9.012f, 12.0f)
                lineTo(3.431f, 5.488f)
                curveTo(3.161f, 5.174f, 3.198f, 4.7f, 3.512f, 4.431f)
                curveTo(3.827f, 4.161f, 4.3f, 4.197f, 4.57f, 4.512f)
                lineTo(10.0f, 10.847f)
                lineTo(15.431f, 4.512f)
                curveTo(15.7f, 4.197f, 16.174f, 4.161f, 16.488f, 4.431f)
                close()
                moveTo(17.75f, 15.523f)
                curveTo(17.75f, 14.995f, 18.194f, 14.5f, 18.736f, 14.5f)
                curveTo(19.143f, 14.5f, 19.471f, 14.691f, 19.629f, 14.934f)
                curveTo(19.765f, 15.143f, 19.847f, 15.5f, 19.536f, 16.029f)
                curveTo(19.386f, 16.284f, 19.16f, 16.511f, 18.854f, 16.753f)
                curveTo(18.702f, 16.874f, 18.538f, 16.99f, 18.361f, 17.116f)
                lineTo(18.287f, 17.168f)
                curveTo(18.135f, 17.275f, 17.972f, 17.39f, 17.815f, 17.509f)
                curveTo(17.071f, 18.068f, 16.25f, 18.854f, 16.25f, 20.25f)
                curveTo(16.25f, 20.664f, 16.586f, 21.0f, 17.0f, 21.0f)
                lineTo(17.008f, 21.0f)
                lineTo(17.016f, 21.0f)
                horizontalLineTo(20.451f)
                curveTo(20.865f, 21.0f, 21.201f, 20.664f, 21.201f, 20.25f)
                curveTo(21.201f, 19.836f, 20.865f, 19.5f, 20.451f, 19.5f)
                horizontalLineTo(17.938f)
                curveTo(18.098f, 19.218f, 18.361f, 18.975f, 18.717f, 18.707f)
                curveTo(18.854f, 18.604f, 18.996f, 18.504f, 19.149f, 18.396f)
                lineTo(19.227f, 18.341f)
                curveTo(19.405f, 18.215f, 19.597f, 18.077f, 19.784f, 17.93f)
                curveTo(20.156f, 17.636f, 20.545f, 17.273f, 20.829f, 16.789f)
                curveTo(21.386f, 15.841f, 21.375f, 14.868f, 20.886f, 14.117f)
                curveTo(20.42f, 13.4f, 19.591f, 13.0f, 18.736f, 13.0f)
                curveTo(17.258f, 13.0f, 16.25f, 14.278f, 16.25f, 15.523f)
                curveTo(16.25f, 15.937f, 16.586f, 16.273f, 17.0f, 16.273f)
                curveTo(17.414f, 16.273f, 17.75f, 15.937f, 17.75f, 15.523f)
                close()
            }
        }
        .build()
        return _textSubscript!!
    }

@Suppress("ObjectPropertyName")
private var _textSubscript: ImageVector? = null

@Preview
@Composable
private fun TextSubscriptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextSubscript, contentDescription = null)
    }
}

