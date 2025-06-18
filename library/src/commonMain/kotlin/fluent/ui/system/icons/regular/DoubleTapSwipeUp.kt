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
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.DoubleTapSwipeUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DoubleTapSwipeUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.53f, 2.22f)
            curveTo(12.237f, 1.927f, 11.763f, 1.927f, 11.47f, 2.22f)
            lineTo(7.97f, 5.72f)
            curveTo(7.677f, 6.013f, 7.677f, 6.487f, 7.97f, 6.78f)
            curveTo(8.263f, 7.073f, 8.737f, 7.073f, 9.03f, 6.78f)
            lineTo(11.25f, 4.561f)
            verticalLineTo(15.25f)
            curveTo(11.25f, 15.664f, 11.586f, 16f, 12f, 16f)
            curveTo(12.414f, 16f, 12.75f, 15.664f, 12.75f, 15.25f)
            verticalLineTo(4.561f)
            lineTo(14.97f, 6.78f)
            curveTo(15.263f, 7.073f, 15.737f, 7.073f, 16.03f, 6.78f)
            curveTo(16.323f, 6.487f, 16.323f, 6.013f, 16.03f, 5.72f)
            lineTo(12.53f, 2.22f)
            close()
            moveTo(5f, 15f)
            curveTo(5f, 11.738f, 7.231f, 8.998f, 10.25f, 8.22f)
            verticalLineTo(9.784f)
            curveTo(8.07f, 10.515f, 6.5f, 12.574f, 6.5f, 15f)
            curveTo(6.5f, 18.038f, 8.962f, 20.5f, 12f, 20.5f)
            curveTo(15.038f, 20.5f, 17.5f, 18.038f, 17.5f, 15f)
            curveTo(17.5f, 12.574f, 15.93f, 10.515f, 13.75f, 9.784f)
            verticalLineTo(8.22f)
            curveTo(16.769f, 8.998f, 19f, 11.738f, 19f, 15f)
            curveTo(19f, 18.866f, 15.866f, 22f, 12f, 22f)
            curveTo(8.134f, 22f, 5f, 18.866f, 5f, 15f)
            close()
            moveTo(7.5f, 15f)
            curveTo(7.5f, 13.135f, 8.634f, 11.536f, 10.25f, 10.853f)
            verticalLineTo(12.563f)
            curveTo(9.493f, 13.108f, 9f, 13.996f, 9f, 15f)
            curveTo(9f, 16.657f, 10.343f, 18f, 12f, 18f)
            curveTo(13.657f, 18f, 15f, 16.657f, 15f, 15f)
            curveTo(15f, 13.996f, 14.507f, 13.108f, 13.75f, 12.563f)
            verticalLineTo(10.853f)
            curveTo(15.366f, 11.536f, 16.5f, 13.135f, 16.5f, 15f)
            curveTo(16.5f, 17.485f, 14.485f, 19.5f, 12f, 19.5f)
            curveTo(9.515f, 19.5f, 7.5f, 17.485f, 7.5f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DoubleTapSwipeUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DoubleTapSwipeUp, contentDescription = null)
    }
}
