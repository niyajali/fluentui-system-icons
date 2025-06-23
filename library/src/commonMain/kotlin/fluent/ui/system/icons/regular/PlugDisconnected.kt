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

public val FluentIcons.Regular.PlugDisconnected: ImageVector
    get() {
        if (_PlugDisconnected != null) {
            return _PlugDisconnected!!
        }
        _PlugDisconnected = ImageVector.Builder(
            name = "Regular.PlugDisconnected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.78f, 3.28f)
                curveTo(22.073f, 2.987f, 22.073f, 2.513f, 21.78f, 2.22f)
                curveTo(21.487f, 1.927f, 21.013f, 1.927f, 20.72f, 2.22f)
                lineTo(18.708f, 4.232f)
                curveTo(17.048f, 3.053f, 14.732f, 3.207f, 13.245f, 4.694f)
                lineTo(12.177f, 5.763f)
                curveTo(11.493f, 6.446f, 11.493f, 7.554f, 12.177f, 8.237f)
                lineTo(15.762f, 11.823f)
                curveTo(16.446f, 12.507f, 17.554f, 12.507f, 18.237f, 11.823f)
                lineTo(19.305f, 10.755f)
                curveTo(20.793f, 9.268f, 20.947f, 6.952f, 19.768f, 5.292f)
                lineTo(21.78f, 3.28f)
                close()
                moveTo(18.194f, 5.755f)
                lineTo(18.217f, 5.778f)
                lineTo(18.22f, 5.78f)
                lineTo(18.222f, 5.783f)
                lineTo(18.245f, 5.805f)
                curveTo(19.319f, 6.879f, 19.319f, 8.621f, 18.245f, 9.694f)
                lineTo(17.177f, 10.762f)
                curveTo(17.079f, 10.86f, 16.921f, 10.86f, 16.823f, 10.762f)
                lineTo(13.237f, 7.177f)
                curveTo(13.14f, 7.079f, 13.14f, 6.921f, 13.237f, 6.823f)
                lineTo(14.305f, 5.755f)
                curveTo(15.379f, 4.681f, 17.121f, 4.681f, 18.194f, 5.755f)
                close()
                moveTo(10.78f, 11.28f)
                curveTo(11.073f, 10.987f, 11.073f, 10.513f, 10.78f, 10.22f)
                curveTo(10.487f, 9.927f, 10.013f, 9.927f, 9.72f, 10.22f)
                lineTo(8f, 11.939f)
                lineTo(7.53f, 11.47f)
                curveTo(7.237f, 11.177f, 6.763f, 11.177f, 6.47f, 11.47f)
                lineTo(4.695f, 13.245f)
                curveTo(3.207f, 14.732f, 3.053f, 17.048f, 4.232f, 18.708f)
                lineTo(2.22f, 20.72f)
                curveTo(1.927f, 21.013f, 1.927f, 21.487f, 2.22f, 21.78f)
                curveTo(2.513f, 22.073f, 2.987f, 22.073f, 3.28f, 21.78f)
                lineTo(5.292f, 19.768f)
                curveTo(6.952f, 20.947f, 9.268f, 20.793f, 10.755f, 19.306f)
                lineTo(12.53f, 17.53f)
                curveTo(12.823f, 17.237f, 12.823f, 16.763f, 12.53f, 16.47f)
                lineTo(12.061f, 16f)
                lineTo(13.78f, 14.28f)
                curveTo(14.073f, 13.987f, 14.073f, 13.513f, 13.78f, 13.22f)
                curveTo(13.487f, 12.927f, 13.013f, 12.927f, 12.72f, 13.22f)
                lineTo(11f, 14.939f)
                lineTo(9.061f, 13f)
                lineTo(10.78f, 11.28f)
                close()
                moveTo(7.466f, 13.527f)
                lineTo(7.47f, 13.53f)
                lineTo(7.473f, 13.534f)
                lineTo(10.466f, 16.527f)
                lineTo(10.47f, 16.53f)
                lineTo(10.473f, 16.534f)
                lineTo(10.939f, 17f)
                lineTo(9.695f, 18.245f)
                curveTo(8.621f, 19.319f, 6.879f, 19.319f, 5.805f, 18.245f)
                lineTo(5.755f, 18.194f)
                curveTo(4.681f, 17.121f, 4.681f, 15.379f, 5.755f, 14.306f)
                lineTo(7f, 13.061f)
                lineTo(7.466f, 13.527f)
                close()
            }
        }.build()

        return _PlugDisconnected!!
    }

@Suppress("ObjectPropertyName")
private var _PlugDisconnected: ImageVector? = null

@Preview
@Composable
private fun PlugDisconnectedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PlugDisconnected, contentDescription = null)
    }
}
