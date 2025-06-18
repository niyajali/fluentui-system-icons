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

public val FluentUi.Filled.VehicleSubwayClock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VehicleSubwayClock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 6.5f)
            curveTo(12f, 3.462f, 9.538f, 1f, 6.5f, 1f)
            curveTo(3.462f, 1f, 1f, 3.462f, 1f, 6.5f)
            curveTo(1f, 9.538f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 9.538f, 12f, 6.5f)
            close()
            moveTo(6.5f, 3f)
            curveTo(6.776f, 3f, 7f, 3.224f, 7f, 3.5f)
            verticalLineTo(6f)
            horizontalLineTo(9f)
            curveTo(9.276f, 6f, 9.5f, 6.224f, 9.5f, 6.5f)
            curveTo(9.5f, 6.776f, 9.276f, 7f, 9f, 7f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 7f, 6f, 6.776f, 6f, 6.5f)
            verticalLineTo(3.5f)
            curveTo(6f, 3.224f, 6.224f, 3f, 6.5f, 3f)
            close()
            moveTo(6.5f, 13f)
            curveTo(7.388f, 13f, 8.234f, 12.822f, 9.004f, 12.5f)
            horizontalLineTo(18.5f)
            lineTo(18.5f, 6.75f)
            curveTo(18.5f, 5.507f, 17.493f, 4.5f, 16.25f, 4.5f)
            horizontalLineTo(12.686f)
            curveTo(12.514f, 3.967f, 12.275f, 3.463f, 11.978f, 3f)
            horizontalLineTo(16.25f)
            curveTo(18.321f, 3f, 20f, 4.679f, 20f, 6.75f)
            verticalLineTo(15.75f)
            curveTo(20f, 17.525f, 18.767f, 19.012f, 17.11f, 19.401f)
            lineTo(19.573f, 20.573f)
            curveTo(19.947f, 20.751f, 20.105f, 21.198f, 19.927f, 21.573f)
            curveTo(19.764f, 21.915f, 19.374f, 22.077f, 19.023f, 21.965f)
            lineTo(18.928f, 21.927f)
            lineTo(13.83f, 19.5f)
            horizontalLineTo(10.169f)
            lineTo(5.073f, 21.927f)
            curveTo(4.699f, 22.105f, 4.251f, 21.946f, 4.073f, 21.573f)
            curveTo(3.895f, 21.198f, 4.054f, 20.751f, 4.428f, 20.573f)
            lineTo(6.89f, 19.401f)
            curveTo(5.234f, 19.012f, 4f, 17.525f, 4f, 15.75f)
            verticalLineTo(12.502f)
            curveTo(4.77f, 12.823f, 5.614f, 13f, 6.5f, 13f)
            close()
            moveTo(8f, 15f)
            curveTo(7.448f, 15f, 7f, 15.448f, 7f, 16f)
            curveTo(7f, 16.552f, 7.448f, 17f, 8f, 17f)
            curveTo(8.552f, 17f, 9f, 16.552f, 9f, 16f)
            curveTo(9f, 15.448f, 8.552f, 15f, 8f, 15f)
            close()
            moveTo(16f, 15f)
            curveTo(15.448f, 15f, 15f, 15.448f, 15f, 16f)
            curveTo(15f, 16.552f, 15.448f, 17f, 16f, 17f)
            curveTo(16.552f, 17f, 17f, 16.552f, 17f, 16f)
            curveTo(17f, 15.448f, 16.552f, 15f, 16f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VehicleSubwayClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VehicleSubwayClock, contentDescription = null)
    }
}
