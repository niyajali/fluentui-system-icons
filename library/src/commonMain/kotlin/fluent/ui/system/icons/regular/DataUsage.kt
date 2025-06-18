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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.DataUsage: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataUsage",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.25f, 2.996f)
            curveTo(19.769f, 2.996f, 21f, 4.227f, 21f, 5.746f)
            verticalLineTo(18.246f)
            curveTo(21f, 19.765f, 19.769f, 20.996f, 18.25f, 20.996f)
            horizontalLineTo(5.75f)
            curveTo(4.231f, 20.996f, 3f, 19.765f, 3f, 18.246f)
            verticalLineTo(5.746f)
            curveTo(3f, 4.227f, 4.231f, 2.996f, 5.75f, 2.996f)
            horizontalLineTo(18.25f)
            close()
            moveTo(18.25f, 4.496f)
            horizontalLineTo(5.75f)
            curveTo(5.06f, 4.496f, 4.5f, 5.056f, 4.5f, 5.746f)
            verticalLineTo(18.246f)
            curveTo(4.5f, 18.936f, 5.06f, 19.496f, 5.75f, 19.496f)
            horizontalLineTo(18.25f)
            curveTo(18.94f, 19.496f, 19.5f, 18.936f, 19.5f, 18.246f)
            verticalLineTo(5.746f)
            curveTo(19.5f, 5.056f, 18.94f, 4.496f, 18.25f, 4.496f)
            close()
            moveTo(7.75f, 8.999f)
            curveTo(8.13f, 8.999f, 8.443f, 9.28f, 8.493f, 9.645f)
            lineTo(8.5f, 9.746f)
            verticalLineTo(16.253f)
            curveTo(8.5f, 16.665f, 8.164f, 16.999f, 7.75f, 16.999f)
            curveTo(7.37f, 16.999f, 7.057f, 16.719f, 7.007f, 16.354f)
            lineTo(7f, 16.253f)
            verticalLineTo(9.746f)
            curveTo(7f, 9.334f, 7.336f, 8.999f, 7.75f, 8.999f)
            close()
            moveTo(16.25f, 6.999f)
            curveTo(16.63f, 6.999f, 16.944f, 7.274f, 16.993f, 7.63f)
            lineTo(17f, 7.729f)
            verticalLineTo(16.27f)
            curveTo(17f, 16.673f, 16.664f, 16.999f, 16.25f, 16.999f)
            curveTo(15.87f, 16.999f, 15.557f, 16.725f, 15.507f, 16.369f)
            lineTo(15.5f, 16.27f)
            verticalLineTo(7.729f)
            curveTo(15.5f, 7.326f, 15.836f, 6.999f, 16.25f, 6.999f)
            close()
            moveTo(11.975f, 11.996f)
            curveTo(12.346f, 11.993f, 12.655f, 12.263f, 12.707f, 12.617f)
            lineTo(12.715f, 12.715f)
            lineTo(12.75f, 16.263f)
            curveTo(12.754f, 16.664f, 12.429f, 16.992f, 12.025f, 16.996f)
            curveTo(11.654f, 17f, 11.345f, 16.729f, 11.293f, 16.375f)
            lineTo(11.285f, 16.277f)
            lineTo(11.25f, 12.73f)
            curveTo(11.246f, 12.328f, 11.571f, 12f, 11.975f, 11.996f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataUsagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DataUsage, contentDescription = null)
    }
}
