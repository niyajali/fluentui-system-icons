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

public val FluentIcons.Filled.ClockToolbox: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClockToolbox",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.25f, 12.5f)
            horizontalLineTo(12.25f)
            curveTo(11.836f, 12.5f, 11.5f, 12.164f, 11.5f, 11.75f)
            verticalLineTo(5.75f)
            curveTo(11.5f, 5.336f, 11.836f, 5f, 12.25f, 5f)
            curveTo(12.664f, 5f, 13f, 5.336f, 13f, 5.75f)
            verticalLineTo(11f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 11f, 17f, 11.336f, 17f, 11.75f)
            curveTo(17f, 12.164f, 16.664f, 12.5f, 16.25f, 12.5f)
            close()
            moveTo(13f, 1f)
            curveTo(7.478f, 1f, 3f, 5.478f, 3f, 11f)
            curveTo(3f, 11.206f, 3.006f, 11.411f, 3.018f, 11.614f)
            curveTo(3.491f, 11.23f, 4.094f, 11f, 4.75f, 11f)
            horizontalLineTo(8.25f)
            curveTo(9.769f, 11f, 11f, 12.231f, 11f, 13.75f)
            verticalLineTo(14.05f)
            curveTo(12.141f, 14.282f, 13f, 15.29f, 13f, 16.5f)
            verticalLineTo(21f)
            curveTo(18.522f, 21f, 23f, 16.522f, 23f, 11f)
            curveTo(23f, 5.478f, 18.522f, 1f, 13f, 1f)
            close()
            moveTo(8.25f, 13.5f)
            horizontalLineTo(4.75f)
            curveTo(4.612f, 13.5f, 4.5f, 13.612f, 4.5f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(8.5f)
            verticalLineTo(13.75f)
            curveTo(8.5f, 13.612f, 8.388f, 13.5f, 8.25f, 13.5f)
            close()
            moveTo(3f, 15f)
            verticalLineTo(13.75f)
            curveTo(3f, 12.783f, 3.783f, 12f, 4.75f, 12f)
            horizontalLineTo(8.25f)
            curveTo(9.217f, 12f, 10f, 12.783f, 10f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(10.5f)
            curveTo(11.328f, 15f, 12f, 15.672f, 12f, 16.5f)
            verticalLineTo(18f)
            horizontalLineTo(10f)
            verticalLineTo(17.5f)
            curveTo(10f, 17.224f, 9.776f, 17f, 9.5f, 17f)
            curveTo(9.224f, 17f, 9f, 17.224f, 9f, 17.5f)
            verticalLineTo(18f)
            horizontalLineTo(4f)
            verticalLineTo(17.5f)
            curveTo(4f, 17.224f, 3.776f, 17f, 3.5f, 17f)
            curveTo(3.224f, 17f, 3f, 17.224f, 3f, 17.5f)
            verticalLineTo(18f)
            horizontalLineTo(1f)
            verticalLineTo(16.5f)
            curveTo(1f, 15.672f, 1.672f, 15f, 2.5f, 15f)
            horizontalLineTo(3f)
            close()
            moveTo(9f, 19.5f)
            verticalLineTo(19f)
            horizontalLineTo(4f)
            verticalLineTo(19.5f)
            curveTo(4f, 19.776f, 3.776f, 20f, 3.5f, 20f)
            curveTo(3.224f, 20f, 3f, 19.776f, 3f, 19.5f)
            verticalLineTo(19f)
            horizontalLineTo(1f)
            verticalLineTo(21.5f)
            curveTo(1f, 22.328f, 1.672f, 23f, 2.5f, 23f)
            horizontalLineTo(10.5f)
            curveTo(11.328f, 23f, 12f, 22.328f, 12f, 21.5f)
            verticalLineTo(19f)
            horizontalLineTo(10f)
            verticalLineTo(19.5f)
            curveTo(10f, 19.776f, 9.776f, 20f, 9.5f, 20f)
            curveTo(9.224f, 20f, 9f, 19.776f, 9f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClockToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClockToolbox, contentDescription = null)
    }
}
