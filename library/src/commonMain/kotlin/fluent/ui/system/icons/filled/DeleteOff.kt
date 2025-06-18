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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.DeleteOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeleteOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.939f, 5f)
            lineTo(2.22f, 3.28f)
            curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
            curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
            lineTo(21.78f, 20.72f)
            curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
            curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
            lineTo(18.529f, 19.59f)
            curveTo(17.987f, 21.01f, 16.613f, 22f, 15.026f, 22f)
            horizontalLineTo(8.974f)
            curveTo(7.043f, 22f, 5.427f, 20.533f, 5.241f, 18.611f)
            lineTo(4.069f, 6.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6.5f, 2f, 6.164f, 2f, 5.75f)
            curveTo(2f, 5.336f, 2.336f, 5f, 2.75f, 5f)
            horizontalLineTo(3.939f)
            close()
            moveTo(15f, 16.061f)
            lineTo(13.5f, 14.561f)
            verticalLineTo(17.25f)
            curveTo(13.5f, 17.664f, 13.836f, 18f, 14.25f, 18f)
            curveTo(14.664f, 18f, 15f, 17.664f, 15f, 17.25f)
            verticalLineTo(16.061f)
            close()
            moveTo(10.5f, 11.561f)
            lineTo(9f, 10.061f)
            verticalLineTo(17.25f)
            curveTo(9f, 17.664f, 9.336f, 18f, 9.75f, 18f)
            curveTo(10.164f, 18f, 10.5f, 17.664f, 10.5f, 17.25f)
            verticalLineTo(11.561f)
            close()
            moveTo(15f, 9.75f)
            verticalLineTo(11.819f)
            lineTo(19.027f, 15.845f)
            lineTo(19.931f, 6.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 6.5f, 22f, 6.164f, 22f, 5.75f)
            curveTo(22f, 5.336f, 21.664f, 5f, 21.25f, 5f)
            horizontalLineTo(15.5f)
            curveTo(15.5f, 3.067f, 13.933f, 1.5f, 12f, 1.5f)
            curveTo(10.067f, 1.5f, 8.5f, 3.067f, 8.5f, 5f)
            horizontalLineTo(8.182f)
            lineTo(13.5f, 10.318f)
            verticalLineTo(9.75f)
            curveTo(13.5f, 9.336f, 13.836f, 9f, 14.25f, 9f)
            curveTo(14.664f, 9f, 15f, 9.336f, 15f, 9.75f)
            close()
            moveTo(14f, 5f)
            horizontalLineTo(10f)
            curveTo(10f, 3.895f, 10.895f, 3f, 12f, 3f)
            curveTo(13.105f, 3f, 14f, 3.895f, 14f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DeleteOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DeleteOff, contentDescription = null)
    }
}
