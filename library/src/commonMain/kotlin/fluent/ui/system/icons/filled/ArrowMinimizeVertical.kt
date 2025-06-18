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

public val FluentUi.Filled.ArrowMinimizeVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowMinimizeVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.793f, 18.707f)
            curveTo(14.183f, 19.098f, 14.817f, 19.098f, 15.207f, 18.707f)
            curveTo(15.598f, 18.317f, 15.598f, 17.683f, 15.207f, 17.293f)
            lineTo(12.707f, 14.793f)
            curveTo(12.317f, 14.402f, 11.683f, 14.402f, 11.293f, 14.793f)
            lineTo(8.793f, 17.293f)
            curveTo(8.402f, 17.683f, 8.402f, 18.317f, 8.793f, 18.707f)
            curveTo(9.183f, 19.098f, 9.817f, 19.098f, 10.207f, 18.707f)
            lineTo(11f, 17.914f)
            lineTo(11f, 21f)
            curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
            curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
            verticalLineTo(17.914f)
            lineTo(13.793f, 18.707f)
            close()
            moveTo(4f, 12f)
            curveTo(4f, 11.448f, 4.448f, 11f, 5f, 11f)
            horizontalLineTo(19f)
            curveTo(19.552f, 11f, 20f, 11.448f, 20f, 12f)
            curveTo(20f, 12.552f, 19.552f, 13f, 19f, 13f)
            horizontalLineTo(5f)
            curveTo(4.448f, 13f, 4f, 12.552f, 4f, 12f)
            close()
            moveTo(13f, 3f)
            curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
            curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
            lineTo(11f, 6.086f)
            lineTo(10.207f, 5.293f)
            curveTo(9.817f, 4.902f, 9.183f, 4.902f, 8.793f, 5.293f)
            curveTo(8.402f, 5.683f, 8.402f, 6.317f, 8.793f, 6.707f)
            lineTo(11.293f, 9.207f)
            curveTo(11.683f, 9.598f, 12.317f, 9.598f, 12.707f, 9.207f)
            lineTo(15.207f, 6.707f)
            curveTo(15.598f, 6.317f, 15.598f, 5.683f, 15.207f, 5.293f)
            curveTo(14.817f, 4.902f, 14.183f, 4.902f, 13.793f, 5.293f)
            lineTo(13f, 6.086f)
            verticalLineTo(3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowMinimizeVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowMinimizeVertical, contentDescription = null)
    }
}
