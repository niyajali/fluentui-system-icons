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
 * ServerSurfaceMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: server, surface, multiple
 * - Source: ic_fluent_server_surface_multiple_16_regular.svg
 * 
 * @return The [ImageVector] for the ServerSurfaceMultiple icon.
 */
public val FluentIcons.Regular.ServerSurfaceMultiple: ImageVector
    get() {
        if (_serverSurfaceMultiple != null) {
            return _serverSurfaceMultiple!!
        }
        _serverSurfaceMultiple = Builder(name = "ServerSurfaceMultiple", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                horizontalLineTo(10.5f)
                curveTo(10.633f, 7.0f, 10.76f, 7.053f, 10.854f, 7.146f)
                curveTo(10.948f, 7.24f, 11.0f, 7.367f, 11.0f, 7.5f)
                curveTo(11.0f, 7.633f, 10.948f, 7.76f, 10.854f, 7.854f)
                curveTo(10.76f, 7.947f, 10.633f, 8.0f, 10.5f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(10.854f, 3.146f)
                curveTo(10.948f, 3.24f, 11.0f, 3.367f, 11.0f, 3.5f)
                curveTo(11.0f, 3.633f, 10.948f, 3.76f, 10.854f, 3.854f)
                curveTo(10.76f, 3.947f, 10.633f, 4.0f, 10.5f, 4.0f)
                horizontalLineTo(9.485f)
                curveTo(9.347f, 3.817f, 9.183f, 3.654f, 9.0f, 3.515f)
                verticalLineTo(3.5f)
                curveTo(9.0f, 3.367f, 9.053f, 3.24f, 9.147f, 3.146f)
                curveTo(9.241f, 3.053f, 9.368f, 3.0f, 9.5f, 3.0f)
                horizontalLineTo(10.5f)
                curveTo(10.633f, 3.0f, 10.76f, 3.053f, 10.854f, 3.146f)
                close()
                moveTo(13.976f, 8.342f)
                lineTo(14.976f, 11.342f)
                curveTo(15.0f, 11.417f, 15.007f, 11.497f, 14.995f, 11.576f)
                curveTo(14.983f, 11.654f, 14.953f, 11.728f, 14.906f, 11.793f)
                curveTo(14.86f, 11.857f, 14.799f, 11.909f, 14.729f, 11.945f)
                curveTo(14.658f, 11.981f, 14.58f, 12.0f, 14.5f, 12.0f)
                horizontalLineTo(11.245f)
                lineTo(10.92f, 11.024f)
                curveTo(10.918f, 11.021f, 10.916f, 11.018f, 10.914f, 11.015f)
                curveTo(10.911f, 11.01f, 10.908f, 11.005f, 10.908f, 11.0f)
                horizontalLineTo(13.807f)
                lineTo(13.141f, 9.0f)
                horizontalLineTo(12.908f)
                curveTo(12.805f, 9.291f, 12.615f, 9.544f, 12.363f, 9.723f)
                curveTo(12.111f, 9.902f, 11.81f, 9.999f, 11.5f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.5f)
                curveTo(11.633f, 9.0f, 11.76f, 8.947f, 11.854f, 8.854f)
                curveTo(11.948f, 8.76f, 12.0f, 8.633f, 12.0f, 8.5f)
                verticalLineTo(2.5f)
                curveTo(12.0f, 2.367f, 11.948f, 2.24f, 11.854f, 2.146f)
                curveTo(11.76f, 2.053f, 11.633f, 2.0f, 11.5f, 2.0f)
                horizontalLineTo(8.5f)
                curveTo(8.368f, 2.0f, 8.241f, 2.053f, 8.147f, 2.146f)
                curveTo(8.053f, 2.24f, 8.0f, 2.367f, 8.0f, 2.5f)
                verticalLineTo(3.051f)
                curveTo(7.836f, 3.017f, 7.668f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.5f)
                curveTo(7.0f, 2.102f, 7.159f, 1.721f, 7.44f, 1.439f)
                curveTo(7.721f, 1.158f, 8.103f, 1.0f, 8.5f, 1.0f)
                horizontalLineTo(11.5f)
                curveTo(11.898f, 1.0f, 12.28f, 1.158f, 12.561f, 1.439f)
                curveTo(12.842f, 1.721f, 13.0f, 2.102f, 13.0f, 2.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.5f)
                curveTo(13.606f, 8.0f, 13.708f, 8.033f, 13.793f, 8.094f)
                curveTo(13.878f, 8.156f, 13.942f, 8.242f, 13.976f, 8.342f)
                close()
                moveTo(5.147f, 6.146f)
                curveTo(5.053f, 6.24f, 5.001f, 6.367f, 5.001f, 6.5f)
                curveTo(5.001f, 6.633f, 5.053f, 6.76f, 5.147f, 6.854f)
                curveTo(5.241f, 6.947f, 5.368f, 7.0f, 5.501f, 7.0f)
                horizontalLineTo(6.501f)
                curveTo(6.633f, 7.0f, 6.76f, 6.947f, 6.854f, 6.854f)
                curveTo(6.948f, 6.76f, 7.001f, 6.633f, 7.001f, 6.5f)
                curveTo(7.001f, 6.367f, 6.948f, 6.24f, 6.854f, 6.146f)
                curveTo(6.76f, 6.053f, 6.633f, 6.0f, 6.501f, 6.0f)
                horizontalLineTo(5.501f)
                curveTo(5.368f, 6.0f, 5.241f, 6.053f, 5.147f, 6.146f)
                close()
                moveTo(6.501f, 11.0f)
                horizontalLineTo(5.501f)
                curveTo(5.368f, 11.0f, 5.241f, 10.947f, 5.147f, 10.854f)
                curveTo(5.053f, 10.76f, 5.001f, 10.633f, 5.001f, 10.5f)
                curveTo(5.001f, 10.367f, 5.053f, 10.24f, 5.147f, 10.146f)
                curveTo(5.241f, 10.053f, 5.368f, 10.0f, 5.501f, 10.0f)
                horizontalLineTo(6.501f)
                curveTo(6.633f, 10.0f, 6.76f, 10.053f, 6.854f, 10.146f)
                curveTo(6.948f, 10.24f, 7.001f, 10.367f, 7.001f, 10.5f)
                curveTo(7.001f, 10.633f, 6.948f, 10.76f, 6.854f, 10.854f)
                curveTo(6.76f, 10.947f, 6.633f, 11.0f, 6.501f, 11.0f)
                close()
                moveTo(10.725f, 14.944f)
                curveTo(10.795f, 14.908f, 10.855f, 14.856f, 10.901f, 14.792f)
                horizontalLineTo(10.906f)
                curveTo(10.952f, 14.728f, 10.983f, 14.654f, 10.995f, 14.575f)
                curveTo(11.007f, 14.497f, 11.0f, 14.417f, 10.976f, 14.342f)
                lineTo(9.976f, 11.342f)
                curveTo(9.942f, 11.242f, 9.879f, 11.156f, 9.793f, 11.094f)
                curveTo(9.708f, 11.033f, 9.606f, 11.0f, 9.501f, 11.0f)
                horizontalLineTo(9.001f)
                verticalLineTo(5.5f)
                curveTo(9.001f, 5.102f, 8.843f, 4.721f, 8.561f, 4.439f)
                curveTo(8.28f, 4.158f, 7.898f, 4.0f, 7.501f, 4.0f)
                horizontalLineTo(4.501f)
                curveTo(4.103f, 4.0f, 3.721f, 4.158f, 3.44f, 4.439f)
                curveTo(3.159f, 4.721f, 3.001f, 5.102f, 3.001f, 5.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.501f)
                curveTo(2.396f, 11.0f, 2.293f, 11.033f, 2.208f, 11.094f)
                curveTo(2.123f, 11.156f, 2.059f, 11.242f, 2.026f, 11.342f)
                lineTo(1.026f, 14.342f)
                curveTo(1.001f, 14.417f, 0.994f, 14.497f, 1.006f, 14.576f)
                curveTo(1.018f, 14.654f, 1.048f, 14.728f, 1.095f, 14.793f)
                curveTo(1.141f, 14.857f, 1.202f, 14.909f, 1.273f, 14.945f)
                curveTo(1.343f, 14.981f, 1.421f, 15.0f, 1.501f, 15.0f)
                horizontalLineTo(10.501f)
                curveTo(10.579f, 14.999f, 10.656f, 14.98f, 10.725f, 14.944f)
                close()
                moveTo(4.147f, 11.854f)
                curveTo(4.053f, 11.76f, 4.001f, 11.633f, 4.001f, 11.5f)
                verticalLineTo(5.5f)
                curveTo(4.001f, 5.367f, 4.053f, 5.24f, 4.147f, 5.146f)
                curveTo(4.241f, 5.053f, 4.368f, 5.0f, 4.501f, 5.0f)
                horizontalLineTo(7.501f)
                curveTo(7.633f, 5.0f, 7.76f, 5.053f, 7.854f, 5.146f)
                curveTo(7.948f, 5.24f, 8.001f, 5.367f, 8.001f, 5.5f)
                verticalLineTo(11.5f)
                curveTo(8.001f, 11.633f, 7.948f, 11.76f, 7.854f, 11.854f)
                curveTo(7.76f, 11.947f, 7.633f, 12.0f, 7.501f, 12.0f)
                horizontalLineTo(4.501f)
                curveTo(4.368f, 12.0f, 4.241f, 11.947f, 4.147f, 11.854f)
                close()
                moveTo(8.909f, 12.0f)
                horizontalLineTo(9.141f)
                lineTo(9.808f, 14.0f)
                horizontalLineTo(2.194f)
                lineTo(2.861f, 12.0f)
                horizontalLineTo(3.093f)
                curveTo(3.196f, 12.292f, 3.386f, 12.544f, 3.638f, 12.723f)
                curveTo(3.89f, 12.902f, 4.191f, 12.999f, 4.501f, 13.0f)
                horizontalLineTo(7.501f)
                curveTo(7.81f, 12.999f, 8.111f, 12.902f, 8.363f, 12.723f)
                curveTo(8.615f, 12.544f, 8.806f, 12.292f, 8.909f, 12.0f)
                close()
            }
        }
        .build()
        return _serverSurfaceMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _serverSurfaceMultiple: ImageVector? = null

@Preview
@Composable
private fun ServerSurfaceMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ServerSurfaceMultiple, contentDescription = null)
    }
}

