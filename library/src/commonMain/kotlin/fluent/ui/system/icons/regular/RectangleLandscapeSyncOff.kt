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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.RectangleLandscapeSyncOff: ImageVector
    get() {
        if (_RectangleLandscapeSyncOff != null) {
            return _RectangleLandscapeSyncOff!!
        }
        _RectangleLandscapeSyncOff = ImageVector.Builder(
            name = "Regular.RectangleLandscapeSyncOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(3.47f, 4.53f)
                curveTo(2.585f, 5.111f, 2f, 6.112f, 2f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
                horizontalLineTo(12.022f)
                curveTo(11.725f, 19.537f, 11.486f, 19.034f, 11.314f, 18.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 18.5f, 3.5f, 17.716f, 3.5f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(3.5f, 6.523f, 3.943f, 5.899f, 4.574f, 5.635f)
                lineTo(12.719f, 13.78f)
                curveTo(12.261f, 14.582f, 12f, 15.51f, 12f, 16.5f)
                curveTo(12f, 19.538f, 14.462f, 22f, 17.5f, 22f)
                curveTo(18.49f, 22f, 19.418f, 21.739f, 20.22f, 21.281f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(18.72f, 19.781f)
                curveTo(18.34f, 19.923f, 17.929f, 20f, 17.5f, 20f)
                curveTo(16.52f, 20f, 15.635f, 19.597f, 15f, 18.949f)
                verticalLineTo(19.5f)
                curveTo(15f, 19.776f, 14.776f, 20f, 14.5f, 20f)
                curveTo(14.224f, 20f, 14f, 19.776f, 14f, 19.5f)
                verticalLineTo(17.5f)
                curveTo(14f, 17.224f, 14.224f, 17f, 14.5f, 17f)
                horizontalLineTo(15.939f)
                lineTo(16.822f, 17.883f)
                curveTo(16.735f, 17.956f, 16.623f, 18f, 16.5f, 18f)
                horizontalLineTo(15.5f)
                curveTo(15.956f, 18.608f, 16.683f, 19f, 17.5f, 19f)
                curveTo(17.638f, 19f, 17.774f, 18.989f, 17.906f, 18.967f)
                lineTo(18.72f, 19.781f)
                close()
                moveTo(14.857f, 11.675f)
                lineTo(16.369f, 13.187f)
                curveTo(16.724f, 13.066f, 17.104f, 13f, 17.5f, 13f)
                curveTo(18.48f, 13f, 19.365f, 13.403f, 20f, 14.051f)
                verticalLineTo(13.5f)
                curveTo(20f, 13.224f, 20.224f, 13f, 20.5f, 13f)
                curveTo(20.776f, 13f, 21f, 13.224f, 21f, 13.5f)
                verticalLineTo(15.5f)
                curveTo(21f, 15.776f, 20.776f, 16f, 20.5f, 16f)
                horizontalLineTo(19.182f)
                lineTo(22.325f, 19.143f)
                curveTo(22.755f, 18.359f, 23f, 17.458f, 23f, 16.5f)
                curveTo(23f, 13.462f, 20.538f, 11f, 17.5f, 11f)
                curveTo(16.542f, 11f, 15.642f, 11.245f, 14.857f, 11.675f)
                close()
                moveTo(18.249f, 15.067f)
                lineTo(17.2f, 14.018f)
                curveTo(17.298f, 14.006f, 17.398f, 14f, 17.5f, 14f)
                curveTo(18.317f, 14f, 19.044f, 14.392f, 19.5f, 15f)
                horizontalLineTo(18.5f)
                curveTo(18.409f, 15f, 18.323f, 15.024f, 18.249f, 15.067f)
                close()
                moveTo(7.182f, 4f)
                lineTo(8.682f, 5.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 5.5f, 20.5f, 6.284f, 20.5f, 7.25f)
                verticalLineTo(10.732f)
                curveTo(21.051f, 11.019f, 21.556f, 11.383f, 22f, 11.81f)
                verticalLineTo(7.25f)
                curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
                horizontalLineTo(7.182f)
                close()
            }
        }.build()

        return _RectangleLandscapeSyncOff!!
    }

@Suppress("ObjectPropertyName")
private var _RectangleLandscapeSyncOff: ImageVector? = null

@Preview
@Composable
private fun RectangleLandscapeSyncOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.RectangleLandscapeSyncOff, contentDescription = null)
    }
}
