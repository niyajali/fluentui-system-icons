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
 * ServerSurface Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent a server environments.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_server_surface_16_filled.svg)
 * 
 * @return The [ImageVector] for the ServerSurface icon.
 */
public val FluentIcons.Filled.ServerSurface: ImageVector
    get() {
        if (_serverSurface != null) {
            return _serverSurface!!
        }
        _serverSurface = Builder(name = "ServerSurface", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 13.0f)
                horizontalLineTo(9.5f)
                curveTo(10.327f, 13.0f, 11.0f, 12.327f, 11.0f, 11.5f)
                verticalLineTo(2.5f)
                curveTo(11.0f, 2.102f, 10.842f, 1.721f, 10.561f, 1.439f)
                curveTo(10.28f, 1.158f, 9.898f, 1.0f, 9.5f, 1.0f)
                horizontalLineTo(5.5f)
                curveTo(5.102f, 1.0f, 4.721f, 1.158f, 4.439f, 1.439f)
                curveTo(4.157f, 1.72f, 4.0f, 2.102f, 4.0f, 2.5f)
                verticalLineTo(11.5f)
                curveTo(4.0f, 12.327f, 4.673f, 13.0f, 5.5f, 13.0f)
                close()
                moveTo(6.146f, 4.146f)
                curveTo(6.24f, 4.052f, 6.367f, 4.0f, 6.5f, 4.0f)
                horizontalLineTo(8.5f)
                curveTo(8.633f, 4.0f, 8.76f, 4.053f, 8.854f, 4.146f)
                curveTo(8.948f, 4.24f, 9.0f, 4.367f, 9.0f, 4.5f)
                curveTo(9.0f, 4.633f, 8.947f, 4.76f, 8.854f, 4.854f)
                curveTo(8.761f, 4.948f, 8.633f, 5.0f, 8.5f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(6.367f, 5.0f, 6.24f, 4.947f, 6.146f, 4.854f)
                curveTo(6.052f, 4.761f, 6.0f, 4.633f, 6.0f, 4.5f)
                curveTo(6.0f, 4.367f, 6.053f, 4.24f, 6.146f, 4.146f)
                close()
                moveTo(6.146f, 8.146f)
                curveTo(6.24f, 8.052f, 6.367f, 8.0f, 6.5f, 8.0f)
                horizontalLineTo(8.5f)
                curveTo(8.633f, 8.0f, 8.76f, 8.053f, 8.854f, 8.146f)
                curveTo(8.948f, 8.24f, 9.0f, 8.367f, 9.0f, 8.5f)
                curveTo(9.0f, 8.633f, 8.947f, 8.76f, 8.854f, 8.854f)
                curveTo(8.761f, 8.948f, 8.633f, 9.0f, 8.5f, 9.0f)
                horizontalLineTo(6.5f)
                curveTo(6.367f, 9.0f, 6.24f, 8.947f, 6.146f, 8.854f)
                curveTo(6.052f, 8.761f, 6.0f, 8.633f, 6.0f, 8.5f)
                curveTo(6.0f, 8.367f, 6.053f, 8.24f, 6.146f, 8.146f)
                close()
                moveTo(6.146f, 10.146f)
                curveTo(6.24f, 10.052f, 6.367f, 10.0f, 6.5f, 10.0f)
                horizontalLineTo(8.5f)
                curveTo(8.633f, 10.0f, 8.76f, 10.053f, 8.854f, 10.146f)
                curveTo(8.948f, 10.24f, 9.0f, 10.367f, 9.0f, 10.5f)
                curveTo(9.0f, 10.633f, 8.947f, 10.76f, 8.854f, 10.854f)
                curveTo(8.76f, 10.948f, 8.633f, 11.0f, 8.5f, 11.0f)
                horizontalLineTo(6.5f)
                curveTo(6.367f, 11.0f, 6.24f, 10.947f, 6.146f, 10.854f)
                curveTo(6.052f, 10.76f, 6.0f, 10.633f, 6.0f, 10.5f)
                curveTo(6.0f, 10.367f, 6.053f, 10.24f, 6.146f, 10.146f)
                close()
                moveTo(13.968f, 14.324f)
                lineTo(12.468f, 10.324f)
                curveTo(12.432f, 10.229f, 12.368f, 10.147f, 12.285f, 10.089f)
                curveTo(12.201f, 10.031f, 12.102f, 10.0f, 12.0f, 10.0f)
                verticalLineTo(11.5f)
                curveTo(12.0f, 12.878f, 10.879f, 14.0f, 9.5f, 14.0f)
                horizontalLineTo(5.5f)
                curveTo(4.121f, 14.0f, 3.0f, 12.878f, 3.0f, 11.5f)
                verticalLineTo(10.0f)
                curveTo(2.898f, 10.0f, 2.799f, 10.031f, 2.715f, 10.089f)
                curveTo(2.631f, 10.147f, 2.567f, 10.229f, 2.532f, 10.324f)
                lineTo(1.032f, 14.324f)
                curveTo(1.004f, 14.4f, 0.994f, 14.481f, 1.004f, 14.561f)
                curveTo(1.014f, 14.641f, 1.043f, 14.718f, 1.089f, 14.784f)
                curveTo(1.135f, 14.85f, 1.196f, 14.905f, 1.268f, 14.942f)
                curveTo(1.34f, 14.98f, 1.419f, 14.999f, 1.5f, 14.999f)
                horizontalLineTo(13.5f)
                curveTo(13.581f, 14.999f, 13.661f, 14.979f, 13.732f, 14.942f)
                curveTo(13.804f, 14.905f, 13.865f, 14.85f, 13.911f, 14.784f)
                curveTo(13.957f, 14.717f, 13.986f, 14.641f, 13.996f, 14.561f)
                curveTo(14.006f, 14.481f, 13.996f, 14.399f, 13.968f, 14.324f)
                close()
            }
        }
        .build()
        return _serverSurface!!
    }

@Suppress("ObjectPropertyName")
private var _serverSurface: ImageVector? = null

@Preview
@Composable
private fun ServerSurfacePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ServerSurface, contentDescription = "ServerSurface Icon")
    }
}

