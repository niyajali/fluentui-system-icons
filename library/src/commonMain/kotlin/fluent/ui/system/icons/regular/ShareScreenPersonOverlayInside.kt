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

public val FluentUi.Regular.ShareScreenPersonOverlayInside: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareScreenPersonOverlayInside",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 12f)
            curveTo(17.105f, 12f, 18f, 11.105f, 18f, 10f)
            curveTo(18f, 8.895f, 17.105f, 8f, 16f, 8f)
            curveTo(14.895f, 8f, 14f, 8.895f, 14f, 10f)
            curveTo(14f, 11.105f, 14.895f, 12f, 16f, 12f)
            close()
            moveTo(13f, 14f)
            curveTo(13f, 13.448f, 13.448f, 13f, 14f, 13f)
            horizontalLineTo(18f)
            curveTo(18.552f, 13f, 19f, 13.448f, 19f, 14f)
            verticalLineTo(14.25f)
            curveTo(19f, 15.769f, 17.769f, 17f, 16.25f, 17f)
            horizontalLineTo(15.75f)
            curveTo(14.231f, 17f, 13f, 15.769f, 13f, 14.25f)
            verticalLineTo(14f)
            close()
            moveTo(6.25f, 7f)
            curveTo(5.56f, 7f, 5f, 7.56f, 5f, 8.25f)
            verticalLineTo(11.75f)
            curveTo(5f, 12.44f, 5.56f, 13f, 6.25f, 13f)
            horizontalLineTo(10.75f)
            curveTo(11.44f, 13f, 12f, 12.44f, 12f, 11.75f)
            verticalLineTo(8.25f)
            curveTo(12f, 7.56f, 11.44f, 7f, 10.75f, 7f)
            horizontalLineTo(6.25f)
            close()
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 20f, 22f, 18.545f, 22f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
            moveTo(3.5f, 7.25f)
            curveTo(3.5f, 6.284f, 4.284f, 5.5f, 5.25f, 5.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 5.5f, 20.5f, 6.284f, 20.5f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(20.5f, 17.716f, 19.716f, 18.5f, 18.75f, 18.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 18.5f, 3.5f, 17.716f, 3.5f, 16.75f)
            verticalLineTo(7.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShareScreenPersonOverlayInsidePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ShareScreenPersonOverlayInside, contentDescription = null)
    }
}
