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

public val FluentIcons.Regular.CalendarAgenda: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarAgenda",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            close()
            moveTo(19.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            close()
            moveTo(17f, 7.75f)
            curveTo(17f, 8.13f, 16.718f, 8.443f, 16.352f, 8.493f)
            lineTo(16.25f, 8.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 8.5f, 7f, 8.164f, 7f, 7.75f)
            curveTo(7f, 7.37f, 7.282f, 7.057f, 7.648f, 7.007f)
            lineTo(7.75f, 7f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 7f, 17f, 7.336f, 17f, 7.75f)
            close()
            moveTo(17f, 16.25f)
            curveTo(17f, 16.63f, 16.718f, 16.944f, 16.352f, 16.993f)
            lineTo(16.25f, 17f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 17f, 7f, 16.664f, 7f, 16.25f)
            curveTo(7f, 15.87f, 7.282f, 15.557f, 7.648f, 15.507f)
            lineTo(7.75f, 15.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 15.5f, 17f, 15.836f, 17f, 16.25f)
            close()
            moveTo(17f, 12f)
            curveTo(17f, 12.38f, 16.718f, 12.693f, 16.352f, 12.743f)
            lineTo(16.25f, 12.75f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 12.75f, 7f, 12.414f, 7f, 12f)
            curveTo(7f, 11.62f, 7.282f, 11.307f, 7.648f, 11.257f)
            lineTo(7.75f, 11.25f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 11.25f, 17f, 11.586f, 17f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarAgendaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalendarAgenda, contentDescription = null)
    }
}
