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

public val FluentIcons.Filled.ArrowCircleLeft: ImageVector
    get() {
        if (_ArrowCircleLeft != null) {
            return _ArrowCircleLeft!!
        }
        _ArrowCircleLeft = ImageVector.Builder(
            name = "Filled.ArrowCircleLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(12.28f, 16.531f)
                curveTo(12.014f, 16.797f, 11.597f, 16.821f, 11.304f, 16.603f)
                lineTo(11.219f, 16.531f)
                lineTo(7.219f, 12.53f)
                curveTo(6.952f, 12.264f, 6.928f, 11.847f, 7.146f, 11.553f)
                lineTo(7.219f, 11.469f)
                lineTo(11.22f, 7.469f)
                curveTo(11.513f, 7.176f, 11.988f, 7.176f, 12.281f, 7.469f)
                curveTo(12.547f, 7.736f, 12.571f, 8.152f, 12.353f, 8.446f)
                lineTo(12.281f, 8.53f)
                lineTo(9.559f, 11.251f)
                lineTo(16.25f, 11.25f)
                curveTo(16.63f, 11.25f, 16.944f, 11.533f, 16.994f, 11.899f)
                lineTo(17f, 12f)
                curveTo(17f, 12.38f, 16.718f, 12.694f, 16.352f, 12.743f)
                lineTo(16.25f, 12.75f)
                lineTo(9.561f, 12.751f)
                lineTo(12.28f, 15.47f)
                curveTo(12.546f, 15.736f, 12.571f, 16.153f, 12.353f, 16.447f)
                lineTo(12.28f, 16.531f)
                close()
            }
        }.build()

        return _ArrowCircleLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowCircleLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowCircleLeft, contentDescription = null)
    }
}
