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

public val FluentIcons.Regular.ArrowLeft: ImageVector
    get() {
        if (_ArrowLeft != null) {
            return _ArrowLeft!!
        }
        _ArrowLeft = ImageVector.Builder(
            name = "Regular.ArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.733f, 19.791f)
                curveTo(11.033f, 20.076f, 11.507f, 20.065f, 11.793f, 19.765f)
                curveTo(12.079f, 19.465f, 12.067f, 18.99f, 11.767f, 18.704f)
                lineTo(5.516f, 12.75f)
                lineTo(20.25f, 12.75f)
                curveTo(20.664f, 12.75f, 21f, 12.414f, 21f, 12f)
                curveTo(21f, 11.585f, 20.664f, 11.25f, 20.25f, 11.25f)
                lineTo(5.516f, 11.25f)
                lineTo(11.767f, 5.295f)
                curveTo(12.067f, 5.009f, 12.079f, 4.535f, 11.793f, 4.235f)
                curveTo(11.507f, 3.935f, 11.033f, 3.923f, 10.733f, 4.209f)
                lineTo(3.314f, 11.276f)
                curveTo(3.145f, 11.436f, 3.045f, 11.642f, 3.014f, 11.855f)
                curveTo(3.005f, 11.902f, 3f, 11.95f, 3f, 12f)
                curveTo(3f, 12.049f, 3.005f, 12.098f, 3.014f, 12.145f)
                curveTo(3.045f, 12.358f, 3.145f, 12.563f, 3.314f, 12.724f)
                lineTo(10.733f, 19.791f)
                close()
            }
        }.build()

        return _ArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowLeft, contentDescription = null)
    }
}
