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

public val FluentUi.Regular.Save: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Save",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 5.75f)
            curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
            horizontalLineTo(15.715f)
            curveTo(16.576f, 3f, 17.403f, 3.342f, 18.013f, 3.952f)
            lineTo(20.048f, 5.987f)
            curveTo(20.658f, 6.597f, 21f, 7.424f, 21f, 8.286f)
            verticalLineTo(18.25f)
            curveTo(21f, 19.769f, 19.769f, 21f, 18.25f, 21f)
            horizontalLineTo(5.75f)
            curveTo(4.231f, 21f, 3f, 19.769f, 3f, 18.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(5.75f, 4.5f)
            curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(4.5f, 18.94f, 5.06f, 19.5f, 5.75f, 19.5f)
            horizontalLineTo(6f)
            verticalLineTo(14.25f)
            curveTo(6f, 13.007f, 7.007f, 12f, 8.25f, 12f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 12f, 18f, 13.007f, 18f, 14.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(18.25f)
            curveTo(18.94f, 19.5f, 19.5f, 18.94f, 19.5f, 18.25f)
            verticalLineTo(8.286f)
            curveTo(19.5f, 7.821f, 19.316f, 7.376f, 18.987f, 7.048f)
            lineTo(16.952f, 5.013f)
            curveTo(16.692f, 4.752f, 16.358f, 4.583f, 16f, 4.523f)
            verticalLineTo(7.25f)
            curveTo(16f, 8.493f, 14.993f, 9.5f, 13.75f, 9.5f)
            horizontalLineTo(9.25f)
            curveTo(8.007f, 9.5f, 7f, 8.493f, 7f, 7.25f)
            verticalLineTo(4.5f)
            horizontalLineTo(5.75f)
            close()
            moveTo(16.5f, 19.5f)
            verticalLineTo(14.25f)
            curveTo(16.5f, 13.836f, 16.164f, 13.5f, 15.75f, 13.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 13.5f, 7.5f, 13.836f, 7.5f, 14.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(16.5f)
            close()
            moveTo(8.5f, 4.5f)
            verticalLineTo(7.25f)
            curveTo(8.5f, 7.664f, 8.836f, 8f, 9.25f, 8f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 8f, 14.5f, 7.664f, 14.5f, 7.25f)
            verticalLineTo(4.5f)
            horizontalLineTo(8.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SavePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Save, contentDescription = null)
    }
}
