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

public val FluentUi.Filled.ArrowExportRtl: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExportRtl",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.246f, 4.504f)
            curveTo(20.866f, 4.504f, 20.553f, 4.786f, 20.503f, 5.152f)
            lineTo(20.496f, 5.254f)
            verticalLineTo(18.753f)
            curveTo(20.496f, 19.167f, 20.832f, 19.503f, 21.246f, 19.503f)
            curveTo(21.626f, 19.503f, 21.94f, 19.22f, 21.989f, 18.854f)
            lineTo(21.996f, 18.753f)
            verticalLineTo(5.254f)
            curveTo(21.996f, 4.84f, 21.66f, 4.504f, 21.246f, 4.504f)
            close()
            moveTo(8.786f, 6.387f)
            lineTo(8.703f, 6.293f)
            curveTo(8.343f, 5.932f, 7.775f, 5.905f, 7.383f, 6.21f)
            lineTo(7.289f, 6.293f)
            lineTo(2.292f, 11.291f)
            curveTo(1.932f, 11.651f, 1.904f, 12.218f, 2.209f, 12.61f)
            lineTo(2.292f, 12.704f)
            lineTo(7.288f, 17.708f)
            curveTo(7.679f, 18.098f, 8.312f, 18.099f, 8.703f, 17.709f)
            curveTo(9.063f, 17.348f, 9.092f, 16.781f, 8.787f, 16.389f)
            lineTo(8.704f, 16.295f)
            lineTo(5.415f, 13f)
            lineTo(17.996f, 13f)
            curveTo(18.509f, 13f, 18.932f, 12.614f, 18.989f, 12.117f)
            lineTo(18.996f, 12f)
            curveTo(18.996f, 11.487f, 18.61f, 11.064f, 18.113f, 11.007f)
            lineTo(17.996f, 11f)
            lineTo(5.412f, 11f)
            lineTo(8.703f, 7.707f)
            curveTo(9.064f, 7.347f, 9.091f, 6.779f, 8.786f, 6.387f)
            lineTo(8.703f, 6.293f)
            lineTo(8.786f, 6.387f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowExportRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowExportRtl, contentDescription = null)
    }
}
