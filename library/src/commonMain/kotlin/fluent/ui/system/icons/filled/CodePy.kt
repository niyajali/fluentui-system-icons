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
 * CodePy icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: code, py
 * - Source: ic_fluent_code_py_16_filled.svg
 * 
 * @return The [ImageVector] for the CodePy icon.
 */
public val FluentIcons.Filled.CodePy: ImageVector
    get() {
        if (_codePy != null) {
            return _codePy!!
        }
        _codePy = Builder(name = "CodePy", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.441f, 3.894f)
                curveTo(14.519f, 3.95f, 14.586f, 4.022f, 14.639f, 4.108f)
                lineTo(14.637f, 4.109f)
                curveTo(14.689f, 4.191f, 14.725f, 4.286f, 14.74f, 4.385f)
                curveTo(14.755f, 4.478f, 14.752f, 4.576f, 14.731f, 4.673f)
                curveTo(14.706f, 4.773f, 14.666f, 4.862f, 14.609f, 4.94f)
                lineTo(12.249f, 8.244f)
                verticalLineTo(11.504f)
                curveTo(12.249f, 11.702f, 12.169f, 11.895f, 12.029f, 12.035f)
                curveTo(11.889f, 12.176f, 11.7f, 12.254f, 11.499f, 12.254f)
                curveTo(11.298f, 12.254f, 11.11f, 12.176f, 10.969f, 12.035f)
                curveTo(10.829f, 11.896f, 10.749f, 11.702f, 10.749f, 11.504f)
                verticalLineTo(8.244f)
                lineTo(8.389f, 4.94f)
                curveTo(8.331f, 4.86f, 8.288f, 4.767f, 8.267f, 4.672f)
                curveTo(8.245f, 4.574f, 8.241f, 4.476f, 8.257f, 4.38f)
                curveTo(8.274f, 4.286f, 8.309f, 4.191f, 8.361f, 4.107f)
                curveTo(8.414f, 4.022f, 8.482f, 3.95f, 8.564f, 3.891f)
                curveTo(8.644f, 3.833f, 8.734f, 3.792f, 8.832f, 3.77f)
                curveTo(8.923f, 3.748f, 9.024f, 3.744f, 9.124f, 3.76f)
                curveTo(9.222f, 3.776f, 9.316f, 3.811f, 9.4f, 3.865f)
                curveTo(9.485f, 3.919f, 9.556f, 3.986f, 9.613f, 4.065f)
                lineTo(11.5f, 6.712f)
                lineTo(13.39f, 4.066f)
                curveTo(13.444f, 3.988f, 13.516f, 3.92f, 13.602f, 3.866f)
                curveTo(13.686f, 3.813f, 13.779f, 3.778f, 13.879f, 3.761f)
                curveTo(13.981f, 3.745f, 14.078f, 3.749f, 14.174f, 3.772f)
                curveTo(14.268f, 3.793f, 14.359f, 3.834f, 14.441f, 3.894f)
                close()
                moveTo(3.5f, 3.753f)
                horizontalLineTo(5.75f)
                curveTo(6.418f, 3.754f, 7.046f, 4.014f, 7.518f, 4.486f)
                curveTo(7.989f, 4.957f, 8.25f, 5.585f, 8.25f, 6.253f)
                curveTo(8.249f, 6.922f, 7.99f, 7.55f, 7.518f, 8.021f)
                curveTo(7.045f, 8.493f, 6.418f, 8.753f, 5.75f, 8.753f)
                horizontalLineTo(4.25f)
                verticalLineTo(11.503f)
                curveTo(4.25f, 11.701f, 4.17f, 11.894f, 4.03f, 12.034f)
                curveTo(3.89f, 12.175f, 3.701f, 12.253f, 3.5f, 12.253f)
                curveTo(3.299f, 12.253f, 3.111f, 12.175f, 2.97f, 12.034f)
                curveTo(2.83f, 11.895f, 2.75f, 11.701f, 2.75f, 11.503f)
                verticalLineTo(4.503f)
                curveTo(2.75f, 4.306f, 2.83f, 4.113f, 2.97f, 3.973f)
                curveTo(3.111f, 3.831f, 3.3f, 3.753f, 3.5f, 3.753f)
                close()
                moveTo(4.25f, 7.253f)
                horizontalLineTo(5.75f)
                curveTo(6.014f, 7.253f, 6.27f, 7.147f, 6.456f, 6.96f)
                curveTo(6.645f, 6.772f, 6.75f, 6.52f, 6.75f, 6.252f)
                curveTo(6.749f, 5.986f, 6.644f, 5.735f, 6.456f, 5.547f)
                curveTo(6.27f, 5.36f, 6.013f, 5.253f, 5.749f, 5.253f)
                horizontalLineTo(4.25f)
                verticalLineTo(7.253f)
                close()
            }
        }
        .build()
        return _codePy!!
    }

@Suppress("ObjectPropertyName")
private var _codePy: ImageVector? = null

@Preview
@Composable
private fun CodePyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CodePy, contentDescription = null)
    }
}

