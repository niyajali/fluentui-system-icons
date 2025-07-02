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
 * ServerSurfaceMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: server, surface, multiple
 * - Source: ic_fluent_server_surface_multiple_16_filled.svg
 * 
 * @return The [ImageVector] for the ServerSurfaceMultiple icon.
 */
public val FluentIcons.Filled.ServerSurfaceMultiple: ImageVector
    get() {
        if (_serverSurfaceMultiple != null) {
            return _serverSurfaceMultiple!!
        }
        _serverSurfaceMultiple = Builder(name = "ServerSurfaceMultiple", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                horizontalLineTo(10.5f)
                curveTo(10.632f, 8.0f, 10.759f, 7.948f, 10.854f, 7.854f)
                curveTo(10.946f, 7.76f, 11.0f, 7.633f, 11.0f, 7.5f)
                curveTo(11.0f, 7.367f, 10.948f, 7.24f, 10.854f, 7.146f)
                curveTo(10.759f, 7.053f, 10.632f, 7.0f, 10.5f, 7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.5f)
                curveTo(10.0f, 4.948f, 9.815f, 4.429f, 9.487f, 3.997f)
                curveTo(9.491f, 3.997f, 9.5f, 4.0f, 9.5f, 4.0f)
                horizontalLineTo(10.5f)
                curveTo(10.632f, 4.0f, 10.759f, 3.948f, 10.854f, 3.854f)
                curveTo(10.946f, 3.76f, 11.0f, 3.633f, 11.0f, 3.5f)
                curveTo(11.0f, 3.367f, 10.948f, 3.239f, 10.854f, 3.146f)
                curveTo(10.759f, 3.053f, 10.632f, 3.0f, 10.5f, 3.0f)
                horizontalLineTo(9.5f)
                curveTo(9.367f, 3.0f, 9.24f, 3.052f, 9.146f, 3.146f)
                curveTo(9.053f, 3.24f, 9.0f, 3.367f, 9.0f, 3.5f)
                curveTo(9.0f, 3.503f, 9.0f, 3.505f, 9.001f, 3.507f)
                curveTo(9.002f, 3.509f, 9.003f, 3.511f, 9.003f, 3.514f)
                curveTo(8.571f, 3.186f, 8.052f, 3.0f, 7.501f, 3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.5f)
                curveTo(7.0f, 2.102f, 7.157f, 1.72f, 7.439f, 1.439f)
                curveTo(7.721f, 1.158f, 8.102f, 1.0f, 8.5f, 1.0f)
                horizontalLineTo(11.5f)
                curveTo(11.898f, 1.0f, 12.28f, 1.158f, 12.561f, 1.439f)
                curveTo(12.84f, 1.719f, 12.998f, 2.098f, 13.0f, 2.494f)
                verticalLineTo(8.5f)
                curveTo(13.0f, 9.327f, 12.326f, 10.0f, 11.5f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(13.998f, 8.415f)
                lineTo(14.974f, 11.342f)
                curveTo(15.0f, 11.417f, 15.005f, 11.497f, 14.993f, 11.575f)
                curveTo(14.981f, 11.654f, 14.951f, 11.728f, 14.905f, 11.792f)
                horizontalLineTo(14.899f)
                curveTo(14.854f, 11.856f, 14.793f, 11.908f, 14.724f, 11.944f)
                curveTo(14.655f, 11.98f, 14.578f, 12.0f, 14.5f, 12.0f)
                horizontalLineTo(11.248f)
                lineTo(10.924f, 11.025f)
                curveTo(10.922f, 11.021f, 10.92f, 11.017f, 10.917f, 11.012f)
                curveTo(10.915f, 11.009f, 10.912f, 11.005f, 10.91f, 11.0f)
                horizontalLineTo(11.498f)
                curveTo(12.877f, 11.0f, 13.998f, 9.878f, 13.998f, 8.5f)
                verticalLineTo(8.415f)
                close()
                moveTo(10.0f, 11.415f)
                lineTo(10.976f, 14.342f)
                verticalLineTo(14.343f)
                curveTo(11.001f, 14.418f, 11.007f, 14.498f, 10.995f, 14.576f)
                curveTo(10.983f, 14.655f, 10.953f, 14.729f, 10.906f, 14.793f)
                horizontalLineTo(10.901f)
                curveTo(10.855f, 14.857f, 10.795f, 14.909f, 10.726f, 14.945f)
                curveTo(10.656f, 14.981f, 10.579f, 15.001f, 10.501f, 15.001f)
                horizontalLineTo(1.501f)
                curveTo(1.422f, 15.001f, 1.344f, 14.982f, 1.273f, 14.946f)
                curveTo(1.202f, 14.91f, 1.141f, 14.857f, 1.095f, 14.793f)
                curveTo(1.048f, 14.729f, 1.018f, 14.654f, 1.006f, 14.576f)
                curveTo(0.994f, 14.497f, 1.001f, 14.417f, 1.026f, 14.342f)
                lineTo(2.0f, 11.419f)
                verticalLineTo(11.5f)
                curveTo(2.0f, 12.878f, 3.122f, 14.0f, 4.5f, 14.0f)
                horizontalLineTo(7.5f)
                curveTo(8.878f, 14.0f, 10.0f, 12.878f, 10.0f, 11.5f)
                verticalLineTo(11.415f)
                close()
                moveTo(7.5f, 13.0f)
                horizontalLineTo(4.5f)
                curveTo(3.673f, 13.0f, 3.0f, 12.327f, 3.0f, 11.5f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 5.102f, 3.157f, 4.72f, 3.439f, 4.439f)
                curveTo(3.721f, 4.158f, 4.102f, 4.0f, 4.5f, 4.0f)
                horizontalLineTo(7.5f)
                curveTo(7.898f, 4.0f, 8.28f, 4.158f, 8.561f, 4.439f)
                curveTo(8.841f, 4.719f, 8.998f, 5.098f, 9.0f, 5.494f)
                verticalLineTo(11.5f)
                curveTo(9.0f, 12.327f, 8.327f, 13.0f, 7.5f, 13.0f)
                close()
                moveTo(5.501f, 6.0f)
                curveTo(5.368f, 6.0f, 5.241f, 6.052f, 5.147f, 6.146f)
                curveTo(5.054f, 6.24f, 5.001f, 6.367f, 5.001f, 6.5f)
                curveTo(5.001f, 6.633f, 5.053f, 6.76f, 5.147f, 6.854f)
                curveTo(5.241f, 6.947f, 5.368f, 7.0f, 5.501f, 7.0f)
                horizontalLineTo(6.501f)
                curveTo(6.634f, 7.0f, 6.761f, 6.948f, 6.855f, 6.854f)
                curveTo(6.948f, 6.76f, 7.001f, 6.633f, 7.001f, 6.5f)
                curveTo(7.001f, 6.367f, 6.949f, 6.239f, 6.855f, 6.146f)
                curveTo(6.761f, 6.053f, 6.634f, 6.0f, 6.501f, 6.0f)
                horizontalLineTo(5.501f)
                close()
                moveTo(5.501f, 10.0f)
                curveTo(5.368f, 10.0f, 5.241f, 10.052f, 5.147f, 10.146f)
                curveTo(5.054f, 10.24f, 5.001f, 10.367f, 5.001f, 10.5f)
                curveTo(5.001f, 10.633f, 5.053f, 10.76f, 5.147f, 10.854f)
                curveTo(5.241f, 10.947f, 5.368f, 11.0f, 5.501f, 11.0f)
                horizontalLineTo(6.501f)
                curveTo(6.634f, 11.0f, 6.761f, 10.948f, 6.855f, 10.854f)
                curveTo(6.948f, 10.76f, 7.001f, 10.633f, 7.001f, 10.5f)
                curveTo(7.001f, 10.367f, 6.949f, 10.24f, 6.855f, 10.146f)
                curveTo(6.761f, 10.053f, 6.634f, 10.0f, 6.501f, 10.0f)
                horizontalLineTo(5.501f)
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
        Image(imageVector = FluentIcons.Filled.ServerSurfaceMultiple, contentDescription = null)
    }
}

