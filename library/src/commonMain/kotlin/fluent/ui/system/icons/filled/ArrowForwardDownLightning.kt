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

public val FluentUi.Filled.ArrowForwardDownLightning: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.ArrowForwardDownLightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.296f, 5.706f)
                curveTo(15.906f, 5.315f, 15.906f, 4.682f, 16.297f, 4.292f)
                curveTo(16.688f, 3.901f, 17.321f, 3.902f, 17.711f, 4.292f)
                lineTo(22.708f, 9.296f)
                curveTo(23.098f, 9.686f, 23.098f, 10.319f, 22.707f, 10.71f)
                lineTo(17.711f, 15.707f)
                curveTo(17.32f, 16.098f, 16.687f, 16.098f, 16.296f, 15.707f)
                curveTo(15.906f, 15.317f, 15.906f, 14.684f, 16.296f, 14.293f)
                lineTo(19.589f, 11f)
                lineTo(13f, 11f)
                curveTo(8.665f, 11f, 5.136f, 7.552f, 5.004f, 3.249f)
                lineTo(5f, 3f)
                curveTo(5f, 2.448f, 5.448f, 2f, 6f, 2f)
                curveTo(6.552f, 2f, 7f, 2.448f, 7f, 3f)
                curveTo(7f, 6.239f, 9.566f, 8.878f, 12.775f, 8.996f)
                lineTo(13f, 9f)
                lineTo(19.586f, 9f)
                lineTo(16.296f, 5.706f)
                close()
                moveTo(5.318f, 12f)
                horizontalLineTo(10.145f)
                curveTo(10.528f, 12f, 10.769f, 12.412f, 10.581f, 12.745f)
                lineTo(8.75f, 16f)
                horizontalLineTo(10.246f)
                curveTo(10.891f, 16f, 11.235f, 16.759f, 10.811f, 17.244f)
                lineTo(5.987f, 22.752f)
                curveTo(5.482f, 23.328f, 4.544f, 22.837f, 4.729f, 22.094f)
                lineTo(5.5f, 19f)
                horizontalLineTo(2.498f)
                curveTo(2.131f, 19f, 1.889f, 18.619f, 2.045f, 18.287f)
                lineTo(4.865f, 12.287f)
                curveTo(4.948f, 12.112f, 5.124f, 12f, 5.318f, 12f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ArrowForwardDownLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowForwardDownLightning, contentDescription = null)
    }
}
