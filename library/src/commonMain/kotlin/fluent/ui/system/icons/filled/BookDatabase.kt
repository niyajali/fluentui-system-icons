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

public val FluentUi.Filled.BookDatabase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookDatabase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 2f)
            curveTo(5.119f, 2f, 4f, 3.119f, 4f, 4.5f)
            verticalLineTo(19.5f)
            curveTo(4f, 20.881f, 5.119f, 22f, 6.5f, 22f)
            horizontalLineTo(12.534f)
            curveTo(12.216f, 21.584f, 12f, 21.076f, 12f, 20.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 20.5f, 5.5f, 20.052f, 5.5f, 19.5f)
            horizontalLineTo(12f)
            verticalLineTo(14.293f)
            lineTo(12.008f, 14.3f)
            curveTo(12.107f, 13.134f, 13.06f, 12.316f, 14.017f, 11.838f)
            curveTo(15.088f, 11.302f, 16.498f, 11f, 18f, 11f)
            curveTo(18.573f, 11f, 19.129f, 11.044f, 19.655f, 11.127f)
            curveTo(19.945f, 11.172f, 20.228f, 11.23f, 20.5f, 11.299f)
            verticalLineTo(4.5f)
            curveTo(20.5f, 3.119f, 19.381f, 2f, 18f, 2f)
            horizontalLineTo(6.5f)
            close()
            moveTo(8f, 5f)
            horizontalLineTo(16f)
            curveTo(16.552f, 5f, 17f, 5.448f, 17f, 6f)
            verticalLineTo(7f)
            curveTo(17f, 7.552f, 16.552f, 8f, 16f, 8f)
            horizontalLineTo(8f)
            curveTo(7.448f, 8f, 7f, 7.552f, 7f, 7f)
            verticalLineTo(6f)
            curveTo(7f, 5.448f, 7.448f, 5f, 8f, 5f)
            close()
            moveTo(19.5f, 12.114f)
            curveTo(20.046f, 12.2f, 20.552f, 12.332f, 21f, 12.5f)
            curveTo(22.214f, 12.956f, 23f, 13.682f, 23f, 14.5f)
            curveTo(23f, 15.318f, 22.214f, 16.044f, 21f, 16.5f)
            curveTo(20.552f, 16.668f, 20.046f, 16.8f, 19.5f, 16.885f)
            curveTo(19.027f, 16.96f, 18.523f, 17f, 18f, 17f)
            curveTo(15.239f, 17f, 13f, 15.881f, 13f, 14.5f)
            curveTo(13f, 13.119f, 15.239f, 12f, 18f, 12f)
            curveTo(18.523f, 12f, 19.027f, 12.04f, 19.5f, 12.114f)
            close()
            moveTo(19.5f, 17.896f)
            curveTo(20.029f, 17.822f, 20.534f, 17.708f, 21f, 17.559f)
            curveTo(21.351f, 17.446f, 21.68f, 17.313f, 21.983f, 17.162f)
            curveTo(22.337f, 16.985f, 22.69f, 16.762f, 23f, 16.492f)
            verticalLineTo(20.5f)
            curveTo(23f, 21.881f, 20.761f, 23f, 18f, 23f)
            curveTo(15.95f, 23f, 14.188f, 22.383f, 13.416f, 21.5f)
            curveTo(13.148f, 21.194f, 13f, 20.856f, 13f, 20.5f)
            verticalLineTo(16.492f)
            curveTo(13.31f, 16.762f, 13.663f, 16.985f, 14.017f, 17.162f)
            curveTo(15.088f, 17.698f, 16.498f, 18f, 18f, 18f)
            curveTo(18.514f, 18f, 19.017f, 17.965f, 19.5f, 17.896f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookDatabasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BookDatabase, contentDescription = null)
    }
}
