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

public val FluentUi.Regular.BuildingDesktop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BuildingDesktop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.75f, 3.5f)
            curveTo(3.612f, 3.5f, 3.5f, 3.612f, 3.5f, 3.75f)
            verticalLineTo(16.25f)
            curveTo(3.5f, 16.388f, 3.612f, 16.5f, 3.75f, 16.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(16.75f)
            curveTo(8.5f, 17.174f, 8.572f, 17.599f, 8.713f, 18f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 18f, 2f, 17.216f, 2f, 16.25f)
            verticalLineTo(3.75f)
            curveTo(2f, 2.783f, 2.783f, 2f, 3.75f, 2f)
            horizontalLineTo(9.25f)
            curveTo(10.217f, 2f, 11f, 2.783f, 11f, 3.75f)
            verticalLineTo(6.75f)
            curveTo(11f, 6.888f, 11.112f, 7f, 11.25f, 7f)
            horizontalLineTo(12.25f)
            curveTo(13.217f, 7f, 14f, 7.784f, 14f, 8.75f)
            verticalLineTo(9f)
            horizontalLineTo(12.5f)
            verticalLineTo(8.75f)
            curveTo(12.5f, 8.612f, 12.388f, 8.5f, 12.25f, 8.5f)
            horizontalLineTo(11.25f)
            curveTo(10.283f, 8.5f, 9.5f, 7.716f, 9.5f, 6.75f)
            verticalLineTo(3.75f)
            curveTo(9.5f, 3.612f, 9.388f, 3.5f, 9.25f, 3.5f)
            horizontalLineTo(3.75f)
            close()
            moveTo(6f, 5.75f)
            curveTo(6f, 6.164f, 5.664f, 6.5f, 5.25f, 6.5f)
            curveTo(4.836f, 6.5f, 4.5f, 6.164f, 4.5f, 5.75f)
            curveTo(4.5f, 5.336f, 4.836f, 5f, 5.25f, 5f)
            curveTo(5.664f, 5f, 6f, 5.336f, 6f, 5.75f)
            close()
            moveTo(5.25f, 9.5f)
            curveTo(5.664f, 9.5f, 6f, 9.164f, 6f, 8.75f)
            curveTo(6f, 8.336f, 5.664f, 8f, 5.25f, 8f)
            curveTo(4.836f, 8f, 4.5f, 8.336f, 4.5f, 8.75f)
            curveTo(4.5f, 9.164f, 4.836f, 9.5f, 5.25f, 9.5f)
            close()
            moveTo(6f, 11.75f)
            curveTo(6f, 12.164f, 5.664f, 12.5f, 5.25f, 12.5f)
            curveTo(4.836f, 12.5f, 4.5f, 12.164f, 4.5f, 11.75f)
            curveTo(4.5f, 11.336f, 4.836f, 11f, 5.25f, 11f)
            curveTo(5.664f, 11f, 6f, 11.336f, 6f, 11.75f)
            close()
            moveTo(7.75f, 6.5f)
            curveTo(8.164f, 6.5f, 8.5f, 6.164f, 8.5f, 5.75f)
            curveTo(8.5f, 5.336f, 8.164f, 5f, 7.75f, 5f)
            curveTo(7.336f, 5f, 7f, 5.336f, 7f, 5.75f)
            curveTo(7f, 6.164f, 7.336f, 6.5f, 7.75f, 6.5f)
            close()
            moveTo(8.5f, 8.75f)
            curveTo(8.5f, 9.164f, 8.164f, 9.5f, 7.75f, 9.5f)
            curveTo(7.336f, 9.5f, 7f, 9.164f, 7f, 8.75f)
            curveTo(7f, 8.336f, 7.336f, 8f, 7.75f, 8f)
            curveTo(8.164f, 8f, 8.5f, 8.336f, 8.5f, 8.75f)
            close()
            moveTo(7.75f, 12.5f)
            curveTo(8.164f, 12.5f, 8.5f, 12.164f, 8.5f, 11.75f)
            curveTo(8.5f, 11.336f, 8.164f, 11f, 7.75f, 11f)
            curveTo(7.336f, 11f, 7f, 11.336f, 7f, 11.75f)
            curveTo(7f, 12.164f, 7.336f, 12.5f, 7.75f, 12.5f)
            close()
            moveTo(9.5f, 12.75f)
            curveTo(9.5f, 11.231f, 10.731f, 10f, 12.25f, 10f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 10f, 22f, 11.231f, 22f, 12.75f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.269f, 20.769f, 19.5f, 19.25f, 19.5f)
            horizontalLineTo(18f)
            verticalLineTo(20.5f)
            horizontalLineTo(19.25f)
            curveTo(19.664f, 20.5f, 20f, 20.836f, 20f, 21.25f)
            curveTo(20f, 21.664f, 19.664f, 22f, 19.25f, 22f)
            horizontalLineTo(12.25f)
            curveTo(11.836f, 22f, 11.5f, 21.664f, 11.5f, 21.25f)
            curveTo(11.5f, 20.836f, 11.836f, 20.5f, 12.25f, 20.5f)
            horizontalLineTo(13.5f)
            verticalLineTo(19.5f)
            horizontalLineTo(12.25f)
            curveTo(10.731f, 19.5f, 9.5f, 18.269f, 9.5f, 16.75f)
            verticalLineTo(12.75f)
            close()
            moveTo(15f, 19.5f)
            verticalLineTo(20.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(19.5f)
            horizontalLineTo(15f)
            close()
            moveTo(12.25f, 11.5f)
            curveTo(11.56f, 11.5f, 11f, 12.06f, 11f, 12.75f)
            verticalLineTo(16.75f)
            curveTo(11f, 17.44f, 11.56f, 18f, 12.25f, 18f)
            horizontalLineTo(19.25f)
            curveTo(19.94f, 18f, 20.5f, 17.44f, 20.5f, 16.75f)
            verticalLineTo(12.75f)
            curveTo(20.5f, 12.06f, 19.94f, 11.5f, 19.25f, 11.5f)
            horizontalLineTo(12.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BuildingDesktop, contentDescription = null)
    }
}
