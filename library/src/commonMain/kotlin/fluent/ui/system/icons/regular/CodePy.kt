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
 * CodePy icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: code, py
 * - Source: ic_fluent_code_py_16_regular.svg
 * 
 * @return The [ImageVector] for the CodePy icon.
 */
public val FluentIcons.Regular.CodePy: ImageVector
    get() {
        if (_codePy != null) {
            return _codePy!!
        }
        _codePy = Builder(name = "CodePy", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.75f, 4.0f)
                horizontalLineTo(3.5f)
                curveTo(3.367f, 4.0f, 3.24f, 4.052f, 3.146f, 4.146f)
                curveTo(3.053f, 4.24f, 3.0f, 4.367f, 3.0f, 4.499f)
                verticalLineTo(11.5f)
                curveTo(3.0f, 11.632f, 3.053f, 11.759f, 3.146f, 11.853f)
                curveTo(3.24f, 11.947f, 3.367f, 12.0f, 3.5f, 12.0f)
                curveTo(3.633f, 12.0f, 3.76f, 11.947f, 3.854f, 11.853f)
                curveTo(3.947f, 11.759f, 4.0f, 11.632f, 4.0f, 11.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(5.75f)
                curveTo(6.347f, 8.499f, 6.919f, 8.262f, 7.34f, 7.84f)
                curveTo(7.762f, 7.418f, 7.999f, 6.846f, 8.0f, 6.249f)
                curveTo(7.999f, 5.653f, 7.762f, 5.081f, 7.34f, 4.659f)
                curveTo(6.919f, 4.237f, 6.347f, 4.0f, 5.75f, 4.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(5.75f, 7.499f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.999f)
                horizontalLineTo(5.75f)
                curveTo(6.081f, 5.0f, 6.399f, 5.132f, 6.633f, 5.366f)
                curveTo(6.868f, 5.601f, 6.999f, 5.918f, 7.0f, 6.249f)
                curveTo(6.999f, 6.581f, 6.868f, 6.898f, 6.633f, 7.133f)
                curveTo(6.399f, 7.367f, 6.081f, 7.499f, 5.75f, 7.499f)
                verticalLineTo(7.499f)
                close()
                moveTo(14.407f, 4.791f)
                lineTo(12.0f, 8.16f)
                verticalLineTo(11.5f)
                curveTo(12.0f, 11.632f, 11.947f, 11.759f, 11.854f, 11.853f)
                curveTo(11.76f, 11.947f, 11.633f, 12.0f, 11.5f, 12.0f)
                curveTo(11.367f, 12.0f, 11.24f, 11.947f, 11.146f, 11.853f)
                curveTo(11.053f, 11.759f, 11.0f, 11.632f, 11.0f, 11.5f)
                verticalLineTo(8.16f)
                lineTo(8.593f, 4.791f)
                curveTo(8.554f, 4.737f, 8.527f, 4.676f, 8.512f, 4.612f)
                curveTo(8.497f, 4.548f, 8.495f, 4.481f, 8.505f, 4.416f)
                curveTo(8.516f, 4.351f, 8.54f, 4.289f, 8.575f, 4.233f)
                curveTo(8.61f, 4.177f, 8.655f, 4.129f, 8.709f, 4.09f)
                curveTo(8.762f, 4.052f, 8.823f, 4.024f, 8.887f, 4.009f)
                curveTo(8.952f, 3.994f, 9.018f, 3.992f, 9.083f, 4.003f)
                curveTo(9.148f, 4.014f, 9.21f, 4.037f, 9.266f, 4.072f)
                curveTo(9.322f, 4.107f, 9.371f, 4.153f, 9.409f, 4.207f)
                lineTo(11.5f, 7.14f)
                lineTo(13.593f, 4.208f)
                curveTo(13.631f, 4.155f, 13.68f, 4.109f, 13.736f, 4.074f)
                curveTo(13.792f, 4.039f, 13.854f, 4.016f, 13.919f, 4.005f)
                curveTo(13.984f, 3.994f, 14.05f, 3.996f, 14.115f, 4.011f)
                curveTo(14.179f, 4.026f, 14.24f, 4.054f, 14.293f, 4.093f)
                curveTo(14.346f, 4.131f, 14.392f, 4.179f, 14.426f, 4.235f)
                curveTo(14.461f, 4.291f, 14.484f, 4.353f, 14.495f, 4.418f)
                curveTo(14.505f, 4.483f, 14.503f, 4.549f, 14.488f, 4.613f)
                curveTo(14.473f, 4.677f, 14.445f, 4.737f, 14.407f, 4.791f)
                verticalLineTo(4.791f)
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
        Image(imageVector = FluentIcons.Regular.CodePy, contentDescription = null)
    }
}

