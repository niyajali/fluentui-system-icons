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
 * WhiteboardOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: whiteboard, off
 * - Source: ic_fluent_whiteboard_off_24_regular.svg
 * 
 * @return The [ImageVector] for the WhiteboardOff icon.
 */
public val FluentIcons.Regular.WhiteboardOff: ImageVector
    get() {
        if (_whiteboardOff != null) {
            return _whiteboardOff!!
        }
        _whiteboardOff = Builder(name = "WhiteboardOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(3.47f, 4.53f)
                curveTo(2.585f, 5.111f, 2.0f, 6.112f, 2.0f, 7.25f)
                verticalLineTo(16.755f)
                curveTo(2.0f, 18.549f, 3.455f, 20.005f, 5.25f, 20.005f)
                horizontalLineTo(18.75f)
                curveTo(18.813f, 20.005f, 18.876f, 20.003f, 18.938f, 19.999f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(17.444f, 18.505f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 18.505f, 3.5f, 17.721f, 3.5f, 16.755f)
                verticalLineTo(11.262f)
                lineTo(6.909f, 9.12f)
                lineTo(7.007f, 9.068f)
                curveTo(7.341f, 8.921f, 7.742f, 9.037f, 7.943f, 9.356f)
                curveTo(8.085f, 9.583f, 8.096f, 9.869f, 7.971f, 10.105f)
                lineTo(6.763f, 12.391f)
                lineTo(6.693f, 12.535f)
                curveTo(6.22f, 13.606f, 6.65f, 14.876f, 7.701f, 15.431f)
                curveTo(8.378f, 15.789f, 9.189f, 15.778f, 9.856f, 15.403f)
                lineTo(11.621f, 14.407f)
                lineTo(11.706f, 14.35f)
                curveTo(12.0f, 14.126f, 12.09f, 13.714f, 11.902f, 13.384f)
                curveTo(11.697f, 13.024f, 11.239f, 12.898f, 10.879f, 13.103f)
                lineTo(9.12f, 14.096f)
                lineTo(9.022f, 14.142f)
                curveTo(8.822f, 14.219f, 8.595f, 14.207f, 8.402f, 14.105f)
                curveTo(8.036f, 13.912f, 7.896f, 13.458f, 8.089f, 13.092f)
                lineTo(9.297f, 10.806f)
                lineTo(9.376f, 10.64f)
                curveTo(9.397f, 10.592f, 9.416f, 10.543f, 9.433f, 10.494f)
                lineTo(17.444f, 18.505f)
                close()
                moveTo(6.569f, 7.629f)
                curveTo(6.411f, 7.684f, 6.257f, 7.758f, 6.11f, 7.85f)
                lineTo(3.5f, 9.49f)
                verticalLineTo(7.25f)
                curveTo(3.5f, 6.523f, 3.943f, 5.899f, 4.574f, 5.635f)
                lineTo(6.569f, 7.629f)
                close()
                moveTo(12.956f, 9.774f)
                lineTo(15.167f, 11.985f)
                lineTo(16.081f, 11.71f)
                curveTo(16.437f, 11.604f, 16.761f, 11.41f, 17.024f, 11.148f)
                lineTo(21.305f, 6.874f)
                curveTo(22.149f, 6.031f, 22.189f, 4.687f, 21.426f, 3.796f)
                lineTo(21.306f, 3.665f)
                lineTo(21.176f, 3.545f)
                curveTo(20.284f, 2.781f, 18.941f, 2.82f, 18.096f, 3.664f)
                lineTo(13.805f, 7.947f)
                curveTo(13.552f, 8.2f, 13.363f, 8.509f, 13.253f, 8.85f)
                lineTo(12.956f, 9.774f)
                close()
                moveTo(21.564f, 18.382f)
                lineTo(20.43f, 17.248f)
                curveTo(20.475f, 17.091f, 20.5f, 16.926f, 20.5f, 16.755f)
                verticalLineTo(9.443f)
                lineTo(22.0f, 7.946f)
                verticalLineTo(16.755f)
                curveTo(22.0f, 17.348f, 21.841f, 17.903f, 21.564f, 18.382f)
                close()
                moveTo(7.182f, 4.0f)
                lineTo(8.682f, 5.5f)
                horizontalLineTo(14.486f)
                lineTo(15.989f, 4.0f)
                horizontalLineTo(7.182f)
                close()
                moveTo(19.156f, 4.725f)
                curveTo(19.456f, 4.425f, 19.944f, 4.425f, 20.245f, 4.726f)
                curveTo(20.518f, 4.999f, 20.542f, 5.426f, 20.319f, 5.727f)
                lineTo(20.244f, 5.813f)
                lineTo(15.964f, 10.086f)
                curveTo(15.876f, 10.174f, 15.768f, 10.238f, 15.65f, 10.274f)
                lineTo(14.233f, 10.699f)
                lineTo(14.681f, 9.31f)
                curveTo(14.717f, 9.196f, 14.781f, 9.093f, 14.865f, 9.009f)
                lineTo(19.156f, 4.725f)
                close()
            }
        }
        .build()
        return _whiteboardOff!!
    }

@Suppress("ObjectPropertyName")
private var _whiteboardOff: ImageVector? = null

@Preview
@Composable
private fun WhiteboardOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WhiteboardOff, contentDescription = null)
    }
}

