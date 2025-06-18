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

public val FluentUi.Regular.CalendarMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.993f, 5.007f)
            lineTo(19.998f, 5.128f)
            lineTo(20f, 5.25f)
            verticalLineTo(16.35f)
            curveTo(20f, 18.366f, 18.366f, 20f, 16.35f, 20f)
            horizontalLineTo(5.25f)
            curveTo(5.168f, 20f, 5.087f, 19.998f, 5.007f, 19.993f)
            curveTo(5.583f, 20.899f, 6.596f, 21.5f, 7.75f, 21.5f)
            horizontalLineTo(16.35f)
            curveTo(19.194f, 21.5f, 21.5f, 19.194f, 21.5f, 16.35f)
            verticalLineTo(7.75f)
            curveTo(21.5f, 6.597f, 20.899f, 5.584f, 19.993f, 5.007f)
            close()
            moveTo(5.25f, 2f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineTo(15.75f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineTo(15.75f)
            curveTo(17.545f, 19f, 19f, 17.545f, 19f, 15.75f)
            verticalLineTo(5.25f)
            curveTo(19f, 3.455f, 17.545f, 2f, 15.75f, 2f)
            horizontalLineTo(5.25f)
            close()
            moveTo(3.5f, 7.5f)
            horizontalLineTo(17.5f)
            verticalLineTo(15.75f)
            curveTo(17.5f, 16.716f, 16.716f, 17.5f, 15.75f, 17.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 17.5f, 3.5f, 16.716f, 3.5f, 15.75f)
            verticalLineTo(7.5f)
            close()
            moveTo(5.25f, 3.5f)
            horizontalLineTo(15.75f)
            curveTo(16.716f, 3.5f, 17.5f, 4.284f, 17.5f, 5.25f)
            verticalLineTo(6f)
            horizontalLineTo(3.5f)
            verticalLineTo(5.25f)
            curveTo(3.5f, 4.284f, 4.284f, 3.5f, 5.25f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarMultiple, contentDescription = null)
    }
}
