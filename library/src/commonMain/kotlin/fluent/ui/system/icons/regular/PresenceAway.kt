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

public val FluentUi.Regular.PresenceAway: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceAway",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 11.31f)
            verticalLineTo(6.5f)
            curveTo(13f, 5.672f, 12.328f, 5f, 11.5f, 5f)
            curveTo(10.672f, 5f, 10f, 5.672f, 10f, 6.5f)
            verticalLineTo(12f)
            curveTo(10f, 12.438f, 10.191f, 12.854f, 10.524f, 13.139f)
            lineTo(14.024f, 16.139f)
            curveTo(14.653f, 16.678f, 15.6f, 16.605f, 16.139f, 15.976f)
            curveTo(16.678f, 15.347f, 16.605f, 14.4f, 15.976f, 13.861f)
            lineTo(13f, 11.31f)
            close()
            moveTo(0f, 12f)
            curveTo(0f, 5.373f, 5.373f, 0f, 12f, 0f)
            curveTo(18.627f, 0f, 24f, 5.373f, 24f, 12f)
            curveTo(24f, 18.627f, 18.627f, 24f, 12f, 24f)
            curveTo(5.373f, 24f, 0f, 18.627f, 0f, 12f)
            close()
            moveTo(12f, 3f)
            curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
            curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
            curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
            curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PresenceAwayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PresenceAway, contentDescription = null)
    }
}
