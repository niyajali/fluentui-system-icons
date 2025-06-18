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

public val FluentUi.Filled.ScreenshotRecord: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ScreenshotRecord",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(12.022f)
            curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
            curveTo(11f, 13.91f, 13.91f, 11f, 17.5f, 11f)
            curveTo(18.789f, 11f, 19.99f, 11.375f, 21f, 12.022f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(8f, 7.5f)
            curveTo(7.724f, 7.5f, 7.5f, 7.724f, 7.5f, 8f)
            verticalLineTo(10.25f)
            curveTo(7.5f, 10.664f, 7.164f, 11f, 6.75f, 11f)
            curveTo(6.336f, 11f, 6f, 10.664f, 6f, 10.25f)
            verticalLineTo(8f)
            curveTo(6f, 6.895f, 6.895f, 6f, 8f, 6f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 6f, 11f, 6.336f, 11f, 6.75f)
            curveTo(11f, 7.164f, 10.664f, 7.5f, 10.25f, 7.5f)
            horizontalLineTo(8f)
            close()
            moveTo(7.5f, 16f)
            curveTo(7.5f, 16.276f, 7.724f, 16.5f, 8f, 16.5f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 16.5f, 11f, 16.836f, 11f, 17.25f)
            curveTo(11f, 17.664f, 10.664f, 18f, 10.25f, 18f)
            horizontalLineTo(8f)
            curveTo(6.895f, 18f, 6f, 17.105f, 6f, 16f)
            verticalLineTo(13.75f)
            curveTo(6f, 13.336f, 6.336f, 13f, 6.75f, 13f)
            curveTo(7.164f, 13f, 7.5f, 13.336f, 7.5f, 13.75f)
            verticalLineTo(16f)
            close()
            moveTo(16f, 7.5f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 7.5f, 13f, 7.164f, 13f, 6.75f)
            curveTo(13f, 6.336f, 13.336f, 6f, 13.75f, 6f)
            horizontalLineTo(16f)
            curveTo(17.105f, 6f, 18f, 6.895f, 18f, 8f)
            verticalLineTo(10.25f)
            curveTo(18f, 10.664f, 17.664f, 11f, 17.25f, 11f)
            curveTo(16.836f, 11f, 16.5f, 10.664f, 16.5f, 10.25f)
            verticalLineTo(8f)
            curveTo(16.5f, 7.724f, 16.276f, 7.5f, 16f, 7.5f)
            close()
            moveTo(17.5f, 13.5f)
            curveTo(19.709f, 13.5f, 21.5f, 15.291f, 21.5f, 17.5f)
            curveTo(21.5f, 19.709f, 19.709f, 21.5f, 17.5f, 21.5f)
            curveTo(15.291f, 21.5f, 13.5f, 19.709f, 13.5f, 17.5f)
            curveTo(13.5f, 15.291f, 15.291f, 13.5f, 17.5f, 13.5f)
            close()
            moveTo(17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            close()
            moveTo(20f, 17.5f)
            curveTo(20f, 18.881f, 18.881f, 20f, 17.5f, 20f)
            curveTo(16.119f, 20f, 15f, 18.881f, 15f, 17.5f)
            curveTo(15f, 16.119f, 16.119f, 15f, 17.5f, 15f)
            curveTo(18.881f, 15f, 20f, 16.119f, 20f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScreenshotRecordPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ScreenshotRecord, contentDescription = null)
    }
}
