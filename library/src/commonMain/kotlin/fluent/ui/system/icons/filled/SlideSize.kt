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

public val FluentUi.Filled.SlideSize: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideSize",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(22f, 18.769f, 20.769f, 20f, 19.25f, 20f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
            verticalLineTo(6.75f)
            close()
            moveTo(16.781f, 7.22f)
            curveTo(16.64f, 7.079f, 16.449f, 7f, 16.25f, 7f)
            lineTo(13.749f, 7f)
            curveTo(13.335f, 7f, 12.999f, 7.336f, 12.999f, 7.75f)
            curveTo(12.999f, 8.164f, 13.335f, 8.5f, 13.749f, 8.5f)
            horizontalLineTo(14.439f)
            lineTo(12.72f, 10.219f)
            curveTo(12.427f, 10.512f, 12.427f, 10.987f, 12.719f, 11.28f)
            curveTo(13.012f, 11.573f, 13.487f, 11.573f, 13.78f, 11.28f)
            lineTo(15.5f, 9.56f)
            verticalLineTo(10.25f)
            curveTo(15.5f, 10.664f, 15.836f, 11f, 16.25f, 11f)
            curveTo(16.665f, 11f, 17f, 10.664f, 17f, 10.25f)
            verticalLineTo(7.75f)
            curveTo(17f, 7.551f, 16.921f, 7.36f, 16.781f, 7.22f)
            close()
            moveTo(7.75f, 17f)
            horizontalLineTo(10.251f)
            curveTo(10.665f, 17f, 11.001f, 16.664f, 11.001f, 16.25f)
            curveTo(11.001f, 15.836f, 10.665f, 15.5f, 10.251f, 15.5f)
            horizontalLineTo(9.56f)
            lineTo(11.28f, 13.78f)
            curveTo(11.573f, 13.487f, 11.573f, 13.012f, 11.28f, 12.719f)
            curveTo(10.987f, 12.426f, 10.512f, 12.426f, 10.22f, 12.719f)
            lineTo(8.5f, 14.439f)
            verticalLineTo(13.75f)
            curveTo(8.5f, 13.336f, 8.164f, 13f, 7.75f, 13f)
            curveTo(7.336f, 13f, 7f, 13.336f, 7f, 13.75f)
            lineTo(7f, 16.25f)
            curveTo(7f, 16.449f, 7.079f, 16.64f, 7.22f, 16.78f)
            curveTo(7.36f, 16.921f, 7.551f, 17f, 7.75f, 17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideSizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SlideSize, contentDescription = null)
    }
}
