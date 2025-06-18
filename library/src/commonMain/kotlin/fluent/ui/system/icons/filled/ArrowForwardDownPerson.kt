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

public val FluentUi.Filled.ArrowForwardDownPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowForwardDownPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.296f, 5.706f)
            curveTo(15.906f, 5.315f, 15.906f, 4.682f, 16.297f, 4.291f)
            curveTo(16.688f, 3.901f, 17.321f, 3.901f, 17.711f, 4.292f)
            lineTo(22.708f, 9.296f)
            curveTo(23.098f, 9.686f, 23.097f, 10.319f, 22.707f, 10.709f)
            lineTo(17.711f, 15.707f)
            curveTo(17.32f, 16.098f, 16.687f, 16.098f, 16.296f, 15.707f)
            curveTo(15.906f, 15.317f, 15.906f, 14.684f, 16.296f, 14.293f)
            lineTo(19.589f, 11f)
            lineTo(13f, 11f)
            curveTo(8.665f, 11f, 5.135f, 7.552f, 5.004f, 3.249f)
            lineTo(5f, 3f)
            curveTo(5f, 2.448f, 5.448f, 2f, 6f, 2f)
            curveTo(6.552f, 2f, 7f, 2.448f, 7f, 3f)
            curveTo(7f, 6.238f, 9.566f, 8.878f, 12.775f, 8.996f)
            lineTo(13f, 9f)
            lineTo(19.586f, 9f)
            lineTo(16.296f, 5.706f)
            close()
            moveTo(9f, 13.5f)
            curveTo(9f, 14.881f, 7.881f, 16f, 6.5f, 16f)
            curveTo(5.119f, 16f, 4f, 14.881f, 4f, 13.5f)
            curveTo(4f, 12.119f, 5.119f, 11f, 6.5f, 11f)
            curveTo(7.881f, 11f, 9f, 12.119f, 9f, 13.5f)
            close()
            moveTo(11f, 18.875f)
            curveTo(11f, 20.431f, 9.714f, 22f, 6.5f, 22f)
            curveTo(3.286f, 22f, 2f, 20.437f, 2f, 18.875f)
            verticalLineTo(18.772f)
            curveTo(2f, 17.793f, 2.794f, 17f, 3.773f, 17f)
            horizontalLineTo(9.227f)
            curveTo(10.206f, 17f, 11f, 17.793f, 11f, 18.772f)
            verticalLineTo(18.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowForwardDownPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowForwardDownPerson, contentDescription = null)
    }
}
