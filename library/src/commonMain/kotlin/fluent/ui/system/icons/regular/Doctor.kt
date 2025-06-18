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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Doctor: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Doctor",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.75f, 4.5f)
            curveTo(9.612f, 4.5f, 9.5f, 4.612f, 9.5f, 4.75f)
            verticalLineTo(8.75f)
            curveTo(9.5f, 9.164f, 9.164f, 9.5f, 8.75f, 9.5f)
            horizontalLineTo(4.75f)
            curveTo(4.612f, 9.5f, 4.5f, 9.612f, 4.5f, 9.75f)
            verticalLineTo(14.25f)
            curveTo(4.5f, 14.388f, 4.612f, 14.5f, 4.75f, 14.5f)
            horizontalLineTo(8.75f)
            curveTo(9.164f, 14.5f, 9.5f, 14.836f, 9.5f, 15.25f)
            verticalLineTo(19.25f)
            curveTo(9.5f, 19.388f, 9.612f, 19.5f, 9.75f, 19.5f)
            horizontalLineTo(14.25f)
            curveTo(14.388f, 19.5f, 14.5f, 19.388f, 14.5f, 19.25f)
            verticalLineTo(15.25f)
            curveTo(14.5f, 14.836f, 14.836f, 14.5f, 15.25f, 14.5f)
            horizontalLineTo(19.25f)
            curveTo(19.388f, 14.5f, 19.5f, 14.388f, 19.5f, 14.25f)
            verticalLineTo(9.75f)
            curveTo(19.5f, 9.612f, 19.388f, 9.5f, 19.25f, 9.5f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 9.5f, 14.5f, 9.164f, 14.5f, 8.75f)
            verticalLineTo(4.75f)
            curveTo(14.5f, 4.612f, 14.388f, 4.5f, 14.25f, 4.5f)
            horizontalLineTo(9.75f)
            close()
            moveTo(8f, 4.75f)
            curveTo(8f, 3.783f, 8.783f, 3f, 9.75f, 3f)
            horizontalLineTo(14.25f)
            curveTo(15.217f, 3f, 16f, 3.783f, 16f, 4.75f)
            verticalLineTo(8f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 8f, 21f, 8.783f, 21f, 9.75f)
            verticalLineTo(14.25f)
            curveTo(21f, 15.217f, 20.216f, 16f, 19.25f, 16f)
            horizontalLineTo(16f)
            verticalLineTo(19.25f)
            curveTo(16f, 20.216f, 15.217f, 21f, 14.25f, 21f)
            horizontalLineTo(9.75f)
            curveTo(8.783f, 21f, 8f, 20.216f, 8f, 19.25f)
            verticalLineTo(16f)
            horizontalLineTo(4.75f)
            curveTo(3.783f, 16f, 3f, 15.217f, 3f, 14.25f)
            verticalLineTo(9.75f)
            curveTo(3f, 8.783f, 3.783f, 8f, 4.75f, 8f)
            horizontalLineTo(8f)
            verticalLineTo(4.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DoctorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Doctor, contentDescription = null)
    }
}
