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
 * CodeRb Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent Ruby language.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_rb_16_filled.svg)
 * 
 * @return The [ImageVector] for the CodeRb icon.
 */
public val FluentIcons.Filled.CodeRb: ImageVector
    get() {
        if (_codeRb != null) {
            return _codeRb!!
        }
        _codeRb = Builder(name = "CodeRb", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.059f, 10.452f)
                curveTo(8.101f, 10.592f, 8.156f, 10.776f, 8.203f, 10.9f)
                lineTo(8.204f, 10.899f)
                curveTo(8.284f, 10.96f, 8.352f, 11.035f, 8.403f, 11.123f)
                curveTo(8.47f, 11.235f, 8.505f, 11.366f, 8.505f, 11.5f)
                curveTo(8.505f, 11.7f, 8.426f, 11.888f, 8.285f, 12.03f)
                curveTo(8.144f, 12.172f, 7.955f, 12.25f, 7.755f, 12.25f)
                curveTo(7.025f, 12.25f, 6.816f, 11.549f, 6.615f, 10.871f)
                curveTo(6.201f, 9.496f, 5.82f, 8.75f, 5.001f, 8.75f)
                horizontalLineTo(4.251f)
                verticalLineTo(11.5f)
                curveTo(4.251f, 11.7f, 4.173f, 11.888f, 4.031f, 12.03f)
                curveTo(3.747f, 12.313f, 3.253f, 12.313f, 2.97f, 12.03f)
                curveTo(2.828f, 11.889f, 2.75f, 11.7f, 2.75f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(2.75f, 4.3f, 2.829f, 4.112f, 2.97f, 3.97f)
                curveTo(3.111f, 3.828f, 3.3f, 3.75f, 3.5f, 3.75f)
                horizontalLineTo(5.75f)
                curveTo(6.419f, 3.751f, 7.047f, 4.01f, 7.518f, 4.482f)
                curveTo(7.989f, 4.953f, 8.25f, 5.581f, 8.25f, 6.25f)
                curveTo(8.249f, 6.722f, 8.115f, 7.181f, 7.862f, 7.579f)
                curveTo(7.664f, 7.891f, 7.402f, 8.154f, 7.092f, 8.35f)
                curveTo(7.546f, 8.981f, 7.87f, 9.685f, 8.058f, 10.448f)
                lineTo(8.059f, 10.452f)
                close()
                moveTo(6.456f, 6.957f)
                curveTo(6.643f, 6.771f, 6.75f, 6.514f, 6.75f, 6.25f)
                curveTo(6.749f, 5.988f, 6.643f, 5.731f, 6.456f, 5.545f)
                curveTo(6.27f, 5.358f, 6.013f, 5.251f, 5.749f, 5.251f)
                horizontalLineTo(4.25f)
                verticalLineTo(7.251f)
                horizontalLineTo(5.75f)
                curveTo(6.013f, 7.25f, 6.27f, 7.144f, 6.456f, 6.957f)
                close()
                moveTo(13.651f, 7.875f)
                curveTo(13.88f, 8.077f, 14.072f, 8.32f, 14.214f, 8.591f)
                horizontalLineTo(14.215f)
                curveTo(14.402f, 8.947f, 14.501f, 9.349f, 14.501f, 9.751f)
                curveTo(14.5f, 10.419f, 14.241f, 11.046f, 13.769f, 11.519f)
                curveTo(13.296f, 11.99f, 12.669f, 12.251f, 12.001f, 12.251f)
                horizontalLineTo(9.501f)
                curveTo(9.301f, 12.251f, 9.113f, 12.172f, 8.971f, 12.031f)
                curveTo(8.829f, 11.89f, 8.751f, 11.701f, 8.751f, 11.501f)
                verticalLineTo(4.501f)
                curveTo(8.751f, 4.301f, 8.83f, 4.113f, 8.971f, 3.971f)
                curveTo(9.112f, 3.829f, 9.301f, 3.751f, 9.501f, 3.751f)
                horizontalLineTo(11.751f)
                curveTo(12.42f, 3.752f, 13.048f, 4.011f, 13.519f, 4.483f)
                curveTo(13.99f, 4.956f, 14.251f, 5.583f, 14.251f, 6.251f)
                curveTo(14.251f, 6.598f, 14.181f, 6.935f, 14.043f, 7.251f)
                curveTo(13.943f, 7.479f, 13.812f, 7.688f, 13.651f, 7.875f)
                close()
                moveTo(10.25f, 5.251f)
                verticalLineTo(7.251f)
                horizontalLineTo(11.75f)
                curveTo(12.013f, 7.25f, 12.27f, 7.144f, 12.456f, 6.957f)
                curveTo(12.642f, 6.772f, 12.75f, 6.515f, 12.75f, 6.251f)
                curveTo(12.749f, 5.987f, 12.642f, 5.731f, 12.456f, 5.545f)
                curveTo(12.27f, 5.358f, 12.013f, 5.251f, 11.749f, 5.251f)
                horizontalLineTo(10.25f)
                close()
                moveTo(12.706f, 10.457f)
                curveTo(12.893f, 10.271f, 13.0f, 10.014f, 13.0f, 9.75f)
                curveTo(12.999f, 9.488f, 12.893f, 9.231f, 12.706f, 9.045f)
                curveTo(12.52f, 8.858f, 12.263f, 8.751f, 11.999f, 8.751f)
                horizontalLineTo(10.25f)
                verticalLineTo(10.751f)
                horizontalLineTo(11.999f)
                curveTo(12.263f, 10.75f, 12.52f, 10.644f, 12.706f, 10.457f)
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
        Image(imageVector = FluentIcons.Filled.CodeRb, contentDescription = "CodeRb Icon")
    }
}

