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

public val FluentUi.Regular.PresenceOffline: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceOffline",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.061f, 7.939f)
            curveTo(16.646f, 8.525f, 16.646f, 9.475f, 16.061f, 10.061f)
            lineTo(14.121f, 12f)
            lineTo(16.061f, 13.939f)
            curveTo(16.646f, 14.525f, 16.646f, 15.475f, 16.061f, 16.061f)
            curveTo(15.475f, 16.646f, 14.525f, 16.646f, 13.939f, 16.061f)
            lineTo(12f, 14.121f)
            lineTo(10.061f, 16.061f)
            curveTo(9.475f, 16.646f, 8.525f, 16.646f, 7.939f, 16.061f)
            curveTo(7.354f, 15.475f, 7.354f, 14.525f, 7.939f, 13.939f)
            lineTo(9.879f, 12f)
            lineTo(7.939f, 10.061f)
            curveTo(7.354f, 9.475f, 7.354f, 8.525f, 7.939f, 7.939f)
            curveTo(8.525f, 7.354f, 9.475f, 7.354f, 10.061f, 7.939f)
            lineTo(12f, 9.879f)
            lineTo(13.939f, 7.939f)
            curveTo(14.525f, 7.354f, 15.475f, 7.354f, 16.061f, 7.939f)
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
private fun PresenceOfflinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PresenceOffline, contentDescription = null)
    }
}
