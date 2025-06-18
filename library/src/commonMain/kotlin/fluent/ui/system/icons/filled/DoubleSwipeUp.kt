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

public val FluentUi.Filled.DoubleSwipeUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DoubleSwipeUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.207f, 2.293f)
            curveTo(17.817f, 1.902f, 17.183f, 1.902f, 16.793f, 2.293f)
            lineTo(13.793f, 5.293f)
            curveTo(13.402f, 5.683f, 13.402f, 6.317f, 13.793f, 6.707f)
            curveTo(14.183f, 7.098f, 14.817f, 7.098f, 15.207f, 6.707f)
            lineTo(16.5f, 5.414f)
            verticalLineTo(17f)
            curveTo(16.5f, 17.552f, 16.948f, 18f, 17.5f, 18f)
            curveTo(18.052f, 18f, 18.5f, 17.552f, 18.5f, 17f)
            verticalLineTo(5.414f)
            lineTo(19.793f, 6.707f)
            curveTo(20.183f, 7.098f, 20.817f, 7.098f, 21.207f, 6.707f)
            curveTo(21.598f, 6.317f, 21.598f, 5.683f, 21.207f, 5.293f)
            lineTo(18.207f, 2.293f)
            close()
            moveTo(12.5f, 17f)
            curveTo(12.5f, 14.95f, 13.734f, 13.188f, 15.5f, 12.416f)
            verticalLineTo(14.764f)
            curveTo(14.886f, 15.313f, 14.5f, 16.111f, 14.5f, 17f)
            curveTo(14.5f, 18.657f, 15.843f, 20f, 17.5f, 20f)
            curveTo(19.157f, 20f, 20.5f, 18.657f, 20.5f, 17f)
            curveTo(20.5f, 16.111f, 20.114f, 15.313f, 19.5f, 14.764f)
            verticalLineTo(12.416f)
            curveTo(21.266f, 13.188f, 22.5f, 14.95f, 22.5f, 17f)
            curveTo(22.5f, 19.761f, 20.261f, 22f, 17.5f, 22f)
            curveTo(14.739f, 22f, 12.5f, 19.761f, 12.5f, 17f)
            close()
            moveTo(4.5f, 12.416f)
            curveTo(2.734f, 13.188f, 1.5f, 14.95f, 1.5f, 17f)
            curveTo(1.5f, 19.761f, 3.739f, 22f, 6.5f, 22f)
            curveTo(9.261f, 22f, 11.5f, 19.761f, 11.5f, 17f)
            curveTo(11.5f, 14.95f, 10.266f, 13.188f, 8.5f, 12.416f)
            verticalLineTo(14.764f)
            curveTo(9.114f, 15.313f, 9.5f, 16.111f, 9.5f, 17f)
            curveTo(9.5f, 18.657f, 8.157f, 20f, 6.5f, 20f)
            curveTo(4.843f, 20f, 3.5f, 18.657f, 3.5f, 17f)
            curveTo(3.5f, 16.111f, 3.886f, 15.313f, 4.5f, 14.764f)
            verticalLineTo(12.416f)
            close()
            moveTo(7.207f, 2.293f)
            curveTo(6.817f, 1.902f, 6.183f, 1.902f, 5.793f, 2.293f)
            lineTo(2.793f, 5.293f)
            curveTo(2.402f, 5.683f, 2.402f, 6.317f, 2.793f, 6.707f)
            curveTo(3.183f, 7.098f, 3.817f, 7.098f, 4.207f, 6.707f)
            lineTo(5.5f, 5.414f)
            verticalLineTo(17f)
            curveTo(5.5f, 17.552f, 5.948f, 18f, 6.5f, 18f)
            curveTo(7.052f, 18f, 7.5f, 17.552f, 7.5f, 17f)
            verticalLineTo(5.414f)
            lineTo(8.793f, 6.707f)
            curveTo(9.183f, 7.098f, 9.817f, 7.098f, 10.207f, 6.707f)
            curveTo(10.598f, 6.317f, 10.598f, 5.683f, 10.207f, 5.293f)
            lineTo(7.207f, 2.293f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DoubleSwipeUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DoubleSwipeUp, contentDescription = null)
    }
}
