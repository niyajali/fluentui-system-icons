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

public val FluentUi.Filled.RemixAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RemixAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 3f)
            curveTo(2f, 2.448f, 2.448f, 2f, 3f, 2f)
            horizontalLineTo(12f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 14.726f, 20.91f, 17.197f, 19.141f, 19f)
            horizontalLineTo(15.876f)
            curveTo(18.335f, 17.635f, 20f, 15.012f, 20f, 12f)
            curveTo(20f, 8.139f, 17.264f, 4.917f, 13.626f, 4.166f)
            curveTo(13.101f, 4.057f, 12.557f, 4f, 12f, 4f)
            horizontalLineTo(3f)
            curveTo(2.448f, 4f, 2f, 3.552f, 2f, 3f)
            close()
            moveTo(10.182f, 21.835f)
            curveTo(10.772f, 21.943f, 11.379f, 22f, 12f, 22f)
            horizontalLineTo(21f)
            curveTo(21.552f, 22f, 22f, 21.552f, 22f, 21f)
            curveTo(22f, 20.448f, 21.552f, 20f, 21f, 20f)
            horizontalLineTo(12f)
            curveTo(9.33f, 20f, 6.966f, 18.692f, 5.512f, 16.682f)
            curveTo(5.495f, 16.658f, 5.477f, 16.633f, 5.46f, 16.609f)
            curveTo(4.54f, 15.306f, 4f, 13.716f, 4f, 12f)
            curveTo(4f, 8.988f, 5.665f, 6.365f, 8.124f, 5f)
            horizontalLineTo(4.859f)
            curveTo(3.09f, 6.804f, 2f, 9.275f, 2f, 12f)
            curveTo(2f, 16.902f, 5.527f, 20.98f, 10.182f, 21.835f)
            close()
            moveTo(12f, 8f)
            curveTo(12.552f, 8f, 13f, 8.448f, 13f, 9f)
            verticalLineTo(11f)
            horizontalLineTo(15f)
            curveTo(15.552f, 11f, 16f, 11.448f, 16f, 12f)
            curveTo(16f, 12.552f, 15.552f, 13f, 15f, 13f)
            horizontalLineTo(13f)
            verticalLineTo(15f)
            curveTo(13f, 15.552f, 12.552f, 16f, 12f, 16f)
            curveTo(11.448f, 16f, 11f, 15.552f, 11f, 15f)
            verticalLineTo(13f)
            horizontalLineTo(9f)
            curveTo(8.448f, 13f, 8f, 12.552f, 8f, 12f)
            curveTo(8f, 11.448f, 8.448f, 11f, 9f, 11f)
            horizontalLineTo(11f)
            verticalLineTo(9f)
            curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RemixAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.RemixAdd, contentDescription = null)
    }
}
