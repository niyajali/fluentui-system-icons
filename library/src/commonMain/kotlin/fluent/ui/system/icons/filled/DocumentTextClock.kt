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

public val FluentIcons.Filled.DocumentTextClock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentTextClock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(20f)
            curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
            horizontalLineTo(11.19f)
            curveTo(12.093f, 21.059f, 12.715f, 19.848f, 12.924f, 18.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 18.5f, 16.5f, 18.164f, 16.5f, 17.75f)
            curveTo(16.5f, 17.336f, 16.164f, 17f, 15.75f, 17f)
            horizontalLineTo(12.981f)
            curveTo(12.948f, 16.57f, 12.874f, 16.152f, 12.762f, 15.75f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 15.75f, 16.5f, 15.414f, 16.5f, 15f)
            curveTo(16.5f, 14.586f, 16.164f, 14.25f, 15.75f, 14.25f)
            horizontalLineTo(12.13f)
            curveTo(11.868f, 13.796f, 11.551f, 13.376f, 11.19f, 13f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 13f, 16.5f, 12.664f, 16.5f, 12.25f)
            curveTo(16.5f, 11.836f, 16.164f, 11.5f, 15.75f, 11.5f)
            horizontalLineTo(9.004f)
            curveTo(8.234f, 11.178f, 7.388f, 11f, 6.5f, 11f)
            curveTo(5.614f, 11f, 4.77f, 11.177f, 4f, 11.498f)
            verticalLineTo(4f)
            curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(12f)
            close()
            moveTo(13.5f, 2.5f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 2.5f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 14.462f, 9.538f, 12f, 6.5f, 12f)
            curveTo(3.462f, 12f, 1f, 14.462f, 1f, 17.5f)
            curveTo(1f, 20.538f, 3.462f, 23f, 6.5f, 23f)
            curveTo(9.538f, 23f, 12f, 20.538f, 12f, 17.5f)
            close()
            moveTo(6.5f, 14f)
            curveTo(6.776f, 14f, 7f, 14.224f, 7f, 14.5f)
            verticalLineTo(17f)
            horizontalLineTo(9f)
            curveTo(9.276f, 17f, 9.5f, 17.224f, 9.5f, 17.5f)
            curveTo(9.5f, 17.776f, 9.276f, 18f, 9f, 18f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 18f, 6f, 17.776f, 6f, 17.5f)
            verticalLineTo(14.5f)
            curveTo(6f, 14.224f, 6.224f, 14f, 6.5f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentTextClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentTextClock, contentDescription = null)
    }
}
