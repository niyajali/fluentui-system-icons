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

public val FluentUi.Filled.DoubleTapSwipeDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DoubleTapSwipeDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.707f, 21.707f)
            curveTo(12.317f, 22.097f, 11.683f, 22.097f, 11.293f, 21.707f)
            lineTo(8.293f, 18.707f)
            curveTo(7.902f, 18.316f, 7.902f, 17.683f, 8.293f, 17.293f)
            curveTo(8.683f, 16.902f, 9.317f, 16.902f, 9.707f, 17.293f)
            lineTo(11f, 18.586f)
            verticalLineTo(9f)
            curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
            curveTo(12.552f, 8f, 13f, 8.448f, 13f, 9f)
            verticalLineTo(18.586f)
            lineTo(14.293f, 17.293f)
            curveTo(14.683f, 16.902f, 15.317f, 16.902f, 15.707f, 17.293f)
            curveTo(16.098f, 17.683f, 16.098f, 18.316f, 15.707f, 18.707f)
            lineTo(12.707f, 21.707f)
            close()
            moveTo(4.5f, 9f)
            curveTo(4.5f, 12.45f, 6.829f, 15.355f, 10f, 16.23f)
            verticalLineTo(14.125f)
            curveTo(7.951f, 13.325f, 6.5f, 11.332f, 6.5f, 9f)
            curveTo(6.5f, 5.962f, 8.962f, 3.5f, 12f, 3.5f)
            curveTo(15.038f, 3.5f, 17.5f, 5.962f, 17.5f, 9f)
            curveTo(17.5f, 11.332f, 16.049f, 13.325f, 14f, 14.125f)
            verticalLineTo(16.23f)
            curveTo(17.171f, 15.355f, 19.5f, 12.45f, 19.5f, 9f)
            curveTo(19.5f, 4.858f, 16.142f, 1.5f, 12f, 1.5f)
            curveTo(7.858f, 1.5f, 4.5f, 4.858f, 4.5f, 9f)
            close()
            moveTo(7.5f, 9f)
            curveTo(7.5f, 10.767f, 8.518f, 12.296f, 10f, 13.032f)
            verticalLineTo(10.5f)
            curveTo(9.686f, 10.082f, 9.5f, 9.563f, 9.5f, 9f)
            curveTo(9.5f, 7.619f, 10.619f, 6.5f, 12f, 6.5f)
            curveTo(13.381f, 6.5f, 14.5f, 7.619f, 14.5f, 9f)
            curveTo(14.5f, 9.563f, 14.314f, 10.082f, 14f, 10.5f)
            verticalLineTo(13.032f)
            curveTo(15.482f, 12.296f, 16.5f, 10.767f, 16.5f, 9f)
            curveTo(16.5f, 6.515f, 14.485f, 4.5f, 12f, 4.5f)
            curveTo(9.515f, 4.5f, 7.5f, 6.515f, 7.5f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DoubleTapSwipeDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DoubleTapSwipeDown, contentDescription = null)
    }
}
