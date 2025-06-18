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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.CalendarTemplate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarTemplate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 2f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineTo(16.75f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineTo(9.075f)
            curveTo(9.026f, 19.758f, 9f, 19.507f, 9f, 19.25f)
            verticalLineTo(18.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 18.5f, 3.5f, 17.716f, 3.5f, 16.75f)
            verticalLineTo(5.25f)
            curveTo(3.5f, 4.284f, 4.284f, 3.5f, 5.25f, 3.5f)
            horizontalLineTo(15.75f)
            curveTo(16.716f, 3.5f, 17.5f, 4.284f, 17.5f, 5.25f)
            verticalLineTo(9f)
            horizontalLineTo(19f)
            verticalLineTo(5.25f)
            curveTo(19f, 3.455f, 17.545f, 2f, 15.75f, 2f)
            horizontalLineTo(5.25f)
            close()
            moveTo(12.75f, 9f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 9f, 6f, 9.336f, 6f, 9.75f)
            curveTo(6f, 10.164f, 6.336f, 10.5f, 6.75f, 10.5f)
            horizontalLineTo(9.75f)
            curveTo(10.434f, 9.589f, 11.523f, 9f, 12.75f, 9f)
            close()
            moveTo(6.75f, 6f)
            curveTo(6.336f, 6f, 6f, 6.336f, 6f, 6.75f)
            curveTo(6f, 7.164f, 6.336f, 7.5f, 6.75f, 7.5f)
            horizontalLineTo(14.25f)
            curveTo(14.664f, 7.5f, 15f, 7.164f, 15f, 6.75f)
            curveTo(15f, 6.336f, 14.664f, 6f, 14.25f, 6f)
            horizontalLineTo(6.75f)
            close()
            moveTo(10f, 12.75f)
            curveTo(10f, 11.231f, 11.231f, 10f, 12.75f, 10f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 10f, 22f, 11.231f, 22f, 12.75f)
            verticalLineTo(19.25f)
            curveTo(22f, 20.769f, 20.769f, 22f, 19.25f, 22f)
            horizontalLineTo(12.75f)
            curveTo(11.231f, 22f, 10f, 20.769f, 10f, 19.25f)
            verticalLineTo(12.75f)
            close()
            moveTo(11.5f, 15f)
            verticalLineTo(19.25f)
            curveTo(11.5f, 19.94f, 12.06f, 20.5f, 12.75f, 20.5f)
            horizontalLineTo(19.25f)
            curveTo(19.94f, 20.5f, 20.5f, 19.94f, 20.5f, 19.25f)
            verticalLineTo(15f)
            horizontalLineTo(11.5f)
            close()
            moveTo(20.5f, 13.5f)
            verticalLineTo(12.75f)
            curveTo(20.5f, 12.06f, 19.94f, 11.5f, 19.25f, 11.5f)
            horizontalLineTo(12.75f)
            curveTo(12.06f, 11.5f, 11.5f, 12.06f, 11.5f, 12.75f)
            verticalLineTo(13.5f)
            horizontalLineTo(20.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarTemplatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalendarTemplate, contentDescription = null)
    }
}
