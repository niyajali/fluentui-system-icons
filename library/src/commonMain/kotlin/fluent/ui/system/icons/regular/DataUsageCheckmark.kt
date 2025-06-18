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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.DataUsageCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataUsageCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.25f, 1.996f)
            curveTo(18.769f, 1.996f, 20f, 3.227f, 20f, 4.746f)
            verticalLineTo(11.498f)
            curveTo(19.526f, 11.3f, 19.023f, 11.157f, 18.5f, 11.076f)
            verticalLineTo(4.746f)
            curveTo(18.5f, 4.056f, 17.94f, 3.496f, 17.25f, 3.496f)
            horizontalLineTo(4.75f)
            curveTo(4.06f, 3.496f, 3.5f, 4.056f, 3.5f, 4.746f)
            verticalLineTo(17.246f)
            curveTo(3.5f, 17.937f, 4.06f, 18.496f, 4.75f, 18.496f)
            horizontalLineTo(11.076f)
            curveTo(11.156f, 19.019f, 11.299f, 19.522f, 11.497f, 19.996f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 19.996f, 2f, 18.765f, 2f, 17.246f)
            verticalLineTo(4.746f)
            curveTo(2f, 3.227f, 3.231f, 1.996f, 4.75f, 1.996f)
            horizontalLineTo(17.25f)
            close()
            moveTo(16f, 6.729f)
            verticalLineTo(11.174f)
            curveTo(15.472f, 11.299f, 14.969f, 11.488f, 14.5f, 11.732f)
            verticalLineTo(6.729f)
            curveTo(14.5f, 6.326f, 14.836f, 5.999f, 15.25f, 5.999f)
            curveTo(15.63f, 5.999f, 15.943f, 6.274f, 15.993f, 6.63f)
            lineTo(16f, 6.729f)
            close()
            moveTo(11.715f, 11.715f)
            lineTo(11.742f, 14.481f)
            curveTo(11.496f, 14.949f, 11.306f, 15.451f, 11.179f, 15.979f)
            curveTo(11.129f, 15.99f, 11.078f, 15.996f, 11.025f, 15.996f)
            curveTo(10.654f, 16f, 10.345f, 15.729f, 10.293f, 15.375f)
            lineTo(10.285f, 15.277f)
            lineTo(10.25f, 11.73f)
            curveTo(10.246f, 11.328f, 10.571f, 11f, 10.975f, 10.996f)
            curveTo(11.346f, 10.993f, 11.655f, 11.263f, 11.707f, 11.617f)
            lineTo(11.715f, 11.715f)
            close()
            moveTo(6.75f, 7.999f)
            curveTo(7.13f, 7.999f, 7.443f, 8.28f, 7.493f, 8.645f)
            lineTo(7.5f, 8.746f)
            verticalLineTo(15.253f)
            curveTo(7.5f, 15.665f, 7.164f, 15.999f, 6.75f, 15.999f)
            curveTo(6.37f, 15.999f, 6.057f, 15.719f, 6.007f, 15.354f)
            lineTo(6f, 15.253f)
            verticalLineTo(8.746f)
            curveTo(6f, 8.334f, 6.336f, 7.999f, 6.75f, 7.999f)
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
        Image(imageVector = FluentUi.Regular.DataUsageCheckmark, contentDescription = null)
    }
}
