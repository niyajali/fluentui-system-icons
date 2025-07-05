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
 * Cellular3g Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used for device connection status.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_cellular_3g_24_regular.svg)
 * 
 * @return The [ImageVector] for the Cellular3g icon.
 */
public val FluentIcons.Regular.Cellular3g: ImageVector
    get() {
        if (_cellular3g != null) {
            return _cellular3g!!
        }
        _cellular3g = Builder(name = "Cellular3g", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.896f, 3.619f)
                lineTo(12.896f, 3.62f)
                curveTo(13.106f, 3.977f, 12.987f, 4.437f, 12.63f, 4.647f)
                curveTo(12.282f, 4.851f, 11.836f, 4.743f, 11.619f, 4.406f)
                curveTo(11.616f, 4.402f, 11.611f, 4.396f, 11.604f, 4.388f)
                curveTo(11.58f, 4.363f, 11.531f, 4.317f, 11.45f, 4.272f)
                curveTo(11.303f, 4.19f, 10.983f, 4.071f, 10.385f, 4.181f)
                curveTo(9.977f, 4.256f, 9.766f, 4.515f, 9.636f, 4.848f)
                curveTo(9.57f, 5.017f, 9.534f, 5.188f, 9.517f, 5.319f)
                curveTo(9.508f, 5.383f, 9.504f, 5.435f, 9.502f, 5.467f)
                curveTo(9.501f, 5.484f, 9.5f, 5.495f, 9.5f, 5.501f)
                lineTo(9.5f, 5.504f)
                verticalLineTo(6.75f)
                curveTo(9.5f, 7.302f, 9.948f, 7.75f, 10.5f, 7.75f)
                horizontalLineTo(10.75f)
                curveTo(11.216f, 7.75f, 11.608f, 7.431f, 11.719f, 7.0f)
                horizontalLineTo(11.25f)
                curveTo(10.836f, 7.0f, 10.5f, 6.664f, 10.5f, 6.25f)
                curveTo(10.5f, 5.836f, 10.836f, 5.5f, 11.25f, 5.5f)
                horizontalLineTo(12.491f)
                lineTo(12.5f, 5.5f)
                curveTo(12.914f, 5.5f, 13.25f, 5.836f, 13.25f, 6.25f)
                verticalLineTo(6.75f)
                curveTo(13.25f, 8.131f, 12.131f, 9.25f, 10.75f, 9.25f)
                horizontalLineTo(10.5f)
                curveTo(9.119f, 9.25f, 8.0f, 8.131f, 8.0f, 6.75f)
                verticalLineTo(5.499f)
                lineTo(8.0f, 5.497f)
                lineTo(8.0f, 5.494f)
                lineTo(8.0f, 5.485f)
                lineTo(8.001f, 5.459f)
                curveTo(8.001f, 5.439f, 8.002f, 5.411f, 8.004f, 5.378f)
                curveTo(8.008f, 5.313f, 8.016f, 5.223f, 8.03f, 5.116f)
                curveTo(8.059f, 4.904f, 8.118f, 4.612f, 8.239f, 4.302f)
                curveTo(8.484f, 3.675f, 9.023f, 2.906f, 10.115f, 2.705f)
                curveTo(11.027f, 2.538f, 11.706f, 2.697f, 12.182f, 2.963f)
                curveTo(12.413f, 3.092f, 12.581f, 3.238f, 12.696f, 3.36f)
                curveTo(12.753f, 3.421f, 12.798f, 3.476f, 12.83f, 3.521f)
                curveTo(12.847f, 3.543f, 12.86f, 3.563f, 12.871f, 3.58f)
                curveTo(12.877f, 3.588f, 12.882f, 3.596f, 12.886f, 3.602f)
                lineTo(12.892f, 3.612f)
                lineTo(12.894f, 3.616f)
                lineTo(12.895f, 3.618f)
                lineTo(12.896f, 3.619f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.493f, 4.565f)
                curveTo(4.491f, 4.567f, 4.467f, 4.588f, 4.436f, 4.61f)
                curveTo(4.099f, 4.851f, 3.631f, 4.773f, 3.39f, 4.436f)
                curveTo(3.149f, 4.099f, 3.227f, 3.63f, 3.564f, 3.39f)
                curveTo(3.486f, 3.446f, 4.198f, 2.75f, 5.25f, 2.75f)
                curveTo(6.314f, 2.75f, 6.99f, 3.473f, 7.19f, 4.259f)
                curveTo(7.326f, 4.791f, 7.262f, 5.403f, 6.932f, 5.901f)
                curveTo(6.91f, 5.935f, 6.887f, 5.968f, 6.862f, 6.0f)
                curveTo(7.168f, 6.403f, 7.283f, 6.895f, 7.252f, 7.351f)
                curveTo(7.191f, 8.264f, 6.506f, 9.25f, 5.25f, 9.25f)
                curveTo(4.713f, 9.25f, 4.28f, 9.079f, 3.984f, 8.911f)
                curveTo(3.69f, 8.744f, 3.498f, 8.558f, 3.512f, 8.569f)
                curveTo(3.197f, 8.3f, 3.161f, 7.826f, 3.431f, 7.512f)
                curveTo(3.7f, 7.197f, 4.174f, 7.161f, 4.488f, 7.431f)
                lineTo(4.502f, 7.443f)
                curveTo(4.577f, 7.51f, 4.843f, 7.75f, 5.25f, 7.75f)
                curveTo(5.434f, 7.75f, 5.539f, 7.687f, 5.608f, 7.614f)
                curveTo(5.688f, 7.529f, 5.746f, 7.4f, 5.755f, 7.251f)
                curveTo(5.766f, 7.094f, 5.72f, 6.968f, 5.656f, 6.893f)
                curveTo(5.607f, 6.834f, 5.501f, 6.75f, 5.25f, 6.75f)
                curveTo(4.836f, 6.75f, 4.5f, 6.414f, 4.5f, 6.0f)
                curveTo(4.5f, 5.586f, 4.836f, 5.25f, 5.25f, 5.25f)
                curveTo(5.528f, 5.25f, 5.632f, 5.148f, 5.681f, 5.074f)
                curveTo(5.748f, 4.972f, 5.781f, 4.806f, 5.737f, 4.63f)
                curveTo(5.706f, 4.509f, 5.645f, 4.414f, 5.574f, 4.354f)
                curveTo(5.509f, 4.299f, 5.411f, 4.25f, 5.25f, 4.25f)
                curveTo(5.038f, 4.25f, 4.86f, 4.317f, 4.725f, 4.394f)
                curveTo(4.658f, 4.433f, 4.605f, 4.471f, 4.569f, 4.5f)
                curveTo(4.552f, 4.514f, 4.538f, 4.526f, 4.527f, 4.535f)
                lineTo(4.51f, 4.551f)
                lineTo(4.493f, 4.565f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.75f, 12.0f)
                curveTo(12.13f, 12.0f, 12.443f, 12.282f, 12.493f, 12.648f)
                lineTo(12.5f, 12.75f)
                verticalLineTo(20.25f)
                curveTo(12.5f, 20.664f, 12.164f, 21.0f, 11.75f, 21.0f)
                curveTo(11.37f, 21.0f, 11.057f, 20.718f, 11.007f, 20.352f)
                lineTo(11.0f, 20.25f)
                verticalLineTo(12.75f)
                curveTo(11.0f, 12.336f, 11.336f, 12.0f, 11.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 9.0f)
                curveTo(16.13f, 9.0f, 16.444f, 9.282f, 16.493f, 9.648f)
                lineTo(16.5f, 9.75f)
                verticalLineTo(20.25f)
                curveTo(16.5f, 20.664f, 16.164f, 21.0f, 15.75f, 21.0f)
                curveTo(15.37f, 21.0f, 15.057f, 20.718f, 15.007f, 20.352f)
                lineTo(15.0f, 20.25f)
                verticalLineTo(9.75f)
                curveTo(15.0f, 9.336f, 15.336f, 9.0f, 15.75f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 18.0f)
                curveTo(4.13f, 18.0f, 4.443f, 18.282f, 4.493f, 18.648f)
                lineTo(4.5f, 18.75f)
                verticalLineTo(20.25f)
                curveTo(4.5f, 20.664f, 4.164f, 21.0f, 3.75f, 21.0f)
                curveTo(3.37f, 21.0f, 3.057f, 20.718f, 3.007f, 20.352f)
                lineTo(3.0f, 20.25f)
                verticalLineTo(18.75f)
                curveTo(3.0f, 18.336f, 3.336f, 18.0f, 3.75f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.743f, 6.0f)
                curveTo(20.122f, 5.996f, 20.439f, 6.275f, 20.492f, 6.641f)
                lineTo(20.5f, 6.742f)
                verticalLineTo(20.243f)
                curveTo(20.504f, 20.657f, 20.171f, 20.996f, 19.757f, 21.0f)
                curveTo(19.378f, 21.003f, 19.061f, 20.725f, 19.008f, 20.359f)
                lineTo(19.0f, 20.258f)
                verticalLineTo(6.757f)
                curveTo(18.996f, 6.343f, 19.329f, 6.004f, 19.743f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.75f, 15.0f)
                curveTo(8.13f, 15.0f, 8.443f, 15.282f, 8.493f, 15.648f)
                lineTo(8.5f, 15.75f)
                verticalLineTo(20.249f)
                curveTo(8.5f, 20.663f, 8.164f, 20.999f, 7.75f, 20.999f)
                curveTo(7.37f, 20.999f, 7.057f, 20.717f, 7.007f, 20.351f)
                lineTo(7.0f, 20.249f)
                verticalLineTo(15.75f)
                curveTo(7.0f, 15.336f, 7.336f, 15.0f, 7.75f, 15.0f)
                close()
            }
        }
        .build()
        return _cellular3g!!
    }

@Suppress("ObjectPropertyName")
private var _cellular3g: ImageVector? = null

@Preview
@Composable
private fun Cellular3gPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Cellular3g, contentDescription = "Cellular3g Icon")
    }
}

