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

public val FluentUi.Filled.ArrowImport: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowImport",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.25f, 4.5f)
            curveTo(21.63f, 4.5f, 21.944f, 4.782f, 21.993f, 5.148f)
            lineTo(22f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(22f, 19.164f, 21.664f, 19.5f, 21.25f, 19.5f)
            curveTo(20.87f, 19.5f, 20.556f, 19.218f, 20.507f, 18.852f)
            lineTo(20.5f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(20.5f, 4.836f, 20.836f, 4.5f, 21.25f, 4.5f)
            close()
            moveTo(12.21f, 6.387f)
            lineTo(12.293f, 6.293f)
            curveTo(12.653f, 5.932f, 13.221f, 5.905f, 13.613f, 6.21f)
            lineTo(13.707f, 6.293f)
            lineTo(18.704f, 11.291f)
            curveTo(19.064f, 11.651f, 19.092f, 12.218f, 18.787f, 12.61f)
            lineTo(18.704f, 12.704f)
            lineTo(13.708f, 17.708f)
            curveTo(13.317f, 18.098f, 12.684f, 18.099f, 12.293f, 17.709f)
            curveTo(11.933f, 17.348f, 11.905f, 16.781f, 12.209f, 16.389f)
            lineTo(12.292f, 16.295f)
            lineTo(15.581f, 13f)
            horizontalLineTo(3f)
            curveTo(2.487f, 13f, 2.064f, 12.614f, 2.007f, 12.117f)
            lineTo(2f, 12f)
            curveTo(2f, 11.487f, 2.386f, 11.064f, 2.883f, 11.007f)
            lineTo(3f, 11f)
            horizontalLineTo(15.584f)
            lineTo(12.293f, 7.707f)
            curveTo(11.932f, 7.347f, 11.905f, 6.779f, 12.21f, 6.387f)
            lineTo(12.293f, 6.293f)
            lineTo(12.21f, 6.387f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowImportPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowImport, contentDescription = null)
    }
}
