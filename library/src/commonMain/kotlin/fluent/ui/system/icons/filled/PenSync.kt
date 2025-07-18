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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.PenSync: ImageVector
    get() {
        if (_PenSync != null) {
            return _PenSync!!
        }
        _PenSync = ImageVector.Builder(
            name = "Filled.PenSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.891f, 3.047f)
                curveTo(17.288f, 1.65f, 19.554f, 1.65f, 20.952f, 3.047f)
                curveTo(22.349f, 4.445f, 22.349f, 6.71f, 20.952f, 8.108f)
                lineTo(17.907f, 11.153f)
                curveTo(17.454f, 11.052f, 16.983f, 11f, 16.5f, 11f)
                curveTo(12.91f, 11f, 10f, 13.91f, 10f, 17.5f)
                curveTo(10f, 17.983f, 10.053f, 18.455f, 10.153f, 18.908f)
                lineTo(9.002f, 20.059f)
                curveTo(8.595f, 20.466f, 8.084f, 20.751f, 7.525f, 20.885f)
                lineTo(2.924f, 21.98f)
                curveTo(2.67f, 22.04f, 2.404f, 21.965f, 2.22f, 21.781f)
                curveTo(2.036f, 21.597f, 1.96f, 21.33f, 2.02f, 21.077f)
                lineTo(3.116f, 16.475f)
                curveTo(3.249f, 15.916f, 3.535f, 15.405f, 3.941f, 14.999f)
                lineTo(15.891f, 3.047f)
                close()
                moveTo(11f, 17.5f)
                curveTo(11f, 20.538f, 13.462f, 23f, 16.5f, 23f)
                curveTo(19.538f, 23f, 22f, 20.538f, 22f, 17.5f)
                curveTo(22f, 14.462f, 19.538f, 12f, 16.5f, 12f)
                curveTo(13.462f, 12f, 11f, 14.462f, 11f, 17.5f)
                close()
                moveTo(19.5f, 14f)
                curveTo(19.776f, 14f, 20f, 14.224f, 20f, 14.5f)
                verticalLineTo(16.5f)
                curveTo(20f, 16.776f, 19.776f, 17f, 19.5f, 17f)
                horizontalLineTo(17.5f)
                curveTo(17.224f, 17f, 17f, 16.776f, 17f, 16.5f)
                curveTo(17f, 16.224f, 17.224f, 16f, 17.5f, 16f)
                horizontalLineTo(18.5f)
                curveTo(18.044f, 15.392f, 17.317f, 15f, 16.5f, 15f)
                curveTo(15.667f, 15f, 14.928f, 15.407f, 14.473f, 16.036f)
                curveTo(14.311f, 16.26f, 13.999f, 16.31f, 13.775f, 16.148f)
                curveTo(13.551f, 15.986f, 13.501f, 15.673f, 13.663f, 15.45f)
                curveTo(14.298f, 14.572f, 15.332f, 14f, 16.5f, 14f)
                curveTo(17.48f, 14f, 18.365f, 14.403f, 19f, 15.051f)
                verticalLineTo(14.5f)
                curveTo(19f, 14.224f, 19.224f, 14f, 19.5f, 14f)
                close()
                moveTo(14f, 19.949f)
                verticalLineTo(20.5f)
                curveTo(14f, 20.776f, 13.776f, 21f, 13.5f, 21f)
                curveTo(13.224f, 21f, 13f, 20.776f, 13f, 20.5f)
                verticalLineTo(18.5f)
                curveTo(13f, 18.224f, 13.224f, 18f, 13.5f, 18f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 18f, 16f, 18.224f, 16f, 18.5f)
                curveTo(16f, 18.776f, 15.776f, 19f, 15.5f, 19f)
                horizontalLineTo(14.5f)
                curveTo(14.956f, 19.608f, 15.683f, 20f, 16.5f, 20f)
                curveTo(17.266f, 20f, 17.952f, 19.656f, 18.411f, 19.112f)
                curveTo(18.589f, 18.901f, 18.905f, 18.874f, 19.116f, 19.052f)
                curveTo(19.327f, 19.23f, 19.353f, 19.546f, 19.175f, 19.757f)
                curveTo(18.534f, 20.516f, 17.573f, 21f, 16.5f, 21f)
                curveTo(15.52f, 21f, 14.635f, 20.597f, 14f, 19.949f)
                close()
            }
        }.build()

        return _PenSync!!
    }

@Suppress("ObjectPropertyName")
private var _PenSync: ImageVector? = null

@Preview
@Composable
private fun PenSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PenSync, contentDescription = null)
    }
}
