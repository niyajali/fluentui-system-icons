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

public val FluentUi.Regular.CalendarDataBar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarDataBar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(13.05f)
            curveTo(20.631f, 13.125f, 20.291f, 13.281f, 20f, 13.5f)
            curveTo(20f, 12.937f, 19.814f, 12.418f, 19.5f, 12f)
            verticalLineTo(8.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(11f)
            verticalLineTo(21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(19.5f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
            moveTo(17.5f, 12f)
            curveTo(16.672f, 12f, 16f, 12.672f, 16f, 13.5f)
            verticalLineTo(21.5f)
            curveTo(16f, 22.328f, 16.672f, 23f, 17.5f, 23f)
            curveTo(18.328f, 23f, 19f, 22.328f, 19f, 21.5f)
            verticalLineTo(13.5f)
            curveTo(19f, 12.672f, 18.328f, 12f, 17.5f, 12f)
            close()
            moveTo(13.5f, 16f)
            curveTo(12.672f, 16f, 12f, 16.672f, 12f, 17.5f)
            verticalLineTo(21.5f)
            curveTo(12f, 22.328f, 12.672f, 23f, 13.5f, 23f)
            curveTo(14.328f, 23f, 15f, 22.328f, 15f, 21.5f)
            verticalLineTo(17.5f)
            curveTo(15f, 16.672f, 14.328f, 16f, 13.5f, 16f)
            close()
            moveTo(20f, 15.5f)
            curveTo(20f, 14.672f, 20.672f, 14f, 21.5f, 14f)
            curveTo(22.328f, 14f, 23f, 14.672f, 23f, 15.5f)
            verticalLineTo(21.5f)
            curveTo(23f, 22.328f, 22.328f, 23f, 21.5f, 23f)
            curveTo(20.672f, 23f, 20f, 22.328f, 20f, 21.5f)
            verticalLineTo(15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarDataBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarDataBar, contentDescription = null)
    }
}
