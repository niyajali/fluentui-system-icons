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

public val FluentIcons.Filled.CircleMultipleHintCheckmark: ImageVector
    get() {
        if (_CircleMultipleHintCheckmark != null) {
            return _CircleMultipleHintCheckmark!!
        }
        _CircleMultipleHintCheckmark = ImageVector.Builder(
            name = "Filled.CircleMultipleHintCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.667f, 2.263f)
                curveTo(13.036f, 2.51f, 13.057f, 3.029f, 12.742f, 3.343f)
                curveTo(12.469f, 3.617f, 12.035f, 3.636f, 11.708f, 3.429f)
                curveTo(11.224f, 3.122f, 10.694f, 2.883f, 10.13f, 2.724f)
                curveTo(9.771f, 2.623f, 9.5f, 2.31f, 9.5f, 1.937f)
                curveTo(9.5f, 1.476f, 9.908f, 1.117f, 10.355f, 1.231f)
                curveTo(11.19f, 1.444f, 11.97f, 1.797f, 12.667f, 2.263f)
                close()
                moveTo(4.258f, 3.343f)
                curveTo(4.531f, 3.617f, 4.965f, 3.636f, 5.292f, 3.429f)
                curveTo(5.776f, 3.122f, 6.306f, 2.883f, 6.87f, 2.724f)
                curveTo(7.229f, 2.623f, 7.5f, 2.31f, 7.5f, 1.937f)
                curveTo(7.5f, 1.476f, 7.092f, 1.117f, 6.645f, 1.231f)
                curveTo(5.81f, 1.444f, 5.03f, 1.797f, 4.333f, 2.263f)
                curveTo(3.964f, 2.51f, 3.943f, 3.029f, 4.258f, 3.343f)
                close()
                moveTo(1.395f, 10.909f)
                curveTo(1.239f, 10.448f, 1.605f, 10f, 2.092f, 10f)
                curveTo(2.443f, 10f, 2.745f, 10.24f, 2.867f, 10.57f)
                curveTo(3.014f, 10.971f, 3.203f, 11.352f, 3.429f, 11.708f)
                curveTo(3.636f, 12.035f, 3.617f, 12.469f, 3.343f, 12.742f)
                curveTo(3.029f, 13.057f, 2.51f, 13.036f, 2.263f, 12.667f)
                curveTo(1.901f, 12.126f, 1.608f, 11.536f, 1.395f, 10.909f)
                close()
                moveTo(3.112f, 5.857f)
                curveTo(3.27f, 5.536f, 3.23f, 5.144f, 2.977f, 4.891f)
                curveTo(2.638f, 4.552f, 2.073f, 4.603f, 1.85f, 5.028f)
                curveTo(1.5f, 5.698f, 1.247f, 6.428f, 1.113f, 7.198f)
                curveTo(1.037f, 7.629f, 1.387f, 8f, 1.824f, 8f)
                curveTo(2.218f, 8f, 2.54f, 7.697f, 2.618f, 7.311f)
                curveTo(2.721f, 6.8f, 2.888f, 6.312f, 3.112f, 5.857f)
                close()
                moveTo(4.891f, 14.023f)
                curveTo(5.144f, 13.77f, 5.536f, 13.73f, 5.857f, 13.888f)
                curveTo(6.553f, 14.23f, 7.326f, 14.441f, 8.142f, 14.49f)
                curveTo(8.05f, 14.974f, 8.001f, 15.473f, 8f, 15.984f)
                curveTo(6.933f, 15.913f, 5.927f, 15.62f, 5.028f, 15.15f)
                curveTo(4.603f, 14.927f, 4.552f, 14.362f, 4.891f, 14.023f)
                close()
                moveTo(15.15f, 5.028f)
                curveTo(15.62f, 5.927f, 15.913f, 6.933f, 15.984f, 8f)
                curveTo(15.473f, 8.001f, 14.974f, 8.05f, 14.49f, 8.142f)
                curveTo(14.441f, 7.326f, 14.23f, 6.553f, 13.888f, 5.857f)
                curveTo(13.73f, 5.536f, 13.77f, 5.144f, 14.023f, 4.891f)
                curveTo(14.362f, 4.552f, 14.927f, 4.603f, 15.15f, 5.028f)
                close()
                moveTo(23f, 16f)
                curveTo(23f, 19.866f, 19.866f, 23f, 16f, 23f)
                curveTo(12.134f, 23f, 9f, 19.866f, 9f, 16f)
                curveTo(9f, 12.134f, 12.134f, 9f, 16f, 9f)
                curveTo(19.866f, 9f, 23f, 12.134f, 23f, 16f)
                close()
                moveTo(19.78f, 15.03f)
                curveTo(20.073f, 14.737f, 20.073f, 14.263f, 19.78f, 13.97f)
                curveTo(19.487f, 13.677f, 19.013f, 13.677f, 18.72f, 13.97f)
                lineTo(15.5f, 17.189f)
                lineTo(13.78f, 15.47f)
                curveTo(13.487f, 15.177f, 13.013f, 15.177f, 12.72f, 15.47f)
                curveTo(12.427f, 15.763f, 12.427f, 16.237f, 12.72f, 16.53f)
                lineTo(14.97f, 18.78f)
                curveTo(15.11f, 18.921f, 15.301f, 19f, 15.5f, 19f)
                curveTo(15.699f, 19f, 15.89f, 18.921f, 16.03f, 18.78f)
                lineTo(19.78f, 15.03f)
                close()
            }
        }.build()

        return _CircleMultipleHintCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _CircleMultipleHintCheckmark: ImageVector? = null

@Preview
@Composable
private fun CircleMultipleHintCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CircleMultipleHintCheckmark, contentDescription = null)
    }
}
