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

public val FluentUi.Filled.DocumentBorderPrint: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentBorderPrint",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.25f, 2f)
            curveTo(5.455f, 2f, 4f, 3.455f, 4f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(4f, 20.545f, 5.455f, 22f, 7.25f, 22f)
            horizontalLineTo(13.104f)
            curveTo(13.058f, 21.839f, 13.027f, 21.672f, 13.011f, 21.5f)
            horizontalLineTo(13f)
            curveTo(12.26f, 21.5f, 11.613f, 21.098f, 11.268f, 20.5f)
            horizontalLineTo(7.25f)
            curveTo(6.284f, 20.5f, 5.5f, 19.716f, 5.5f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(5.5f, 4.284f, 6.284f, 3.5f, 7.25f, 3.5f)
            horizontalLineTo(16.75f)
            curveTo(17.716f, 3.5f, 18.5f, 4.284f, 18.5f, 5.25f)
            verticalLineTo(11f)
            horizontalLineTo(19.25f)
            curveTo(19.51f, 11f, 19.762f, 11.036f, 20f, 11.104f)
            verticalLineTo(5.25f)
            curveTo(20f, 3.455f, 18.545f, 2f, 16.75f, 2f)
            horizontalLineTo(7.25f)
            close()
            moveTo(15.75f, 11f)
            horizontalLineTo(17f)
            verticalLineTo(6f)
            curveTo(17f, 5.448f, 16.552f, 5f, 16f, 5f)
            horizontalLineTo(8f)
            curveTo(7.448f, 5f, 7f, 5.448f, 7f, 6f)
            verticalLineTo(18f)
            curveTo(7f, 18.552f, 7.448f, 19f, 8f, 19f)
            horizontalLineTo(11f)
            verticalLineTo(16f)
            curveTo(11f, 14.788f, 11.863f, 13.777f, 13.007f, 13.549f)
            curveTo(13.11f, 12.124f, 14.299f, 11f, 15.75f, 11f)
            close()
            moveTo(14f, 13.75f)
            curveTo(14f, 12.783f, 14.783f, 12f, 15.75f, 12f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 12f, 21f, 12.783f, 21f, 13.75f)
            verticalLineTo(14.5f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 14.5f, 23f, 15.172f, 23f, 16f)
            verticalLineTo(19.5f)
            curveTo(23f, 20.052f, 22.552f, 20.5f, 22f, 20.5f)
            horizontalLineTo(21f)
            verticalLineTo(21.25f)
            curveTo(21f, 22.216f, 20.216f, 23f, 19.25f, 23f)
            horizontalLineTo(15.75f)
            curveTo(14.783f, 23f, 14f, 22.216f, 14f, 21.25f)
            verticalLineTo(20.5f)
            horizontalLineTo(13f)
            curveTo(12.448f, 20.5f, 12f, 20.052f, 12f, 19.5f)
            verticalLineTo(16f)
            curveTo(12f, 15.172f, 12.672f, 14.5f, 13.5f, 14.5f)
            horizontalLineTo(14f)
            verticalLineTo(13.75f)
            close()
            moveTo(19.5f, 13.75f)
            curveTo(19.5f, 13.612f, 19.388f, 13.5f, 19.25f, 13.5f)
            horizontalLineTo(15.75f)
            curveTo(15.612f, 13.5f, 15.5f, 13.612f, 15.5f, 13.75f)
            verticalLineTo(14.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(13.75f)
            close()
            moveTo(15.5f, 19.25f)
            verticalLineTo(21.25f)
            curveTo(15.5f, 21.388f, 15.612f, 21.5f, 15.75f, 21.5f)
            horizontalLineTo(19.25f)
            curveTo(19.388f, 21.5f, 19.5f, 21.388f, 19.5f, 21.25f)
            verticalLineTo(19.25f)
            curveTo(19.5f, 19.112f, 19.388f, 19f, 19.25f, 19f)
            horizontalLineTo(15.75f)
            curveTo(15.612f, 19f, 15.5f, 19.112f, 15.5f, 19.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentBorderPrintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentBorderPrint, contentDescription = null)
    }
}
