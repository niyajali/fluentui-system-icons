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
 * TextSuperscript icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, superscript
 * - Source: ic_fluent_text_superscript_24_regular.svg
 * 
 * @return The [ImageVector] for the TextSuperscript icon.
 */
public val FluentIcons.Regular.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) {
            return _textSuperscript!!
        }
        _textSuperscript = Builder(name = "TextSuperscript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.736f, 3.5f)
                curveTo(18.194f, 3.5f, 17.75f, 3.995f, 17.75f, 4.523f)
                curveTo(17.75f, 4.937f, 17.414f, 5.273f, 17.0f, 5.273f)
                curveTo(16.586f, 5.273f, 16.25f, 4.937f, 16.25f, 4.523f)
                curveTo(16.25f, 3.278f, 17.258f, 2.0f, 18.736f, 2.0f)
                curveTo(19.591f, 2.0f, 20.42f, 2.4f, 20.886f, 3.117f)
                curveTo(21.375f, 3.868f, 21.386f, 4.841f, 20.829f, 5.789f)
                curveTo(20.545f, 6.273f, 20.156f, 6.636f, 19.784f, 6.93f)
                curveTo(19.597f, 7.078f, 19.405f, 7.214f, 19.227f, 7.341f)
                lineTo(19.149f, 7.396f)
                curveTo(18.996f, 7.504f, 18.854f, 7.604f, 18.717f, 7.707f)
                curveTo(18.361f, 7.975f, 18.098f, 8.218f, 17.938f, 8.5f)
                horizontalLineTo(20.451f)
                curveTo(20.865f, 8.5f, 21.201f, 8.836f, 21.201f, 9.25f)
                curveTo(21.201f, 9.664f, 20.865f, 10.0f, 20.451f, 10.0f)
                horizontalLineTo(17.016f)
                lineTo(17.008f, 10.0f)
                lineTo(17.0f, 10.0f)
                curveTo(16.586f, 10.0f, 16.25f, 9.664f, 16.25f, 9.25f)
                curveTo(16.25f, 7.854f, 17.071f, 7.068f, 17.815f, 6.509f)
                curveTo(17.972f, 6.39f, 18.135f, 6.275f, 18.287f, 6.168f)
                lineTo(18.361f, 6.116f)
                curveTo(18.538f, 5.99f, 18.702f, 5.873f, 18.854f, 5.753f)
                curveTo(19.16f, 5.511f, 19.386f, 5.284f, 19.536f, 5.029f)
                curveTo(19.847f, 4.5f, 19.765f, 4.143f, 19.629f, 3.935f)
                curveTo(19.471f, 3.691f, 19.143f, 3.5f, 18.736f, 3.5f)
                close()
                moveTo(15.26f, 4.711f)
                curveTo(15.32f, 5.272f, 15.645f, 5.753f, 16.107f, 6.028f)
                lineTo(10.988f, 12.0f)
                lineTo(16.57f, 18.512f)
                curveTo(16.839f, 18.826f, 16.803f, 19.3f, 16.488f, 19.569f)
                curveTo(16.174f, 19.839f, 15.7f, 19.803f, 15.431f, 19.488f)
                lineTo(10.0f, 13.152f)
                lineTo(4.569f, 19.488f)
                curveTo(4.3f, 19.803f, 3.826f, 19.839f, 3.512f, 19.569f)
                curveTo(3.197f, 19.3f, 3.161f, 18.826f, 3.431f, 18.512f)
                lineTo(9.012f, 12.0f)
                lineTo(3.431f, 5.488f)
                curveTo(3.161f, 5.174f, 3.198f, 4.7f, 3.512f, 4.431f)
                curveTo(3.827f, 4.161f, 4.3f, 4.197f, 4.57f, 4.512f)
                lineTo(10.0f, 10.847f)
                lineTo(15.26f, 4.711f)
                close()
            }
        }
        .build()
        return _textSuperscript!!
    }

@Suppress("ObjectPropertyName")
private var _textSuperscript: ImageVector? = null

@Preview
@Composable
private fun TextSuperscriptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextSuperscript, contentDescription = null)
    }
}

