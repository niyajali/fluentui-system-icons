/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.RotateLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RotateLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.5f, 15f)
            curveTo(14.086f, 15f, 13.75f, 14.664f, 13.75f, 14.25f)
            curveTo(13.75f, 13.836f, 14.086f, 13.5f, 14.5f, 13.5f)
            horizontalLineTo(15f)
            curveTo(17.485f, 13.5f, 19.5f, 11.933f, 19.5f, 10f)
            curveTo(19.5f, 8.126f, 17.605f, 6.595f, 15.225f, 6.504f)
            lineTo(15f, 6.5f)
            horizontalLineTo(8.061f)
            lineTo(9.78f, 8.22f)
            curveTo(10.073f, 8.513f, 10.073f, 8.987f, 9.78f, 9.28f)
            curveTo(9.514f, 9.547f, 9.097f, 9.571f, 8.804f, 9.353f)
            lineTo(8.72f, 9.28f)
            lineTo(5.72f, 6.28f)
            curveTo(5.427f, 5.987f, 5.427f, 5.513f, 5.72f, 5.22f)
            lineTo(8.72f, 2.22f)
            lineTo(8.804f, 2.147f)
            curveTo(9.097f, 1.929f, 9.514f, 1.953f, 9.78f, 2.22f)
            curveTo(10.073f, 2.513f, 10.073f, 2.987f, 9.78f, 3.28f)
            lineTo(8.062f, 5f)
            horizontalLineTo(15f)
            curveTo(18.314f, 5f, 21f, 7.239f, 21f, 10f)
            curveTo(21f, 12.761f, 18.314f, 15f, 15f, 15f)
            horizontalLineTo(14.5f)
            close()
            moveTo(3.5f, 10.367f)
            curveTo(3.224f, 10.367f, 3f, 10.591f, 3f, 10.867f)
            verticalLineTo(20f)
            curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
            horizontalLineTo(20.138f)
            curveTo(20.317f, 21f, 20.482f, 20.905f, 20.571f, 20.75f)
            curveTo(20.709f, 20.511f, 20.628f, 20.206f, 20.389f, 20.067f)
            lineTo(3.751f, 10.434f)
            curveTo(3.674f, 10.39f, 3.588f, 10.367f, 3.5f, 10.367f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RotateLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.RotateLeft, contentDescription = null)
    }
}
