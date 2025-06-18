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

public val FluentIcons.Filled.VideoPlayPause: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoPlayPause",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 7.75f)
            curveTo(12f, 6.784f, 12.783f, 6f, 13.75f, 6f)
            horizontalLineTo(15.25f)
            curveTo(16.216f, 6f, 17f, 6.784f, 17f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(17f, 17.216f, 16.216f, 18f, 15.25f, 18f)
            horizontalLineTo(13.75f)
            curveTo(12.783f, 18f, 12f, 17.216f, 12f, 16.25f)
            verticalLineTo(12.12f)
            curveTo(11.976f, 12.671f, 11.696f, 13.212f, 11.161f, 13.537f)
            lineTo(4.659f, 17.489f)
            curveTo(3.493f, 18.197f, 2f, 17.358f, 2f, 15.993f)
            verticalLineTo(8.004f)
            curveTo(2f, 6.632f, 3.507f, 5.794f, 4.673f, 6.518f)
            lineTo(11.175f, 10.555f)
            curveTo(11.701f, 10.882f, 11.976f, 11.417f, 12f, 11.963f)
            verticalLineTo(7.75f)
            close()
            moveTo(18f, 7.75f)
            curveTo(18f, 6.784f, 18.784f, 6f, 19.75f, 6f)
            horizontalLineTo(21.25f)
            curveTo(22.216f, 6f, 23f, 6.784f, 23f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(23f, 17.216f, 22.216f, 18f, 21.25f, 18f)
            horizontalLineTo(19.75f)
            curveTo(18.784f, 18f, 18f, 17.216f, 18f, 16.25f)
            verticalLineTo(7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoPlayPausePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VideoPlayPause, contentDescription = null)
    }
}
