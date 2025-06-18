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

public val FluentIcons.Regular.Kiosk: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Kiosk",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
            verticalLineTo(10.75f)
            curveTo(20f, 11.993f, 18.993f, 13f, 17.75f, 13f)
            horizontalLineTo(14.5f)
            verticalLineTo(20.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 20.5f, 17f, 20.836f, 17f, 21.25f)
            curveTo(17f, 21.664f, 16.664f, 22f, 16.25f, 22f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 22f, 7f, 21.664f, 7f, 21.25f)
            curveTo(7f, 20.836f, 7.336f, 20.5f, 7.75f, 20.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(13f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 13f, 4f, 11.993f, 4f, 10.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(11f, 13f)
            verticalLineTo(20.5f)
            horizontalLineTo(13f)
            verticalLineTo(13f)
            horizontalLineTo(11f)
            close()
            moveTo(6.25f, 3.5f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            verticalLineTo(10.75f)
            curveTo(5.5f, 11.164f, 5.836f, 11.5f, 6.25f, 11.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 11.5f, 18.5f, 11.164f, 18.5f, 10.75f)
            verticalLineTo(4.25f)
            curveTo(18.5f, 3.836f, 18.164f, 3.5f, 17.75f, 3.5f)
            horizontalLineTo(6.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KioskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Kiosk, contentDescription = null)
    }
}
