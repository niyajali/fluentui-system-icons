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
 * Multiplier1x Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon, stream
 * - Description: Used to represent video speed. Contains number variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_multiplier_1x_24_filled.svg)
 * 
 * @return The [ImageVector] for the Multiplier1x icon.
 */
public val FluentIcons.Filled.Multiplier1x: ImageVector
    get() {
        if (_multiplier1x != null) {
            return _multiplier1x!!
        }
        _multiplier1x = Builder(name = "Multiplier1x", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 7.902f)
                curveTo(10.0f, 7.453f, 9.702f, 7.06f, 9.27f, 6.939f)
                curveTo(8.839f, 6.818f, 8.379f, 6.999f, 8.146f, 7.382f)
                curveTo(8.122f, 7.422f, 8.097f, 7.462f, 8.073f, 7.502f)
                curveTo(7.67f, 8.169f, 7.231f, 8.896f, 5.986f, 9.643f)
                curveTo(5.512f, 9.927f, 5.359f, 10.541f, 5.643f, 11.015f)
                curveTo(5.927f, 11.489f, 6.541f, 11.642f, 7.015f, 11.358f)
                curveTo(7.392f, 11.132f, 7.718f, 10.901f, 8.0f, 10.672f)
                verticalLineTo(16.001f)
                curveTo(8.0f, 16.553f, 8.448f, 17.001f, 9.0f, 17.001f)
                curveTo(9.553f, 17.001f, 10.0f, 16.553f, 10.0f, 16.001f)
                verticalLineTo(7.902f)
                close()
                moveTo(13.707f, 12.294f)
                curveTo(13.317f, 11.903f, 12.683f, 11.903f, 12.293f, 12.294f)
                curveTo(11.902f, 12.684f, 11.902f, 13.317f, 12.293f, 13.708f)
                lineTo(13.086f, 14.501f)
                lineTo(12.293f, 15.294f)
                curveTo(11.902f, 15.685f, 11.902f, 16.318f, 12.293f, 16.708f)
                curveTo(12.683f, 17.099f, 13.317f, 17.099f, 13.707f, 16.708f)
                lineTo(14.5f, 15.915f)
                lineTo(15.293f, 16.708f)
                curveTo(15.683f, 17.099f, 16.317f, 17.099f, 16.707f, 16.708f)
                curveTo(17.098f, 16.318f, 17.098f, 15.685f, 16.707f, 15.294f)
                lineTo(15.914f, 14.501f)
                lineTo(16.707f, 13.708f)
                curveTo(17.098f, 13.317f, 17.098f, 12.684f, 16.707f, 12.294f)
                curveTo(16.317f, 11.903f, 15.683f, 11.903f, 15.293f, 12.294f)
                lineTo(14.5f, 13.087f)
                lineTo(13.707f, 12.294f)
                close()
            }
        }
        .build()
        return _multiplier1x!!
    }

@Suppress("ObjectPropertyName")
private var _multiplier1x: ImageVector? = null

@Preview
@Composable
private fun Multiplier1xPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Multiplier1x, contentDescription = "Multiplier1x Icon")
    }
}

