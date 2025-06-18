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

public val FluentUi.Filled.DataUsageCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataUsageCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.25f, 1.996f)
            curveTo(18.769f, 1.996f, 20f, 3.227f, 20f, 4.746f)
            verticalLineTo(11.498f)
            curveTo(19.23f, 11.177f, 18.386f, 11f, 17.5f, 11f)
            curveTo(16.984f, 11f, 16.482f, 11.06f, 16f, 11.174f)
            verticalLineTo(6.729f)
            curveTo(16f, 6.326f, 15.664f, 5.999f, 15.25f, 5.999f)
            curveTo(14.836f, 5.999f, 14.5f, 6.326f, 14.5f, 6.729f)
            verticalLineTo(11.732f)
            curveTo(13.324f, 12.345f, 12.359f, 13.307f, 11.742f, 14.481f)
            lineTo(11.715f, 11.715f)
            curveTo(11.711f, 11.314f, 11.38f, 10.992f, 10.975f, 10.996f)
            curveTo(10.571f, 11f, 10.246f, 11.328f, 10.25f, 11.73f)
            lineTo(10.285f, 15.277f)
            curveTo(10.289f, 15.678f, 10.62f, 16f, 11.025f, 15.996f)
            curveTo(11.078f, 15.996f, 11.129f, 15.99f, 11.179f, 15.979f)
            curveTo(11.062f, 16.466f, 11f, 16.976f, 11f, 17.5f)
            curveTo(11f, 18.384f, 11.177f, 19.228f, 11.497f, 19.996f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 19.996f, 2f, 18.765f, 2f, 17.246f)
            verticalLineTo(4.746f)
            curveTo(2f, 3.227f, 3.231f, 1.996f, 4.75f, 1.996f)
            horizontalLineTo(17.25f)
            close()
            moveTo(6.75f, 7.999f)
            curveTo(6.336f, 7.999f, 6f, 8.334f, 6f, 8.746f)
            verticalLineTo(15.253f)
            curveTo(6f, 15.665f, 6.336f, 15.999f, 6.75f, 15.999f)
            curveTo(7.164f, 15.999f, 7.5f, 15.665f, 7.5f, 15.253f)
            verticalLineTo(8.746f)
            curveTo(7.5f, 8.334f, 7.164f, 7.999f, 6.75f, 7.999f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(20.854f, 15.146f)
            curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
            lineTo(16.5f, 18.793f)
            lineTo(14.854f, 17.146f)
            curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
            curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
            lineTo(16.146f, 19.854f)
            curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
            lineTo(20.854f, 15.854f)
            curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataUsageCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DataUsageCheckmark, contentDescription = null)
    }
}
