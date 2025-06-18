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

public val FluentUi.Filled.ClockPause: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClockPause",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
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
            curveTo(3f, 11.334f, 3.016f, 11.665f, 3.049f, 11.991f)
            curveTo(4.049f, 11.363f, 5.232f, 11f, 6.5f, 11f)
            curveTo(10.09f, 11f, 13f, 13.91f, 13f, 17.5f)
            curveTo(13f, 18.768f, 12.637f, 19.951f, 12.009f, 20.951f)
            curveTo(12.335f, 20.984f, 12.666f, 21f, 13f, 21f)
            curveTo(18.522f, 21f, 23f, 16.522f, 23f, 11f)
            curveTo(23f, 5.478f, 18.522f, 1f, 13f, 1f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            close()
            moveTo(4.5f, 20.5f)
            curveTo(4.776f, 20.5f, 5f, 20.276f, 5f, 20f)
            verticalLineTo(15f)
            curveTo(5f, 14.724f, 4.776f, 14.5f, 4.5f, 14.5f)
            curveTo(4.224f, 14.5f, 4f, 14.724f, 4f, 15f)
            verticalLineTo(20f)
            curveTo(4f, 20.276f, 4.224f, 20.5f, 4.5f, 20.5f)
            close()
            moveTo(8.5f, 20.5f)
            curveTo(8.776f, 20.5f, 9f, 20.276f, 9f, 20f)
            verticalLineTo(15f)
            curveTo(9f, 14.724f, 8.776f, 14.5f, 8.5f, 14.5f)
            curveTo(8.224f, 14.5f, 8f, 14.724f, 8f, 15f)
            verticalLineTo(20f)
            curveTo(8f, 20.276f, 8.224f, 20.5f, 8.5f, 20.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClockPausePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClockPause, contentDescription = null)
    }
}
