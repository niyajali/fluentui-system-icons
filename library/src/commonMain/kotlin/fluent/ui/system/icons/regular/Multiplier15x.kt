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
 * Multiplier15x Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, stream
 * - Description: Used to represent video speed. Contains number variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_multiplier_1_5x_24_regular.svg)
 * 
 * @return The [ImageVector] for the Multiplier15x icon.
 */
public val FluentIcons.Regular.Multiplier15x: ImageVector
    get() {
        if (_multiplier15x != null) {
            return _multiplier15x!!
        }
        _multiplier15x = Builder(name = "Multiplier15x", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.453f, 7.028f)
                curveTo(5.776f, 7.119f, 6.0f, 7.414f, 6.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(6.0f, 16.664f, 5.664f, 17.0f, 5.25f, 17.0f)
                curveTo(4.836f, 17.0f, 4.5f, 16.664f, 4.5f, 16.25f)
                verticalLineTo(9.833f)
                curveTo(4.118f, 10.202f, 3.66f, 10.579f, 3.136f, 10.893f)
                curveTo(2.781f, 11.106f, 2.32f, 10.991f, 2.107f, 10.636f)
                curveTo(1.894f, 10.281f, 2.009f, 9.82f, 2.364f, 9.607f)
                curveTo(3.04f, 9.202f, 3.604f, 8.642f, 4.006f, 8.168f)
                curveTo(4.205f, 7.933f, 4.36f, 7.726f, 4.463f, 7.579f)
                curveTo(4.514f, 7.506f, 4.553f, 7.448f, 4.577f, 7.41f)
                curveTo(4.59f, 7.391f, 4.599f, 7.377f, 4.604f, 7.369f)
                lineTo(4.609f, 7.36f)
                lineTo(4.61f, 7.359f)
                curveTo(4.785f, 7.072f, 5.129f, 6.937f, 5.453f, 7.028f)
                close()
                moveTo(10.75f, 7.0f)
                curveTo(10.355f, 7.0f, 10.028f, 7.306f, 10.001f, 7.7f)
                lineTo(9.751f, 11.45f)
                curveTo(9.736f, 11.676f, 9.824f, 11.896f, 9.99f, 12.05f)
                curveTo(10.155f, 12.204f, 10.382f, 12.274f, 10.606f, 12.243f)
                lineTo(12.807f, 11.928f)
                curveTo(13.964f, 11.763f, 15.0f, 12.661f, 15.0f, 13.829f)
                curveTo(15.0f, 14.89f, 14.14f, 15.75f, 13.079f, 15.75f)
                horizontalLineTo(12.724f)
                curveTo(12.082f, 15.75f, 11.47f, 15.479f, 11.038f, 15.003f)
                lineTo(10.805f, 14.746f)
                curveTo(10.527f, 14.439f, 10.052f, 14.416f, 9.746f, 14.694f)
                curveTo(9.439f, 14.973f, 9.416f, 15.447f, 9.694f, 15.754f)
                lineTo(9.927f, 16.011f)
                curveTo(10.643f, 16.8f, 11.659f, 17.25f, 12.724f, 17.25f)
                horizontalLineTo(13.079f)
                curveTo(14.968f, 17.25f, 16.5f, 15.719f, 16.5f, 13.829f)
                curveTo(16.5f, 11.748f, 14.656f, 10.149f, 12.595f, 10.443f)
                lineTo(11.309f, 10.627f)
                lineTo(11.451f, 8.5f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 8.5f, 16.0f, 8.164f, 16.0f, 7.75f)
                curveTo(16.0f, 7.336f, 15.664f, 7.0f, 15.25f, 7.0f)
                horizontalLineTo(10.75f)
                close()
                moveTo(18.281f, 12.22f)
                curveTo(17.988f, 11.927f, 17.513f, 11.927f, 17.22f, 12.22f)
                curveTo(16.927f, 12.513f, 16.927f, 12.988f, 17.22f, 13.28f)
                lineTo(18.439f, 14.5f)
                lineTo(17.22f, 15.72f)
                curveTo(16.927f, 16.013f, 16.927f, 16.487f, 17.22f, 16.78f)
                curveTo(17.513f, 17.073f, 17.988f, 17.073f, 18.281f, 16.78f)
                lineTo(19.5f, 15.561f)
                lineTo(20.72f, 16.78f)
                curveTo(21.013f, 17.073f, 21.487f, 17.073f, 21.78f, 16.78f)
                curveTo(22.073f, 16.487f, 22.073f, 16.013f, 21.78f, 15.72f)
                lineTo(20.561f, 14.5f)
                lineTo(21.78f, 13.28f)
                curveTo(22.073f, 12.988f, 22.073f, 12.513f, 21.78f, 12.22f)
                curveTo(21.487f, 11.927f, 21.013f, 11.927f, 20.72f, 12.22f)
                lineTo(19.5f, 13.439f)
                lineTo(18.281f, 12.22f)
                close()
                moveTo(8.5f, 16.25f)
                curveTo(8.5f, 16.664f, 8.164f, 17.0f, 7.75f, 17.0f)
                curveTo(7.336f, 17.0f, 7.0f, 16.664f, 7.0f, 16.25f)
                curveTo(7.0f, 15.836f, 7.336f, 15.5f, 7.75f, 15.5f)
                curveTo(8.164f, 15.5f, 8.5f, 15.836f, 8.5f, 16.25f)
                close()
            }
        }
        .build()
        return _multiplier15x!!
    }

@Suppress("ObjectPropertyName")
private var _multiplier15x: ImageVector? = null

@Preview
@Composable
private fun Multiplier15xPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Multiplier15x, contentDescription = "Multiplier15x Icon")
    }
}

