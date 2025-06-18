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

public val FluentUi.Regular.Rss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Rss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 7.5f)
            curveTo(6.345f, 7.5f, 6f, 7.183f, 6f, 6.778f)
            verticalLineTo(6.723f)
            curveTo(6f, 6.33f, 6.305f, 6.002f, 6.698f, 6f)
            lineTo(6.75f, 6f)
            curveTo(12.963f, 6f, 18f, 11.037f, 18f, 17.25f)
            lineTo(18f, 17.302f)
            curveTo(17.998f, 17.695f, 17.67f, 18f, 17.277f, 18f)
            horizontalLineTo(17.222f)
            curveTo(16.817f, 18f, 16.5f, 17.655f, 16.5f, 17.25f)
            curveTo(16.5f, 11.865f, 12.135f, 7.5f, 6.75f, 7.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.294f, 18f)
            curveTo(13.673f, 18f, 13.995f, 17.713f, 14f, 17.334f)
            curveTo(14f, 17.306f, 14f, 17.278f, 14f, 17.25f)
            curveTo(14f, 13.246f, 10.754f, 10f, 6.75f, 10f)
            curveTo(6.722f, 10f, 6.694f, 10f, 6.666f, 10f)
            curveTo(6.287f, 10.005f, 6f, 10.327f, 6f, 10.706f)
            verticalLineTo(10.796f)
            curveTo(6f, 11.195f, 6.351f, 11.5f, 6.75f, 11.5f)
            curveTo(9.926f, 11.5f, 12.5f, 14.074f, 12.5f, 17.25f)
            curveTo(12.5f, 17.649f, 12.805f, 18f, 13.204f, 18f)
            horizontalLineTo(13.294f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 16.5f)
            curveTo(9f, 17.328f, 8.328f, 18f, 7.5f, 18f)
            curveTo(6.672f, 18f, 6f, 17.328f, 6f, 16.5f)
            curveTo(6f, 15.672f, 6.672f, 15f, 7.5f, 15f)
            curveTo(8.328f, 15f, 9f, 15.672f, 9f, 16.5f)
            close()
        }
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
            moveTo(4.5f, 6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RssPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Rss, contentDescription = null)
    }
}
