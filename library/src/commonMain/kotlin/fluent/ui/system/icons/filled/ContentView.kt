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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ContentView: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ContentView",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(6f, 8.25f)
            curveTo(6f, 7.284f, 6.784f, 6.5f, 7.75f, 6.5f)
            horizontalLineTo(16.25f)
            curveTo(17.216f, 6.5f, 18f, 7.284f, 18f, 8.25f)
            verticalLineTo(9.75f)
            curveTo(18f, 10.717f, 17.216f, 11.5f, 16.25f, 11.5f)
            horizontalLineTo(7.75f)
            curveTo(6.784f, 11.5f, 6f, 10.717f, 6f, 9.75f)
            verticalLineTo(8.25f)
            close()
            moveTo(7.75f, 8f)
            curveTo(7.612f, 8f, 7.5f, 8.112f, 7.5f, 8.25f)
            verticalLineTo(9.75f)
            curveTo(7.5f, 9.888f, 7.612f, 10f, 7.75f, 10f)
            horizontalLineTo(16.25f)
            curveTo(16.388f, 10f, 16.5f, 9.888f, 16.5f, 9.75f)
            verticalLineTo(8.25f)
            curveTo(16.5f, 8.112f, 16.388f, 8f, 16.25f, 8f)
            horizontalLineTo(7.75f)
            close()
            moveTo(6.75f, 13f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 13f, 12f, 13.336f, 12f, 13.75f)
            curveTo(12f, 14.164f, 11.664f, 14.5f, 11.25f, 14.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 14.5f, 6f, 14.164f, 6f, 13.75f)
            curveTo(6f, 13.336f, 6.336f, 13f, 6.75f, 13f)
            close()
            moveTo(6f, 16.75f)
            curveTo(6f, 16.336f, 6.336f, 16f, 6.75f, 16f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 16f, 12f, 16.336f, 12f, 16.75f)
            curveTo(12f, 17.164f, 11.664f, 17.5f, 11.25f, 17.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 17.5f, 6f, 17.164f, 6f, 16.75f)
            close()
            moveTo(15.25f, 13f)
            horizontalLineTo(16.25f)
            curveTo(17.216f, 13f, 18f, 13.783f, 18f, 14.75f)
            verticalLineTo(15.75f)
            curveTo(18f, 16.716f, 17.216f, 17.5f, 16.25f, 17.5f)
            horizontalLineTo(15.25f)
            curveTo(14.283f, 17.5f, 13.5f, 16.716f, 13.5f, 15.75f)
            verticalLineTo(14.75f)
            curveTo(13.5f, 13.783f, 14.283f, 13f, 15.25f, 13f)
            close()
            moveTo(15f, 14.75f)
            curveTo(15f, 14.612f, 15.112f, 14.5f, 15.25f, 14.5f)
            horizontalLineTo(16.25f)
            curveTo(16.388f, 14.5f, 16.5f, 14.612f, 16.5f, 14.75f)
            verticalLineTo(15.75f)
            curveTo(16.5f, 15.888f, 16.388f, 16f, 16.25f, 16f)
            horizontalLineTo(15.25f)
            curveTo(15.112f, 16f, 15f, 15.888f, 15f, 15.75f)
            verticalLineTo(14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ContentViewPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ContentView, contentDescription = null)
    }
}
