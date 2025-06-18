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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.DoubleTapSwipeDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DoubleTapSwipeDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.53f, 21.78f)
            curveTo(12.237f, 22.073f, 11.763f, 22.073f, 11.47f, 21.78f)
            lineTo(7.97f, 18.28f)
            curveTo(7.677f, 17.987f, 7.677f, 17.513f, 7.97f, 17.22f)
            curveTo(8.263f, 16.927f, 8.737f, 16.927f, 9.03f, 17.22f)
            lineTo(11.25f, 19.439f)
            verticalLineTo(8.75f)
            curveTo(11.25f, 8.336f, 11.586f, 8f, 12f, 8f)
            curveTo(12.414f, 8f, 12.75f, 8.336f, 12.75f, 8.75f)
            verticalLineTo(19.439f)
            lineTo(14.97f, 17.22f)
            curveTo(15.263f, 16.927f, 15.737f, 16.927f, 16.03f, 17.22f)
            curveTo(16.323f, 17.513f, 16.323f, 17.987f, 16.03f, 18.28f)
            lineTo(12.53f, 21.78f)
            close()
            moveTo(5f, 9f)
            curveTo(5f, 12.262f, 7.231f, 15.002f, 10.25f, 15.78f)
            verticalLineTo(14.216f)
            curveTo(8.07f, 13.485f, 6.5f, 11.426f, 6.5f, 9f)
            curveTo(6.5f, 5.962f, 8.962f, 3.5f, 12f, 3.5f)
            curveTo(15.038f, 3.5f, 17.5f, 5.962f, 17.5f, 9f)
            curveTo(17.5f, 11.426f, 15.93f, 13.485f, 13.75f, 14.216f)
            verticalLineTo(15.78f)
            curveTo(16.769f, 15.002f, 19f, 12.262f, 19f, 9f)
            curveTo(19f, 5.134f, 15.866f, 2f, 12f, 2f)
            curveTo(8.134f, 2f, 5f, 5.134f, 5f, 9f)
            close()
            moveTo(7.5f, 9f)
            curveTo(7.5f, 10.865f, 8.634f, 12.464f, 10.25f, 13.147f)
            verticalLineTo(11.437f)
            curveTo(9.493f, 10.892f, 9f, 10.004f, 9f, 9f)
            curveTo(9f, 7.343f, 10.343f, 6f, 12f, 6f)
            curveTo(13.657f, 6f, 15f, 7.343f, 15f, 9f)
            curveTo(15f, 10.004f, 14.507f, 10.892f, 13.75f, 11.437f)
            verticalLineTo(13.147f)
            curveTo(15.366f, 12.464f, 16.5f, 10.865f, 16.5f, 9f)
            curveTo(16.5f, 6.515f, 14.485f, 4.5f, 12f, 4.5f)
            curveTo(9.515f, 4.5f, 7.5f, 6.515f, 7.5f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DoubleTapSwipeDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DoubleTapSwipeDown, contentDescription = null)
    }
}
