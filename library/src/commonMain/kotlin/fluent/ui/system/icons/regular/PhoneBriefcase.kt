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

public val FluentUi.Regular.PhoneBriefcase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneBriefcase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineTo(11f)
            horizontalLineTo(15.75f)
            curveTo(15.3f, 11f, 14.875f, 11.108f, 14.5f, 11.3f)
            verticalLineTo(4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            horizontalLineTo(11f)
            verticalLineTo(21.5f)
            curveTo(11f, 21.671f, 11.017f, 21.838f, 11.05f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(8.749f, 17.504f)
            lineTo(11f, 17.5f)
            verticalLineTo(19f)
            lineTo(8.751f, 19.004f)
            curveTo(8.337f, 19.004f, 8.001f, 18.669f, 8f, 18.255f)
            curveTo(7.999f, 17.841f, 8.335f, 17.504f, 8.749f, 17.504f)
            close()
            moveTo(14f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 15f, 12f, 15.672f, 12f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(12f, 22.328f, 12.672f, 23f, 13.5f, 23f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(23f, 15.672f, 22.328f, 15f, 21.5f, 15f)
            horizontalLineTo(21f)
            verticalLineTo(13.75f)
            curveTo(21f, 12.783f, 20.216f, 12f, 19.25f, 12f)
            horizontalLineTo(15.75f)
            curveTo(14.783f, 12f, 14f, 12.783f, 14f, 13.75f)
            close()
            moveTo(15.5f, 13.75f)
            curveTo(15.5f, 13.612f, 15.612f, 13.5f, 15.75f, 13.5f)
            horizontalLineTo(19.25f)
            curveTo(19.388f, 13.5f, 19.5f, 13.612f, 19.5f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(15.5f)
            verticalLineTo(13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PhoneBriefcase, contentDescription = null)
    }
}
