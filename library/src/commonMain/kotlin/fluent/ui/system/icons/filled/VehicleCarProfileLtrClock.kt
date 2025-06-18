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

public val FluentUi.Filled.VehicleCarProfileLtrClock: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VehicleCarProfileLtrClock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
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
            moveTo(11f, 11.19f)
            curveTo(9.832f, 12.311f, 8.246f, 13f, 6.5f, 13f)
            curveTo(5.43f, 13f, 4.421f, 12.742f, 3.531f, 12.284f)
            curveTo(2.624f, 12.733f, 2f, 13.669f, 2f, 14.75f)
            verticalLineTo(17f)
            curveTo(2f, 17.865f, 2.399f, 18.636f, 3.023f, 19.14f)
            curveTo(3.216f, 20.751f, 4.587f, 22f, 6.25f, 22f)
            curveTo(7.696f, 22f, 8.921f, 21.056f, 9.343f, 19.75f)
            horizontalLineTo(14.157f)
            curveTo(14.578f, 21.056f, 15.804f, 22f, 17.25f, 22f)
            curveTo(18.79f, 22f, 20.079f, 20.929f, 20.415f, 19.492f)
            curveTo(21.351f, 19.053f, 22f, 18.102f, 22f, 17f)
            verticalLineTo(15.312f)
            curveTo(22f, 14.05f, 21.141f, 12.95f, 19.917f, 12.644f)
            lineTo(17.735f, 12.099f)
            lineTo(15.226f, 7.852f)
            curveTo(14.756f, 7.055f, 13.918f, 6.551f, 13f, 6.504f)
            curveTo(13f, 7.019f, 12.939f, 7.52f, 12.826f, 8f)
            horizontalLineTo(12.858f)
            curveTo(13.301f, 8f, 13.71f, 8.234f, 13.935f, 8.614f)
            lineTo(15.934f, 12f)
            horizontalLineTo(11f)
            verticalLineTo(11.19f)
            close()
            moveTo(4.5f, 18.75f)
            curveTo(4.5f, 17.784f, 5.284f, 17f, 6.25f, 17f)
            curveTo(7.216f, 17f, 8f, 17.784f, 8f, 18.75f)
            curveTo(8f, 19.716f, 7.216f, 20.5f, 6.25f, 20.5f)
            curveTo(5.284f, 20.5f, 4.5f, 19.716f, 4.5f, 18.75f)
            close()
            moveTo(17.25f, 20.5f)
            curveTo(16.284f, 20.5f, 15.5f, 19.716f, 15.5f, 18.75f)
            curveTo(15.5f, 17.784f, 16.284f, 17f, 17.25f, 17f)
            curveTo(18.216f, 17f, 19f, 17.784f, 19f, 18.75f)
            curveTo(19f, 19.716f, 18.216f, 20.5f, 17.25f, 20.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VehicleCarProfileLtrClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VehicleCarProfileLtrClock, contentDescription = null)
    }
}
