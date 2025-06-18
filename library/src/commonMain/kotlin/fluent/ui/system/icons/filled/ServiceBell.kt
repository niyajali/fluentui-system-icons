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

public val FluentUi.Filled.ServiceBell: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ServiceBell",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 4f)
            curveTo(10f, 2.895f, 10.895f, 2f, 12f, 2f)
            curveTo(13.105f, 2f, 14f, 2.895f, 14f, 4f)
            verticalLineTo(5.239f)
            curveTo(17.596f, 6.126f, 20.25f, 9.377f, 20.25f, 13.248f)
            curveTo(20.25f, 13.663f, 19.914f, 13.998f, 19.5f, 13.998f)
            horizontalLineTo(4.5f)
            curveTo(4.086f, 13.998f, 3.75f, 13.663f, 3.75f, 13.248f)
            curveTo(3.75f, 9.388f, 6.418f, 6.15f, 10f, 5.249f)
            verticalLineTo(4f)
            close()
            moveTo(13.25f, 7.5f)
            curveTo(12.836f, 7.5f, 12.5f, 7.836f, 12.5f, 8.25f)
            curveTo(12.5f, 8.664f, 12.836f, 9f, 13.25f, 9f)
            curveTo(14.503f, 9f, 15.393f, 9.618f, 16.135f, 10.68f)
            curveTo(16.373f, 11.019f, 16.841f, 11.102f, 17.18f, 10.865f)
            curveTo(17.519f, 10.627f, 17.602f, 10.159f, 17.365f, 9.82f)
            curveTo(16.435f, 8.491f, 15.136f, 7.5f, 13.25f, 7.5f)
            close()
            moveTo(2f, 17f)
            curveTo(2f, 15.895f, 2.895f, 15f, 4f, 15f)
            horizontalLineTo(20f)
            curveTo(21.105f, 15f, 22f, 15.895f, 22f, 17f)
            curveTo(22f, 18.105f, 21.105f, 19f, 20f, 19f)
            horizontalLineTo(4f)
            curveTo(2.895f, 19f, 2f, 18.105f, 2f, 17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ServiceBellPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ServiceBell, contentDescription = null)
    }
}
