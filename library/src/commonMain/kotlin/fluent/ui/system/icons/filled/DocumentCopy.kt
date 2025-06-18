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

public val FluentUi.Filled.DocumentCopy: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentCopy",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 6.75f)
            verticalLineTo(2f)
            horizontalLineTo(8.75f)
            curveTo(7.507f, 2f, 6.5f, 3.007f, 6.5f, 4.25f)
            verticalLineTo(17.25f)
            curveTo(6.5f, 18.493f, 7.507f, 19.5f, 8.75f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 19.5f, 20f, 18.493f, 20f, 17.25f)
            verticalLineTo(9f)
            horizontalLineTo(15.25f)
            curveTo(14.007f, 9f, 13f, 7.993f, 13f, 6.75f)
            close()
            moveTo(14.5f, 6.75f)
            verticalLineTo(2.5f)
            lineTo(19.5f, 7.5f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 7.5f, 14.5f, 7.164f, 14.5f, 6.75f)
            close()
            moveTo(5.503f, 4.627f)
            curveTo(4.627f, 4.935f, 4f, 5.769f, 4f, 6.75f)
            verticalLineTo(17.254f)
            curveTo(4f, 19.878f, 6.127f, 22.004f, 8.75f, 22.004f)
            horizontalLineTo(15.244f)
            curveTo(16.224f, 22.004f, 17.057f, 21.378f, 17.366f, 20.504f)
            lineTo(8.75f, 20.504f)
            curveTo(6.955f, 20.504f, 5.5f, 19.049f, 5.5f, 17.254f)
            lineTo(5.503f, 4.627f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentCopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentCopy, contentDescription = null)
    }
}
